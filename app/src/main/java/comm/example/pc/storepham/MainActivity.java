package comm.example.pc.storepham;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button buttonSELL,buttonWAREHOUSE,buttonCUSTOMER,buttonSTATISTICAL,buttonSUPPLIER,buttonSETTING;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Anhxa();
        buttonSELL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,MainCommodityActivity.class);
                startActivity(i);
            }
        });
        buttonWAREHOUSE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,MainWareHouseActivity.class);
                startActivity(intent);
            }
        });
        buttonSTATISTICAL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,MainStatisticalActivity.class);
                startActivity(intent);
            }
        });
        buttonCUSTOMER.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,MainCustomerActivity.class);
                startActivity(intent);
            }
        });
    }
    private void Anhxa(){
        buttonSELL = findViewById(R.id.buttonSELL);
        buttonWAREHOUSE = findViewById(R.id.buttonWAREHOUSE);
        buttonCUSTOMER = findViewById(R.id.buttonCUSTOMER);
        buttonSTATISTICAL = findViewById(R.id.buttonSTATISTICAL);
        buttonSUPPLIER = findViewById(R.id.buttonSUPPLIER);
        buttonSETTING = findViewById(R.id.buttonSETTING);
    }
}
