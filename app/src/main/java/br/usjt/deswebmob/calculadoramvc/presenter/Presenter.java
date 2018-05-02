package br.usjt.deswebmob.calculadoramvc.presenter;

import br.usjt.deswebmob.calculadoramvc.model.Calculadora;

public interface Presenter {
    void onCreate();
    void onStart();
    void onResume();
    void onPause();
    void onStop();
    void onRestart();
    void onDestroy();
}
