package com.example.yuwenqing.system_enterprise;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by yuwenqing on 2017/10/15.
 */

public class chatAdapter extends RecyclerView.Adapter<chatAdapter.ViewHolder> {

    private List<Message> mChatList;

    static class ViewHolder extends RecyclerView.ViewHolder{

        LinearLayout leftLayout;
        LinearLayout rightLayout;
        TextView leftMessage;
        TextView rightMessage;
        CircleImageView leftImage;
        CircleImageView rightImage;

        public ViewHolder(View itemView) {
            super(itemView);
            leftLayout=itemView.findViewById(R.id.chat_leftLayout);
            rightLayout=itemView.findViewById(R.id.chat_rightLayout);
            leftMessage=itemView.findViewById(R.id.left_message);
            rightMessage=itemView.findViewById(R.id.right_message);
            leftImage=itemView.findViewById(R.id.char_lift_icon);
            rightImage=itemView.findViewById(R.id.char_right_icon);
        }
    }

    public chatAdapter(List<Message> charList) {
        mChatList=charList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.chat_item,parent,false);
        ViewHolder holder=new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Message message=mChatList.get(position);
        if(message.getType()==Message.TYPE_RECEIVED)
        {
            holder.leftImage.setImageResource(message.getUserIcon());
            holder.leftLayout.setVisibility(View.VISIBLE);
            holder.rightLayout.setVisibility(View.GONE);
            holder.leftMessage.setText(message.getMessage());
        }else if (message.getType()==Message.TYPE_SEND)
        {
            holder.rightImage.setImageResource(message.getUserIcon());
            holder.rightLayout.setVisibility(View.VISIBLE);
            holder.leftLayout.setVisibility(View.GONE);
            holder.rightMessage.setText(message.getMessage());
        }
    }

    @Override
    public int getItemCount() {
        return mChatList.size();
    }
}
