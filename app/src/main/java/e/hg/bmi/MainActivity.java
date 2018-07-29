package e.hg.bmi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button calucator;
    private TextView result;
    private EditText weight;
    private EditText height;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calucator=findViewById(R.id.button);
        result=findViewById(R.id.result);
        weight=findViewById(R.id.weight);
        height=findViewById(R.id.height);



        calucator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                double height1 = Double.parseDouble(height.getText().toString());

                double weight1 = Double.parseDouble(weight.getText().toString());

                Double BMI= weight1/(height1*height1);

               result.setText(Double.toString(BMI));


            }
        });

    }

}
