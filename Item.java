import java.util.*;

public abstract class Item {
  protected String name;
  public Item(String n) {
    name = n;
  }

  public String getName(){
    return name;
  }

  public abstract void use(Subject s);
}