package com.example.huangyachong.myapplication;

import android.content.ComponentName;
import android.content.pm.PackageManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private PackageManager mPackageManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mPackageManager=getApplicationContext().getPackageManager();





    }

    public void click(View view){
        //获取当前的ComponentName
        ComponentName currentName=getComponentName();
        if (!currentName.getClassName().equals("com.example.huangyachong.myapplication.tag_11")){
            ComponentName double11=new ComponentName(getBaseContext(),"com.example.huangyachong.myapplication.tag_11");
            disableComponent(currentName);
            enableComponent(double11);
        }else if (!currentName.getClassName().equals("com.example.huangyachong.myapplication.tag_12")){
            ComponentName double12=new ComponentName(getBaseContext(),"com.example.huangyachong.myapplication.tag_12");
            disableComponent(currentName);
            enableComponent(double12);
        }
    }

    //启用组件
    public void enableComponent(ComponentName componentName){
        mPackageManager.setComponentEnabledSetting(componentName,
                PackageManager.COMPONENT_ENABLED_STATE_ENABLED,PackageManager.DONT_KILL_APP);
    }

    //隐藏组件
    public void disableComponent(ComponentName componentName){
        mPackageManager.setComponentEnabledSetting(componentName,
                PackageManager.COMPONENT_ENABLED_STATE_DISABLED,PackageManager.DONT_KILL_APP);
    }

}
