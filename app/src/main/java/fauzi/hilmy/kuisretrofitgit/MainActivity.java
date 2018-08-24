package fauzi.hilmy.kuisretrofitgit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import fauzi.hilmy.kuisretrofitgit.adapter.CustomAdapter;
import fauzi.hilmy.kuisretrofitgit.api.Client;
import fauzi.hilmy.kuisretrofitgit.api.Server;
import fauzi.hilmy.kuisretrofitgit.response.DataItem;
import fauzi.hilmy.kuisretrofitgit.response.ResponseData;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    CustomAdapter adapter;
    List<DataItem> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        getData();
    }

    private void getData() {
        Server server = Client.getInstance();
        Call<ResponseData> call = server.response_read();
        call.enqueue(new Callback<ResponseData>() {
            @Override
            public void onResponse(Call<ResponseData> call, Response<ResponseData> response) {
                Boolean status = response.body().isSuccess();
                if (status){
                    list = response.body().getData();
                    adapter = new CustomAdapter(MainActivity.this, list);
                    recyclerView.setAdapter(adapter);
                }
            }

            @Override
            public void onFailure(Call<ResponseData> call, Throwable t) {

            }
        });
    }
}
