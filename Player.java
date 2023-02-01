import java.util.*;

public class Player {
  protected String name;
  protected int maxItemCount, kodigoCount, correctionTapeCount, sharpenerCount;
  protected ArrayList<Subject> party;
  
  
  public Player(String n) {
    name = n;
    maxItemCount = 5;
    kodigoCount = 0;
    correctionTapeCount = 0;
    sharpenerCount = 0;
    this.party = new ArrayList<>();
  }

  public String getName(){
    return name;
  }
  public int getMaxItemCount(){
    return maxItemCount;
  }
  public int getKodigoCount(){
    return kodigoCount;
  }
  public int getCorrectionTapeCount(){
    return correctionTapeCount;
  }
  public int getSharpenerCount(){
    return sharpenerCount;
  }

  public void pickSubject(Subject s){
    //checks if same subject is already in the team, puts subject in party
    party.add(s);
  }
  
  public void useItem(Item i){
    //checks if there is item, uses it, and decreasing that item's count
  }
  
  public void addItem(Item i){
    //adds item count if not exceeding item count
  }
  
  public void forfeit(){
    //forfeits game
  }

  public void changeName(String s){
    name = s;
  }
}