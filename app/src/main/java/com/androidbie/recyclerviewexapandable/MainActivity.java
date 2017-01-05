package com.androidbie.recyclerviewexapandable;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.androidbie.recyclerviewexapandable.expandables.BiodataExpandable;
import com.androidbie.recyclerviewexapandable.models.BiodataChildModel;
import com.androidbie.recyclerviewexapandable.models.BiodataParentModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvBiodata;
    private BiodataExpandable mBiodataExapandable;
    List<BiodataParentModel> listModelBiodata = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvBiodata = (RecyclerView) findViewById(R.id.recyclerview);


        setData();

        rvBiodata.setLayoutManager(new LinearLayoutManager(this));
        mBiodataExapandable = new BiodataExpandable(listModelBiodata, this);
        rvBiodata.setItemAnimator(new DefaultItemAnimator());
        rvBiodata.setAdapter(mBiodataExapandable);

    }


    private void setData(){
        List<BiodataChildModel> mChildBiodata1 = new ArrayList<>();
        mChildBiodata1.add(new BiodataChildModel("Single", "I am a free man!"));
        List<BiodataChildModel> mChildBiodata2 = new ArrayList<>();
        mChildBiodata2.add(new BiodataChildModel("Married", "I am a married man!"));
        List<BiodataChildModel> mChildBiodata3 = new ArrayList<>();
        mChildBiodata3.add(new BiodataChildModel("Young", "I am a young man!"));
        List<BiodataChildModel> mChildBiodata4 = new ArrayList<>();
        mChildBiodata4.add(new BiodataChildModel("Married", "I am a married man!"));
        List<BiodataChildModel> mChildBiodata5 = new ArrayList<>();
        mChildBiodata5.add(new BiodataChildModel("Semelekete", "I am a semelekete man!"));


        BiodataParentModel mHeadBiodata1 = new BiodataParentModel();
        mHeadBiodata1.setAge("10");
        mHeadBiodata1.setName("Komak");
        mHeadBiodata1.setmListChild(mChildBiodata1);

        BiodataParentModel mHeadBiodata2 = new BiodataParentModel();
        mHeadBiodata2.setAge("20");
        mHeadBiodata2.setName("Kacang");
        mHeadBiodata2.setmListChild(mChildBiodata2);

        BiodataParentModel mHeadBiodata3 = new BiodataParentModel();
        mHeadBiodata3.setAge("15");
        mHeadBiodata3.setName("Kare");
        mHeadBiodata3.setmListChild(mChildBiodata3);

        BiodataParentModel mHeadBiodata4 = new BiodataParentModel();
        mHeadBiodata4.setAge("24");
        mHeadBiodata4.setName("Kedelai");
        mHeadBiodata4.setmListChild(mChildBiodata4);

        BiodataParentModel mHeadBiodata5 = new BiodataParentModel();
        mHeadBiodata5.setAge("32");
        mHeadBiodata5.setName("Rozan");
        mHeadBiodata5.setmListChild(mChildBiodata5);

        listModelBiodata.add(mHeadBiodata1);
        listModelBiodata.add(mHeadBiodata2);
        listModelBiodata.add(mHeadBiodata3);
        listModelBiodata.add(mHeadBiodata4);
        listModelBiodata.add(mHeadBiodata5);
    }
}
