package com.ahmad.cv.fragments;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.ahmad.cv.Education_Item;
import com.ahmad.cv.model.DemoItem;
import com.ahmad.cv.adapters.EducationAdapter;
import com.ahmad.cv.base.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
/**
 * A simple {@link Fragment} subclass.
 */
public class EducationFragment extends Fragment {

    private RecyclerView recyclerView;
    private List<Education_Item>  listEducation;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        listEducation=new ArrayList<>();
        listEducation.add(new Education_Item("National University of Emerging and Computer Sciences","BS(CS)","(2008 – 2012)",R.drawable.fastlogo));
        listEducation.add(new Education_Item("Kips College","FSc Pre Engineering","(2008 – 2012)",R.drawable.kips));
        listEducation.add(new Education_Item("Digiskills","SEO online course","(2019)",R.drawable.digi));

    }

    public EducationFragment() {
        // Required empty public constructor
    }


    public static EducationFragment newInstance() {

        EducationFragment fragment = new EducationFragment();

        Bundle args = new Bundle();

        fragment.setArguments(args);

        return fragment;

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_blank_fragment2, container, false);
        recyclerView=(RecyclerView) view.findViewById(R.id.recyclerViewDemo1);
        EducationAdapter educationAdapter=new EducationAdapter(listEducation,getContext());
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(educationAdapter);
        return view;
    }


}




