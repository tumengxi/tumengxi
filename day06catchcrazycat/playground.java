package com.example.kylin.catchcrazycat;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.KeyEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

/**
 * Created by Kylin on 2015/7/13 0013.
 */
public class playground extends SurfaceView{

    private static final int WIDTH=80;
    private static final int COL=10;
    private static final int ROW=10;
    private static final int BLOCKS=15;//默认的路障数量

    private Dot matrix[][];
    private Dot cat;


    public playground(Context context){
        super(context);
        getHolder().addCallback(callback);
        matrix=new Dot[ROW][COL];
        for (int i=0;i< ROW;i++){
            for(int j=0;j<COL;j++){
                matrix[i][j]=new Dot(j,i);
            }
        }
        initGame();
    }


    private Dot getDot(int x,int y){
        return matrix[y][x];
    }


    private void redraw(){
        int i;
        int j;
        Canvas c=getHolder().lockCanvas();
        c.drawColor(Color.LTGRAY);
        Paint paint=new Paint();
        for (i=0;i<ROW;i++){
            for(j=0;j<COL;j++){
                Dot one=getDot(j,i);
                switch (one.getStatus()){
                    case Dot.STATUS_OFF:
                        paint.setColor(0XFFEEEEEE);
                        break;
                    case Dot.STATUS_ON:
                        paint.setColor(0XFFFFAA00);
                        break;
                    case Dot.STATUS_IN:
                        paint.setColor(0XFFFF0000);
                        break;
                    default:
                        break;
                }
                if (i % 2 == 0) {
                    c.drawOval(new RectF(j*WIDTH+(WIDTH/2), i* WIDTH,j*WIDTH+(WIDTH/2*3),(i+1)*WIDTH), paint);

                } else {
                    c.drawOval(new RectF(j*WIDTH,i*WIDTH,j*WIDTH+WIDTH,(i+1)*WIDTH), paint);
                }


            }
        }
        getHolder().unlockCanvasAndPost(c);
    }

    SurfaceHolder.Callback callback=new SurfaceHolder.Callback() {
        @Override
        public void surfaceCreated(SurfaceHolder holder) {
            redraw();
        }

        @Override
        public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {

        }

        @Override
        public void surfaceDestroyed(SurfaceHolder holder) {

        }
    };

    private void initGame(){
        for (int i=0;i<ROW;i++){
            for (int j=0;j<COL;j++){
                matrix[j][i].setStatus(Dot.STATUS_OFF);
            }
        }
        cat=new Dot(4,5);
        getDot(4,5).setStatus(Dot.STATUS_IN);
        for (int i=0;i<BLOCKS;){
            int x=(int) (Math.random()*1000)%COL;
            int y=(int) (Math.random()*1000)%ROW;//随机数返回double，强制转换为int
            if (getDot(x,y).getStatus()==Dot.STATUS_OFF){
                getDot(x,y).setStatus(Dot.STATUS_ON);
                i++;
                System.out.println("Block"+i);
            }
        }
    }
}
