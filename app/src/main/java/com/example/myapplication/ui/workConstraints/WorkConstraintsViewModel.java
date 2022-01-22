package com.example.myapplication.ui.workConstraints;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class WorkConstraintsViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public WorkConstraintsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is the Work Constraints fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}