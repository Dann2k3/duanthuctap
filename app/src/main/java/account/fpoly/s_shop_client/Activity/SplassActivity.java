package account.fpoly.s_shop_client.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import account.fpoly.s_shop_client.R;

public class SplassActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splass);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Start your main activity here
                Intent mainIntent = new Intent(getBaseContext(), DangNhapActivity.class);
                startActivity(mainIntent);
                finish();
            }
        }, 2);
    }
}