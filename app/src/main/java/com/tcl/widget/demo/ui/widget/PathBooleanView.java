package com.tcl.widget.demo.ui.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;

import com.tcl.widget.demo.uti.ResUtil;

/**
 * Created by lenovo on 2016/10/10.
 */

public class PathBooleanView extends View {
    private int mWidth, mHeight;
    private Paint mDeafultPaint;


    public PathBooleanView(Context context) {
        this(context,null);
    }

    public PathBooleanView(Context context, AttributeSet attrs) {
        this(context, attrs,0);
    }

    public PathBooleanView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        mWidth = w;
        mHeight = h;
    }

    private void init(){
        mDeafultPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        mDeafultPaint.setStyle(Paint.Style.STROKE);
        mDeafultPaint.setStrokeWidth(ResUtil.dip2px(5));
        mDeafultPaint.setColor(Color.BLACK);
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        //canvas.translate(mWidth / 2, mHeight / 2);

        Path path1 = new Path();
        Path path2 = new Path();
        Path path3 = new Path();
        Path path4 = new Path();

        path1.addCircle(0, 0, 200, Path.Direction.CW);
        path2.addRect(0, -200, 200, 200, Path.Direction.CW);
        path3.addCircle(0, -100, 100, Path.Direction.CW);
        path4.addCircle(0, 100, 100, Path.Direction.CCW);


//        path1.op(path2, Path.Op.DIFFERENCE);
//        path1.op(path3, Path.Op.UNION);
//        path1.op(path4, Path.Op.DIFFERENCE);

        //canvas.drawPath(path1, mDeafultPaint);

        Path path5 = new Path();
        path5.moveTo(200, 200);
        path5.quadTo(50, 300, 600, 600);
        canvas.drawPath(path5,mDeafultPaint);

    }
}
