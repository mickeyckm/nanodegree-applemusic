package ng.cheo.android.applemusic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import java.util.Hashtable;
import java.util.Set;

public class DetailActivity extends AppCompatActivity {

    Hashtable audios = new Hashtable();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        audios.put("audio1", findViewById(R.id.audio1));
        audios.put("audio2", findViewById(R.id.audio2));
        audios.put("audio3", findViewById(R.id.audio3));
        audios.put("audio4", findViewById(R.id.audio4));
        audios.put("audio5", findViewById(R.id.audio5));
        audios.put("audio6", findViewById(R.id.audio6));
        audios.put("audio7", findViewById(R.id.audio7));
        audios.put("audio8", findViewById(R.id.audio8));
        audios.put("audio9", findViewById(R.id.audio9));

        Set<String> keys = audios.keySet();
        for (String key: keys) {
            ((LinearLayout) audios.get(key)).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(DetailActivity.this, NowPlayingActivity.class);
                    startActivity(intent);
                }
            });
        }

    }
}
