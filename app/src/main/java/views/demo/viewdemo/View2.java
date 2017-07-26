package views.demo.viewdemo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;

/**
 * ================================================
 * 作    者：admin
 * 版    本：1.0
 * 创建日期：2017/7/26
 * 描    述：
 * 修订历史：
 * ================================================
 */

public class View2 extends View {
    Paint paint = new Paint();
    Paint paint2 = new Paint();
    Paint paint3 = new Paint();
    Path path = new Path();
    Path path2 = new Path();
    Context context;

    public View2(Context context) {
        super(context);
        this.context = context;
    }

    public View2(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public View2(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        path.addArc(200, 200, 400, 400, -225, 225);
        path.arcTo(400, 200, 600, 400, -180, 225, false);
        path.lineTo(400, 542);
        paint.setColor(Color.RED);
        paint2.setColor(Color.BLACK);
        canvas.drawPath(path,paint);
        canvas.drawCircle(300,800,150,paint2);
        paint3.setColor(Color.YELLOW);
       canvas.drawRect(600,900,900,1200,paint3);
    }
}
