package jibin_mdb.apps.com.jibin.jibin_mdb;

import android.app.Application;



public final class Mdb_Application extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Mdb_Application vInstance = this;
//        if (LeakCanary.isInAnalyzerProcess(vInstance)) {
//            return;
//        }
//        LeakCanary.install(vInstance);
    }
}
