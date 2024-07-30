// This class 'item' acting as a model class for recyclerView.

package com.example.thegroceryapp;

public class Item
{
    int imageViewApp_ItemImage;
    String textViewApp_itemTitle;
    String textViewApp_itemDescription;

    public Item(int imageViewApp_ItemImage, String textViewApp_itemTitle, String textViewApp_itemDescription)
    {
        this.imageViewApp_ItemImage = imageViewApp_ItemImage;
        this.textViewApp_itemTitle = textViewApp_itemTitle;
        this.textViewApp_itemDescription = textViewApp_itemDescription;
    }

    public int getImageViewApp_ItemImage()
    {
        return imageViewApp_ItemImage;
    }

    public void setImageViewApp_ItemImage(int imageViewApp_ItemImage)
    {
        this.imageViewApp_ItemImage = imageViewApp_ItemImage;
    }

    public String getTextViewApp_itemTitle()
    {
        return textViewApp_itemTitle;
    }

    public void setTextViewApp_itemTitle(String textViewApp_itemTitle)
    {
        this.textViewApp_itemTitle = textViewApp_itemTitle;
    }

    public String getTextViewApp_itemDescription()
    {
        return textViewApp_itemDescription;
    }

    public void setTextViewApp_itemDescription(String textViewApp_itemDescription)
    {
        this.textViewApp_itemDescription = textViewApp_itemDescription;
    }
}
