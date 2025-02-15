package com.android.emrannik.pdf_view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class MainActivity extends AppCompatActivity {
    PDFView pdfViewer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pdfViewer=(PDFView) findViewById(R.id.pdfviewer);
        pdfViewer.fromAsset("minnatul_bari_1.pdf").load();
    }
}
