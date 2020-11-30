import Valuables.*;

import java.util.HashMap;

public class GemMine
{
  private static HashMap<String, Gem> gems = new HashMap<>();

public static Gem getGem(String gemType){
  Gem gem =gems.get(gemType);
  if (gem == null){
    switch (gemType){
      case "Diamond":
      {
        gem = new Diamond();
        break;
      }
      case "Ruby":
      {
        gem = new Ruby();
        break;
      }
      case "Gold":
      {
        gem = new Gold();
        break;
      }
      case "Silver":
      {
        gem = new Silver();
        break;
      }
    }
    gems.put(gemType,gem);
  }
  return gem;
}
}
