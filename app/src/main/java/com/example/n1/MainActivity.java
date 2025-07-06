package com.example.n1;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setDataAndType(Uri.parse("https://sn.rs/n1stream"), "video/*");
        intent.setPackage("org.videolan.vlc");
        startActivity(intent);
        finish();
    }
}
