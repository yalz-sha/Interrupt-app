package com.example.interrupt2k19;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EventsMenu extends AppCompatActivity implements View.OnClickListener {

    Button b1, b2, b3, b4, b5;
    CardView c1, c2, c3, c4, c5;
    Events e;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events_menu);

        c1 = (CardView) findViewById(R.id.card1);
        c2 = (CardView) findViewById(R.id.card2);
        c3 = (CardView) findViewById(R.id.card3);
        c4 = (CardView) findViewById(R.id.card4);
        c5 = (CardView) findViewById(R.id.card5);

//        b1 = (Button)findViewById(R.id.b1);
//        b2 = (Button)findViewById(R.id.b2);
//        b3 = (Button)findViewById(R.id.b3);
//        b4 = (Button)findViewById(R.id.b4);
//        b5 = (Button)findViewById(R.id.b5);

        e = new Events();

        c1.setOnClickListener(this);

//        b1.setOnClickListener(this);
//        b2.setOnClickListener(this);
//        b3.setOnClickListener(this);
//        b4.setOnClickListener(this);
//        b5.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        if (v == c1) {
            e.Eventid(1);
            startActivity(new Intent(EventsMenu.this, Events.class));
        }else if(v == c2){
            e.Eventid(2);
            startActivity(new Intent(EventsMenu.this, Events.class));
        }else if(v == c3){
            e.Eventid(3);
            startActivity(new Intent(EventsMenu.this, Events.class));
        }else if(v == c4){
            e.Eventid(4);
            startActivity(new Intent(EventsMenu.this, Events.class));
        }else if(v == c5){
            e.Eventid(5);
            startActivity(new Intent(EventsMenu.this, Events.class));
        }

    }
}
