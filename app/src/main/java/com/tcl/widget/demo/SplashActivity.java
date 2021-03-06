package com.tcl.widget.demo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.Menu;
import android.widget.TextView;

import com.tcl.widget.demo.container.FragmentContainerActivity;
import com.tcl.widget.demo.ui.base.BaseActivity;
import com.tcl.widget.demo.ui.fragment.FloatViewFragment;

/**
 * @author Jerry
 * @Description:
 * @date 2016/9/10 11:08
 * @copyright TCL-MIG
 */

public class SplashActivity extends BaseActivity {
    TextView btn;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_splash);
        btn = (TextView) findViewById(R.id.btn);

        //FragmentContainerActivity.launch(this, TestWidgetFragment.class,null);
        //FragmentContainerActivity.launch(this, TestSlideSwitchFragment.class,null);
        //FragmentContainerActivity.launch(this, ThreeStepTestFragment.class,null);
        //FragmentContainerActivity.launch(this, GithubTestFragment.class,null);
        FragmentContainerActivity.launch(this, FloatViewFragment.class,null);
        //FragmentContainerActivity.launch(this, MemoryLeakFragment.class,null);
        finish();
        //test2
        //git push
        //test git stash
        //test git stash apply
        //


    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }


}
