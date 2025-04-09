public class Main {

    public static void main(String[] args){
        

        System.out.println("Lista de Números Desordenada: ");

        // Lista de números desordenada
        int array[] = {5, 2, 4, 6, 1, 3};

        for (int i : array){
            System.out.println(i);
        }

        System.out.println("--------------");

        System.out.println("Lista de Números Ordenada: ");

        insertionSort(array);

        for (int i : array){
            System.out.println(i);
        }
    }

    // int j = 1 - 1 -> compara com o valor da esquerda
    private static void insertionSort(int[] array){
        for (int i = 1; i < array.length; i++){
            int aux = array[i];
            int j = i - 1;

            // array[j + 1] = array[j] -> joga o elemento para a direita
            while (j >= 0 && array[j] > aux){
                array[j + 1] = array[j];
                j--;
            }

            //serve para inserir o elemento que está sendo ordenado (armazenado na variável aux) na posição correta dentro da parte já ordenada do array.
            array[j + 1] = aux;
        }

        
    }

}
