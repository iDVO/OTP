package ua.kharkov.kpi.ttvtp;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.Locale;

public class Settings extends AppCompatActivity {
    String mLang;
    private Locale mNewLocale;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        Button enBtn = (Button) findViewById(R.id.enb);
        Button ruBtn = (Button) findViewById(R.id.rub);
        Button uaBtn = (Button) findViewById(R.id.uab);

        enBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Locale localeEn = new Locale("en_US");
                Locale.setDefault(localeEn);
                Configuration configEn = new Configuration();
                configEn.locale = localeEn;
                getApplicationContext().getResources().updateConfiguration(configEn, null);
                Context context = getBaseContext();
                Intent intent = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });
        ruBtn.setOnClickListener(new View.OnClickListener() {

            @Override
        public void onClick(View v) {
            Locale localeRu = new Locale("ru_RU");
            Locale.setDefault(localeRu);
            Configuration configRU = new Configuration();
            configRU.locale = localeRu;
            getApplicationContext().getResources().updateConfiguration(configRU, null);
            Context context = getBaseContext();
            Intent intent = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
        }
    });
        uaBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Locale localeUk = new Locale("uk_UK");
                Locale.setDefault(localeUk);
                Configuration configUk = new Configuration();
                configUk.locale = localeUk;
                getApplicationContext().getResources().updateConfiguration(configUk, null);
                Context context = getBaseContext();
                Intent intent = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });
    }
}


