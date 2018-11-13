package com.project.mandeep.userprofile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Interests extends AppCompatActivity {
        TextView profile,favorite;
        ImageView back,acc;
        Button addbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interests);
        favorite=findViewById(R.id.fav);
        back= findViewById(R.id.back2);
        profile=findViewById(R.id.profile);
        addbtn=findViewById(R.id.addinterest);

        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Interests.this,UserProfileInfo.class);
                startActivity(intent);
            }
        });

        favorite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Interests.this,Favourites.class);
                startActivity(intent);
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Interests.this,UserProfileInfo.class);
                startActivity(intent);
            }
        });
        acc= findViewById(R.id.account);

        acc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Interests.this,ArdenVideos.class);
                startActivity(intent);
            }
        });

        addbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Interests.this,RegisterInterest.class);
                startActivity(intent);
            }
        });
    }
}
