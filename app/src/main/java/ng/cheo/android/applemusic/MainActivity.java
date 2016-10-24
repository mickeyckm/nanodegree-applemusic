package ng.cheo.android.applemusic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Set;

public class MainActivity extends AppCompatActivity {

    Hashtable items = new Hashtable();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        items.put("adele", findViewById(R.id.adele));
        items.put("ruthb", findViewById(R.id.ruthb));
        items.put("shawnmendes", findViewById(R.id.shawnmendes));
        items.put("nomoney", findViewById(R.id.nomoney));
        items.put("theocean", findViewById(R.id.theocean));
        items.put("thescript", findViewById(R.id.thescript));
        items.put("serial", findViewById(R.id.serial));
        items.put("startup", findViewById(R.id.startup));
        items.put("invisible", findViewById(R.id.invisible));

        Set<String> keys = items.keySet();
        for (String key: keys) {
            ((ImageView) items.get(key)).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                    startActivity(intent);
                }
            });
        }

        Button searchButton = (Button) findViewById(R.id.search);
        searchButton.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SearchActivity.class);
                startActivity(intent);
            }
        }));

        Button storeButton = (Button) findViewById(R.id.store);
        storeButton.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, StoreActivity.class);
                startActivity(intent);
            }
        }));
    }
}
