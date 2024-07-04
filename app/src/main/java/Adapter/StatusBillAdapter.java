package Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import account.fpoly.s_shop_client.Modal.BillMore;
import account.fpoly.s_shop_client.R;

public class StatusBillAdapter extends RecyclerView.Adapter<StatusBillAdapter.StatusBillViewHolder> {
    Context context;
    List<BillMore> list;

    public StatusBillAdapter(Context context, List<BillMore> list) {
        this.context = context;
        this.list = list;
    }
    @NonNull
    @Override
    public StatusBillViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.iteam_status_product,parent,false);
        return new StatusBillViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StatusBillViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class StatusBillViewHolder extends RecyclerView.ViewHolder {
        TextView totalPrice,statusPro,xacnhanPro,huydon;
        TextView maDonhang,tv_name,tv_phonenumber,tv_address,mualai;
        ImageView imageBill;
        RecyclerView nestedRecyclerView;
        public StatusBillViewHolder(@NonNull View itemView) {
            super(itemView);

            maDonhang = itemView.findViewById(R.id.maDonhang);
            tv_name = itemView.findViewById(R.id.tv_name);
            tv_phonenumber = itemView.findViewById(R.id.tv_phonenumber);
            tv_address = itemView.findViewById(R.id.tv_address);
            mualai = itemView.findViewById(R.id.mualai);



            xacnhanPro = itemView.findViewById(R.id.xacnhanPros);
            totalPrice = itemView.findViewById(R.id.totalPrice);
            statusPro = itemView.findViewById(R.id.statusPro);
            huydon = itemView.findViewById(R.id.huydon);
            nestedRecyclerView = itemView.findViewById(R.id.nestedRecyclerView);
        }
    }
}

