package com.example.thegroceryapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements ItemClickListener
{
    // 1. AdapterView:
    RecyclerView recyclerView;

    // 2. Data Source:
    List<Item> itemList;

    // 3.Adapter:
    MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerviewApp_activity_main);
        itemList = new ArrayList<>();

        Item Item_1 = new Item(R.drawable.fruit, "Fruits", "Fresh fruits from the garden.");
        Item Item_2 = new Item(R.drawable.vegitables, "Vegetables", "Delicious Vegetables.");
        Item Item_3 = new Item(R.drawable.bread, "Bread", "Bread, Wheat and Beans.");
        Item Item_4 = new Item(R.drawable.beverage, "Beverage", "Juice, Tea, Coffee and Soda.");
        Item Item_5 = new Item(R.drawable.milk, "Milk", "Milk, Shakes and Yogurt.");
        Item Item_6 = new Item(R.drawable.popcorn, "Snacks", "Pop Corn, Donut and Drinks.");

        itemList.add(Item_1);
        itemList.add(Item_2);
        itemList.add(Item_3);
        itemList.add(Item_4);
        itemList.add(Item_5);
        itemList.add(Item_6);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        myAdapter = new MyAdapter(itemList);
        recyclerView.setAdapter(myAdapter);

        myAdapter.setClickListener(this);
    }

    @Override
    public void onClick(View view, int position)
    {
        Toast.makeText(this, "You choose: " + itemList.get(position).getTextViewApp_itemTitle(), Toast.LENGTH_LONG).show();
    }
}
