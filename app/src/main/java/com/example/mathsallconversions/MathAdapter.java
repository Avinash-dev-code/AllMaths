package com.example.mathsallconversions;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

public class MathAdapter extends RecyclerView.Adapter<MathAdapter.MathViewHolder> {
    String[] data;

    public MathAdapter(String[] data){
        this.data=data;

    }
    @NonNull
    @Override
    public MathViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.activity_grid_data,parent,false);
        return new MathViewHolder(view);
    }

    @SuppressLint("ResourceAsColor")
    @Override
    public void onBindViewHolder(@NonNull MathViewHolder holder, int position) {
        String options=data[position];
        holder.textView.setText(options);
        switch (holder.getAdapterPosition()){
            case 0:
                holder.textView.setBackgroundColor(Color.RED);
                break;
            case 1:
                holder.textView.setBackgroundColor(Color.BLUE);
                break;
            case 2:
                holder.textView.setBackgroundResource(R.color.colorPrimary);
                break;
            case 3:
                holder.textView.setBackgroundColor(Color.GREEN);
                break;
            case 4:
                holder.textView.setBackgroundColor(Color.BLUE);
                break;

            case 5:
                holder.textView.setBackgroundColor(Color.RED);
                break;
            case 6:
                holder.textView.setBackgroundResource(R.color.color11);
                break;
            case 7:
                holder.textView.setBackgroundResource(R.color.color12);
                break;
            case 8:
                holder.textView.setBackgroundResource(R.color.color14);
                break;
            case 9:
                holder.textView.setBackgroundResource(R.color.colorPrimaryDark);
            default:


        }


    }

    @Override

    public int getItemCount() {
        return data.length;
    }

    public class MathViewHolder extends RecyclerView.ViewHolder {
        TextView textView;
        public MathViewHolder(@NonNull View itemView) {
            super(itemView);
            textView=(TextView)itemView.findViewById(R.id.data1);
            textView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


            switch (getAdapterPosition()){
                case 0:
                    textView.setBackgroundColor(Color.RED);
                    break;
                case 1:
                    textView.setBackgroundColor(Color.BLUE);
                    break;
                case 2:
                    textView.setBackgroundResource(R.color.colorPrimary);
                    Intent intent=new Intent(v.getContext(),MeterToInch.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP|Intent.FLAG_ACTIVITY_NO_ANIMATION);
                    v.getContext().startActivity(intent);
                    break;
                case 3:
                    textView.setBackgroundColor(Color.GREEN);
                    Intent intent2=new Intent(v.getContext(),KmtoMeter.class);
                    intent2.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP|Intent.FLAG_ACTIVITY_NO_ANIMATION);
                    v.getContext().startActivity(intent2);
                    break;
                case 4:
                    textView.setBackgroundColor(Color.BLUE);
                    break;

                case 5:
                    textView.setBackgroundColor(Color.RED);
                    break;
                case 6:
                    textView.setBackgroundResource(R.color.color11);
                    break;
                case 7:
                    textView.setBackgroundResource(R.color.color12);
                    break;
                case 8:
                    textView.setBackgroundResource(R.color.color14);
                    break;
                case 9:
                    textView.setBackgroundResource(R.color.colorPrimaryDark);
                default:


            }
                }
            });
        }
    }
}
