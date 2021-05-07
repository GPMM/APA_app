package com.ppa.perfildeaprendizado.ui.editar_perfil;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class EditarPerfilViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public EditarPerfilViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is dashboard fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}