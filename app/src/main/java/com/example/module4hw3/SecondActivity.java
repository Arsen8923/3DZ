package com.example.module4hw3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {

    List<Fish> fishes = new ArrayList<Fish>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        setInitialData();

        RecyclerView recyclerView = findViewById(R.id.list_animal);

        FishAdapter adapter = new FishAdapter(this, fishes);

        recyclerView.setAdapter(adapter);
    }
    private void setInitialData(){
        fishes.add(new Fish("Мухамор","ядовитый гриб с ярким красным шляпкой и белыми пятнами, известный своей токсичностью и психоделическими свойствами ",
                R.drawable.fish1,"Опасность не съедобный"));
        fishes.add(new Fish("Опята"," съедобный гриб с оранжево-желтой шляпкой и желтоватым споровым порошком, популярный в кулинарии благодаря своему насыщенному аромату и вкусу.",
                R.drawable.fish2,"Опасность Съедобный"));
        fishes.add(new Fish("Рядовка","гриб с плоской шляпкой и рядом пластинок под ней, часто обладающий яркой окраской, который можно встретить в различных экосистемах и часто используется в кулинарии.",
                R.drawable.fish3,"Опасность Съедобный"));
        fishes.add(new Fish("Свинухи"," до 1981 были съедобны,но потом открыли, что грибы накапливают всебе радиацию, также провацируют рак крови",
                R.drawable.fish4,"Опасность несъедобные"));
        fishes.add(new Fish("Бледная поганка"," ядовитый гриб с бледно-желтой шляпкой и желтоватыми пластинками, известный своей опасностью для пищеварительной системы при употреблении..",
                R.drawable.fish5,"Опасность смертельная"));
    }
}