public class Resultado {
    public final int[] vetor;
    public final int trocas;

    public Resultado(int[] vetor, int trocas){
        this.vetor = vetor;
        this.trocas = trocas;
    }

    public int getTrocas() {
        return trocas;
    }

    public static void printVetor(int [] vetor){
        for(int i=0;i<vetor.length;i++){
            if(i==0){
                System.out.print("[");
            }
            int aux = vetor.length-i;
            if(aux==1){
                System.out.print(vetor[i] + "]");
            }
            else{
                System.out.print(vetor[i] + ",  ");
            }
        }
    }


}