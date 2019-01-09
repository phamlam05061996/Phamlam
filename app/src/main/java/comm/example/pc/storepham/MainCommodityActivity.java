package comm.example.pc.storepham;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Adapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainCommodityActivity extends AppCompatActivity {
    android.support.design.widget.FloatingActionButton Fab;
    TextView TextviewBanchayhang,TextviewBongden,TextviewDaydien,TextviewOngnuoc,TextviewThietbi;
    ListView ListviewCommodity;
    ArrayList<Commodity>arrayCommodity;
    CommodityAdapter adapter;
    EditText editTextSearch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_commodity);
        init();
        adapter = new CommodityAdapter(this,R.layout.activity_commodity,arrayCommodity);
        ListviewCommodity.setAdapter(adapter);
        Fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainCommodityActivity.this,MainBillActivity.class);
                startActivity(intent);
            }
        });
    }
    public void  init(){
        Fab = findViewById(R.id.buttonFloating);
        ListviewCommodity = findViewById(R.id.ListviewCommodity);
        arrayCommodity = new ArrayList<>();
        arrayCommodity.add(new Commodity("Bóng Đèn","Philip",R.drawable.light,"5 x 10 cm","3 tháng","35","120.000 Đồng"));
        arrayCommodity.add(new Commodity("Bóng Đèn","Philip",R.drawable.light,"5 x 10 cm","3 tháng","35","120.000 Đồng"));
        arrayCommodity.add(new Commodity("Bóng Đèn","Philip",R.drawable.light,"5 x 10 cm","3 tháng","35","120.000 Đồng"));
        TextviewBanchayhang = findViewById(R.id.TextviewBanchayhang);
        TextviewBongden = findViewById(R.id.TextviewBongden);
        TextviewDaydien  = findViewById(R.id.TextviewDaydien);
        TextviewOngnuoc = findViewById(R.id.TextviewOngnuoc);
        TextviewThietbi = findViewById(R.id.TextviewThietbi);
        editTextSearch = findViewById(R.id.editTextSearch);
        Fab.setImageBitmap(textAsBitmap("Pay", 40, Color.WHITE));
    }
    public static Bitmap textAsBitmap(String text, float textSize, int textColor) {
        Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        paint.setTextSize(textSize);
        paint.setColor(textColor);
        paint.setTextAlign(Paint.Align.LEFT);
        float baseline = -paint.ascent(); // ascent() is negative
        int width = (int) (paint.measureText(text) + 0.0f); // round
        int height = (int) (baseline + paint.descent() + 0.0f);
        Bitmap image = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(image);
        canvas.drawText(text, 0, baseline, paint);
        return image;
    }

}
