package fauzi.hilmy.kuisretrofitgit.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

import fauzi.hilmy.kuisretrofitgit.R;
import fauzi.hilmy.kuisretrofitgit.response.DataItem;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {
    private Context context;
    private List<DataItem> list;

    public static final String Url = "http://192.168.10.46/gitlat/";

    public CustomAdapter(Context context, List<DataItem> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public CustomAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomAdapter.MyViewHolder holder, int position) {
        final String url_image = Url+"upload/"+list.get(position).getImage();
        holder.txtNama.setText(list.get(position).getName());
        holder.txtAlamat.setText(list.get(position).getAddress());
        Glide.with(context)
                .load(url_image)
                .into(holder.imgView);

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView imgView;
        TextView txtNama, txtAlamat;

        public MyViewHolder(View itemView) {
            super(itemView);
            imgView = itemView.findViewById(R.id.img);
            txtNama = itemView.findViewById(R.id.txtNama);
            txtAlamat = itemView.findViewById(R.id.txtAlamat);
        }
    }
}
