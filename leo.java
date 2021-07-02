import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class leo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class leo extends Actor
{
    int amount = 3;
    boolean b = true;
    BigLeo bL= new BigLeo();
    /**
     * Act - do whatever the leo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        touchEach();
        fly();
        //产一只大猪
        if(b){
            //小猪下落250时产生
            if(getY() > 250){
                //添加大猪到世界中去
                getWorld().addObject(bL,Greenfoot.getRandomNumber(750),1);
                b = false;
            }
        }
    } 

    /**
     * 判断大猪是否下落到世界边缘
     */
    public boolean getAtEdge(){
        //大猪未加入世界时不判断
        if(!b){
            if(bL.isAtEdge()){
                return true;
            }else{
                return false;
            }
        }
        return false;
    }
   
    public void fly()
    {
        //设定新坐标  使其下移
        setLocation (getX(),getY()+amount);
    }

    public void touchEach()
    {        
        if(isAtEdge())
        {
            //计数器  速度
            amount++;
            //重新设定新坐标   最上方
            setLocation(Greenfoot.getRandomNumber(750),1);
        }
    }
}
