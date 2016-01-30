package com.madhu.myportfolioapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void launchCapstoneApp(View view) {
        //display the message
        Toast.makeText(MainActivity.this, displayMessage("capstone"), Toast.LENGTH_SHORT).show();
    }

    public void launchReaderApp(View view) {
        //display the message
        Toast.makeText(MainActivity.this, displayMessage("reader"), Toast.LENGTH_SHORT).show();
    }

    public void launchWearApp(View view) {
        //display the message
        Toast.makeText(MainActivity.this, displayMessage("android wear"), Toast.LENGTH_SHORT).show();
    }

    public void launchLibraryApp(View view) {
        //display the message
        Toast.makeText(MainActivity.this, displayMessage("library"), Toast.LENGTH_SHORT).show();
    }

    public void launchScoresApp(View view) {
        //display the message
        Toast.makeText(MainActivity.this, displayMessage("scores"), Toast.LENGTH_SHORT).show();
    }

    public void launchStreamerApp(View view) {
        //display the message
        Toast.makeText(MainActivity.this, displayMessage("streamer"), Toast.LENGTH_SHORT).show();
    }

    private String displayMessage(String appName){
        return "This button will launch my "+ appName + " app";
    }
}
