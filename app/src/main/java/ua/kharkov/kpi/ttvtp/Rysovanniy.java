package ua.kharkov.kpi.ttvtp;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TabHost;
import android.widget.TabWidget;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.URL;
import java.net.URLConnection;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public class Rysovanniy extends AppCompatActivity {

    /****************ПОНЕДЕЛЬНИК*******************/
    /*Парсер начало*/
    /*TextView времени пар*/
    TextView texttime1;
    TextView texttime2;
    TextView texttime3;
    TextView texttime4;
    /*TextView типа пар (лекция,практика,семинар,лаба)*/
    TextView texttype1;
    TextView texttype2;
    TextView texttype3;
    TextView texttype4;
    /*TextView название предмета*/
    TextView textname1;
    TextView textname2;
    TextView textname3;
    TextView textname4;
    /*TextView название корпуса и номер аудитории*/
    TextView textaudit1;
    TextView textaudit2;
    TextView textaudit3;
    TextView textaudit4;

    /****************ВТОРНИК*******************/
    /*Парсер начало*/
    /*TextView времени пар*/
    TextView ttexttime1;
    TextView ttexttime2;
    TextView ttexttime3;
    TextView ttexttime4;
    /*TextView типа пар (лекция,практика,семинар,лаба)*/
    TextView ttexttype1;
    TextView ttexttype2;
    TextView ttexttype3;
    TextView ttexttype4;
    /*TextView название предмета*/
    TextView ttextname1;
    TextView ttextname2;
    TextView ttextname3;
    TextView ttextname4;
    /*TextView название корпуса и номер аудитории*/
    TextView ttextaudit1;
    TextView ttextaudit2;
    TextView ttextaudit3;
    TextView ttextaudit4;

    /****************СРЕДА*******************/
    /*Парсер начало*/
    /*TextView времени пар*/
    TextView wttexttime1;
    TextView wttexttime2;
    TextView wttexttime3;
    TextView wttexttime4;
    /*TextView типа пар (лекция,практика,семинар,лаба)*/
    TextView wttexttype1;
    TextView wttexttype2;
    TextView wttexttype3;
    TextView wttexttype4;
    /*TextView название предмета*/
    TextView wttextname1;
    TextView wttextname2;
    TextView wttextname3;
    TextView wttextname4;
    /*TextView название корпуса и номер аудитории*/
    TextView wttextaudit1;
    TextView wttextaudit2;
    TextView wttextaudit3;
    TextView wttextaudit4;

    /****************ЧЕТВЕРГ*******************/
    /*Парсер начало*/
    /*TextView времени пар*/
    TextView twttexttime1;
    TextView twttexttime2;
    TextView twttexttime3;
    TextView twttexttime4;
    /*TextView типа пар (лекция,практика,семинар,лаба)*/
    TextView twttexttype1;
    TextView twttexttype2;
    TextView twttexttype3;
    TextView twttexttype4;
    /*TextView название предмета*/
    TextView twttextname1;
    TextView twttextname2;
    TextView twttextname3;
    TextView twttextname4;
    /*TextView название корпуса и номер аудитории*/
    TextView twttextaudit1;
    TextView twttextaudit2;
    TextView twttextaudit3;
    TextView twttextaudit4;

    /****************ПЯТНИЦА*******************/
    /*Парсер начало*/
    /*TextView времени пар*/
    TextView ftwttexttime1;
    TextView ftwttexttime2;
    TextView ftwttexttime3;
    TextView ftwttexttime4;
    /*TextView типа пар (лекция,практика,семинар,лаба)*/
    TextView ftwttexttype1;
    TextView ftwttexttype2;
    TextView ftwttexttype3;
    TextView ftwttexttype4;
    /*TextView название предмета*/
    TextView ftwttextname1;
    TextView ftwttextname2;
    TextView ftwttextname3;
    TextView ftwttextname4;
    /*TextView название корпуса и номер аудитории*/
    TextView ftwttextaudit1;
    TextView ftwttextaudit2;
    TextView ftwttextaudit3;
    TextView ftwttextaudit4;


    NodeList nodeList;
    ProgressDialog pDialog;
    String URL = "http://fs148.www.ex.ua/get/179134804053/e48400e58cdc1277d1bcbe72b68c80c7/251950787/Semenov.xml";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rysovanniy);



