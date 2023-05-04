import java.util.*;
public class Noten{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
         int [] n = new int[5];
        System.out.print("listen Sie die Noten, die Sie erreicht haben(beispiel: 14 15 14 15 14): ");
        for(int i = 0; i < n.length; i++){
            n[i] = sc.nextInt();
        }
        String s = " ";
        for(int i = 0; i < n.length; i++){
            if(i == n.length - 1){
                s += n[i];
            }
              else s += n[i] + ", ";
        }
        System.out.println("Erreichte Noten: " + s);
        System.out.println("Durchschnittsnote: " + averageResult(n));
        System.out.println("Beste Note: " + bestResult(n));
        System.out.println("nicht bestanden: " + numberOfFailed(n));
    }
    public static double averageResult(int[] a){
        int b = 0;
        for(int i = 0; i < a.length; i++){
             b += a[i];
        }
        return b/a.length;
    }
    
    public static int bestResult(int[] a){
        int b = a[0];
       for(int i = 1; i<a.length; i++){
          if(a[i] > b){
              b = a[i];
          }
       }
         return b;
    }

    public static int numberOfFailed(int[] a){
        int counter = 0;
        for(int i = 0; i < a.length; i++){
            if(a[i] < 50){
                counter++;
            }
        }
        return counter;
    }
}