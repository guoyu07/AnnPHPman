package cn.anline.geek;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import cn.anline.phpman.R;
import cn.anline.qrcode.QRcodeIndexActivity;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        TextView textView1 = (TextView)findViewById(R.id.text3);
        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goQrHome = new Intent(HomeActivity.this, QRcodeIndexActivity.class);
                startActivity(goQrHome);
            }
        });
    }
}
