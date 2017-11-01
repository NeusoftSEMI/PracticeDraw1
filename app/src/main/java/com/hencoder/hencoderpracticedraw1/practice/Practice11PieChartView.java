package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice11PieChartView extends View {
    private Paint mPaint = new Paint();
    private Path mPath = new Path();

    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图

        int width = getWidth();
        int height = getHeight();
        int min = Math.min(width, height);
        mPaint.setColor(Color.parseColor("#F44336"));
        canvas.drawArc(min / 4 - 20, min / 4 - 20, min * 3 / 4 - 20, min * 3 / 4 - 20, -180, 135, true, mPaint);
        mPaint.setColor(Color.parseColor("#FFC107"));
        canvas.drawArc(min / 4, min / 4, min * 3 / 4, min * 3 / 4, -45, 43, true, mPaint);
        mPaint.setColor(Color.parseColor("#9C27B0"));
        canvas.drawArc(min / 4, min / 4, min * 3 / 4, min * 3 / 4, 0, 10, true, mPaint);
        mPaint.setColor(Color.parseColor("#9E9E9E"));
        canvas.drawArc(min / 4, min / 4, min * 3 / 4, min * 3 / 4, 13, 10, true, mPaint);
        mPaint.setColor(Color.parseColor("#009688"));
        canvas.drawArc(min / 4, min / 4, min * 3 / 4, min * 3 / 4, 25, 50, true, mPaint);
        mPaint.setColor(Color.parseColor("#2196F3"));
        canvas.drawArc(min / 4, min / 4, min * 3 / 4, min * 3 / 4, 78, 100, true, mPaint);


    }
}
