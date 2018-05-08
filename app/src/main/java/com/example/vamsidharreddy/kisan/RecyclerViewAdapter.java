package com.example.vamsidharreddy.kisan;

import android.content.Context;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by USER on 4/1/2018.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
        Context context;
        List<ImageUploadInfo> MainImageUploadInfoList;

public RecyclerViewAdapter(Context context, List<ImageUploadInfo> TempList) {

        this.MainImageUploadInfoList = TempList;

        this.context = context;
        }

@Override
public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_recyclerviewitems, parent, false);

        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
        }

@Override
public void onBindViewHolder(ViewHolder holder, int position) {
        ImageUploadInfo UploadInfo = MainImageUploadInfoList.get(position);

        holder.imageNameTextView.setText(UploadInfo.getCropdetails());

        //Loading image from Glide library.
        //Glide.with(context).load(UploadInfo.getImageURL()).into(holder.imageView);
         //Picasso.get().load(UploadInfo.getImageURL()).resize(80, 80).centerCrop().into(holder.imageView);
    //Toast.makeText(context,UploadInfo.getImageURL(),Toast.LENGTH_SHORT).show();
    Picasso.with(context).load(UploadInfo.getSymptoms()).into(holder.imageView);
        }

@Override
public int getItemCount() {

        return MainImageUploadInfoList.size();
        }

class ViewHolder extends RecyclerView.ViewHolder {

    public ImageView imageView;
    public TextView imageNameTextView;

    public ViewHolder(View itemView) {
        super(itemView);

        imageView = (ImageView) itemView.findViewById(R.id.imageView);

        imageNameTextView = (TextView) itemView.findViewById(R.id.ImageNameTextView);
    }
}
}
