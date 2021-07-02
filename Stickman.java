import greenfoot.*;

/**
 * This is a stick man. Make him run and jump.
 * 
 * @author 
 * @version 
 */
public class Stickman extends Actor
{
    int sLevel = 0;
    int tmp = 0;
    /**
     * 在环境中按下“Act”或“Run”按钮时，就会调用此方法.
     */
    public void act() 
    {
        checkGameover();
        checkKeyPress();
    }    

    public void checkKeyPress()
    {
        if(Greenfoot.isKeyDown("right"))
        {
            move(6);
        }
        if(Greenfoot.isKeyDown("left"))
        {
            move(-6);
        }
    }
    
    public void Gameover()
    {
        setLocation(370,225);
        //重设定 指定的图片作为本actor的外观
        setImage("blue-draught.png");
        Greenfoot.playSound("lasersound.wav");
        Greenfoot.stop();
    }
    
    public void checkGameover()
    {
        if(isAtEdge())
        {
            Gameover();
        }
        if(isTouching(leo.class))
        {
            Gameover();
        }
        if(isTouching(BigLeo.class)){
            Gameover();
        }
    }
}
