package com.android.alucard.customadapterfragmetns;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

public class FragmentTwo extends Fragment {
    private static final String TAG = "FragmentTwo";

    ImageView ivMap;
    Button btBack;
    Fragment me = this;

    int[] maps = {R.drawable.china, R.drawable.india, R.drawable.japan, R.drawable.usa, R.drawable.nepal,
            R.drawable.china, R.drawable.india, R.drawable.japan, R.drawable.usa, R.drawable.nepal,
            R.drawable.china, R.drawable.india, R.drawable.japan, R.drawable.usa, R.drawable.nepal};

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View v  = inflater.inflate(R.layout.fragment_two, container, false);

        ivMap = v.findViewById(R.id.ivMap);
        btBack = v.findViewById(R.id.btBack);

        Bundle b = getArguments();

        int data = b.getInt("position");
        Log.d(TAG, "onCreateView: position " + data);

        ivMap.setImageResource(maps[data]);

        btBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().getFragmentManager().beginTransaction().remove(me).commit();
            }
        });

        return v;
    }
}
