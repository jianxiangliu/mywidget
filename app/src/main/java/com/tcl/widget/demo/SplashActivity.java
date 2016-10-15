package com.tcl.widget.demo;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.tcl.widget.demo.container.FragmentContainerActivity;
import com.tcl.widget.demo.service.LocalCastielService;
import com.tcl.widget.demo.service.RemoteCastielService;

/**
 * @author Jerry
 * @Description:
 * @date 2016/9/10 11:08
 * @copyright TCL-MIG
 */

public class SplashActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //CirclProgressActivity.launch(this);
       // CanvasActivity.launch(this);
        //PieActivity.launch(this);
        //CheckViewActivity.launch(this);
        //RadarActivity.launch(this);
        //FragmentContainerActivity.launch(this,RadarFragment.class, null);
        //FragmentContainerActivity.launch(this,BeizerFragment.class, null);
        FragmentContainerActivity.launch(this,BeizerFragment2.class, null);
        //FragmentContainerActivity.launch(this,PathBooleanFragment.class, null);
        finish();

        // 启动本地服务和远程服务
        // 启动本地服务和远程服务
        startService(new Intent(this, LocalCastielService.class));
        startService(new Intent(this, RemoteCastielService.class));
    }
}
