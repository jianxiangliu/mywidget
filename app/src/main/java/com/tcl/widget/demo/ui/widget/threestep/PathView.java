package com.tcl.widget.demo.ui.widget.threestep;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

import com.tcl.widget.demo.R;
import com.tcl.widget.demo.uti.ResUtil;

/**
 * Created by jerryliu on 2017/5/29.
 */

public class PathView extends View {
    private Paint mPaint;
    private Path mPath;

    public PathView(Context context) {
        super(context, null);
        init();
    }

    public PathView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs, 0);
        init();
    }

    public PathView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setColor(ResUtil.getColor(R.color.blue));
        mPaint.setTextSize(ResUtil.sp2px(12));

        mPath = new Path();

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        /*Path path1 = new Path();
        path1.addCircle(220,200, 180, Path.Direction.CW);
        canvas.drawPath(path1,mPaint);


        Path path2 = new Path();
        path2.addCircle(750,200, 180, Path.Direction.CW);
        canvas.drawPath(path2,mPaint);

        String text = "风萧萧兮易水寒 壮士一去兮不复返";
        canvas.drawTextOnPath(text,path1,0,0,mPaint);

        canvas.drawTextOnPath(text,path2,50,50,mPaint);
*/
        //canvas.drawPath(mPath,mPaint);
        mPath.moveTo(100,600);
        mPath.lineTo(400,100);
        mPath.lineTo(700,900);

        canvas.drawPath(mPath,mPaint);

        mPaint.setColor(ResUtil.getColor(R.color.red));
        mPaint.setPathEffect(new CornerPathEffect(100));
        canvas.drawPath(mPath,mPaint);

        mPaint.setColor(ResUtil.getColor(R.color.green));
        mPaint.setPathEffect(new CornerPathEffect(200));
        canvas.drawPath(mPath,mPaint);
    }

    private float mPreX,mPreY;

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                mPreX = event.getX();
                mPreY = event.getY();
                mPath.moveTo(mPreX,mPreY);
                return true;
            case MotionEvent.ACTION_MOVE:
                float endX = (mPreX + event.getX()) / 2;
                float endY = (mPreY + event.getY()) / 2;
                mPath.quadTo(mPreX,mPreY,endX,endY);
                mPreX = endX;
                mPreY = endY;
                invalidate();
                break;
            case MotionEvent.ACTION_UP:

                break;
        }
        return true;
    }


    public void reset(){
        mPath.reset();
        invalidate();
    }
}
