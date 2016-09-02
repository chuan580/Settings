package com.android.settings.notification;

import com.android.settings.notification.NotificationAppList.Backend;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class ClearNotificationBroadCast extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
		// 得到广播中得到的数据，并显示出来
		String pkg = intent.getStringExtra("pkg");
		int uid = intent.getIntExtra("uid", 0);
		Boolean banned = intent.getBooleanExtra("banned", true);
		
	    Backend backend = new Backend();
	    backend.setNotificationsBanned(pkg, uid, banned);
	}

}
