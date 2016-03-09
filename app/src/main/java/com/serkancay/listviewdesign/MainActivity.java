package com.serkancay.listviewdesign;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    ListAdapter adapter;
    List<Kisi> kisiler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listView);
        // Kişiler listemizi tanımlayıp içine bilgileri giriyoruz.
        kisiler = new ArrayList<>();
        kisiler.add(new Kisi("Serkan", "Çay", "Kahramanmaraş", "Java&Android", R.drawable.serkan_profile));
        kisiler.add(new Kisi("Yaprak", "Kaya", "Kayseri", "PHP", R.drawable.yaprak_profile));
        kisiler.add(new Kisi("Dennis", "Ritchie", "New York", "C", R.drawable.ritchie_profile));
        kisiler.add(new Kisi("James", "Gosling", "Alberta", "Java", R.drawable.gosling_profile));
        kisiler.add(new Kisi("Linus", "Torvalds", "Helsinki", "Linux", R.drawable.torvalds_profile));
        kisiler.add(new Kisi("Anders", "Hejlsberg", "Kopenhag", "C#", R.drawable.hejlsberg_profile));
        kisiler.add(new Kisi("Tim", "Berners-Lee", "Londra", "Web", R.drawable.berners_profile));
        // Adaptörümüzü oluşturup ListView'a set ediyoruz.
        adapter = new ListAdapter(this, kisiler);
        listView.setAdapter(adapter);
    }
}
