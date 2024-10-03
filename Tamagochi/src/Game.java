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
            System.out.println("                            ;\\ \n" +
                    "                            |' \\ \n" +
                    "         _                  ; : ; \n" +
                    "        / `-.              /: : | \n" +
                    "       |  ,-.`-.          ,': : | \n" +
                    "       \\  :  `. `.       ,'-. : | \n" +
                    "        \\ ;    ;  `-.__,'    `-.| \n" +
                    "         \\ ;   ;  :::  ,::'`:.  `. \n" +
                    "          \\ `-. :  `    :.    `.  \\ \n" +
                    "           \\   \\    ,   ;   ,:    (\\ \n" +
                    "            \\   :., :.    ,'o)): ` `-. \n" +
                    "           ,/,' ;' ,::\"'`.`---'   `.  `-._ \n" +
                    "         ,/  :  ; '\"      `;'          ,--`. \n" +
                    "        ;/   :; ;             ,:'     (   ,:) \n" +
                    "          ,.,:.    ; ,:.,  ,-._ `.     \\\"\"'/ \n" +
                    "          '::'     `:'`  ,'(  \\`._____.-'\"' \n" +
                    "             ;,   ;  `.  `. `._`-.  \\\\ \n" +
                    "             ;:.  ;:       `-._`-.\\  \\`. \n" +
                    "              '`:. :        |' `. `\\  ) \\ \n" +
                    "      -hrr-      ` ;:       |    `--\\__,' \n" +
                    "                   '`      ,' \n" +
                    "                        ,-' \n" +
                    "\n");
            System.out.println("Tillykke med din hund." );
            System.out.println(ostemad.toString());
            while (ostemad.isAlive()){
                Scanner sc2 = new Scanner(System.in);
                System.out.println("-------------------------------------------------------------------");
ostemad.getStats();
                System.out.println("-------------------------------------------------------------------");
ostemad.getMenu();
                System.out.println("-------------------------------------------------------------------");
int Tempvalg = sc2.nextInt();
if (Tempvalg==1){
    ostemad.feed();
    ostemad.addOneMood();
}
if (Tempvalg==2){
    ostemad.addTwoMood();
    ostemad.remEnergi();
}
if (Tempvalg==3){
    ostemad.addEnergi();
    ostemad.remTwoMood();
}
if (Tempvalg==4){
    ostemad.surDyr();
    ostemad.remTwoMood();
}
if (Tempvalg==5){
    System.out.println("\n" +
            "                              _ \n" +
            "                            _-' \"'-,     \n" +
            "                         _-' | d$$b |  \n" +
            "                      _-'    | $$$$ |    \n" +
            "                   _-'       | Y$$P |  \n" +
            "                _-'|         |      |\n" +
            "             _-'  _*         |      |\n" +
            "          _-' |_-\"      __--''\\    /\n" +
            "       _-'         __--'     __*--'\n" +
            "     -'       __-''    __--*__-\"`\n" +
            "    |    _--''   __--*\"__-'`  \n" +
            "    |_--\"  .--=`\"__-||\"  \n" +
            "    |      |  |\\\\   ||\n" +
            "    | .dUU |  | \\\\ //\n" +
            "    | UUUU | _|___//\n" +
            "    | UUUU |  |   \n" +
            "    | UUUU |  |         [Matzec]\n" +
            "    | UUUU |  |\n" +
            "    | UUUU |  |\n" +
            "    | UUUU |  |\n" +
            "    | UUP' |  |\n" +
            "    |   ___^-\"`\n" +
            "     \"\"'          \n" +
            "\n" +
            "\n" +
            "\n");
    System.out.println("Jeg er jo bare en nuttet hund :(");

    ostemad.kill();
}
                ostemad.addAge();
                ostemad.remEnergi();
                ostemad.deFeed();


if(ostemad.getMood()<1|| ostemad.getHunger()<1 || ostemad.energy<1|| ostemad.getAge()>30){

    ostemad.kill();
    ostemad.getStats();
}
            }
        } else if (svar == 2) {
            Cat ostemad = new Cat(tempNavn, tempkøn);
            System.out.println("                                                  \n" +
                    "            .                .                    \n" +
                    "            :\"-.          .-\";                    \n" +
                    "            |:`.`.__..__.'.';|                    \n" +
                    "            || :-\"      \"-; ||                    \n" +
                    "            :;              :;                    \n" +
                    "            /  .==.    .==.  \\                    \n" +
                    "           :      _.--._      ;                   \n" +
                    "           ; .--.' `--' `.--. :                   \n" +
                    "          :   __;`      ':__   ;                  \n" +
                    "          ;  '  '-._:;_.-'  '  :                  \n" +
                    "          '.       `--'       .'                  \n" +
                    "           .\"-._          _.-\".                   \n" +
                    "         .'     \"\"------\"\"     `.                 \n" +
                    "        /`-                    -'\\                \n" +
                    "       /`-                      -'\\               \n" +
                    "      :`-   .'              `.   -';              \n" +
                    "      ;    /                  \\    :              \n" +
                    "     :    :                    ;    ;             \n" +
                    "     ;    ;                    :    :             \n" +
                    "     ':_:.'                    '.;_;'             \n" +
                    "        :_                      _;                \n" +
                    "        ; \"-._                -\" :`-.     _.._    \n" +
                    "        :_          ()          _;   \"--::__. `.  \n" +
                    "         \\\"-                  -\"/`._           :  \n" +
                    "        .-\"-.                 -\"-.  \"\"--..____.'  \n" +
                    "       /         .__  __.         \\               \n" +
                    "      : / ,       / \"\" \\       . \\ ;             \n" +
                    "       \"-:___..--\"      \"--..___;-\"               \n" +
                    "                                                  \n");
            System.out.println("Tillykke med din kat." );
            System.out.println(ostemad.toString());
            while (ostemad.isAlive()){
                Scanner sc2 = new Scanner(System.in);
                ostemad.getStats();
                ostemad.getMenu();
                int Tempvalg = sc2.nextInt();
                if (Tempvalg==1){
                    ostemad.feed();
                    ostemad.addOneMood();
                }
                if (Tempvalg==2){
                    ostemad.addTwoMood();
                    ostemad.remEnergi();
                }
                if (Tempvalg==3){
                    ostemad.addEnergi();
                }
                if (Tempvalg==4){
                    ostemad.surDyr();
                    ostemad.remTwoMood();
                }
                if (Tempvalg==5){
                    System.out.println("\n" +
                            "                              _ \n" +
                            "                            _-' \"'-,     \n" +
                            "                         _-' | d$$b |  \n" +
                            "                      _-'    | $$$$ |    \n" +
                            "                   _-'       | Y$$P |  \n" +
                            "                _-'|         |      |\n" +
                            "             _-'  _*         |      |\n" +
                            "          _-' |_-\"      __--''\\    /\n" +
                            "       _-'         __--'     __*--'\n" +
                            "     -'       __-''    __--*__-\"`\n" +
                            "    |    _--''   __--*\"__-'`  \n" +
                            "    |_--\"  .--=`\"__-||\"  \n" +
                            "    |      |  |\\\\   ||\n" +
                            "    | .dUU |  | \\\\ //\n" +
                            "    | UUUU | _|___//\n" +
                            "    | UUUU |  |   \n" +
                            "    | UUUU |  |         [Matzec]\n" +
                            "    | UUUU |  |\n" +
                            "    | UUUU |  |\n" +
                            "    | UUUU |  |\n" +
                            "    | UUP' |  |\n" +
                            "    |   ___^-\"`\n" +
                            "     \"\"'          \n" +
                            "\n" +
                            "\n" +
                            "\n");

                    System.out.println("Jeg er jo bare en nuttet kat :(");

                    ostemad.kill();
                }
                ostemad.addAge();
                ostemad.remEnergi();
                ostemad.deFeed();

                if(ostemad.getMood()<1|| ostemad.getHunger()<1 || ostemad.energy<1|| ostemad.getAge()>30){

                    ostemad.kill();
                    ostemad.getStats();
                }

            }


        } else {
            System.out.println("Forkert input....... START FORFRAAAAAAAAAAAAAAAAAAAAAAA");
        }
        System.out.println("Din Tamagochi døde");
        System.out.println("du er nu alene i verden");
        System.out.println("\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⡤⠖⠚⠉⠁⠀⠀⠉⠙⠒⢄⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⢀⠔⠋⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⢢⡀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⡰⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⣆⠀⠀\n" +
                "⠀⠀⠀⠀⠀⢠⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢇⠀\n" +
                "⠀⠀⠀⠀⠀⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⡄\n" +
                "⠀⠀⠀⠀⢸⠄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠇\n" +
                "⠀⠀⠀⠀⠸⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡘\n" +
                "⠀⠀⠀⠀⠀⢻⠀⠀⠀⠀⠀⠀⠀⢀⣴⣶⡄⠀⠀⠀⠀⠀⢀⣶⡆⠀⢠⠇\n" +
                "⠀⠀⠀⠀⠀⠀⣣⠀⠀⠀⠀⠀⠀⠀⠙⠛⠁⠀⠀⠀⠀⠀⠈⠛⠁⡰⠃⠀\n" +
                "⠀⠀⠀⠀⢠⠞⠋⢳⢤⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠜⠁⠀⠀\n" +
                "⠀⠀⠀⣰⠋⠀⠀⠀⢷⠙⠲⢤⣀⡀⠀⠀⠀⠀⠴⠴⣆⠴⠚⠁⠀⠀⠀⠀\n" +
                "⠀⠀⣰⠃⠀⠀⠀⠀⠘⡇⠀⣀⣀⡉⠙⠒⠒⠒⡎⠉⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⢠⠃⠀⠀⢶⠀⠀⠀⢳⠋⠁⠀⠙⢳⡠⠖⠚⠑⠲⡀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⡎⠀⠀⠀⠘⣆⠀⠀⠈⢧⣀⣠⠔⡺⣧⠀⡴⡖⠦⠟⢣⠀⠀⠀⠀⠀⠀\n" +
                "⢸⠀⠀⠀⠀⠀⢈⡷⣄⡀⠀⠀⠀⠀⠉⢹⣾⠁⠁⠀⣠⠎⠀⠀⠀⠀⠀⠀\n" +
                "⠈⠀⠀⠀⠀⠀⡼⠆⠀⠉⢉⡝⠓⠦⠤⢾⠈⠓⠖⠚⢹⠀⠀⠀⠀⠀⠀⠀\n" +
                "⢰⡀⠀⠀⠀⠀⠀⠀⠀⠀⢸⠁⠀⠀⠀⢸⠀⠀⠀⠀⡏⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠳⡀⠀⠀⠀⠀⠀⠀⣀⢾⠀⠀⠀⠀⣾⠀⠀⠀⠀⡇⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠈⠐⠢⠤⠤⠔⠚⠁⠘⣆⠀⠀⢠⠋⢧⣀⣀⡼⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠈⠁⠀⠀⠀⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀\n");


    }
}







