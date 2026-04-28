public class exercicio14 {
        public static void main(String[] args) {
            int n = 10;
            int anterior = 0;
            int atual = 1;

            System.out.println("Sequencia de Fibonacci:");

            for(int i=1; i<=n; i++){
                
                int formula = anterior + atual;
                anterior = atual;
                atual = formula;
                System.out.println(anterior);
            }
    }
}
