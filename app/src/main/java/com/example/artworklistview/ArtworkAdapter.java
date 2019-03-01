package com.example.artworklistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.portfolioapp.R;
import java.util.List;

public class ArtworkAdapter extends ArrayAdapter<Artwork> {

    public ArtworkAdapter(Context context, int resource, List<Artwork> objects) {
        super(context, resource, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Artwork work = getItem(position);

        if(convertView==null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.activity_artworks, parent, false);
        }

        TextView title = (TextView)convertView.findViewById(R.id.artworkTitle);
        TextView blurb = (TextView)convertView.findViewById(R.id.artworkBlurb);
        ImageView artworkImage = (ImageView)convertView.findViewById(R.id.artworkImage);

        title.setText(work.getTitle());
        blurb.setText(work.getBlurb());
        artworkImage.setImageDrawable(work.getImage());

        return convertView;

    }
}
