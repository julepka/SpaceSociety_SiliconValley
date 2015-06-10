/*
* created by Meera Mali, 2015.
*
*/

package com.spacesociety;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PdfFirstScreen extends Activity {

    private static RoundImageView mImage;
    private static Bitmap mIcon;

    public void readOn(View v) {
        startActivity(new Intent(PdfFirstScreen.this, PdfLibrary.class));
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pdf_firstscreen);
        mImage = (RoundImageView) findViewById(R.id.pdfimage);
        mIcon = BitmapFactory.decodeResource(getResources(), R.drawable.pdf_firstscreen);
        mImage.setImageBitmap(mIcon);
    }

}
