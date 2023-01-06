import java.util.ArrayList;
import java.util.List;

public class App {

  public static void main(String[] args) throws Exception {
    System.out.println("==============================");

    // O supertipo de qualquer tipo de lista é List<?>. Este é um tipo curinga:
    List<?> myObjs = new ArrayList<Object>();
    List<Integer> myNumbers = new ArrayList<Integer>();
    myObjs = myNumbers; // erro de compilação
  }
}
