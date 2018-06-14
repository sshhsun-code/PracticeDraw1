package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {

    private Paint linePaint;
    private Paint histogramPaint;
    private Paint textPaint;

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
        drawLine(canvas);
        drawHistogram(canvas);
        drawHistogramText(canvas);
    }

    private void drawLine(Canvas canvas) {
        linePaint = new Paint();
        linePaint.setColor(Color.WHITE);
        linePaint.setStrokeWidth(5);
        linePaint.setStyle(Paint.Style.STROKE);
        Path path = new Path();
        path.moveTo(100, 100);
        path.lineTo(100, 500);
        path.rLineTo(800, 0);
        canvas.drawPath(path, linePaint);
    }

    private void drawHistogram(Canvas canvas) {
        histogramPaint = new Paint();
        histogramPaint.setColor(Color.parseColor("#FF13A30B"));
        histogramPaint.setStrokeWidth(100);
        histogramPaint.setStyle(Paint.Style.STROKE);
        Path path = new Path();
        path.moveTo(200, 500);
        path.rLineTo(0, -100);
        path.moveTo(400, 500);
        path.rLineTo(0, -200);
        path.moveTo(600, 500);
        path.rLineTo(0, -250);
        path.moveTo(800, 500);
        path.rLineTo(0, -300);
        canvas.drawPath(path, histogramPaint);
    }

    private void drawHistogramText(Canvas canvas) {
        textPaint = new Paint();
        textPaint.setColor(Color.WHITE);
        textPaint.setTextSize(50);
        textPaint.setStyle(Paint.Style.STROKE);
        canvas.drawText("A", 200, 560, textPaint);
        canvas.drawText("B", 400, 560, textPaint);
        canvas.drawText("C", 600, 560, textPaint);
        canvas.drawText("D", 800, 560, textPaint);
        canvas.drawText("直方图", 500, 660, textPaint);
    }
}
