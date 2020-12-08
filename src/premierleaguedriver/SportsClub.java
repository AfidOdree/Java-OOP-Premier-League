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
abstract class SportsClub {
    protected String clubName;
    protected String location;
    protected int wins;
    protected int defeats;
    protected int draws;
    protected int points;
    protected int matchesPlayed;
    
    public SportsClub(String name,String location){
         this.clubName=name;
         this.location=location;
    }
    
    abstract String getName();
    
    abstract String getLocation();
    
    abstract int getWins();
    
    abstract int getLoses();
    
    abstract int getDraws();
    
    abstract int getGoalsScored();
    
    abstract int getMatchPlayed();
    
    abstract int getPoints();
    
    abstract int getGoalsConceded();
    
    abstract int goalDifference();
    
    abstract void clubStatistics();
    
    
}
