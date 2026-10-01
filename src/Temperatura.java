
import java.util.Scanner;

public class Temperatura {
    public static void main (String[] args) {
        System.out.println("Ovaj program učitava tjelesne temperature tijekom dana i ispisuje izvještaj.");
        System.out.println("Unesite 0 za kraj unosa.");

        Scanner input=new Scanner(System.in);

        float visokaTemp=37;
        int brVisokihTemp=0;
        int brMjerenja=0;
        float max=Float.MIN_VALUE;
        float min=Float.MAX_VALUE;
        float prosjek;
        float suma=0;
        

    
    
    while (true) {
    
        System.out.print("Unesite mjerenje temperature:");
        float temp=input.nextFloat();

        if (temp==0) {
            break;
        }
        else if (temp<0){System.out.println("Unesite pozitivnu temperaturu.");
        continue;
        }
        
        if (temp>visokaTemp) {
            brVisokihTemp++;
        } 
        if (temp>max)
        {
            max=temp;
        }

        if (temp<min)
        {
            min=temp;
        }
    brMjerenja++;
    suma+=temp;
    }

    prosjek=suma/brMjerenja;

    if(brMjerenja==0){
        System.out.println("Niste unesli ni jedno mjerenje.");
    }
    else{
        System.out.printf("Broj mjerenja: %d%n", brMjerenja);
        System.out.printf("Najviša temperatura: %.2f%n", max);
        System.out.printf("Najniža temperatura: %.2f%n", min);
        System.out.printf("Prosječna temperatura: %.2f%n", prosjek);
        System.out.printf("Broj mjerenja visokih temperatura: %d%n", brVisokihTemp);

        if (brVisokihTemp>0) {
            System.out.println("Povišena temperatura zabilježena.");
        }
        else System.out.println("Sva mjerenja u granicama normale.");
        
    }
    }
}