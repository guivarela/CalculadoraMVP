package br.usjt.deswebmob.calculadoramvc.presenter;

import br.usjt.deswebmob.calculadoramvc.model.Calculadora;
import br.usjt.deswebmob.calculadoramvc.view.MainView;

public class MainPresenter implements Presenter {
    private Calculadora model;
    private MainView view;

    public MainPresenter(MainView v) {
        this.view = v;
    }

    @Override
    public void onCreate() {
        model = new Calculadora();
    }

    @Override
    public void onStart() {

    }

    @Override
    public void onResume() {

    }

    @Override
    public void onPause() {

    }

    @Override
    public void onStop() {

    }

    @Override
    public void onRestart() {

    }

    @Override
    public void onDestroy() {

    }

    public void calculo(){
        model.setValor1(view.getValor1());
        model.setValor2(view.getValor2());
        model.setOperador(view.getOperador());
        model.calculo();
        view.setResultado(model.getResultado());
    }
}
