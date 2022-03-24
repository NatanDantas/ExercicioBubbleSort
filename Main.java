import java.util.Arrays;
class Main {
  public static void main(String[] args) {
    int [] v = {5, 10, 3, 2, 4, 7, 9, 8, 6};
    int b = bubbleSort(v);
    System.out.println("Pares Separados de Ímpares: "+Arrays.toString(v));
  }

  public static int bubbleSort(int[] v){
    int aux = 0;

    for(int i = 0; i <v.length - 1; i++){
      for(int j = 0; j < v.length - i - 1; j++){
        if(v[j] %2 == 0 & v[j+1] %2==1){
          aux = v[j];
          v[j] = v[j+1];
          v[j+1] = aux;
        }
      }
    }
    return aux;
  }
}
