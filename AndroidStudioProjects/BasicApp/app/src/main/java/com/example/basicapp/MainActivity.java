package com.example.basicapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.Toast;

import android.os.Bundle;
import android.net.Uri;

public class MainActivity extends AppCompatActivity
{
    private CardView card_view ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        card_view = (CardView) findViewById(R.id.select_camera);
        card_view.setOnClickListener( new View.OnClickListener() {
                    @Override
                    public void onClick(View v)
                    {
                        Intent intent = new Intent(v.getContext(), CameraoutputActivity.class);
                        startActivity(intent);
                    }
                }
        );
        // Create our Preview view and set it as the content of our activity.
        //FrameLayout preview = (FrameLayout) findViewById(R.id.camera_preview);
        //preview.addView(mPreview);
    }

}