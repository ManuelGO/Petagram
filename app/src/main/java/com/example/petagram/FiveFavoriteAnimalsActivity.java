package com.example.petagram;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.petagram.adapters.PetAdapter;
import com.example.petagram.pojo.Pet;

import java.util.ArrayList;

public class FiveFavoriteAnimalsActivity extends AppCompatActivity {
    ArrayList<Pet> favoritePets;
    private RecyclerView recyclerView;
    Toolbar childActionbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_five_favorite_animals);

        childActionbar = (Toolbar) findViewById(R.id.action_bar2);
        setSupportActionBar(childActionbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        recyclerView = (RecyclerView) findViewById(R.id.favorites_recycler_view);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        recyclerView.setLayoutManager(llm);

        initPetList();
        initAdapter();
    }

    public void initAdapter() {
        PetAdapter adapter = new PetAdapter(favoritePets, this);
        recyclerView.setAdapter(adapter);
    }

    public void initPetList() {
        favoritePets = new ArrayList<Pet>();
        favoritePets.add(new Pet("Fox", "1", R.drawable.icons8_fox_96));
        favoritePets.add(new Pet("Nemo", "4", R.drawable.icons8_fish_96));
        favoritePets.add(new Pet("Pandy", "2", R.drawable.icons8_red_panda_96));
        favoritePets.add(new Pet("Kitty", "3", R.drawable.icons8_cat_head_96));
        favoritePets.add(new Pet("Doggy", "1", R.drawable.icons8_pug_96));
    }

}
