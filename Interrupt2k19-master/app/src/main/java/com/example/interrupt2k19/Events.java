package com.example.interrupt2k19;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import android.content.Intent;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class Events extends AppCompatActivity implements View.OnClickListener{

    TextView t1, desc, descti, rulesti, rules;
    Typeface typeface;
    RelativeLayout bgrl, fgrl;
    Button reg;
    static int flag=0, m=0;
    MediaPlayer mediaPlayer;
    CircleImageView icon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events);

        t1 = (TextView)findViewById(R.id.t1);
        desc = (TextView)findViewById(R.id.desc);
        bgrl = (RelativeLayout)findViewById(R.id.bgrl);
        fgrl = (RelativeLayout)findViewById(R.id.fgrl);
        descti = (TextView)findViewById(R.id.descti);
        rulesti = (TextView)findViewById(R.id.rulesti);
        reg = (Button)findViewById(R.id.regbut);
        rules = (TextView) findViewById(R.id.rules);
        icon = (CircleImageView)findViewById(R.id.EventIcon);

        icon.setImageResource(R.drawable.detdark);

        switch(flag){

            case 1:
                    t1.setText("DETROIT");
//                    typeface = ResourcesCompat.getFont(getApplicationContext(), R.font.gothamu);
//                    //mediaPlayer = MediaPlayer.create(this, Settings.System.DEFAULT_RINGTONE_URI);
//                    mediaPlayer = MediaPlayer.create(this,R.raw.iphone_6);
//                    m=1;
//                    bgrl.setBackgroundResource(R.drawable.mario1b);
//                    fgrl.setBackgroundResource(R.drawable.mario1);
//                    t1.setBackgroundColor(getColor(R.color.mariobox));
//                    t1.setTextColor(getColor(R.color.mariotext));
//                    t1.setTypeface(typeface);
//                    descti.setBackgroundColor(getColor(R.color.mariobox));
//                    descti.setTextColor(getColor(R.color.mariotext));
//                    descti.setTypeface(typeface);
//                    reg.setBackgroundColor(getColor(R.color.mariobox));
//                    reg.setTextColor(getColor(R.color.mariotext));
//                    reg.setTypeface(typeface);
//                    rulesti.setTypeface(typeface);
//                    rulesti.setBackgroundColor(getColor(R.color.mariobox));
//                    rulesti.setTextColor(getColor(R.color.mariotext));
//                    desc.setTextColor(getColor(R.color.mariotext));
//                    desc.setTypeface(typeface);
//                    rules.setTextColor(getColor(R.color.mariotext));
//                    rules.setTypeface(typeface);
//
//
//                    mediaPlayer.setLooping(true);
//                    mediaPlayer.start();
                    break;
            case 2: t1.setText("Event 2");
                    break;
            case 3: t1.setText("Event 3");
                    break;
            case 4: t1.setText("Event 4");
                    break;
            case 5: t1.setText("Event 5");
                    break;
        }

        rules.setOnClickListener(this);

    }

//    @Override
//    public void onBackPressed() {
//        if(m == 1) {
//            mediaPlayer.stop();
//            m=0;
//        }
//        super.onBackPressed();
//    }

    public void Eventid(int c){
        flag = c;
    }

    @Override
    public void onClick(View v) {

    }

}
