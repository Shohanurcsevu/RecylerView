package com.example.recyclerviewok;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.MyViewHolder> {

    private Context context;
    private ArrayList<UserModel> dataList;

    public UserAdapter(Context context) {
        this.context = context;
        this.dataList=new ArrayList<>();

        this.dataList.add(new UserModel("Shohanur","Rahman","shohanurvu@gmail.com",R.drawable.profile));
        this.dataList.add(new UserModel("Shohanur","Rahman","shohanurvu@gmail.com",R.drawable.profile));
        this.dataList.add(new UserModel("Shohanur","Rahman","shohanurvu@gmail.com",R.drawable.profile));
        this.dataList.add(new UserModel("Shohanur","Rahman","shohanurvu@gmail.com",R.drawable.profile));
        this.dataList.add(new UserModel("Shohanur","Rahman","shohanurvu@gmail.com",R.drawable.profile));
        this.dataList.add(new UserModel("Shohanur","Rahman","shohanurvu@gmail.com",R.drawable.profile));
        this.dataList.add(new UserModel("Shohanur","Rahman","shohanurvu@gmail.com",R.drawable.profile));
        this.dataList.add(new UserModel("Shohanur","Rahman","shohanurvu@gmail.com",R.drawable.profile));
        this.dataList.add(new UserModel("Shohanur","Rahman","shohanurvu@gmail.com",R.drawable.profile));

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.user_list,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.setData(dataList.get(position));


    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView fName,lName,eMail;
        private ImageView imge;




        public MyViewHolder(View itemView) {

            super(itemView);
            fName=itemView.findViewById(R.id.tvFirstName);
            lName=itemView.findViewById(R.id.tvLastName);
            eMail=itemView.findViewById(R.id.tvEmail);
            imge=itemView.findViewById(R.id.imageView);


        }

        public void setData(UserModel userModel) {

            fName.setText(userModel.getFirstname());
            lName.setText(userModel.getLastName());
            eMail.setText(userModel.getEmail());
            imge.setImageResource(userModel.getImageview());



        }
    }
}
