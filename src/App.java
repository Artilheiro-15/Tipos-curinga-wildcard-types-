import java.util.ArrayList;
import java.util.List;

public class App {

  public static void main(String[] args) throws Exception {
    System.out.println("==============================");

    //Nesse exemplo aki agente pode entenderr claramente que o list Integer nao e subtipo de List<Object>

    List<Object> myObjs = new ArrayList<Object>();
    List<Integer> myNumbers = new ArrayList<Integer>();
    //nao e posivel fazer aki o upcasting
    myObjs = myNumbers; // erro de compilação
  }
}
