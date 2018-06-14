package com.hencoder.hencoderpracticedraw1.practice;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Build;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice11PieChartView extends View {

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
        drawArc1(canvas);
        drawTips(canvas);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    private void drawArc1(Canvas canvas) {
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.parseColor("#FFFC5A3D"));
        canvas.drawArc(100, 100, 700, 700, -180, 135, true, paint);
        paint.setColor(Color.parseColor("#FFE7AF15"));
        canvas.drawArc(120, 120, 720, 720, -45, 40, true, paint);
        paint.setColor(Color.parseColor("#FFA545C2"));
        canvas.drawArc(120, 120, 720, 720, 0, 10, true, paint);
        paint.setColor(Color.parseColor("#FF948A8A"));
        canvas.drawArc(120, 120, 720, 720, 10, 32, true, paint);
        paint.setColor(Color.parseColor("#FF13DC60"));
        canvas.drawArc(120, 120, 720, 720, 46, 40, true, paint);
        paint.setColor(Color.parseColor("#FF1DA2EF"));
        canvas.drawArc(120, 120, 720, 720, 90, 90, true, paint);
    }

    private void drawTips(Canvas canvas) {
        Paint linePaint = new Paint();
        linePaint.setColor(Color.WHITE);
        linePaint.setStyle(Paint.Style.STROKE);
        linePaint.setStrokeWidth(5);
        linePaint.setTextSize(30);
        Path path = new Path();
        path.moveTo(850, 330);
        path.lineTo(730, 330);
        path.rLineTo(-20, 15);
        canvas.drawPath(path, linePaint);
        Paint textPaint = new Paint();
        textPaint.setColor(Color.WHITE);
        textPaint.setStyle(Paint.Style.STROKE);
        textPaint.setTextSize(40);
        canvas.drawText("test", 870, 330, textPaint);

    }
}
