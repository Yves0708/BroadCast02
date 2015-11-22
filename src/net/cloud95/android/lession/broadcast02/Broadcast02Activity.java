package net.cloud95.android.lession.broadcast02;

import java.util.List;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;

public class Broadcast02Activity extends Activity {
    
    private Switch timetick_service_switch, boot_service_switch, phonestate_service_switch;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_broadcast02);
        
        processViews();
        // 準備註冊與移除廣播接收元件的IntentFilter物件
        // 建立啟動服務的Intent物件
    }

    @Override
    protected void onResume() {
        super.onResume();
        
        // 註冊廣播接收元件
    }
    
    @Override
    protected void onPause() {
        // 移除廣播接收元件
        // 停止服務
        //stopService(intentTimeTickService);
        //stopService(intentBootCompletedService);
        //stopService(intentPhoneStateService);
        
        super.onPause();
    }

    public void clickTimeTickSwitch(View view) {
        Switch switchView = (Switch)view;
        
            // 建立廣播接收元件物件
            // 註冊廣播接收元件
                // 移除廣播接收元件
    }
    
    public void clickTimeTickServiceSwitch(View view) {
        Switch switchView = (Switch)view;
        
            // 啟動服務
            // 停止服務
    }
    
    public void clickBootServiceSwitch(View view) {
        Switch switchView = (Switch)view;
        
            // 啟動服務
            // 停止服務
    }    
    
    public void clickPhoneStateServiceSwitch(View view) {
        Switch switchView = (Switch)view;
            // 啟動服務
            // 停止服務
    }       
    
    private void processViews() {
        timetick_service_switch = (Switch) findViewById(R.id.timetick_service_switch);
        boot_service_switch = (Switch) findViewById(R.id.boot_service_switch);
        phonestate_service_switch = (Switch) findViewById(R.id.phonestate_service_switch);
    }
    
    // 判斷參數指定的元件類別是否正在運作中
        // 取得系統ActivityManager物件
        // 取得正在運作中的服務元件
        // 建立參數指定服務元件的ComponentName物件
        // 比對與判斷服務元件是否在運作中
    
}
