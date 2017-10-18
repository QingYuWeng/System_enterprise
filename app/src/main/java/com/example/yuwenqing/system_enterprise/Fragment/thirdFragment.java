package com.example.yuwenqing.system_enterprise.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.yuwenqing.system_enterprise.R;

/**
 * Created by yuwenqing on 2017/10/11.
 */

public class thirdFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.third_fragment,container,false);
        Log.i("TAG","3");


        return view;
    }
}
