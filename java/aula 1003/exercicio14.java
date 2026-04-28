public class exercicio14{
    public static void main(String[] args) {
        int n = 0;
        int anterior = 1;
        int atual = 1;

        for(int i=0 ; i>=n; i++){
            int formula = anterior + atual;
            atual = formula;
            anterior = atual;

            System.out.println(anterior);
        }
    }
}