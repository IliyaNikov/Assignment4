public class Test
{
  public static void main(String[] args)
  {
    GemMineWorker gemMineWorker = new GemMineWorker();
    Thread thread = new Thread(gemMineWorker);
    thread.start();
  }
}
