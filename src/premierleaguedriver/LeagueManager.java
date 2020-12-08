/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package premierleaguedriver;

/**
 *
 * @author USER
 */
public interface LeagueManager {
    FootballClub[] fb=new FootballClub[20];
    
    abstract void menu();
    
    abstract void addClub();
    
    abstract void deleteClub();
    
    abstract void displayTabe();
    
    abstract void showStats();
    
    abstract void matchPlayed();
    
    
}
