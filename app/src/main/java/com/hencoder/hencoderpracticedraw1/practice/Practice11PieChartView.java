package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice11PieChartView extends View {

    float centerX = 500;
    float centerY = 500;

    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    Paint paint = new Paint();
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图

        paint.setColor(Color.RED);
        canvas.drawArc(100, 100, 400, 400, 180, 120, true, paint);
        paint.setColor(Color.YELLOW);
        canvas.drawArc(100, 100, 400, 400, 300, 45, true, paint);
        paint.setColor(Color.DKGRAY);
        canvas.drawArc(100, 100, 400, 400, 0, 20, true, paint);
        paint.setColor(Color.BLACK);
        canvas.drawArc(100, 100, 400, 400, 30, 20, true, paint);
        paint.setColor(Color.GREEN);
        canvas.drawArc(100, 100, 400, 400, 60, 50, true, paint);

    }
}
