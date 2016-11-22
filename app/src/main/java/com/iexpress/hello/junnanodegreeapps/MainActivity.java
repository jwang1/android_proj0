package com.iexpress.hello.junnanodegreeapps;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
  private Toast toast;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    toast = Toast.makeText(getApplicationContext(), "to fill", Toast.LENGTH_SHORT);
    setContentView(R.layout.activity_main);

    Button buildItBiggerBtn = (Button) findViewById(R.id.build_it_bigger);
    buildItBiggerBtn.setOnClickListener((view) -> {
      toast.setText("Hello Momy, this " + ((Button) view).getText() + " button will launch Build It Bigger project.");
      toast.show();
    });

  }

  public void clickPopularMovies(View view) {
    toast.setText("Hello Annie, this " + ((Button)view).getText()  + " button will lauch Popular Movies Project.");
    toast.show();
  }

  public void clickStockHawk(View view) {
    toast.setText("Hello Raymond, this " + ((Button)view).getText()  + " button will lauch Stock Hawk Project.");
    toast.show();
  }

}
