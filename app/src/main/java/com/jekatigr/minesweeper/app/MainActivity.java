package com.jekatigr.minesweeper.app;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        LinearLayout rl = (LinearLayout) findViewById(R.id.main_layout);
        rl.addView(new GameFieldView(this));
    }
}

class GameFieldView extends View {

    public GameFieldView(Context context) {
        super(context);
    }

    public GameFieldView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public GameFieldView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(Color.RED);
        Paint p = new Paint();
        p.setColor(Color.BLACK);
        Bitmap b = BitmapFactory.decodeResource(getResources(), R.drawable.cell_1);
        Bitmap b2 = BitmapFactory.decodeResource(getResources(), R.drawable.closed_field);

        b = Bitmap.createScaledBitmap(b, 100, 100, false);
        b2 = Bitmap.createScaledBitmap(b2, 100, 100, false);

        canvas.drawBitmap(b, 10, 10, p);
        canvas.drawBitmap(b2, 70, 70, p);
    }
}
