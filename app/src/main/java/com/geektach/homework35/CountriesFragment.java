package com.geektach.homework35;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class CountriesFragment extends Fragment implements OnClick {
    private AdapterContinent adapterContinent;
    ArrayList<Model> arrayList;
    private RecyclerView recyclerView;
    private static final String KEY = "KEY";


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_countries, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        recyclerView = view.findViewById(R.id.recycler_countries);
        adapterContinent = new AdapterContinent(arrayList, new OnClick() {
            @Override
            public void click(Model model) {

            }
        });
        recyclerView.setAdapter(adapterContinent);
    }

    private void loadData() {
        arrayList = new ArrayList<>();
        Bundle bundle = getArguments();
        int a = bundle.getInt(KEY);
        switch (a) {
            case 1:
                arrayList.add(new Model("Катар", R.drawable.eru1));
                arrayList.add(new Model("Корея", R.drawable.eru2));
                arrayList.add(new Model("Япония", R.drawable.eru3));
                arrayList.add(new Model("Казахстан", R.drawable.eru14));
                arrayList.add(new Model("Филипины", R.drawable.eru5));
                break;
            case 2:
                arrayList.add(new Model("Панама", R.drawable.north1));
                arrayList.add(new Model("Бразилия", R.drawable.north2));
                arrayList.add(new Model("Аргентина", R.drawable.north3));
                arrayList.add(new Model("Колумбия", R.drawable.north4));
                arrayList.add(new Model("Эквадор", R.drawable.north5));
                break;
            case 3:
                arrayList.add(new Model("Евразия", R.drawable.sorth1));
                arrayList.add(new Model("Северная Америка", R.drawable.sorth2));
                arrayList.add(new Model("Южная Америка", R.drawable.sorth3));
                arrayList.add(new Model("Африка", R.drawable.sorth4));
                arrayList.add(new Model("Австралия", R.drawable.sorth5));
                break;
            case 4:
                arrayList.add(new Model("Танзания", R.drawable.africa));
                arrayList.add(new Model("Синегал", R.drawable.africa1));
                arrayList.add(new Model("Кот-д'Ивуар", R.drawable.africa2));
                arrayList.add(new Model("Марокко", R.drawable.africa3));
                arrayList.add(new Model("Др Конго", R.drawable.africa4));
                break;
            case 5:
                arrayList.add(new Model("Австралия", R.drawable.australia));
                break;
            case 6:
                arrayList.add(new Model("Хорватия", R.drawable.eouro1));
                arrayList.add(new Model("Германия", R.drawable.eouro2));
                arrayList.add(new Model("Великобритания", R.drawable.eouro3));
                arrayList.add(new Model("Финляндия", R.drawable.eouro4));
                arrayList.add(new Model("Швеция", R.drawable.eouro5));
                break;

        }
    }

    @Override
    public void click(Model model) {

    }
}