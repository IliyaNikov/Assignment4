import Valuables.Gem;

import java.util.Random;

public class GemMineWorker implements Runnable
{
  @Override public void run()
  {
    Random random = new Random();
    Gem gem;
    while (true){
      int randomNumber = random.nextInt(10)+1;
      if (randomNumber <= 4 ){
        gem = GemMine.getGem("Silver");
      }
      else if( randomNumber <= 7){
        gem = GemMine.getGem("Ruby");
      }
      else if(randomNumber <=9){
        gem = GemMine.getGem("Gold");
      }
      else{
        gem = GemMine.getGem("Diamond");
      }
      Catalogue.getInstance().newEvent("The gem miner dug "+gem.getName()+" worth "+gem.getValue()+" coins");
      try
      {
        Thread.sleep(random.nextInt(5000));
      }
      catch (InterruptedException e)
      {
        e.printStackTrace();
      }
    }
  }
}
