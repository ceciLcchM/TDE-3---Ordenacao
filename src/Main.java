public class Main{
    public static void main(String[] args) {

        int[] vetor1 = {12, 18, 9, 25, 17, 31, 22, 27, 16, 13, 19, 23, 20, 30, 14, 11, 15, 24, 26, 28};
        int[] vetor2 = {5, 7, 9, 10, 12, 14, 15, 17, 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32};
        int[] vetor3 = {99, 85, 73, 60, 50, 40, 35, 30, 25, 20, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6};

        int tam = 20;
        int[] temp = new int[tam];

        System.out.println("Vetor 1:");
        Sorts.Testar(vetor1, temp, tam);

        System.out.println("Vetor 2:");
        Sorts.Testar(vetor2, temp, tam);

        System.out.println("Vetor 3:");
        Sorts.Testar(vetor3, temp, tam);
    }
}
