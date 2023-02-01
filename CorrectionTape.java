import java.util.*;

public class CorrectionTape extends Item{
  public CorrectionTape(String n) {
    super(n);
  }

  @Override
  public void use(Subject s) {
    s.addHP(15);
  }
}