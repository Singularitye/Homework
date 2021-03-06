package com.example.administrator.signin;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.EditText;

/**
 * Created by Administrator on 2016/11/23.
 */

public class MyEditText extends EditText {

    private Paint mPaint;

    public MyEditText(Context context, AttributeSet attrs){
        super(context,attrs);
        mPaint = new Paint();
        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setColor(Color.GRAY);
    }

    public void onDraw(Canvas canvas){
        super.onDraw(canvas);

        canvas.drawLine(0,this.getHeight()-1,this.getWidth()-1,this.getHeight()-1
        ,mPaint);
    }
}
