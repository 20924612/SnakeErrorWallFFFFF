
import java.awt.Color;
import java.awt.Graphics;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author victor
 */
public class SpecialFood extends Food {
    
    private int visibleMilliseconds;
    public static final int MAX_MILLISECONDS = 10000;
    public static final int MIN_MILLISECONDS = 3000;
    
    public SpecialFood(Snake snake) {
        super(snake);
        visibleMilliseconds = (int) (Math.random()*(MAX_MILLISECONDS - MIN_MILLISECONDS) 
                                                + MIN_MILLISECONDS);
    }
    
    public int getVisibleMilliseconds(){
        return visibleMilliseconds;
    }
    
    public void paint(Graphics g, int width, int height) {
        Util.drawSquare(g, row, col, Color.magenta, width, height);
    }
    
}
