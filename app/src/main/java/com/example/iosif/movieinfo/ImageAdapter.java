package com.example.iosif.movieinfo;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by iosif on 31/10/15.
 */
public class ImageAdapter extends ArrayAdapter<String> {

    private static final String LOG_TAG = ImageAdapter.class.getSimpleName();

    public ImageAdapter(Activity context, List<String> posters){
        super(context, 0, posters);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        String url = getItem(position);

        if (convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.image_grid, parent, false);
        }

        ImageView iconView = (ImageView) convertView.findViewById(R.id.picture);
        Picasso.with(getContext()).load(url).fit().into(iconView);

        return convertView;
    }


}
