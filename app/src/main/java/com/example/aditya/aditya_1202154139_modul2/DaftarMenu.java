package com.example.aditya.aditya_1202154139_modul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class DaftarMenu extends AppCompatActivity {
    //membuat variable untuk menampung nilai
    private RecyclerView recyclerView;
    private DaftarMenuAdapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<String> Menu;
    private ArrayList<String> Price;
    private ArrayList<Integer> Gambar;

    //Daftar Menu
    private String[] menu = {"Fried Chicken", "Waffle", "Beef Burger", "Kentang Goreng", "Float", "Sundae"};
    //Daftar Harga
    private String[] price = {"55.000", "15.000", "74.000", "30.000", "40.000", "10.000"};
    //Daftar Gambar
    private int[] image = {R.drawable.friedchicken, R.drawable.waffle, R.drawable.beefburger, R.drawable.kentang, R.drawable.icefloat,
            R.drawable.sundae};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_menu);
        //membuat arraylist
        Menu = new ArrayList<>();
        Price = new ArrayList<>();
        Gambar = new ArrayList<>();
        recyclerView= findViewById(R.id.recyclerview);
        DaftarItem();
        //Menggunakan Layout Manager, Dan Membuat List Secara Vertical
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        adapter = new DaftarMenuAdapter(Menu, Price, Gambar);
        //Memasang Adapter pada RecyclerView
        recyclerView.setAdapter(adapter);
    }
    //membuat method untuk perulangan
    private void DaftarItem() {
        for (int w=0; w<menu.length; w++){
            Gambar.add(image[w]);
            Menu.add(menu[w]);
            Price.add(price[w]);
        }
    }
}