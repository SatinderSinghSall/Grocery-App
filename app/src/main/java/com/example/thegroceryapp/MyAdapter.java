package com.example.thegroceryapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.security.PublicKey;
import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder>
{
    private List<Item> itemList;
    public ItemClickListener clickListener;

    public void setClickListener(ItemClickListener myListener)
    {
        this.clickListener = myListener;
    }

    public MyAdapter(List<Item> itemList)
    {
        this.itemList = itemList;
    }

    // Responsible for creating new view holders for your items.
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
        return new MyViewHolder(itemView);
    }

    // Binds the data from your dataset to the views within the view holder.
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position)
    {
        Item item = itemList.get(position);
        holder.imageViewApp_ItemImage.setImageResource(item.getImageViewApp_ItemImage());
        holder.textViewApp_itemTitle.setText(item.getTextViewApp_itemTitle());
        holder.textViewApp_itemDescription.setText(item.getTextViewApp_itemDescription());
    }

    // Returns the data from your dataset to the views within the view holder.
    @Override
    public int getItemCount()
    {
        return itemList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener
    {
        ImageView imageViewApp_ItemImage;
        TextView textViewApp_itemTitle;
        TextView textViewApp_itemDescription;

        public MyViewHolder(@NonNull View itemView)
        {
            super(itemView);
            imageViewApp_ItemImage = itemView.findViewById(R.id.imageViewApp_ItemImage);
            textViewApp_itemTitle = itemView.findViewById(R.id.textViewApp_itemTitle);
            textViewApp_itemDescription = itemView.findViewById(R.id.textViewApp_itemDescription);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view)
        {
            if (clickListener != null)
            {
                clickListener.onClick(view, getAdapterPosition());
            }
        }
    }
}
