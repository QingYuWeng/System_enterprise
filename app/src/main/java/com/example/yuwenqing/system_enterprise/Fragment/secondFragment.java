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

import com.example.yuwenqing.system_enterprise.Adapter.StudentAdapter;
import com.example.yuwenqing.system_enterprise.Class.Student;
import com.example.yuwenqing.system_enterprise.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yuwenqing on 2017/10/11.
 */

public class secondFragment extends Fragment {

    private List<Student> students=new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.second_fragment,container,false);
        Log.i("TAG","2");

        initStudent();
        RecyclerView recyclerView=view.findViewById(R.id.stu_recycler);
        LinearLayoutManager layoutManager=new LinearLayoutManager(view.getContext());
        StudentAdapter adapter=new StudentAdapter(students);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

        return view;
    }

    private void initStudent() {

        for(int i=0;i<2;i++)
        {
            Student student1=new Student(R.drawable.user,"离歌","软件工程师实习生","厦门理工学院","18060952783","1134328499@qq.com");
            students.add(student1);

            Student student2=new Student(R.drawable.user,"天问","系统架构师实习生","集美大学","18060952783","1134328499@qq.com");
            students.add(student2);

            Student student3=new Student(R.drawable.user,"凌虚","嵌入式实习生","厦门大学","18060952783","1134328499@qq.com");
            students.add(student3);

            Student student4=new Student(R.drawable.user,"水寒","软件评测师实习生","华侨大学","18060952783","1134328499@qq.com");
            students.add(student4);

            Student student5=new Student(R.drawable.user,"墨眉","软件工程师实习生","福州大学","18060952783","1134328499@qq.com");
            students.add(student5);
        }
    }


}
