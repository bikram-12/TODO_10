package gcit.edu.todo_10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText operand1, operand2;
    private TextView resulttextView;
    private calculater mcalculater;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        operand1 = findViewById(R.id.number1);
        operand2 = findViewById(R.id.number2);
        resulttextView = findViewById(R.id.text);
        mcalculater = new calculater();

    }

    public void addition(View view) {
        String val1 = operand1.getText().toString();
        String val2 = operand2.getText().toString();
        double add = mcalculater.add(Double.valueOf(val1),(Double.valueOf(val2)));
        resulttextView.setText(String.valueOf(add));
        Log.d("CALCULATOR","ERROR MESSAGE");

    }

    public void substraction(View view) {
        String val1 = operand1.getText().toString();
        String val2 = operand2.getText().toString();
        double sub = mcalculater.sub(Double.valueOf(val1),(Double.valueOf(val2)));
        resulttextView.setText(String.valueOf(sub));
        Log.d("CALCULATOR","ERROR MESSAGE");

    }

    public void multiplication(View view) {
        String val1 = operand1.getText().toString();
        String val2 = operand2.getText().toString();
        double mul = mcalculater.mul(Double.valueOf(val1),(Double.valueOf(val2)));
        resulttextView.setText(String.valueOf(mul));
        Log.d("CALCULATOR","ERROR MESSAGE");

    }

    public void division(View view) {
        String val1 = operand1.getText().toString();
        String val2 = operand2.getText().toString();
        double div = mcalculater.div(Double.valueOf(val1),(Double.valueOf(val2)));
        resulttextView.setText(String.valueOf(div));
        Log.d("CALCULATOR","ERROR MESSAGE");

    }
}