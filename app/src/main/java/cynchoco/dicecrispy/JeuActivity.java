package cynchoco.dicecrispy;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Random;

/**
 * Created by Cyn on 25/08/2016.
 */
public class JeuActivity extends Activity {

    private TextView blabla;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.infos);

        //Récupérer une occurrence du textview qui est dans l'activité (cible => ecran infos)
        this.blabla = (TextView) this.findViewById(R.id.textView);
        //this.textView = (TextView) this.findViewById(R.id.pageInfos);

        //récupérer les données de l'intent créé
        Intent intent = this.getIntent();

        //demander au textview de remplir le textview avec la chaine récupérée
        //String name = intent.getStringExtra("NAME");
        //this.textView.setText(name);
    }
}
