public class Catalogue
{
  private static Catalogue instance;

  private Catalogue(){
  }

  public void newEvent(String string){
    System.out.println(string);
  }

  public static Catalogue getInstance()
  {
    if (instance == null){
      instance = new Catalogue();
    }
    return instance;
  }
}
