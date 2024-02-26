/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mouaadhttp.td1;


/**
 *
 * @author admin
 */
public class Jeu {
    Joueur j1, j2;
    
    public Jeu(Joueur a, Joueur b) {
        j1 = new Joueur(a.GetName());
        j2 = new Joueur(b.GetName());
                } 

 void tirage(Joueur S){
        //D donne une valeur comprise entre 1.0 et 7.0(exclue)
  	double D = 6 * Math.random() + 1 ; 
        //D est ensuite converti de double en entier
  	int resultat = (int) D;
        //ajouter le resultat trouver 
        S.AjoutPoint(resultat);
  }
 
 void jouer(int n){
        //proceder a n tirages
        for(int i = 0 ; i < n ; i++){
            tirage(j1); //le tirage de premier joueur 
            tirage(j2); //le tirage de deuxieme joueur
            }
  
            j1.Affichage();
            j2.Affichage();
                  
        //indiquer le gagnant
  	if( j1.GetScore()> j2.GetScore() ) 
            System.out.println(j1.GetName() + " est le vainqueur");
        else if( j1.GetScore()< j2.GetScore() ) 
            System.out.println(j2.GetName() + " est le vainqueur");
        else System.out.println("Les deux sont vainqueurs");
 }
 
 /**
  * méthode main du programme
  */ 
 public static void main(String args[]) {
    //on crée les joueurs 
    Joueur p0 = new Joueur();
    Joueur p1 = new Joueur();
       
    p0.SetJ("Walid", 0);
    p1.SetJ("Omar", 0);
    //on crée un jeu
        //1er jeu
        Jeu monopoly= new Jeu(p1 , p0);
        //la partie se fait sur 10 tirages
        monopoly.jouer(10);
    
        
        
  
 }
}
