package net.cloud95.android.lession.broadcast02;

import android.app.Service;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.IBinder;

// 繼承自Service的服務元件
public class TimeTickService extends Service {  
    
    // 廣播接收元件
    @Override
    public IBinder onBind(Intent intent) {
    }

    @Override
    public void onCreate() {
        super.onCreate();
        
        // 建立廣播接收元件物件
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        // 準備註冊與移除廣播接收元件的IntentFilter物件
        // 註冊廣播接收元件
    }

    @Override
    public void onDestroy() {
        // 移除廣播接收元件
        super.onDestroy();
    }
}