/****************************ПОНЕДЕЛЬНИК*******************************************************/
        /*На место какого TextView парситься xml*/
        /*Время пар*/
        texttime1 = (TextView) findViewById(R.id.time1);
        texttime2 = (TextView) findViewById(R.id.time2);
        texttime3 = (TextView) findViewById(R.id.time3);
        texttime4 = (TextView) findViewById(R.id.time4);
        /*Тип пар (лекция,практика,семинар,лаба)*/
        texttype1 = (TextView) findViewById(R.id.type1);
        texttype2 = (TextView) findViewById(R.id.type2);
        texttype3 = (TextView) findViewById(R.id.type3);
        texttype4 = (TextView) findViewById(R.id.type4);
        /*Тип пар название предмета*/
        textname1 = (TextView) findViewById(R.id.name1);
        textname2 = (TextView) findViewById(R.id.name2);
        textname3 = (TextView) findViewById(R.id.name3);
        textname4 = (TextView) findViewById(R.id.name4);
        /*Тип пар название корпуса и номер аудитории*/
        textaudit1 = (TextView) findViewById(R.id.audit1);
        textaudit2 = (TextView) findViewById(R.id.audit2);
        textaudit3 = (TextView) findViewById(R.id.audit3);
        textaudit4 = (TextView) findViewById(R.id.audit4);


        /****************************ВТОРНИК*******************************************************/
        /*На место какого TextView парситься xml*/
        /*Время пар*/
        ttexttime1 = (TextView) findViewById(R.id.ttime1);
        ttexttime2 = (TextView) findViewById(R.id.ttime2);
        ttexttime3 = (TextView) findViewById(R.id.ttime3);
        ttexttime4 = (TextView) findViewById(R.id.ttime4);
        /*Тип пар (лекция,практика,семинар,лаба)*/
        ttexttype1 = (TextView) findViewById(R.id.ttype1);
        ttexttype2 = (TextView) findViewById(R.id.ttype2);
        ttexttype3 = (TextView) findViewById(R.id.ttype3);
        ttexttype4 = (TextView) findViewById(R.id.ttype4);
        /*Тип пар название предмета*/
        ttextname1 = (TextView) findViewById(R.id.tname1);
        ttextname2 = (TextView) findViewById(R.id.tname2);
        ttextname3 = (TextView) findViewById(R.id.tname3);
        ttextname4 = (TextView) findViewById(R.id.tname4);
        /*Тип пар название корпуса и номер аудитории*/
        ttextaudit1 = (TextView) findViewById(R.id.taudit1);
        ttextaudit2 = (TextView) findViewById(R.id.taudit2);
        ttextaudit3 = (TextView) findViewById(R.id.taudit3);
        ttextaudit4 = (TextView) findViewById(R.id.taudit4);


        /****************************СРЕДА*******************************************************/
        /*На место какого TextView парситься xml*/
        /*Время пар*/
        wttexttime1 = (TextView) findViewById(R.id.wttime1);
        wttexttime2 = (TextView) findViewById(R.id.wttime2);
        wttexttime3 = (TextView) findViewById(R.id.wttime3);
        wttexttime4 = (TextView) findViewById(R.id.wttime4);
        /*Тип пар (лекция,практика,семинар,лаба)*/
        wttexttype1 = (TextView) findViewById(R.id.wttype1);
        wttexttype2 = (TextView) findViewById(R.id.wttype2);
        wttexttype3 = (TextView) findViewById(R.id.wttype3);
        wttexttype4 = (TextView) findViewById(R.id.wttype4);
        /*Тип пар название предмета*/
        wttextname1 = (TextView) findViewById(R.id.wtname1);
        wttextname2 = (TextView) findViewById(R.id.wtname2);
        wttextname3 = (TextView) findViewById(R.id.wtname3);
        wttextname4 = (TextView) findViewById(R.id.wtname4);
        /*Тип пар название корпуса и номер аудитории*/
        wttextaudit1 = (TextView) findViewById(R.id.wtaudit1);
        wttextaudit2 = (TextView) findViewById(R.id.wtaudit2);
        wttextaudit3 = (TextView) findViewById(R.id.wtaudit3);
        wttextaudit4 = (TextView) findViewById(R.id.wtaudit4);

        /****************************ЧЕТВЕРГ*******************************************************/
        /*На место какого TextView парситься xml*/
        /*Время пар*/
        twttexttime1 = (TextView) findViewById(R.id.twttime1);
        twttexttime2 = (TextView) findViewById(R.id.twttime2);
        twttexttime3 = (TextView) findViewById(R.id.twttime3);
        twttexttime4 = (TextView) findViewById(R.id.twttime4);
        /*Тип пар (лекция,практика,семинар,лаба)*/
        twttexttype1 = (TextView) findViewById(R.id.twttype1);
        twttexttype2 = (TextView) findViewById(R.id.twttype2);
        twttexttype3 = (TextView) findViewById(R.id.twttype3);
        twttexttype4 = (TextView) findViewById(R.id.twttype4);
        /*Тип пар название предмета*/
        twttextname1 = (TextView) findViewById(R.id.twtname1);
        twttextname2 = (TextView) findViewById(R.id.twtname2);
        twttextname3 = (TextView) findViewById(R.id.twtname3);
        twttextname4 = (TextView) findViewById(R.id.twtname4);
        /*Тип пар название корпуса и номер аудитории*/
        twttextaudit1 = (TextView) findViewById(R.id.twtaudit1);
        twttextaudit2 = (TextView) findViewById(R.id.twtaudit2);
        twttextaudit3 = (TextView) findViewById(R.id.twtaudit3);
        twttextaudit4 = (TextView) findViewById(R.id.twtaudit4);

        /****************************ПЯТНИЦА*******************************************************/
        /*На место какого TextView парситься xml*/
        /*Время пар*/
        ftwttexttime1 = (TextView) findViewById(R.id.ftwttime1);
        ftwttexttime2 = (TextView) findViewById(R.id.ftwttime2);
        ftwttexttime3 = (TextView) findViewById(R.id.ftwttime3);
        ftwttexttime4 = (TextView) findViewById(R.id.ftwttime4);
        /*Тип пар (лекция,практика,семинар,лаба)*/
        ftwttexttype1 = (TextView) findViewById(R.id.ftwttype1);
        ftwttexttype2 = (TextView) findViewById(R.id.ftwttype2);
        ftwttexttype3 = (TextView) findViewById(R.id.ftwttype3);
        ftwttexttype4 = (TextView) findViewById(R.id.ftwttype4);
        /*Тип пар название предмета*/
        ftwttextname1 = (TextView) findViewById(R.id.ftwtname1);
        ftwttextname2 = (TextView) findViewById(R.id.ftwtname2);
        ftwttextname3 = (TextView) findViewById(R.id.ftwtname3);
        ftwttextname4 = (TextView) findViewById(R.id.ftwtname4);
        /*Тип пар название корпуса и номер аудитории*/
        ftwttextaudit1 = (TextView) findViewById(R.id.ftwtaudit1);
        ftwttextaudit2 = (TextView) findViewById(R.id.ftwtaudit2);
        ftwttextaudit3 = (TextView) findViewById(R.id.ftwtaudit3);
        ftwttextaudit4 = (TextView) findViewById(R.id.ftwtaudit4);




        new DownloadXML().execute(URL);

        /*Настройка ActionBar*/
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true); //стрелка на предыдущее активити

      /*Работа с Tab */
        TabHost tabs = (TabHost) findViewById(android.R.id.tabhost);

        tabs.setup();


        TabHost.TabSpec spec = tabs.newTabSpec("monday12");
        spec.setContent(R.id.monday12);
        spec.setIndicator("Пн.");

        tabs.addTab(spec);


        spec = tabs.newTabSpec("tuesday12");
        spec.setContent(R.id.tuesday12);
        spec.setIndicator("Вт.");
        tabs.addTab(spec);

        spec = tabs.newTabSpec("wednesday12");
        spec.setContent(R.id.wednesday12);
        spec.setIndicator("Ср.");
        tabs.addTab(spec);

        spec = tabs.newTabSpec("thursday12");
        spec.setContent(R.id.thursday12);
        spec.setIndicator("Чт.");
        tabs.addTab(spec);

        spec = tabs.newTabSpec("friday12");
        spec.setContent(R.id.friday12);
        spec.setIndicator("Пт.");
        tabs.addTab(spec);


        tabs.setCurrentTab(1);

    }

    /*главный метод парсинга*/
    private class DownloadXML extends AsyncTask<String, Void, Void> {
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            pDialog = new ProgressDialog(Rysovanniy.this);

            pDialog.setTitle("Загрузка рассписания");
            pDialog.setMessage("Загрузка....");

            pDialog.setIndeterminate(false);
            pDialog.show();

        }

        @Override
        protected Void doInBackground(String... Url) {

            try {
                URL url = new URL(Url[0]);


                DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
                DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
                Document doc = documentBuilder.parse(new InputSource(url.openStream()));
                doc.getDocumentElement().normalize();

                nodeList = doc.getElementsByTagName("myxml");

            } catch (Exception e) {

                e.printStackTrace();
            }

            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            for (int temp = 0; temp < nodeList.getLength(); temp++) {
                Node nNode = nodeList.item(temp);
                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;

                    /***************ПОНЕДЕЛЬНИК*******************/
                    /*Время с помощью TextViev парсим в таблицу*/
                    texttime1.setText(texttime1.getText() + getNode("first", eElement));

                    texttime2.setText(texttime2.getText() + getNode("second", eElement));

                    texttime3.setText(texttime3.getText() + getNode("third", eElement));

                    texttime4.setText(texttime4.getText() + getNode("fourth", eElement));

                     /*Тип пары с помощью TextViev парсим в таблицу*/
                    texttype1.setText(texttype1.getText() + getNode("lc", eElement));

                    texttype2.setText(texttype2.getText() + getNode("pr", eElement));

                    texttype3.setText(texttype3.getText() + getNode("lb", eElement));

                    texttype4.setText(texttype4.getText() + getNode("lc", eElement));


//                     /*Название предмета с помощью TextViev парсим в таблицу*/
                    textname1.setText(textname1.getText() + getNode("fp", eElement));

                    textname2.setText(textname2.getText() + getNode("sp", eElement));
//
                    textname3.setText(textname3.getText() + getNode("tp", eElement));
//
                    textname4.setText(textname4.getText() + getNode("fop", eElement));

                     /*Название корпуса и номер аудитории с помощью TextViev парсим в таблицу*/
                    textaudit1.setText(textaudit1.getText() + getNode("ela", eElement));

                    textaudit2.setText(textaudit2.getText() + getNode("tea", eElement));

                    textaudit3.setText(textaudit3.getText() + getNode("sia", eElement));

                    textaudit4.setText(textaudit4.getText() + getNode("seva", eElement));


                    /***************ВТОРНИК*******************/
                    /*Время с помощью TextViev парсим в таблицу*/
                    ttexttime1.setText(ttexttime1.getText() + getNode("second", eElement));

                    ttexttime2.setText(ttexttime2.getText() + getNode("second", eElement));

                    ttexttime3.setText(ttexttime3.getText() + getNode("third", eElement));

                    ttexttime4.setText(ttexttime4.getText() + getNode("fourth", eElement));

                     /*Тип пары с помощью TextViev парсим в таблицу*/
                    ttexttype1.setText(ttexttype1.getText() + getNode("lc", eElement));

                    ttexttype2.setText(ttexttype2.getText() + getNode("pr", eElement));

                    ttexttype3.setText(ttexttype3.getText() + getNode("lb", eElement));

                    ttexttype4.setText(ttexttype4.getText() + getNode("lc", eElement));


//                     /*Название предмета с помощью TextViev парсим в таблицу*/
                    ttextname1.setText(ttextname1.getText() + getNode("fp", eElement));

                    ttextname2.setText(ttextname2.getText() + getNode("sp", eElement));
//
                    ttextname3.setText(ttextname3.getText() + getNode("tp", eElement));
//
                    ttextname4.setText(ttextname4.getText() + getNode("fop", eElement));

                     /*Название корпуса и номер аудитории с помощью TextViev парсим в таблицу*/
                    ttextaudit1.setText(ttextaudit1.getText() + getNode("ela", eElement));

                    ttextaudit2.setText(ttextaudit2.getText() + getNode("tea", eElement));

                    ttextaudit3.setText(ttextaudit3.getText() + getNode("sia", eElement));

                    ttextaudit4.setText(ttextaudit4.getText() + getNode("seva", eElement));



                    /***************СРЕДА*******************/
                    /*Время с помощью TextViev парсим в таблицу*/
                    wttexttime1.setText(wttexttime1.getText() + getNode("second", eElement));

                    wttexttime2.setText(wttexttime2.getText() + getNode("second", eElement));

                    wttexttime3.setText(wttexttime3.getText() + getNode("third", eElement));

                    wttexttime4.setText(wttexttime4.getText() + getNode("fourth", eElement));

                     /*Тип пары с помощью TextViev парсим в таблицу*/
                    wttexttype1.setText(wttexttype1.getText() + getNode("lc", eElement));

                    wttexttype2.setText(wttexttype2.getText() + getNode("pr", eElement));

                    wttexttype3.setText(wttexttype3.getText() + getNode("lb", eElement));

                    wttexttype4.setText(wttexttype4.getText() + getNode("lc", eElement));


//                     /*Название предмета с помощью TextViev парсим в таблицу*/
                    wttextname1.setText(wttextname1.getText() + getNode("fp", eElement));

                    wttextname2.setText(wttextname2.getText() + getNode("sp", eElement));
//
                    wttextname3.setText(wttextname3.getText() + getNode("tp", eElement));
//
                    wttextname4.setText(wttextname4.getText() + getNode("fop", eElement));

                     /*Название корпуса и номер аудитории с помощью TextViev парсим в таблицу*/
                    wttextaudit1.setText(wttextaudit1.getText() + getNode("ela", eElement));

                    wttextaudit2.setText(wttextaudit2.getText() + getNode("tea", eElement));

                    wttextaudit3.setText(wttextaudit3.getText() + getNode("sia", eElement));

                    wttextaudit4.setText(wttextaudit4.getText() + getNode("seva", eElement));



                    /***************ЧЕТВЕРГ*******************/
                    /*Время с помощью TextViev парсим в таблицу*/
                    twttexttime1.setText(twttexttime1.getText() + getNode("second", eElement));

                    twttexttime2.setText(twttexttime2.getText() + getNode("second", eElement));

                    twttexttime3.setText(twttexttime3.getText() + getNode("third", eElement));

                    twttexttime4.setText(twttexttime4.getText() + getNode("fourth", eElement));

                     /*Тип пары с помощью TextViev парсим в таблицу*/
                    twttexttype1.setText(twttexttype1.getText() + getNode("lc", eElement));

                    twttexttype2.setText(twttexttype2.getText() + getNode("pr", eElement));

                    twttexttype3.setText(twttexttype3.getText() + getNode("lb", eElement));

                    twttexttype4.setText(twttexttype4.getText() + getNode("lc", eElement));


//                     /*Название предмета с помощью TextViev парсим в таблицу*/
                    twttextname1.setText(twttextname1.getText() + getNode("fp", eElement));

                    twttextname2.setText(twttextname2.getText() + getNode("sp", eElement));
//
                    twttextname3.setText(twttextname3.getText() + getNode("tp", eElement));
//
                    twttextname4.setText(twttextname4.getText() + getNode("fop", eElement));

                     /*Название корпуса и номер аудитории с помощью TextViev парсим в таблицу*/
                    twttextaudit1.setText(twttextaudit1.getText() + getNode("ela", eElement));

                    twttextaudit2.setText(twttextaudit2.getText() + getNode("tea", eElement));

                    twttextaudit3.setText(twttextaudit3.getText() + getNode("sia", eElement));

                    twttextaudit4.setText(twttextaudit4.getText() + getNode("seva", eElement));


                    /***************ПЯТНИЦА*******************/
                    /*Время с помощью TextViev парсим в таблицу*/
                    ftwttexttime1.setText(ftwttexttime1.getText() + getNode("second", eElement));

                    ftwttexttime2.setText(ftwttexttime2.getText() + getNode("second", eElement));

                    ftwttexttime3.setText(ftwttexttime3.getText() + getNode("third", eElement));

                    ftwttexttime4.setText(ftwttexttime4.getText() + getNode("fourth", eElement));

                     /*Тип пары с помощью TextViev парсим в таблицу*/
                    ftwttexttype1.setText(ftwttexttype1.getText() + getNode("lc", eElement));

                    ftwttexttype2.setText(ftwttexttype2.getText() + getNode("pr", eElement));

                    ftwttexttype3.setText(ftwttexttype3.getText() + getNode("lb", eElement));

                    ftwttexttype4.setText(ftwttexttype4.getText() + getNode("lc", eElement));


//                     /*Название предмета с помощью TextViev парсим в таблицу*/
                    ftwttextname1.setText(ftwttextname1.getText() + getNode("fp", eElement));

                    ftwttextname2.setText(ftwttextname2.getText() + getNode("sp", eElement));
//
                    ftwttextname3.setText(ftwttextname3.getText() + getNode("tp", eElement));
//
                    ftwttextname4.setText(ftwttextname4.getText() + getNode("fop", eElement));

                     /*Название корпуса и номер аудитории с помощью TextViev парсим в таблицу*/
                    ftwttextaudit1.setText(ftwttextaudit1.getText() + getNode("ela", eElement));

                    ftwttextaudit2.setText(ftwttextaudit2.getText() + getNode("tea", eElement));

                    ftwttextaudit3.setText(ftwttextaudit3.getText() + getNode("sia", eElement));

                    ftwttextaudit4.setText(ftwttextaudit4.getText() + getNode("seva", eElement));



                }


            }
            pDialog.dismiss();
        }
    }

    private static String getNode(String sTag, Element eElement) {
        NodeList nList = eElement.getElementsByTagName(sTag).item(0).getChildNodes();
        Node nValue = (Node) nList.item(0);
        return nValue.getNodeValue();
    }






    @Override
    public boolean onCreateOptionsMenu (Menu menu){
        getMenuInflater().inflate(R.menu.main, menu);
        return true;

    }

}

