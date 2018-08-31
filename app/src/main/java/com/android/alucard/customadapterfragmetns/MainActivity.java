package com.android.alucard.customadapterfragmetns;

import android.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity implements MapsInterface {


    //Your code is perfect
    private static final String TAG = "MainActivity";

//    ListView listView;
//    ListViewAdapter listViewAdapter;



    String[] countries = {"china", "india", "USA", "japan", "nepal",
            "china", "india", "USA", "japan", "nepal",
            "china", "india", "USA", "japan", "nepal", };

    int[] myPics = {R.drawable.china, R.drawable.india, R.drawable.japan, R.drawable.usa, R.drawable.nepal,
            R.drawable.china, R.drawable.india, R.drawable.japan, R.drawable.usa, R.drawable.nepal,
            R.drawable.china, R.drawable.india, R.drawable.japan, R.drawable.usa, R.drawable.nepal};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        listView = findViewById(R.id.listView);
//
//        listViewAdapter = new ListViewAdapter(countries, myPics, MainActivity.this);
//
//        listView.setAdapter(listViewAdapter);



        //getFragmentManager().beginTransaction().add()
    }

    @Override
    public void getData(int data) {
        FragmentTwo fragTwo = new FragmentTwo();
        Bundle b = new Bundle();
        b.putInt("position", data);
        Log.d(TAG, "getData: Postion " + data);
        fragTwo.setArguments(b);

        getFragmentManager().beginTransaction().replace(R.id.fragOne, fragTwo).commit();
    }
}
