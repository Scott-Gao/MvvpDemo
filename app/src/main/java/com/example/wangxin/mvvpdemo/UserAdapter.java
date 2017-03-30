package com.example.wangxin.mvvpdemo;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.wangxin.mvvpdemo.databinding.UserItemBinding;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wAngxIn on 2017/3/27.
 */

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserHolder> {
    private static final int USER_COUNT = 50;

    private List<User> users;

    public UserAdapter() {
        users = new ArrayList<>();
        for (int i = 0; i < USER_COUNT; i ++) {
            User user = new User("zhao", "gaofeng"+i,i);
            users.add(user);
        }
    }

    public  class UserHolder extends RecyclerView.ViewHolder{
        private UserItemBinding mBinding;
        private Context activity;
        public UserHolder(View itemView, Context context) {
            super(itemView);
            mBinding = DataBindingUtil.bind(itemView);
            activity=context;
        }
        public void bind(User user,int position){
            if(position>10){
                mBinding.tvLastname.setBackgroundColor(activity.getResources().getColor(R.color.green));
            }
            mBinding.setUser(user);
        }
    }

    @Override
    public UserAdapter.UserHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.user_item, parent, false);
        return new UserHolder(itemView,parent.getContext());
    }

    @Override
    public void onBindViewHolder(UserAdapter.UserHolder holder, int position) {
        holder.bind(users.get(position),position);
    }

    @Override
    public int getItemCount() {
        return users.size();
    }
}
