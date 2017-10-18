package com.example.yuwenqing.system_enterprise.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.yuwenqing.system_enterprise.Adapter.messageAdapter;
import com.example.yuwenqing.system_enterprise.Class.Message;
import com.example.yuwenqing.system_enterprise.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yuwenqing on 2017/10/11.
 */

public class firstFragment extends Fragment {

    private List<Message> messageList=new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.first_fragment,container,false);
        Log.i("TAG","1");


        initMessage();
        RecyclerView recyclerView=view.findViewById(R.id.message);
        LinearLayoutManager layoutManager=new LinearLayoutManager(view.getContext());
        messageAdapter adapter=new messageAdapter(messageList);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }


    void initMessage()
    {
        for(int i=0;i<2;i++)
        {
            Message message1=new Message(R.drawable.user,"荆轲","你好，我是荆轲，来应聘软件工程师的，请问这个岗位目前还有空缺吗?","2017-10-11",Message.TYPE_RECEIVED);
            messageList.add(message1);
            Message message2=new Message(R.drawable.user,"荆天明","你好，我是荆天明，来应聘软件工程师的，请问这个岗位目前还有空缺吗?","2017-10-11",Message.TYPE_RECEIVED);
            messageList.add(message2);
            Message message3=new Message(R.drawable.user,"盖聂","你好，我是盖聂，来应聘软件工程师的，请问这个岗位目前还有空缺吗?","2017-10-11",Message.TYPE_RECEIVED);
            messageList.add(message3);
            Message message4=new Message(R.drawable.user,"盗跖","你好，我是盗跖，来应聘软件工程师的，请问这个岗位目前还有空缺吗?","2017-10-11",Message.TYPE_RECEIVED);
            messageList.add(message4);
            Message message5=new Message(R.drawable.user,"少羽","你好，我是少羽，来应聘软件工程师的，请问这个岗位目前还有空缺吗?","2017-10-11",Message.TYPE_RECEIVED);
            messageList.add(message5);
            Message message6=new Message(R.drawable.user,"月儿","你好，我是月儿，来应聘软件工程师的，请问这个岗位目前还有空缺吗?","2017-10-11",Message.TYPE_RECEIVED);
            messageList.add(message6);
            Message message7=new Message(R.drawable.user,"东皇太一","你好，我是东皇太一，来应聘软件工程师的，请问这个岗位目前还有空缺吗?","2017-10-11",Message.TYPE_RECEIVED);
            messageList.add(message7);
            Message message8=new Message(R.drawable.user,"张良","你好，我是张良，来应聘软件工程师的，请问这个岗位目前还有空缺吗?","2017-10-11",Message.TYPE_RECEIVED);
            messageList.add(message8);
            Message message9=new Message(R.drawable.user,"高渐离","你好，我是高渐离，来应聘软件工程师的，请问这个岗位目前还有空缺吗?","2017-10-11",Message.TYPE_RECEIVED);
            messageList.add(message9);

        }
    }
}
