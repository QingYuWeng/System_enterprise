package com.example.yuwenqing.system_enterprise;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by yuwenqing on 2017/10/11.
 */

public class messageAdapter extends RecyclerView.Adapter<messageAdapter.ViewHolder> {

    private List<Message> myMessageList;

    static class ViewHolder extends RecyclerView.ViewHolder
    {
        CircleImageView user_icon;
        TextView user_name;
        TextView user_message;
        TextView time;

        public ViewHolder(View itemView) {
            super(itemView);
            user_icon=itemView.findViewById(R.id.message_user_icon);
            user_name=itemView.findViewById(R.id.message_user_name);
            user_message=itemView.findViewById(R.id.message_user_message);
            time=itemView.findViewById(R.id.time);
        }
    }

    public messageAdapter(List<Message> messageList) {
        myMessageList=messageList;
    }

    @Override
    public ViewHolder onCreateViewHolder(final ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.message_item,parent,false);
        ViewHolder viewHolder=new ViewHolder(view);

        view.findViewById(R.id.Item_layout).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(parent.getContext(),"you clicked item",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(parent.getContext(),ChatActivity.class);
                parent.getContext().startActivity(intent);
            }
        });

        view.findViewById(R.id.btnDelete).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(parent.getContext(),"you clicked delete",Toast.LENGTH_SHORT).show();
            }
        });

        view.findViewById(R.id.btnTop).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(parent.getContext(),"you clicked Top",Toast.LENGTH_SHORT).show();
            }
        });

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        Message message=myMessageList.get(position);
        holder.user_icon.setImageResource(message.getUserIcon());
        holder.user_name.setText(message.getName());
        holder.user_message.setText(message.getMessage());
        holder.time.setText(message.getDate());
    }

    @Override
    public int getItemCount() {
        return myMessageList.size();
    }
}
