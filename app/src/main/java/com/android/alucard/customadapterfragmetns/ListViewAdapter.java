package com.android.alucard.customadapterfragmetns;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class ListViewAdapter extends BaseAdapter {

    String[] countries;
    int[] maps;
    Context ctx;

    LayoutInflater layoutInflater;

    public ListViewAdapter(String[] countries, int[] maps, Context ctx) {
        this.countries = countries;
        this.maps = maps;
        this.ctx = ctx;

        layoutInflater = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return countries.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        View v = layoutInflater.inflate(R.layout.item_layout, null);

        TextView tvCountry = v.findViewById(R.id.tvCountry);
        ImageView ivMap = v.findViewById(R.id.ivCountry);

        tvCountry.setText(countries[position]);
        ivMap.setImageResource(maps[position]);

        tvCountry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ctx, "Clicked " + countries[position], Toast.LENGTH_SHORT).show();
            }
        });

//        ivMap.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                FragmentTwo fragTwo = new FragmentTwo();
////                int picPos = maps[position];
////                Bundle b = new Bundle();
////                b.putInt("position", picPos);
//
//
//
//            }
//        });

        return v;
    }
}
