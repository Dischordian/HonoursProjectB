package com.example.myapplication.ui.appSettings;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AppSettingsViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public AppSettingsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is the App Settings fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}