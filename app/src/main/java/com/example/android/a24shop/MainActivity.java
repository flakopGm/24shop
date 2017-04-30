package com.example.android.a24shop;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Método para abrir el facebook y seguir al local (Si existiese).
    public void facebook(View view) {
        Intent intent = new Intent("android.intent.category.LAUNCHER");
        intent.setClassName("com.facebook.katana", "com.facebook.katana.LoginActivity");
        // Verify that the intent will resolve to an activity
        if (intent.resolveActivity(this.getPackageManager()) != null) {
            startActivity(intent);
        }
        startActivity(intent);
    }

    // Método para mostrar en el mapa la dirección del local.
    public void map(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/maps/k8ij7XgvE2C2"));
        // Verify that the intent will resolve to an activity
        if (intent.resolveActivity(this.getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    // Método para enviar correo adjuntando dátos básico y de información.
    public void correo(View view) {
        String TO = "24hyourshop@google.es";
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:"));
        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{TO});
        intent.putExtra(Intent.EXTRA_SUBJECT, "24h info");
        intent.putExtra(Intent.EXTRA_TEXT, "Por favor introduzca su consulta y sus datos");
        if (intent.resolveActivity(getPackageManager()) != null)
            startActivity(intent);
    }
}
