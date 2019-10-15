package com.usamaa.cv.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.usamaa.cv.Education_Item;
import com.usamaa.cv.base.R;

import java.util.List;

public class EducationAdapter extends RecyclerView.Adapter<EducationAdapter.DemoItemHolder>{
    private List<Education_Item> education_items;
    private Context        context;

    public EducationAdapter(List<Education_Item> demoItems, Context context) {
        this.education_items   = demoItems;
        this.context     = context;
    }

    @NonNull
    @Override
    public DemoItemHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        view=LayoutInflater.from(context).inflate(R.layout.education,parent,false);
        DemoItemHolder demoItemHolder=new DemoItemHolder(view);
        return demoItemHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull DemoItemHolder holder, int position) {

        holder.tv_institute_name.setText(education_items.get(position).institute_name);
        holder.tv_yearr.setText(education_items.get(position).year);
        holder.tv_Degree_name.setText(education_items.get(position).Degree_name);
        holder.im_Institue_Image.setImageResource(education_items.get(position).Institue_Image);

        
    }

    @Override
    public int getItemCount() {
        return education_items.size();
    }


    public class DemoItemHolder extends RecyclerView.ViewHolder {

        private TextView tv_institute_name;
        private TextView tv_Degree_name;
        private TextView tv_yearr;
        private ImageView im_Institue_Image;


        DemoItemHolder(View itemView) {
            super(itemView);

            tv_institute_name=(TextView) itemView.findViewById(R.id.textView7);
            tv_Degree_name=(TextView) itemView.findViewById(R.id.textView5);
            tv_yearr=(TextView) itemView.findViewById(R.id.textView8);
            im_Institue_Image=(ImageView) itemView.findViewById(R.id.imageView2);

        }
    }
}
