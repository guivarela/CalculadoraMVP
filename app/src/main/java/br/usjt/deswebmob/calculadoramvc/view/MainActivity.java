package br.usjt.deswebmob.calculadoramvc.view;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import br.usjt.deswebmob.calculadoramvc.model.Calculadora;
import br.usjt.deswebmob.calculadoramvc.R;
import br.usjt.deswebmob.calculadoramvc.presenter.MainPresenter;
import br.usjt.deswebmob.calculadoramvc.presenter.Presenter;

public class MainActivity extends Activity implements MainView{
    EditText valor1, valor2, operador, resultado;
    MainPresenter presenter = new MainPresenter(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        valor1 = (EditText)findViewById(R.id.valor1);
        valor2 = (EditText)findViewById(R.id.valor2);
        operador = (EditText)findViewById(R.id.operador);
        resultado = (EditText)findViewById(R.id.resultado);
        presenter.onCreate();
    }

    public void calcular(View view){
        presenter.calculo();
    }

    public String getValor1(){
        return valor1.getText().toString();
    }

    public String getValor2(){
        return valor2.getText().toString();
    }

    public String getOperador(){
        return operador.getText().toString();
    }

    @Override
    public void setResultado(String r) {
        this.resultado.setText(r);
    }
}
