package com.example.demoretrofit;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final RecyclerView recyclerView = findViewById(R.id.RecyclerView);

        ArrayList<Data> data = new ArrayList<>();

        final RetofitAdapter retofitAdapter = new RetofitAdapter(data);

        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));

        recyclerView.setAdapter(retofitAdapter);

        Retrofit retrofit = APIClient.getClient();

        RequcstAPI callApi = retrofit.create(RequcstAPI.class);

        callApi.listData().enqueue(new Callback<List<Data>>() {
            @Override
            public void onResponse(Call<List<Data>> call, Response<List<Data>> response) {
                if(response.isSuccessful()) {
                    List<Data> data = response.body();
                    retofitAdapter.setArrayList((ArrayList<Data>) data);
                    retofitAdapter.notifyDataSetChanged();
                } else {
                    Log.e("a","Fail");
                }
            }

            @Override
            public void onFailure(Call<List<Data>> call, Throwable t) {
                Log.e("a","loi");
            }
        });

    }
}
