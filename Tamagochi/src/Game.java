import java.util.Scanner;
public class Game {
    public static void main(String[] args) {
        String tempNavn;
        String tempkøn;
        Scanner sc = new Scanner(System.in);
        System.out.println("Velkommen til Tamagochispillet!!!!!");
        System.out.println("Lav din Tamagochi <3 <3 <3");
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Hvad skal din Tamagochi hedde?");
        tempNavn = sc1.nextLine();
        System.out.println("Din Tamagochi hedder nu " + tempNavn);
        System.out.println("Hvilket køn skal den være?");
        tempkøn = sc1.nextLine();
        System.out.println("Din Tamagochis køn er " + tempkøn);
        System.out.println("Skal det være en Hund eller kat");
        System.out.println("Tast '1' for hund");
        System.out.println("Tast '2' for kat");
        int svar = sc1.nextInt();
        if (svar == 1) {
            Dog ostemad = new Dog(tempNavn, tempkøn);
            System.out.println("Tillykke med din hund. Her har du dens info: " + ostemad.toString());

        } else if (svar == 2) {
            Cat ostemad = new Cat(tempNavn, tempkøn);
            System.out.println("Tillykke med din kat. Her har du dens info: " + ostemad.toString());
            while (ostemad.isAlive()){

            }

        } else {
            System.out.println("Forkert input....... START FORFRAAAAAAAAAAAAAAAAAAAAAAA");
        }


    }
}







