package com.vsga.listview;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Friend> friends = new ArrayList<>();
        friends.add(new Friend("Tri Cahyo Gusmantoro", "Denpasar, Bali"));
        friends.add(new Friend("Seri Wadanti", "Gianyar, Bali"));
        friends.add(new Friend("Cokorda Gde Agung", "Karangasem, Bali"));
        friends.add(new Friend("Anak Agung Bagus Sugiastika", "Denpasar, Bali"));
        friends.add(new Friend("Gede Giri Astra", "Buleleng, Bali"));
        friends.add(new Friend("Anak Agung Rama Wijaya", "Denpasar, Bali"));
        friends.add(new Friend("Aditya Wiguna", "Denpasar, Bali"));
        friends.add(new Friend("Ryan Adhitama", "Denpasar, Bali"));
        friends.add(new Friend("Arip Hardikusuma", "Denpasar, Bali"));
        friends.add(new Friend("Ida Bagus Surya Putrawan", "Karangasem, Bali"));
        friends.add(new Friend("Putu Bayu", "Buleleng, Bali"));
        friends.add(new Friend("Valdo Dicky", "Denpasar, Bali"));


        CustomAdapter adapter = new CustomAdapter(friends, friend ->
                Toast.makeText(
                        MainActivity.this,
                        friend.getName() + ", asal : " + friend.getAddress(),
                        Toast.LENGTH_SHORT
                ).show()
        );

        RecyclerView rvMain = findViewById(R.id.rvMain);
        rvMain.setAdapter(adapter);
        rvMain.setLayoutManager(new LinearLayoutManager(this));
    }
}