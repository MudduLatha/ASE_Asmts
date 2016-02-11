package com.example.tejuu.cs5551_asmt_3;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;

public class Sign_Up extends AppCompatActivity {
    Button Sign_Up;


    int TAKE_PHOTO_CODE = 0;
    ImageView userImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign__up);
        Button capture = (Button) findViewById(R.id.button_upload_photo);
        userImage = (ImageView) findViewById(R.id.Profilephoto);
        Button btn = (Button) findViewById(R.id.button_Sign_Up);
        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);
        capture.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent cameraIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(cameraIntent, TAKE_PHOTO_CODE);
            }
        });
    }


    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == TAKE_PHOTO_CODE && resultCode == RESULT_OK) {
            Bitmap photo = (Bitmap) data.getExtras().get("data");
            userImage.setImageBitmap(photo);
            Log.d("CameraDemo", "Pic saved");
        }
    }
        //@Override
        public void SignUpPage(View v) {
            userImage.setDrawingCacheEnabled(true);
            Bitmap bm = userImage.getDrawingCache();
            Intent mapsIntent = new Intent(Sign_Up.this, Maps.class);
            mapsIntent.putExtra("PROFILING", bm);
            startActivity(mapsIntent);

    //public void redirectToHome(View v) {
        Intent redirect = new Intent(Sign_Up.this, Maps.class);
        startActivity(redirect);

    }


         }


