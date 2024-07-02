package account.fpoly.s_shop_client;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

public class HistoryOrderClient extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history_order_client);
        RecyclerView recyclerView = findViewById(R.id.Rcv_History);


    }
}