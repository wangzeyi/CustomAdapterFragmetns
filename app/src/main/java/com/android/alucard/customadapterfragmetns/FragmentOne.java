package com.android.alucard.customadapterfragmetns;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

public class FragmentOne extends Fragment {

    private static final String TAG = "FragmentOne";

    ListView listView;
    ListViewAdapter listViewAdapter;

    MapsInterface mapsInterface;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        mapsInterface = (MapsInterface) getActivity();

    }

    String[] countries = {"china", "india",  "japan", "USA", "nepal",
            "china", "india",  "japan", "USA", "nepal",
            "china", "india",  "japan", "USA", "nepal" };

    int[] maps = {R.drawable.china, R.drawable.india, R.drawable.japan, R.drawable.usa, R.drawable.nepal,
            R.drawable.china, R.drawable.india, R.drawable.japan, R.drawable.usa, R.drawable.nepal,
            R.drawable.china, R.drawable.india, R.drawable.japan, R.drawable.usa, R.drawable.nepal};

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_one, container, false);

        listView = v.findViewById(R.id.listView);

        listViewAdapter = new ListViewAdapter(countries, maps, getActivity());

        listView.setAdapter(listViewAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                mapsInterface.getData(position);
                Log.d(TAG, "onItemClick: position: " + position);
            }
        });

        return v;
    }
}
