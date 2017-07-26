package views.demo.viewdemo;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Build;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * ================================================
 * 作    者：admin
 * 版    本：1.0
 * 创建日期：2017/7/26
 * 描    述：
 * 修订历史：
 * ================================================
 */

public class View1 extends View {
    Paint paint = new Paint();
    Path path = new Path();

    public View1(Context context) {
        super(context);

    }

    public View1(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public View1(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        path.addArc(200, 200, 400, 400, -225, 225);
        path.arcTo(400, 200, 600, 400, -180, 225, false);
        path.lineTo(400, 542);
        canvas.drawPath(path,paint);
    }

}
