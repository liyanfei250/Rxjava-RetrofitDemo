package util;

import android.app.Application;


public class APPApplication extends Application {

    public void onCreate() {
        super.onCreate();
        init();
    }
    
    private void init() {

        ToastUtils.init(this);

    }
    
}
