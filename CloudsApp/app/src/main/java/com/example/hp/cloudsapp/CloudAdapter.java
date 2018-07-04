package com.example.hp.cloudsapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class CloudAdapter extends ArrayAdapter<CloudsModel> {
    private Context context;
    private List<CloudsModel> list;
    private int cloudId;
    public CloudAdapter(@NonNull Context context, int resource, @NonNull List<CloudsModel> list) {
        super(context, resource, list);
        this.context = context;
        this.list = list;
        this.cloudId = resource;
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItem = convertView;
        if (listItem == null) {
            listItem = LayoutInflater.from(context).inflate(cloudId, parent, false);
        }
        final CloudsModel cloudsModel = list.get(position);
        ImageView cloudImage = listItem.findViewById(R.id.imageCloud);
        TextView titleTxt = listItem.findViewById(R.id.textTitle);
        TextView descriptionTxt = listItem.findViewById(R.id.textDescription);
        TextView sortTxt = listItem.findViewById(R.id.textCloudSort);

        titleTxt.setText(cloudsModel.getTitle());
        descriptionTxt.setText(cloudsModel.getDescription());
        sortTxt.setText(cloudsModel.getSort());
        Picasso.get().load(cloudsModel.getImageUrl()).into(cloudImage);
        return listItem;
    }
}
