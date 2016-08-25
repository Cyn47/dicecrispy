package cynchoco.dicecrispy;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener {

    private static final String TAG = "MyActivity";

    //détection d'une interaction par un attribut
    private OnClickListener detectClickButton = new OnClickListener() {
        @Override
        public void onClick(View view) {
            Toast.makeText(MainActivity.this, "clic sur PROFIL", Toast.LENGTH_LONG ).show();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.findViewById(R.id.pageInfos).setOnClickListener(this);
        this.findViewById(R.id.diceButton).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        Intent intentInfos = new Intent(this, InfosActivity.class);
        startActivity(intentInfos);

        Intent intentJeu = new Intent(this, JeuActivity.class);
        startActivity(intentJeu);

    }

}
