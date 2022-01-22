package com.example.myapplication.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ScheduleNotificationsViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ScheduleNotificationsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is the Schedule Notifications fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}