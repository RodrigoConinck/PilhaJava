import org.w3c.dom.Node;

public class StackTest {
    public static void main(String[] args) {
        Stack s = new ObjectStack() {
        };

        s.push(64);
        s.push(52);
        s.push(78);
        s.push(127);

        try {
            System.out.println(s.pop());
            System.out.println(s.pop());
            System.out.println(s.pop());
            System.out.println(s.pop());
            System.out.println(s.pop());
            // Erro! fila vazia
        } catch (IndexOutOfBoundsException ex){
            System.out.println(ex.getMessage());
        }
        System.out.println("Fim do Programa!");
    }
}