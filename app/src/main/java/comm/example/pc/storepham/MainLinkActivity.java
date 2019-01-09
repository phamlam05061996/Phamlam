package comm.example.pc.storepham;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;

public class MainLinkActivity extends AppCompatActivity {
    EditText EditLink;
    Button buttonFile,buttonQuestion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_link_online);
        initWidget();
    }
    public void  initWidget(){
        EditLink = findViewById(R.id.Editlink);
        buttonFile = findViewById(R.id.buttonFilefromSDcard);
        buttonQuestion = findViewById(R.id.buttonQuestion);
        buttonQuestion.setText("?");
    }
}
