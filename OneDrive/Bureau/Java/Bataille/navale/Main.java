package navale;
import java.util.Scanner; 
import java.util.Random;

public class Main {


    public static void main(String[] args) {
        
    

Scanner sc = new Scanner(System.in);
Scanner sc2 = new Scanner(System.in);
Scanner sc3 = new Scanner(System.in);
Scanner sc4 = new Scanner(System.in);
Scanner sc5 = new Scanner(System.in);
Scanner sc6 = new Scanner(System.in);
Scanner sc7 = new Scanner(System.in);


System.out.println("Bienvenue sur le jeu de la bataille navale ! ");
System.out.println("voulez vous jouer en solo ou en multi ?");

String solo = sc2.nextLine();

if(solo.equals("solo")) {

System.out.println("Sur quel case se trouve le bateau hein ? (valeur comprise entre 0 et 5)");
int coule = sc.nextInt();

Random bateau = new Random();
         int n = bateau.nextInt(5); 

        if(coule == n) {
    
        System.out.println("Bravo vous avez tous gagné");
        }  else {
        System.out.println("PERDU");
        System.out.println("Je m'appelle nicolas" + n );
         }
    
        } else if (solo.equals("multi")) {
            System.out.println("écrivez le nom du premier joueur?");
            String joueur1 = sc3.nextLine();
            System.out.println("quel est le nom deuxieme joueur ?");
            String joueur2 = sc4.nextLine();

            System.out.println(joueur1 + " Saisi l'emplacement de ton bateau (entre 0 et 5)");
            int bateauJoueur1 = sc4.nextInt();
            System.out.println(joueur2 + " saisi l'emplacement de ton bateau (entre 0 et 5)");
            int bateauJoueur2 = sc5.nextInt();


            

            System.out.println(joueur1 + " sur quel case se trouve le bateau de " + joueur2);
            int attackJoueur1 = sc6.nextInt();


                     

            if ( attackJoueur1 == bateauJoueur2) {
                
                System.out.println("Bravo " + joueur1 + " à coulé le bateau de " + joueur2);
            } else {
                System.out.println("PERDU c'est à " + joueur2 + " de jouer" );
                System.out.println(joueur2 + " sur quel case se trouve le bateau de " + joueur1);

             
            
            int attackJoueur2 = sc7.nextInt();
            if ( attackJoueur2 == bateauJoueur1 ){
                System.out.println("Bravo vous avez coulé le bateau de " + joueur1);
            } 
            


            while ((attackJoueur1 != bateauJoueur2) || (attackJoueur2 != bateauJoueur1)){
                
                

               System.out.println( "PERDU sur quel case se trouve le bateau de l'adversaire ?");
                attackJoueur1 = sc6.nextInt();
                

                     

            if ( attackJoueur1 == bateauJoueur2) {
                
                System.out.println("Bravo " + joueur1 + " à coulé le bateau de " + joueur2);
            } else {
                System.out.println("PERDU c'est à " + joueur2 + " de jouer" );
                //System.out.println(joueur2 + " sur quel case se trouve le bateau de " + joueur1);

            } 
        
            if ( attackJoueur2 == bateauJoueur1 ){
                System.out.println("Bravo vous avez coulé le bateau de " + joueur1);


            } else {
                System.out.println("PERDU c'est à " + joueur1 + " de jouer" );
                //System.out.println(" PERDU "); 

            }
           

        }  
         

        System.out.println("la partie est fini");

        }
    }

} 
}






