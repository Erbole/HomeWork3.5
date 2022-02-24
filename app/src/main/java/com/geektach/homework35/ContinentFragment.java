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

public class ContinentFragment extends Fragment implements OnClick {
    private AdapterContinent adapterContinent;
    private RecyclerView recyclerView;
    private ArrayList<Model> arrayList;
    private static final String KEY = "KEY";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_continent, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        recyclerView = view.findViewById(R.id.recycler_continent);
        adapterContinent = new AdapterContinent(arrayList, this);
        recyclerView.setAdapter(adapterContinent);
    }

    private void loadData() {
        arrayList = new ArrayList<>();
        arrayList.add(new Model("Евразия", R.drawable.caf_3x, 1));
        arrayList.add(new Model("Северная Америка", R.drawable.cas_3x, 2));
        arrayList.add(new Model("Южная Америка", R.drawable.ceu_3x, 3));
        arrayList.add(new Model("Африка", R.drawable.coc_3x, 4));
        arrayList.add(new Model("Австралия", R.drawable.csa_3x, 5));
    }

    @Override
    public void click(Model model) {
        Bundle bundle = new Bundle();
        bundle.putInt(KEY, model.getKeuId());
        Fragment fragment = new CountriesFragment();
        fragment.setArguments(bundle);
        requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container_main, fragment).commit();
    }

}
