package com.example.kwongyo.firetalk.activitySupport.main;

/**
 * Created by kwongiho on 2016-09-08
 */
/**
 * Created by YJLaptop on 2016-03-23.
 */
/**
 * Created by Mathpresso1 on 2015-09-15.
 */
/*import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.widget.CardView;
import android.util.AttributeSet;

import com.example.kwongyo.firetalk.R;
*/
/**
 * AspectRatioCardView is a CardView with a constrained ratio of dimensions.
 * With this class you can create 1:1 (square), 4:3, 16:9 card views.
 * Ratio should be width/height. Eg: 0.75 for 4:3, 0.5625 for 16:9
 * Created by Furkan Tektas on 11/15/14.
 */
/*
public class AspectRatioCardView extends CardView {
    private float mRatio = 1.0f;
    public AspectRatioCardView(Context context) {
        super(context);
    }

    public AspectRatioCardView(Context context, AttributeSet attrs) {
        super(context, attrs);
        extractAttrs(context,attrs);
    }

    public AspectRatioCardView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        extractAttrs(context,attrs);
    }

    private void extractAttrs(Context context, AttributeSet attrs) {
        TypedArray a = context.getTheme().obtainStyledAttributes(
                attrs,
                R.styleable.AspectRatioCardView,
                0, 0);

        try {
            mRatio = a.getFloat(R.styleable.AspectRatioCardView_ratio, 1.0f);
        } finally {
            a.recycle();
        }
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);

        int width = getMeasuredWidth();
        int height = getMeasuredHeight();

        int widthWithoutPadding = width - getPaddingLeft() - getPaddingRight();
        int heightWithoutPadding = height - getPaddingTop() - getPaddingBottom();

        int maxWidth = (int) (heightWithoutPadding * mRatio);
        int maxHeight = (int) (widthWithoutPadding / mRatio);

        if (widthWithoutPadding  > maxWidth) {
            width = maxWidth + getPaddingLeft() + getPaddingRight();
        } else {
            height = maxHeight + getPaddingTop() + getPaddingBottom();
        }

        super.onMeasure(
                MeasureSpec.makeMeasureSpec(width, MeasureSpec.EXACTLY),
                MeasureSpec.makeMeasureSpec(height, MeasureSpec.EXACTLY)
        );
    }
}
*/