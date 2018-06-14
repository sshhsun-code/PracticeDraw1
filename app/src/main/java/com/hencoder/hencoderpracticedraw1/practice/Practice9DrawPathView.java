package com.hencoder.hencoderpracticedraw1.practice;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Build;
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

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawPath() 方法画心形
        drawHeart2(canvas);

    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    private void drawHeart1(Canvas canvas) {//path起点不发生变化，组成一个封闭图形并close
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);//FILL模式模式自动close图形。
        Path path = new Path();
        paint.setAntiAlias(true);

        path.addArc(200, 200, 400, 400, -225, 225);
        path.arcTo(400, 200, 600, 400, -180, 225, false);
        path.lineTo(400, 542);//从第一个圆弧的起点到这个点划线，并组成封闭图形，进行close操作

        canvas.drawPath(path, paint);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    private void drawHeart2(Canvas canvas) {
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);//FILL模式模式自动close图形。
        paint.setAntiAlias(true);
        Path leftPath = new Path();

        leftPath.addArc(200, 200, 400, 400, -225, 225);//画左半边新型
        leftPath.lineTo(400, 542);//左半边心♥封闭

        canvas.drawPath(leftPath, paint);

        Path rightPath = new Path();
        rightPath.addArc(400, 200, 600, 400, -180, 225);//画右半边新型
        rightPath.lineTo(400, 542);//右半边心♥封闭
        canvas.drawPath(rightPath, paint);

    }
}
