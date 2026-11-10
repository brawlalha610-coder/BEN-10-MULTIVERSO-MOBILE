package com.multiverso.ben10;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
public class MainActivity extends Activity {
 @Override public void onCreate(Bundle state) {
  super.onCreate(state);
  getWindow().getDecorView().setSystemUiVisibility(5894 | 1024 | 512);
  WebView web = new WebView(this);
  WebSettings s = web.getSettings(); s.setJavaScriptEnabled(true); s.setDomStorageEnabled(true);
  setContentView(web); web.loadUrl("file:///android_asset/index.html");
 }
}