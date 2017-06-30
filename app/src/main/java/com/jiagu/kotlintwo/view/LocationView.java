package com.jiagu.kotlintwo.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.jiagu.kotlintwo.R;
import com.jiagu.kotlintwo.util.ViewUtils;


/**
 * Created by yuan on 17-3-30.
 */

public class LocationView extends View {

    private int color;
    private float innerRadius;
    private float outRadius;

    private int width;
    private int height;

    private Paint paint;

    public LocationView(Context context) {
        this(context, null);
    }

    public LocationView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public LocationView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        TypedArray typedArray = context.getTheme().obtainStyledAttributes(attrs, R.styleable.LocationView, 0, 0);
        color = typedArray.getColor(R.styleable.LocationView_color, getResources().getColor(R.color.colorAccent));
        innerRadius = typedArray.getDimension(R.styleable.LocationView_radius, ViewUtils.INSTANCE.dpToPx(20, context));
        typedArray.recycle();

        paint = new Paint();
        paint.setColor(color);
        paint.setAntiAlias(true);
    }


    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);

        int widthMode = MeasureSpec.getMode(widthMeasureSpec);
        int heightMode = MeasureSpec.getMode(heightMeasureSpec);

        width = MeasureSpec.getSize(widthMeasureSpec);
        height = MeasureSpec.getSize(heightMeasureSpec);

        outRadius = (float) (innerRadius * 1.5);

        if (widthMode == MeasureSpec.AT_MOST) {
            width = (int) (outRadius * 3);
        } else if (widthMode == MeasureSpec.EXACTLY) {
        } else if (widthMode == MeasureSpec.UNSPECIFIED) {
            width = (int) (outRadius * 3);
        }

        if (heightMode == MeasureSpec.AT_MOST) {
            height = (int) (outRadius * 3);
        } else if (heightMode == MeasureSpec.EXACTLY) {
        } else if (heightMode == MeasureSpec.UNSPECIFIED) {
            height = (int) (outRadius * 3);
        }

        setMeasuredDimension(width, height);


    }


    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        width = w;
        height = h;
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.translate(width / 2, height / 2);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        canvas.drawCircle(0, 0, innerRadius, paint);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(6);
        canvas.drawCircle(0, 0, outRadius, paint);
        canvas.drawLine(0, outRadius, 0, outRadius * 2 - innerRadius, paint);
        canvas.drawLine(0, -outRadius, 0, -outRadius * 2 + innerRadius, paint);
        canvas.rotate(90);
        canvas.drawLine(0, outRadius, 0, outRadius * 2 - innerRadius, paint);
        canvas.drawLine(0, -outRadius, 0, -outRadius * 2 + innerRadius, paint);
    }
}
