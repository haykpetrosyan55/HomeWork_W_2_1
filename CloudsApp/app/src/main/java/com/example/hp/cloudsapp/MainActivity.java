package com.example.hp.cloudsapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ArrayList<CloudsModel> cloudsModelArrayList = CloudProvider.getProviderCloud(this);
        final CloudAdapter cloudAdapter = new CloudAdapter(this, R.layout.cloud_item, cloudsModelArrayList);
        ListView listView = findViewById(R.id.cloudsListID);
        listView.setAdapter(cloudAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Uri uri = Uri.parse(cloudsModelArrayList.get(position).getInformationUri());
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
    }
}
