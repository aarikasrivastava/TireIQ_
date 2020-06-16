package com.example.tireiq;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public class TyregAdapter extends ArrayAdapter<Tyreg> {

    private int mColorResourceId;

    public TyregAdapter(Activity context, ArrayList<Tyreg> tyresg, int colorResourceId) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, tyresg);
        mColorResourceId= colorResourceId;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View gridItemView = convertView;
        if (gridItemView == null) {
            gridItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.activity_main, parent, false);
        }
        // Get the {@link word} object located at this position in the list
        Tyreg currentTyreg = getItem(position);
        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView tyregTextView = (TextView) gridItemView.findViewById(R.id.tyre_text_view);
        // Get the version name from the current word object and
        // set this text on the name TextView
        tyregTextView.setText(currentTyreg.getTyregNumber());
        ImageView imageView = (ImageView) gridItemView.findViewById(R.id.image);
        imageView.setImageResource(currentTyreg.getImagegResourceId());
        return gridItemView;
    }


}




