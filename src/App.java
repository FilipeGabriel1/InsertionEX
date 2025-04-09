import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
     List<Integer> numeros = new ArrayList<>();
     Random random = new Random();

     //Gerar 10 números aleatorios entre 1 e 100
     for (int i = 0;  i < 10; i++){
        numeros.add(random.nextInt(100) +  1);
     }

     System.out.println("Lista de Números Desordenada: ");

     for (int n : numeros) {
        System.out.println(n);

     }

     insertionSort(numeros);

     System.out.println("Lista de Números Ordenada: ");
        for (int n : numeros) {
            System.out.println(n);
        }
    }
    
    // i  comeca em 1, pq eu sei que o elemento 0 ja esta no lugar certo
    public static void insertionSort(List<Integer> list) {
        for (int i = 1; i < list.size(); i++) {
            int aux = list.get(i);
            int j = i - 1;

            while (j >= 0 && list.get(j) > aux) {
                list.set(j + 1, list.get(j));
                j = j - 1;
            }
            list.set(j + 1, aux);
        }
    }
}
