import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyWorld extends World
{
    Start s = new Start();
    Title t = new Title();
    leo l = new leo();
    int score = 0;
    boolean b = false;
    /**
     * Constructor for objects of class MyWorld.
     */
    public MyWorld()
    {    
        super(750, 500, 1); 
        prepare();
    }

    /**
     * 创建初始对象并将其添加到游戏世界中
     */
    private void prepare()
    {
        addObject(new Title(), 375, 100);
        addObject(s, 375, 250);
    }
    
    /** 在此world中的所有对象的act方法之前执行。默认的act方法什么也不会做。
     * 该方法应当在各个World类的子类中重写，从而定义各子类对象的动作行为。**/
    public void act() 
    {
        //判断是否点击开始
        if(Greenfoot.mouseClicked(s)){
            addObject(new Stickman(), 375, 405);
            addObject(new Score("Score:"+score), 60, 50);
            addObject(l,Greenfoot.getRandomNumber(750),1);
            removeObject(s);
            b = true;
        }
        //小猪未加入世界时不判断
        if(b)
        {
            //检查小猪是否下落到世界边缘  +2分
            if(l.isAtEdge()){
                score+=2;
                addObject(new Score("Score: "+score),60, 50);
            }
            //检查大猪是否下落到世界边缘  +5分
            if(l.getAtEdge()){
                score+=5;
                addObject(new Score("Score: "+score),60, 50);
            } 
        }
        
    }
}
