/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigbadwolf;

import java.awt.Color;
import java.awt.Graphics2D;

/**
 *
 * @author Тест
 */
public class BigBadWolf implements IUnit{

    /**
     * @param args the command line arguments
     */
    
    int Wx;
    int Wy;
    int rabb;
    private final float t0;
    

    public BigBadWolf(IWorld World, int x, int y) {
        Wx = x;
        Wy = y;
        t0 = World.getTime();
        rabb = 0;
        //World.addUnit(this);
    }
    
    
    @Override
    public void draw(Graphics2D canvas) {
        canvas.setColor(Color.darkGray);
        canvas.fillRect(Wx - 7, Wy - 7, 15, 15);
    }

    @Override
    public void step(IWorld World, float dt) {
        
        if (World.getTime() - t0 > 300) {
            //World.removeUnit(this);
        }
        
        //движение и удаление зайцев, за каждое из которых увеличивается на 1 переменная rabb 
        
        if (rabb == 5) {
            //World.addUnit();
            rabb = 0;
        }
        
    }
    
    
    
}
