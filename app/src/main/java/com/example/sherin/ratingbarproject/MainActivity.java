package com.example.sherin.ratingbarproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    RatingBar ratingBar;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ratingBar=findViewById(R.id.ratingBarId);
        textView=findViewById(R.id.tvresultId);


        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                textView.setText( "Rating :"+v);


                if(v==1){
                            textView.setText("Very Bad");
                }
               else if(v==2){
                    textView.setText(" Bad");
                }
                else if(v==3){
                    textView.setText("Good");
                }
                else if(v==4){
                    textView.setText("Very Good");
                }
                else if(v==5){
                    textView.setText("Excelent ");
                }
            }
        });
    }
}
