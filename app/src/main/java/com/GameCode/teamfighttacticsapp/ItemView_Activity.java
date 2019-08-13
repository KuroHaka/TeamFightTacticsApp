package com.GameCode.teamfighttacticsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import com.GameCode.teamfighttacticsapp.Items.Item;
import com.GameCode.teamfighttacticsapp.Items.ItemPrimitivo;

public class ItemView_Activity extends AppCompatActivity {
    Resources resources = getResources();
    ImageView itemView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_view_);
        itemView = findViewById(R.id.itemViewer);
        itemView.setImageDrawable(resources.getDrawable(R.drawable.arcorecurvo_base));
    }


    private void SetPrimitiveImageInButton(Button but1, Button but2, Item item){
        but1.setBackground(resources.getDrawable(getParentImagePath(item,0)));
        but2.setBackground(resources.getDrawable(getParentImagePath(item,1)));
    }
    private int getParentImagePath(Item itemId, int parentId){ //parentId should be 0 or 1
        ItemPrimitivo[] itemsPrimitivos = itemId.getPadres();
        return itemsPrimitivos[parentId].getImagePath();
    }
}
