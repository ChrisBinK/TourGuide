package com.example.android.touringguideapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantFragment extends Fragment
{
    private ArrayList<Place> listOfPlace  = null;
    /**
     * Default contructor
     */
     public RestaurantFragment()
     {

     }

    @Override
    public void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,  Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_restaurant, container, false);

        // inilialise the arraylist
        listOfPlace = new ArrayList<Place>();
        /// insert  Places in the list
        String defaultLen = "6:25";
        listOfPlace.add( new Place("Vovo Telo","Grand avenue norwood", R.drawable.restaurant));
        listOfPlace.add( new Place("Vovo Telo 2","Grand avenue norwood", R.drawable.restaurant));
        listOfPlace.add( new Place("Vovo Telo 3","Grand avenue norwood", R.drawable.restaurant));
        listOfPlace.add( new Place("Vovo Telo 4","Grand avenue norwood", R.drawable.restaurant));


        final PlaceArrayAdapter PlaceAdapter = new PlaceArrayAdapter(getActivity(), listOfPlace);

        ListView listViewPlace = (ListView) rootView.findViewById(R.id.list);
        listViewPlace.setAdapter(PlaceAdapter);

        listViewPlace.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapter, View v, int position, long l){
                Place item = (Place)PlaceAdapter.getItem(position);

                Intent intent = new Intent(getActivity(),PlaceDetailActivity.class);

                intent.putExtra("PlaceName", item.getName());
                intent.putExtra("PlaceAddress", item.getAddress());
                intent.putExtra("PlaceImg",String.valueOf( item.getImageRessource()));
                //based on item add info to intent
                startActivity(intent);
            }
        });
        return rootView;
    }

    public void setUpPlaces()
    {



    }
}
