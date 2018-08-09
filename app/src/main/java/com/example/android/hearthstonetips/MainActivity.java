package com.example.android.hearthstonetips;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tipTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tipTextView = (TextView) findViewById(R.id.tip_text_view);

    }

    // Mostra il consiglio 1
    public void showTip1(View view) {

        tipTextView.setText(R.string.tip_1);
    }

    // Mostra il consiglio 2
    public void showTip2(View view) {
        tipTextView.setText(R.string.tip_2);
    }

    // Mostra il consiglio 3
    public void showTip3(View view) {
        tipTextView.setText(R.string.tip_3);
    }

    // Mostra il consiglio 4
    public void showTip4(View view) {
        tipTextView.setText(R.string.tip_4);
    }

    // Mostra il consiglio 5
    public void showTip5(View view) {
        tipTextView.setText(R.string.tip_5);
    }

    // Invia una email allo sviluppatore.
    public void sendFeedback(View view) {
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:")); // only email apps should handle this
        intent.putExtra(Intent.EXTRA_EMAIL, getString(R.string.addressee));
        intent.putExtra(Intent.EXTRA_SUBJECT, getString(R.string.email_subject));
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
}


