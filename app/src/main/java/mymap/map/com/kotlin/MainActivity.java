package mymap.map.com.kotlin;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    Dialog dialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final ProgressDialog dialog=new ProgressDialog(this);
        dialog.setMessage("Please wait....");
        dialog.setCancelable(true);
        dialog.show();

        Handler handler=new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

              dialog.dismiss();

                chechAlert();
            }
        },5000);
    }

    private void chechAlert() {

    //  dialog= new Dialog(getApplicationContext(),true,"Please wait....");
      //  dialog.show();
    }


}
