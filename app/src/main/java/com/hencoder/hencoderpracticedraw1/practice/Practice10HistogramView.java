package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {

    float top = 100;
    float bottom = 600;
    float left = 100;
    float right = 1500;

    float value[] = { 10, 50, 50, 300, 500, 500,280};

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    Paint paint = new Paint();
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图

        paint.setColor(Color.WHITE);
        canvas.drawLine(left, top, left, bottom, paint);
        canvas.drawLine(left, bottom, right, bottom, paint);

        paint.setTextSize(20);
        paint.setStyle(Paint.Style.FILL);
        float xOffset = 120;
        for (int i = 0; i< value.length; i++) {
            if (i == 0) {
                paint.setColor(Color.WHITE);
            } else {
                paint.setColor(Color.DKGRAY);
            }

            canvas.drawRect(xOffset,  bottom - value[i],  xOffset + 80, bottom, paint);
            canvas.drawText("text", xOffset,  bottom, paint);
            xOffset += 120;
        }


    }
}
