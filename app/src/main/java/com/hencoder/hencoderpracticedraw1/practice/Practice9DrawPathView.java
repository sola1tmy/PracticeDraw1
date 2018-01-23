package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice9DrawPathView extends View {

    public Practice9DrawPathView(Context context) {
        super(context);
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    Paint paint = new Paint();
    Path path = new Path();
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawPath() 方法画心形

        paint.setStyle(Paint.Style.FILL_AND_STROKE);

        path.addArc(100, 100, 200, 200, 150, 210);
        path.arcTo(200, 100, 300, 200, 180, 210, false);
        path.lineTo(200, 250);
//        path.close();

//        path.moveTo(100,  150);
//        path.lineTo(300,  150);
//        path.lineTo(200,  250);
//        path.close();
        canvas.drawPath(path, paint);
    }
}
