package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

public class Practice10HistogramView extends View {

    private Path mPath = new Path();
    private Paint mPaint = new Paint();

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图

        int width = getWidth();
        int height = getHeight();
        Log.e("tag", width + "||" + height);
        mPaint.setStrokeWidth(2);
        mPaint.setColor(Color.WHITE);
        canvas.drawColor(Color.parseColor("#506E7A"));
        mPaint.setTextSize(30);
        canvas.drawLine(width / 9, 20, width / 9, height * 2 / 3, mPaint);
        canvas.drawLine(width / 9, height * 2 / 3, width * 8 / 9, height * 2 / 3, mPaint);

        canvas.drawText("FROYO", width / 9, height * 2 / 3 + 20, mPaint);
        canvas.drawText("GB", width * 2 / 9, height * 2 / 3 + 20, mPaint);
        canvas.drawText("ICE", width * 3 / 9, height * 2 / 3 + 20, mPaint);
        canvas.drawText("ICE", width * 3 / 9, height * 2 / 3 + 20, mPaint);
        canvas.drawText("JB", width * 4 / 9, height * 2 / 3 + 20, mPaint);
        canvas.drawText("KitKat", width * 5 / 9, height * 2 / 3 + 20, mPaint);
        canvas.drawText("L", width * 6 / 9, height * 2 / 3 + 20, mPaint);
        canvas.drawText("M", width * 7 / 9, height * 2 / 3 + 20, mPaint);


        mPaint.setStyle(Paint.Style.FILL);
        mPaint.setColor(Color.parseColor("#72B916"));

        canvas.drawRect(width / 9 + 20, height * 16 / 27, width / 9 + 120, height * 2 / 3, mPaint);

        canvas.drawRect(width / 9 + 140, height * 16 / 27, width / 9 + 240, height * 2 / 3, mPaint);

        canvas.drawRect(width / 9 + 260, height * 12 / 27, width / 9 + 360, height * 2 / 3, mPaint);
        canvas.drawRect(width / 9 + 380, height * 11 / 27, width / 9 + 480, height * 2 / 3, mPaint);
        canvas.drawRect(width / 9 + 500, height * 7 / 27, width / 9 + 600, height * 2 / 3, mPaint);
        canvas.drawRect(width / 9 + 620, height * 10 / 27, width / 9 + 720, height * 2 / 3, mPaint);
        canvas.drawRect(width / 9 + 740, height * 2 / 27, width / 9 + 840, height * 2 / 3, mPaint);
    }
}
