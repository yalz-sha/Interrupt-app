package com.example.interrupt2k19;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class EventRules extends AppCompatActivity {

    TextView t2, rul;
    Typeface typeface;
    RelativeLayout bgrl1, fgrl1;
    Button reg;
    static int flag1=0;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_rules);

        t2 = (TextView)findViewById(R.id.t2);
        rul = (TextView)findViewById(R.id.rul);
        bgrl1 = (RelativeLayout)findViewById(R.id.bgrl1);
        fgrl1 = (RelativeLayout)findViewById(R.id.fgrl1);
        reg = (Button)findViewById(R.id.reg);

        switch(flag1){

            case 1:
                t2.setText("Event 1");
                typeface = ResourcesCompat.getFont(getApplicationContext(), R.font.supermario);
                //mediaPlayer = MediaPlayer.create(this, Settings.System.DEFAULT_RINGTONE_URI);
                bgrl1.setBackgroundResource(R.drawable.mario1b);
                fgrl1.setBackgroundResource(R.drawable.mario1);
                t2.setBackgroundColor(getColor(R.color.mariobox));
                t2.setTextColor(getColor(R.color.mariotext));
                t2.setTypeface(typeface);
                reg.setTypeface(typeface);
                reg.setBackgroundColor(getColor(R.color.mariobox));
                reg.setTextColor(getColor(R.color.mariotext));

//                mediaPlayer.setLooping(true);
//                mediaPlayer.start();
                break;
            case 2: t2.setText("Event 2");
                break;
            case 3: t2.setText("Event 3");
                break;
            case 4: t2.setText("Event 4");
                break;
            case 5: t2.setText("Event 5");
                break;
        }

    }

    @Override
    public void onBackPressed() {
        //mediaPlayer.stop();
        super.onBackPressed();
    }

    public static void Eventid1(int c){
        flag1 = c;
    }
}
