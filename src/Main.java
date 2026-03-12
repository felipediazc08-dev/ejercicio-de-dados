
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int d1,d2;
        int sumad1=0,sumad2=0;
        System.out.println("|== Bienvenido ==|");
        System.out.println(" ");
do{
    d1=random.nextInt(6) + 1;
    d2=random.nextInt(6) + 1;
    sumad1+=d1;
    sumad2+=d2;
    System.out.println("Dado 1: " + d1 + " | Dado 2: " + d2);

}while (d1 != d2);
        System.out.println(" ");
if(sumad1>sumad2){
    System.out.println("|--- El dado ganador es el dado1: "+sumad1+" ---|");
        } else if (sumad2>sumad1) {
    System.out.println("|--- El dado ganador es el dado2: "+sumad2+" ---|");

}else{
    System.out.println("|--- Empate ---|");
}
        System.out.println(" ");
        System.out.println("|== Programa finalizado ==|");

    }
}