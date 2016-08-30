package cynchoco.dicecrispy;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by Cyn on 25/08/2016.
 */
public class InfosActivity extends Activity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.infos);

        //Récupérer une occurrence du textview qui est dans l'activité (cible => ecran infos)
        this.textView = (TextView) this.findViewById(R.id.textInfos);

        //récupérer les données de l'intent créé
        Intent intent = this.getIntent();

        //bla bla

        //test changement de nom

    }
}
