import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BigLeo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BigLeo extends Actor
{
    int amount = 2;
    public void act() 
    {
        touch();
        fly();
    } 
    
    public void fly(){
        if(amount == 6){
            amount = 3;
        }
        setLocation(getX(),getY()+amount);
    }
    
    public void touch(){
        if(isAtEdge()){
            amount++;
            setLocation(Greenfoot.getRandomNumber(750),1);
        }
    } 

}
