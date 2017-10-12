package com.example.bill1.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public final static String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    private Button button;
    private Button button1;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new Button.OnClickListener()
        {
            public void onClick(View v) {
                Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                startActivity(intent);
            }
        });
        button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new Button.OnClickListener()
        {
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_PICK,android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                startActivityForResult(intent, 2);
            }
        });
      /*  button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new Button.OnClickListener()
        {
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Main2Activity.class));

            }
        });
        */
    }
    @Override
    public void onClick(View v) {

    }
}
