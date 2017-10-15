package com.example.yuwenqing.system_enterprise;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ChatActivity extends AppCompatActivity {

    private List<Message> chatMessageList=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        Toolbar toolbar=(Toolbar)findViewById(R.id.chat_toolbar);
        setSupportActionBar(toolbar);

        Message message=(Message)getIntent().getSerializableExtra("message");
        chatMessageList.add(message);

        TextView title=(TextView)findViewById(R.id.chat_barTitle);
        title.setText(message.getName());

        final RecyclerView recyclerview=(RecyclerView)findViewById(R.id.chat_recyclerView);
        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        final chatAdapter adapter=new chatAdapter(chatMessageList);
        recyclerview.setAdapter(adapter);
        recyclerview.setLayoutManager(layoutManager);

        Button send=(Button)findViewById(R.id.send);
        final EditText test=(EditText)findViewById(R.id.input_text);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String content=test.getText().toString();
                if(!"".equals(content))
                {
                    Message msg=new Message(R.drawable.user,"boss",content,"2017-10-20",Message.TYPE_SEND);
                    chatMessageList.add(msg);
                    adapter.notifyItemInserted(chatMessageList.size()-1);
                    recyclerview.scrollToPosition(chatMessageList.size()-1);
                    test.setText("");
                }
            }
        });



    }

}
