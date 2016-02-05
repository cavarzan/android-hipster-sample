package io.github.cavarzan.services.push;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;

import io.github.cavarzan.application.App;

import com.google.android.gms.gcm.GcmListenerService;
import com.google.gson.Gson;

import javax.inject.Inject;

public class PushServiceListener extends GcmListenerService {

    @Override
    public void onCreate() {
        super.onCreate();
        App.graph.inject(this);
    }

    @Override
    public void onMessageReceived(String from, Bundle data) {
        IntentFilter filter = new IntentFilter();
        filter.addAction("Events.PUSH");
        Intent broadcast = new Intent();
        broadcast.putExtras(data);
        broadcast.setAction("Events.PUSH");
        sendOrderedBroadcast(broadcast, null, null, null, Activity.RESULT_OK, null, data);
    }
}
