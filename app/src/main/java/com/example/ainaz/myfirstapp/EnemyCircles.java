package com.example.ainaz.myfirstapp;

import java.util.Random;

/**
 * Created by Ainaz on 26.09.2016.
 */
public class EnemyCircles extends SimpleCircle{

    public static final int TO_RADIUS = 510;
    public static final int FROM_RADIUS = 110;

    public EnemyCircles(int x, int y, int radius) {
        super(x, y, radius);
    }

    public static EnemyCircles getRandomCircle() {
        Random random = new Random();
        int x = random.nextInt(GameManager.getWidth());
        int y = random.nextInt(GameManager.getHeight());
        int radius = FROM_RADIUS - random.nextInt(TO_RADIUS - FROM_RADIUS);
        EnemyCircles enemyCircle = new EnemyCircles(x, y, radius);
        return enemyCircle;
    }
}
