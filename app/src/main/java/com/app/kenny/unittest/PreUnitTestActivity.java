package com.app.kenny.unittest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.app.kenny.unittest.calculadora.CalculadoraPreUnitTest;

public class PreUnitTestActivity extends AppCompatActivity {

    private int result;
    private TextView tvResultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pre_unit_test);
        // Como se realizarian los test manuales, no se debe aplicar este metodo de testeo ya que es manual
        result = CalculadoraPreUnitTest.sumar(10, 20);

        tvResultado = findViewById(R.id.tvResultado);
        tvResultado.setText(result);

        Log.d("TAG1", "Resultado suma: " + result);
        if (result == 30) {
            Log.d("TAG1", "Resultado OK: " + result);
        } else {
            Log.d("TAG1", "Resultado ERROR: " + result);
        }
    }



}
