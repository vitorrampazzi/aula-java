public class exercicio15 {
        public static void main(String[] args) {
            int n = 10;
            int anterior = 1;
            int atual = 1;
            int proximo = 1;

            System.out.println("Sequencia de Fibonacci:");

            for(int i=1; i<=n; i++){
                
                System.out.println(anterior);
                int formula = anterior + atual + proximo;
                anterior = atual;
                atual = proximo;
                proximo = formula;
            }
    }
}
