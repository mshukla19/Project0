package com.example.mshukla.myappportfolio;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button mPopular;
    Button mScores;
    Button mLibrary;
    Button mBuild;
    Button mReader;
    Button mCapstone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitle(R.string.app_name);
        mPopular = (Button) findViewById(R.id.popular_movies);
        mScores = (Button) findViewById(R.id.scores_app);
        mLibrary = (Button) findViewById(R.id.library_app);
        mBuild = (Button) findViewById(R.id.build_it);
        mReader = (Button) findViewById(R.id.xyz_reader);
        mCapstone = (Button) findViewById(R.id.capstone);

        // set onclick listerners for all the buttons
        mPopular.setOnClickListener(this);
        mScores.setOnClickListener(this);
        mLibrary.setOnClickListener(this);
        mBuild.setOnClickListener(this);
        mReader.setOnClickListener(this);
        mCapstone.setOnClickListener(this);




    }

    @Override
    public void onClick(View view) {
        String projectClicked;
        switch (view.getId()) {
            case R.id.popular_movies: projectClicked = getResources().getString(R.string.popular_movies);
                break;
            case R.id.scores_app: projectClicked = getResources().getString(R.string.scores_app);
                break;
            case R.id.library_app: projectClicked = getResources().getString(R.string.library_app);
                break;
            case R.id.build_it: projectClicked = getResources().getString(R.string.build_it);
                break;
            case R.id.xyz_reader: projectClicked = getResources().getString(R.string.xyz_reader);
                break;
            case R.id.capstone: projectClicked = getResources().getString(R.string.capstone);
                break;
            default: projectClicked = getResources().getString(R.string.heading);
                break;
        }
        String toastText = String.format(getResources().getString(R.string.toast_text), projectClicked);
        Toast.makeText(this,toastText,Toast.LENGTH_SHORT).show();
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
}
