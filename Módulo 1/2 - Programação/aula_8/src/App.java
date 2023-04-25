import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) throws Exception {

        ArrayList<Integer> numeros = new ArrayList<>();
        
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);

        System.out.println(numeros);

        Iterator<Integer> it = numeros.iterator();
        int numero = it.next();

        System.out.println(numero);

        while(it.hasNext()) {
            it.forEachRemaining((value) -> System.out.println(value));
        }

        LinkedList<String> animais = new LinkedList<>();

        animais.add("Cachorro");
        animais.add("Gato");
        animais.add("Periquito");

        System.out.println(animais);

        animais.add(0, "Peixe");

        System.out.println(animais);

        HashSet<Integer> novosNumeros = new HashSet<>();

        novosNumeros.add(2);
        novosNumeros.add(5);
        novosNumeros.add(17);

        Iterator<Integer> ite = novosNumeros.iterator();
        while(ite.hasNext()) {
            System.out.println(ite.next());
        }

        TreeSet<Integer> arvoreNumeros = new TreeSet<>();

        arvoreNumeros.add(5);
        arvoreNumeros.add(6);
        arvoreNumeros.add(19);

        System.out.println("Árvore: " + arvoreNumeros);

        boolean result = arvoreNumeros.remove(6);

        System.out.println("Removeu o valor 6?: " + result);

        result = arvoreNumeros.remove(42);

        System.out.println("Removeu o valor 42?: " + result);

        ArrayList<String> linguagens = new ArrayList<>();
        
        linguagens.add("Java");
        linguagens.add("Python");
        linguagens.add("Cobol");

        System.out.println(linguagens);

        String[] arr = new String[linguagens.size()];

        linguagens.toArray(arr);
        
        System.out.print("Array: ");

        for(String item: arr) {
            System.out.print(item + ", ");
        }

    }
}