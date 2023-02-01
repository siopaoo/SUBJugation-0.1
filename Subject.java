import java.util.*;

public abstract class Subject {
  protected String name;
  protected int hp, maxHP, atk, speed, shield;
  protected float dmgRed;
  boolean alive = true;
  
  public Subject(String n, int h, int a, float d, int spd) {
    name = n;
    maxHP = h;
    hp = h;
    atk = a;
    dmgRed = d;
    speed = spd;
    alive = true;
    shield = 0;
  }

  public String getName(){
    return name;
  }
  public int getmaxHP(){
    return maxHP;
  }
  public int getHP(){
    return hp;
  }
  public int getAttack(){
    return atk;
  }
  public float getDmgRed(){
    return dmgRed;
  }
  public int getSpeed(){
    return speed;
  }
  public int getShield(){
    return shield;
  }
  public boolean alive(){
    if(hp <= 0){
      return false;
    }else{
      return true;
    }
  }
  

  public void attack(Subject s){
    //checks if alive
    //multiplies atk to enemy's dmg reduction, subtract enemy's shield from it, if attack < 0 -> 0, subtract attack from enemy's hp
  }
  public void skill(Subject s){
    //checks if alive
    //switch case of what it does according to what this subject is and does it to s
  }
  public void dig(){
    //checks if alive
    //randomly generates an item and adds it to the players inventory if the players
  }
  public void addHP(int i){
    //checks if alive
    hp = hp + i;
    if (hp > maxHP) hp = maxHP;
  }
}
