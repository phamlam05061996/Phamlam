package comm.example.pc.storepham;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainStoreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainstore);

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000);
                }catch (Exception e){

                }finally {
                    Intent intent = new Intent(MainStoreActivity.this,MainActivity.class);
                    startActivity(intent);
                    finish();
                }

            }
        });
        thread.start();
    }
}
