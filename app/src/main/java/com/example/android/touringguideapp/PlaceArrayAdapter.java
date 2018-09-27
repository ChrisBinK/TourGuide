package com.example.android.touringguideapp;


import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class PlaceArrayAdapter extends ArrayAdapter<Place>
{
    private ArrayList<Place> listPlace;

    public PlaceArrayAdapter(Activity context, ArrayList<Place> listPlace) {
        super(context,0,listPlace);
        this.listPlace = listPlace;
    }

    @Override
    public View getView(int position, View convertView,  ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Place currentPlace = getItem(position);

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.place_name);
        nameTextView.setText(currentPlace.getName());

        TextView numberTextView = (TextView) listItemView.findViewById(R.id.place_address);

        numberTextView.setText(currentPlace.getAddress());

        ImageView iconView = (ImageView) listItemView.findViewById(R.id.list_item_icon);
        // Get the image resource ID from the current song object and
        // set the image to iconView
        iconView.setImageResource(currentPlace.getImageRessource());

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }

    public Place getItem (int position)
    {
        return listPlace.get(position);
    }
}
