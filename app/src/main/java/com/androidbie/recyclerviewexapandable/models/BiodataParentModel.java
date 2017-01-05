package com.androidbie.recyclerviewexapandable.models;

import com.androidbie.recyclerviewexapandable.libmoduleExpandable.Model.ParentListItem;

import java.util.List;

/**
 * Created by putuguna on 04/01/17.
 */

public class BiodataParentModel implements ParentListItem {

    private String name;
    private String age;
    private List<BiodataChildModel> mListChild;

    public BiodataParentModel(String name, String age, List<BiodataChildModel> mListChild) {
        this.name = name;
        this.age = age;
        this.mListChild = mListChild;
    }

    public BiodataParentModel() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public List<BiodataChildModel> getmListChild() {
        return mListChild;
    }

    public void setmListChild(List<BiodataChildModel> mListChild) {
        this.mListChild = mListChild;
    }

    @Override
    public List<?> getChildItemList() {
        return mListChild;
    }

    @Override
    public boolean isInitiallyExpanded() {
        return false;
    }
}
