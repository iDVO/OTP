package ua.kharkov.kpi.ttvtp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.DatePicker;
import android.widget.Spinner;
import android.widget.TabHost;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class MainActivity extends AppCompatActivity {

//    String[] student_group = {"КИТ-12", "КИТ-22а", "КИТ-22б", "КИТ-32",};
//    String[] teachers = {"Черных Елена Петровна", "Семенов Сергей Геннадьевич",
//            "Межерицкий Сергей Геннадьевич", "Гугнин Владимир Николаевич"};
//

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        /***************Начало Tab'ов*******************/

        TabHost tabs = (TabHost) findViewById(android.R.id.tabhost);

        tabs.setup();

        TabHost.TabSpec spec = tabs.newTabSpec("tag1");

        //для студента
        spec.setContent(R.id.tab1);
        spec.setIndicator(getString(R.string.student));
        tabs.addTab(spec);
        tabs.setCurrentTab(0);


        spec = tabs.newTabSpec("tag2");
        spec.setContent(R.id.tab2);
        spec.setIndicator(getString(R.string.prepod));
        tabs.addTab(spec);


/*******************Spinner для студентов***********************/
        // адаптер
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.student_groups, android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        Spinner spinner = (Spinner) findViewById(R.id.spinner0);
        //   spinner.setSelection(position);

        spinner.setAdapter(adapter);
//        Spinner spinner = (Spinner) findViewById(R.id.spinner0);
//        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.student_groups, android.R.layout.simple_spinner_item);
//        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spinner.setPrompt("Select your favorite Planet!");
//
//        spinner.setAdapter(
//                new NothingSelectedSpinnerAdapter(
//                        adapter,
//                        R.layout.example,
//                        // R.layout.contact_spinner_nothing_selected_dropdown, // Optional
//                        this));


        // заголовок
        spinner.setPrompt("Title");
        // выделяем элемент
        spinner.setSelection(0);


        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // TODO Auto-generated method stub

            }


            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //Выбираем элемент выпадающего списка:

                if (id == 0) {


                }
                if (id == 1) {

                    Intent i = new Intent(MainActivity.this, KIT12.class);
                    startActivity(i);
                }
                if (id == 2) {

                    Intent j = new Intent(MainActivity.this, KIT22a.class);
                    startActivity(j);
                }
                if (id == 3) {

                    Intent k = new Intent(MainActivity.this, KIT22b.class);
                    startActivity(k);
                }
                if (id == 4) {

                    Intent l = new Intent(MainActivity.this, KIT22b.class);
                    startActivity(l);
                }


            }


        });


        /*******************Spinner для преподавателей***********************/
        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this,
                R.array.teachers, android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Spinner spinner1 = (Spinner) findViewById(R.id.spinner1);
        spinner1.setAdapter(adapter1);

        // заголовок
        spinner1.setPrompt(getString(R.string.ch_teacher));
        // выделяем элемент
        spinner1.setSelection(-1, true);
        // устанавливаем обработчик нажатия


        // устанавливаем обработчик нажатия
        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //Выбираем элемент выпадающего списка:

                if (id == 0) {
//                    Intent i = new Intent(MainActivity.this, Semenov.class);//
//                    startActivity(i);
                }
                if (id == 1) {
                    Intent i = new Intent(MainActivity.this, Semenov.class);//
                    startActivity(i);
                }
                if (id == 2) {
                    Intent j = new Intent(MainActivity.this, Chernih.class);
                    startActivity(j);
                }
                if (id == 3) {
                    Intent i = new Intent(MainActivity.this, Megerickiy.class);//
                    startActivity(i);
                }
                if (id == 4) {
                    Intent j = new Intent(MainActivity.this, Semenov.class);
                    startActivity(j);
                }
                if (id == 5) {
                    Intent j = new Intent(MainActivity.this, Semenov.class);
                    startActivity(j);
                }
                if (id == 6) {
                    Intent j = new Intent(MainActivity.this, Semenov.class);
                    startActivity(j);
                }
                if (id == 7) {
                    Intent j = new Intent(MainActivity.this, Semenov.class);
                    startActivity(j);
                }
                if (id == 8) {
                    Intent j = new Intent(MainActivity.this, Semenov.class);
                    startActivity(j);
                }
                if (id == 9) {
                    Intent j = new Intent(MainActivity.this, Semenov.class);
                    startActivity(j);
                }
                if (id == 10) {
                    Intent j = new Intent(MainActivity.this, Semenov.class);
                    startActivity(j);
                }
                if (id == 11) {
                    Intent j = new Intent(MainActivity.this, Semenov.class);
                    startActivity(j);
                }
                if (id == 12) {
                    Intent j = new Intent(MainActivity.this, Semenov.class);
                    startActivity(j);
                }
                if (id == 13) {
                    Intent j = new Intent(MainActivity.this, Semenov.class);
                    startActivity(j);
                }
                if (id == 14) {
                    Intent j = new Intent(MainActivity.this, Semenov.class);
                    startActivity(j);
                }
                if (id == 15) {
                    Intent j = new Intent(MainActivity.this, Semenov.class);
                    startActivity(j);
                }
                if (id == 16) {
                    Intent j = new Intent(MainActivity.this, Semenov.class);
                    startActivity(j);
                }
                if (id == 17) {
                    Intent j = new Intent(MainActivity.this, Semenov.class);
                    startActivity(j);
                }
                if (id == 18) {
                    Intent j = new Intent(MainActivity.this, Semenov.class);
                    startActivity(j);
                }
                if (id == 19) {
                    Intent j = new Intent(MainActivity.this, Semenov.class);
                    startActivity(j);
                }
                if (id == 20) {
                    Intent j = new Intent(MainActivity.this, Semenov.class);
                    startActivity(j);
                }
                if (id == 21) {
                    Intent j = new Intent(MainActivity.this, Semenov.class);
                    startActivity(j);
                }
                if (id == 22) {
                    Intent j = new Intent(MainActivity.this, Semenov.class);
                    startActivity(j);
                }
                if (id == 23) {
                    Intent j = new Intent(MainActivity.this, Semenov.class);
                    startActivity(j);
                }
                if (id == 24) {
                    Intent j = new Intent(MainActivity.this, Semenov.class);
                    startActivity(j);
                }
                if (id == 25) {
                    Intent j = new Intent(MainActivity.this, Semenov.class);
                    startActivity(j);
                }
                if (id == 26) {
                    Intent j = new Intent(MainActivity.this, Semenov.class);
                    startActivity(j);
                }
                if (id == 27) {
                    Intent j = new Intent(MainActivity.this, Semenov.class);
                    startActivity(j);
                }
                if (id == 28) {
                    Intent j = new Intent(MainActivity.this, Semenov.class);
                    startActivity(j);
                }
                if (id == 29) {
                    Intent j = new Intent(MainActivity.this, Semenov.class);
                    startActivity(j);
                }
                if (id == 30) {
                    Intent j = new Intent(MainActivity.this, Semenov.class);
                    startActivity(j);
                }


            }

            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub

            }

        });



    }
    @Override
    public boolean onCreateOptionsMenu (Menu menu){
        getMenuInflater().inflate(R.menu.activitymain, menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()) {
            case R.id.item4:
                Intent intent = new Intent(this, Settings.class);
                this.startActivity(intent);
                break;
            default:
                return super.onOptionsItemSelected(item);
        }

        return true;
    }
}







