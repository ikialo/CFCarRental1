package com.example.isaac.cfcarrental;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.DatePicker;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.Calendar;


public class MainActivity extends AppCompatActivity  implements DatePickerDialog.OnDateSetListener, TimePickerDialog.OnTimeSetListener {


    ListView listView = null;
    LinearLayout LLPickUpLoc, LLPickDate, LLDropDate, LLPickTime, LLDropTime;
    TextView pickupLocation, dropLocation, pickDate, dropDate, dropTime, pickTime;
    int day, month, year, hour, min;
    int finalday, finalmonth, finalyear, finalHour, finalMin;
    Button buttonContinue;
    private DatabaseReference mDatabase;

    private  static final int PICK_ = 500;
    private  int pickOrDrop = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        LLPickUpLoc = findViewById(R.id.LLpickup_loc);
        LLPickDate = findViewById(R.id.LLpickup_Date);
        LLDropDate = findViewById(R.id.LLDropOffDate);
        LLPickTime = findViewById(R.id.LLpickup_Time);
        LLDropTime = findViewById(R.id.LLDropOffTime);
        listView = new ListView(this);
        pickupLocation = findViewById(R.id.pickup_loc);
        dropLocation = findViewById(R.id.dropOffLoc);
        pickDate = findViewById(R.id.pickup_date);
        dropDate = findViewById(R.id.dropOffDate);
        dropTime = findViewById(R.id.dropOffTime);
        pickTime = findViewById(R.id.pickup_time);

        buttonContinue = findViewById(R.id.continueBtn);

        mDatabase = FirebaseDatabase.getInstance().getReference("Booking");


        final String [] places = {"Port Moresby", "Lae", "Manus"};


//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.list_item_loc, R.id.locationPickUp,places);
//        listView.setAdapter(adapter);
//
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//
//                ViewGroup vg = (ViewGroup) view;
//
//
//                TextView textView = vg.findViewById(R.id.locationPickUp);
//                Toast.makeText(MainActivity.this, textView.getText().toString(), Toast.LENGTH_SHORT).show();
//
//
//            }
//        });


//        LLDropLoc.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this)  ;
//                builder.setCancelable(true);
//                builder.setSingleChoiceItems(places, -1, new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialog, int which) {
//
//                        Toast.makeText(MainActivity.this, places[which], Toast.LENGTH_SHORT).show();
//                        dropLocation.setText(places[which]);
//                        dialog.dismiss();
//                    }
//                });
//
//                builder.setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialog, int which) {
//                        Toast.makeText(MainActivity.this, "Cancel", Toast.LENGTH_SHORT).show();
//
//
//                    }
//                });
//                AlertDialog dialog = builder.create();
//                dialog.show();
//
//            }
//        });

        buttonContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Continue", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, ChooseCarActivity.class);

                startActivity(intent);
            }
        });

        LLPickUpLoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this)  ;
                builder.setCancelable(true);
                builder.setSingleChoiceItems(places, -1, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        Toast.makeText(MainActivity.this, places[which], Toast.LENGTH_SHORT).show();
                        pickupLocation.setText(places[which]);
                        dropLocation.setText(places[which]);
                        dialog.dismiss();
                    }
                });

                builder.setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, "Cancel", Toast.LENGTH_SHORT).show();


                    }
                });
                AlertDialog dialog = builder.create();
                dialog.show();



            }

        });


        LLDropDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Calendar c = Calendar.getInstance();

                year =c.get(Calendar.YEAR);
                month = c.get(Calendar.MONTH);
                day = c.get(Calendar.DAY_OF_MONTH);
                pickOrDrop = 200;

                DatePickerDialog datePickerDialog = new DatePickerDialog(MainActivity.this, MainActivity.this,year,month, day);

                datePickerDialog.show();
            }
        });
        LLPickDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar c = Calendar.getInstance();

                year =c.get(Calendar.YEAR);
                month = c.get(Calendar.MONTH);
                day = c.get(Calendar.DAY_OF_MONTH);
                pickOrDrop = 500;

                DatePickerDialog datePickerDialog = new DatePickerDialog(MainActivity.this, MainActivity.this,year,month, day);

                datePickerDialog.show();
            }
        });



        LLPickTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar c = Calendar.getInstance();

                hour = c.get(Calendar.HOUR);
                min = c.get(Calendar.MINUTE);

                pickOrDrop = 200;
                TimePickerDialog timePickerDialog = new TimePickerDialog(MainActivity.this, MainActivity.this,hour, min, true);

                timePickerDialog.show();
            }
        });

        LLDropTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar c = Calendar.getInstance();
                hour = c.get(Calendar.HOUR);
                min = c.get(Calendar.MINUTE);

                pickOrDrop = 201;
                TimePickerDialog timePickerDialog = new TimePickerDialog(MainActivity.this, MainActivity.this,hour, min, true);

                timePickerDialog.show();
            }
        });




    }



    @Override
    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {

        finalyear = year;
        finalmonth = month +1;
        finalday = dayOfMonth;

        if (PICK_ == pickOrDrop){
            pickDate.setText(finalday+"/"+finalmonth+"/"+ finalyear);
        }
        else{
            dropDate.setText(finalday+"/"+finalmonth+"/"+ finalyear);
        }

    }

    @Override
    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {


        finalHour = hourOfDay;
        finalMin = minute;


        if (pickOrDrop == 200){
            pickTime.setText(finalHour+":"+finalMin);
        }
        else{
            dropTime.setText(finalHour+":"+finalMin);
        }

    }
}
