package com.example.wangxin.mvvpdemo;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewStub;

import com.example.wangxin.mvvpdemo.databinding.SecondActivityBinding;

/**
 * Created by wAngxIn on 2017/3/27.
 */

public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        final SecondActivityBinding secondActivityBinding= DataBindingUtil.setContentView(SecondActivity.this,
                R.layout.second_activity);
        final Person person = new Person("zhang","san",38);
        secondActivityBinding.setPerson(person);
        secondActivityBinding.secondBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                person.setFirstName("li");
                person.setLastName("si");
                person.setAge(40);
                secondActivityBinding.secondBtn1.setText("已改变");


            }
        });

        //view_stub
        secondActivityBinding.viewStub.setOnInflateListener(new ViewStub.OnInflateListener() {
            @Override
            public void onInflate(ViewStub stub, View inflated) {
//                ViewStubBinding binding = DataBindingUtil.bind(inflated);
//                User user = new User("fee", "lang");
//                binding.setUser(user);
            }
        });
    }

   /* <com.liangfeizc.databindingsamples.attributesetters.UserView
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:paddingLeft="@dimen/largePadding"
    app:onClickListener="@{activity.clickListener}"
    app:firstName="@{@string/firstName}"
    app:lastName="@{@string/lastName}"
    app:age="27" />*/

}
