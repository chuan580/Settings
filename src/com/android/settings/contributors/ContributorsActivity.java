package com.android.settings.contributors;

import android.app.Activity;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.KeyEvent;
import android.view.Window;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

import com.android.settings.R;

/**
 * Created by SXJ on 2016/7/29.
 */
public class ContributorsActivity extends Activity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_contributors);
        webView = (WebView) findViewById(R.id.webView);
        webView.loadUrl("http://123.56.84.246:8080/dos/teamDevelopmentTest/index.html");
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new MyWebViewClient());
    }

    private class MyWebViewClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            if (!isQuit) {
                isQuit = true;
                mTimeCount = new TimeCount(2500, 500);
                mTimeCount.start();
                Toast.makeText(this, "再次点击确定退出", Toast.LENGTH_SHORT).show();
            } else {
                finish();
            }
        } else {
        }
        return false;
    }

    private TimeCount mTimeCount;
    private boolean isQuit = false;

    class TimeCount extends CountDownTimer {
        public TimeCount(long millisInFuture, long countDownInterval) {
            super(millisInFuture, countDownInterval);//参数依次为总时长,和计时的时间间隔
        }

        @Override
        public void onFinish() {//计时完毕时触发
            isQuit = false;
        }

        @Override
        public void onTick(long millisUntilFinished) {
        }
    }
}
