public class App {
    public static void main(String[] args) {
        int[] vetor = {3,6,8,1,4,9,0};

        //long inicio, fim;
        Resultado resultado;

        System.out.println("\n\nBUBBLE SORT\n");
        //inicio = System.currentTimeMillis();
        System.out.print("Vetor sem ordenação: \n");
        Resultado.printVetor(vetor);
        resultado = BubbleSort.sort(vetor);
        //fim = System.currentTimeMillis();
        //System.out.println("Tempo: " + (fim-inicio) + "ms");
        System.out.println("\n\nTrocas: " + resultado.getTrocas());
        System.out.print("\nVetor ordenado: \n");
        Resultado.printVetor(vetor);

        vetor = new int[]{3, 6, 8, 1, 4, 9, 0};
        System.out.println("\n\n\n\nSELECTION SORT\n");
        //inicio = System.currentTimeMillis();
        System.out.print("Vetor sem ordenação: \n");
        Resultado.printVetor(vetor);
        resultado = SelectionSort.sort(vetor);
        //fim = System.currentTimeMillis();
        //System.out.println("Tempo: " + (fim-inicio) + "ms");
        System.out.println("\n\nTrocas: " + resultado.getTrocas());
        System.out.print("\nVetor ordenado: \n");
        Resultado.printVetor(vetor);
        System.out.println("\n\n\n\n\n\n");



    }
}
