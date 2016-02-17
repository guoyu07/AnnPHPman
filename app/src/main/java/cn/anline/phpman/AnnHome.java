package cn.anline.phpman;

import android.app.Notification;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

import java.net.URI;

public class AnnHome extends AppCompatActivity {

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ann_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //工具栏点击定义
            }
        });

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        final WebView webView = (WebView)findViewById(R.id.webView);
        webView.loadUrl("file:///android_asset/index.html");
        webView.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                return super.shouldOverrideUrlLoading(view, url);
            }
        });
//        Toolbar toolbar1 = (Toolbar) findViewById(R.id.toolbar);
//        toolbar1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                    webView.getTop();
//            }
//        });
    }
public void refesh(){
    onCreate(null);
}
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_ann_home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Intent setIntent = new Intent(AnnHome.this,SettingsActivity.class);
            startActivity(setIntent);
            return true;
        }
        if (id == R.id.action_about) {
            Intent aboutIntent = new Intent(AnnHome.this,AboutActivity.class);
            startActivity(aboutIntent);
            return true;
        }
        if (id == R.id.action_website) {
            Uri anUri = Uri.parse("http://www.anline.cn");
            startActivity(new Intent(Intent.ACTION_VIEW,anUri));
           return true;
        }
        if (id == R.id.action_taobao) {
//                打开安浪创想淘宝店

            return true;
        }
        if (id == R.id.action_wechat) {
//打开安浪创想微信

            return true;
        }
        if (id == R.id.action_exit) {
            Toast.makeText(getApplicationContext(),"程序正在退出",Toast.LENGTH_SHORT).show();
            Toast.makeText(getApplicationContext(),"清除此次占用内存....",Toast.LENGTH_SHORT).show();
            Toast.makeText(getApplicationContext(),"记得经常来学习哦~_~",Toast.LENGTH_SHORT).show();
//            try
//            {
//                Thread.sleep(5000);
//            }
//            catch (InterruptedException e)
//            {
//                e.printStackTrace();
//            }
            System.exit(0);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


}
