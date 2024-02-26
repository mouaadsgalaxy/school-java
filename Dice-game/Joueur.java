/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mouaadhttp.td1;

/**
 *
 * @author admin
 */

    //----classe joueur : gestion des joueurs et leurs attributs
public class Joueur {
    private String name;
    private int score;

    public Joueur(){
        this.score = 0;
    }
    public Joueur(String n){
        this.name = n;
        this.score = 0;
    }
    public void SetJ(String playername , int s){
        this.name = playername; 
        this.score = s ;
    }
    public String GetName(){
        return name;       
    }
    public int GetScore(){
        return score;       
    }
    
    public void AjoutPoint(int add){
        this.score += add ;
    }
    public void Affichage(){
        System.out.println("joueur : "+this.name+ " , score : "+this.score);
    }
    
    
} 
