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
      toast.setText("Launching " + ((Button) view).getText());
      toast.show();
    });

  }

  public void showToast(View view) {
    toast.setText("Launching: " + ((Button) view).getText());
    toast.show();
  }

}
