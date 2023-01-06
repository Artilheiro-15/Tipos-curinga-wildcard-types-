import java.util.Arrays;
import java.util.List;

public class App {

  public static void main(String[] args) throws Exception {
    System.out.println("==============================");

    // Com tipos curinga podemos fazer métodos que recebem um genérico de "qualquer tipo":

    List<Integer> myInts = Arrays.asList(5, 2, 10);
    printList(myInts);

    List<String> myStrs = Arrays.asList("Maria", "Alex", "Bob");
    printList(myStrs);
  }

  // esse metodo aki funcionaria para qualquer outro tipo de lista repare que
  // acima eu tenho 2 declaraçao de list diferente

  public static void printList(List<?> list) {
    for (Object obj : list) {
      System.out.println(obj);

      System.out.println("=============Fim================");
    }
  }
}
