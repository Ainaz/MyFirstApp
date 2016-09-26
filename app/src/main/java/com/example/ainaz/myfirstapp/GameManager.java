package com.example.ainaz.myfirstapp;

import android.graphics.Canvas;
import android.graphics.Paint;

/**
 * Created by Ainaz on 25.09.2016.
 */
public class GameManager {
    private CanvasView canvasView;
    private static int width;
    private static int height;
    private MainCircle mainCircle;

    public GameManager(CanvasView canvasView, int w, int h) {
        this.canvasView = canvasView;
        width = w;
        height = h;
        initMainCircle();
    }

    public static int getWidth() {
        return width;
    }

    public static int getHeight() {
        return height;
    }

    private void initMainCircle() {
        mainCircle = new MainCircle(width / 2, height / 2);
    }

    public void onDrow() {
        canvasView.drawCircle(mainCircle);
    }

    public void onTouchEvent(int x, int y) {
        mainCircle.moveMainCircleWhenTouchAt(x, y);
    }
}
