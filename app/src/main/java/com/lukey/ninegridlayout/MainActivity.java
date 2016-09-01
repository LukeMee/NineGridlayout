package com.lukey.ninegridlayout;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends ActionBarActivity {
    private ListView listView;
    private List<List<Image>> imagesList;

    private String[][] images = new String[][]{{"http://t2.27270.com/uploads/tu/201510/249/8.jpg", "640", "960"}
            , {"http://t2.27270.com/uploads/tu/201606/76/32.jpg", "640", "640"}
            , {"http://t2.27270.com/uploads/tu/201510/249/9.jpg", "640", "640"}
            , {"http://t2.27270.com/uploads/tu/201606/112/17.jpg", "640", "640"}
            , {"http://t2.27270.com/uploads/tu/201510/249/3.jpg", "640", "640"}
            , {"http://t2.27270.com/uploads/tu/201606/62/28.jpg", "640", "640"}
            , {"http://t2.27270.com/uploads/tu/201606/76/34.jpg", "640", "640"}
            , {"http://t2.27270.com/uploads/tu/201606/73/slt.jpg", "640", "640"}
            , {"http://img2.imgtn.bdimg.com/it/u=3347259689,1828160575&fm=21&gp=0.jpg", "640", "640"}
            , {"http://img1.imgtn.bdimg.com/it/u=3607821315,1190508392&fm=21&gp=0.jpg", "640", "640"}
            , {"http://img4.imgtn.bdimg.com/it/u=2495945657,2561148855&fm=21&gp=0.jpg", "640", "640"}
            , {"http://t2.27270.com/uploads/tu/201510/249/7.jpg", "800", "650"}};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.lv_main);
        imagesList = new ArrayList<>();
        for (int i = 0; i < images.length; i++) {
            ArrayList<Image> itemList = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                itemList.add(new Image(images[j][0], Integer.parseInt(images[j][1]), Integer.parseInt(images[j][2])));
            }
            imagesList.add(itemList);
        }
        final MainAdapter adapter = new MainAdapter(MainActivity.this, imagesList);
        listView.setAdapter(adapter);

    }

}
