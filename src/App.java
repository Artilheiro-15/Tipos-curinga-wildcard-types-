import java.util.Arrays;
import java.util.List;

public class App {

  public static void main(String[] args) throws Exception {
    System.out.println("==============================");

    //Agora vamos começar a discultir uma coisa bem intereçante

    //Porém não é possível adicionar dados a uma coleção de tipo curinga

    List<Integer> myInts = Arrays.asList(5, 2, 10);
    printList(myInts);

    List<String> myStrs = Arrays.asList("Maria", "Alex", "Bob");
    printList(myStrs);
  }

  public static void printList(List<?> list) {
    //isso aki vai dar um erro de compilaçao pq a minha lista e de qualquer tipo e o compilador
    //nao sab dizer se esse 3 que eu to tentando add e de algum tipo compativel da minha lista
    // list.add(3);
    for (Object obj : list) {
      System.out.println(obj);

      System.out.println("=============Fim================");
    }
  }
}
