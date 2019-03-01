package com.example.artworklistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.example.portfolioapp.R;

import java.util.List;

public class ArtworkAdapter extends ArrayAdapter<Artwork> {

    public ArtworkAdapter(Context context, List<Artwork> objects) {
        super(context, 0, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Artwork work = getItem(position);

        if(convertView==null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.artwork_item, parent, false);
        }

        TextView title = (TextView)((LinearLayout)((LinearLayout)convertView).getChildAt(1)).getChildAt(0);
        TextView blurb = (TextView)((LinearLayout)((LinearLayout)convertView).getChildAt(1)).getChildAt(0);

//        TextView title = (TextView)convertView.findViewById(R.id.artworkTitle);
//        TextView blurb = (TextView)convertView.findViewById(R.id.artworkBlurb);
        ImageView artworkImage = (ImageView)convertView.findViewById(R.id.artworkImage);

        title.setText(work.getTitle());
        blurb.setText(work.getBlurb());
//        artworkImage.setImageResource(work.getImageID());

        return convertView;

    }
}
