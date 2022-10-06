public class testeComparacao {
    public static void main(String[] args) {
        int i;
        int teste[] = {3, 5, 4, 2 ,1};
        int temporario;

        for (i=1; i<teste.length; i++) {
            for (int j = 0; j<teste.length; j++) {
                if (teste[i] > teste[j]) {
                    temporario = teste[i];
                    teste[i] = teste[j];
                    teste[j] = temporario;
                }
            }
        }

        for (i=0; i< teste.length;i++) {
            System.out.println(teste[i] + ", ");
        }
    }
}
