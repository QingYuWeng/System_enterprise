package com.example.yuwenqing.system_enterprise;

import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by yuwenqing on 2017/10/12.
 */

public class StudentAdapter extends RecyclerView.Adapter<StudentAdapter.ViewHolder>
{
    private List<Student> myStudentList;

    public StudentAdapter(List<Student> studentList) {
        myStudentList=studentList;
    }

    static class ViewHolder extends RecyclerView.ViewHolder
    {
        CircleImageView stu_icon;
        TextView stu_name;
        TextView stu_info;
        public ViewHolder(View itemView) {
            super(itemView);
            stu_icon=itemView.findViewById(R.id.Student_icon);
            stu_name=itemView.findViewById(R.id.Student_name);
            stu_info=itemView.findViewById(R.id.Student_info);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.student_item,parent,false);
        ViewHolder viewHolder=new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Student student=myStudentList.get(position);
        holder.stu_icon.setImageResource(student.getStu_imageId());
        holder.stu_name.setText(student.getStu_name());
        holder.stu_info.setText(student.getStu_craeer());
    }

    @Override
    public int getItemCount() {
        return myStudentList.size();
    }
}
