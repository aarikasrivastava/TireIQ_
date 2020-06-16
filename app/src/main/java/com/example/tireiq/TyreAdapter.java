package com.example.tireiq;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.core.content.ContextCompat;


import java.util.ArrayList;

public class TyreAdapter extends ArrayAdapter<Tyre> {

    // resource id to get background color for the list of words
    private int mColorResourceId;

    public TyreAdapter(Activity context, ArrayList<Tyre> tyres, int colorResourceId) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, tyres);
        mColorResourceId= colorResourceId;
    }

    @Override
    public View getView(int position,  View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.activity_main, parent, false);
        }
        // Get the {@link word} object located at this position in the list
        Tyre currentTyre = getItem(position);
        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView tyreTextView = (TextView) listItemView.findViewById(R.id.tyre_text_view);
        // Get the version name from the current word object and
        // set this text on the name TextView
        tyreTextView.setText(currentTyre.getTyreNumber());
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        imageView.setImageResource(currentTyre.getImageResourceId());
        return listItemView;
    }


}
