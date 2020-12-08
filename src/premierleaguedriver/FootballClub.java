/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package premierleaguedriver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;
import sun.util.locale.StringTokenIterator;


/**
 *
 * @author USER
 */
public class FootballClub extends SportsClub{
    protected int goalsConceded;
    protected int goalsScored;
    HashMap<String,String> matchPlayed=new HashMap<String, String>();
    
    
    public FootballClub(String name,String location){
        super(name,location);
    }
    
    public String getName(){
    return clubName;
    }
    
    public void clubStatistics(){
        System.out.println("Club Name: "+clubName+"\n"+"Wins: "+wins+" "+"Defeats: "+defeats+" "+"Draws: "+draws+" "+"Goals Conceded: "+goalsConceded+" "+"Goals Scored: "+goalsScored+" "+"Points: "+points+" "+"Matches Played: "+matchesPlayed);
    }
    
    public void setMatch(String teamPlayed,String score){
    matchPlayed.put(teamPlayed, score);
    updateStats(score);
    }
    
    public int getPoints(){
        return points;
    }
    
    public int getMatchPlayed(){
        return matchesPlayed;
    }
    
    public int getWins(){
        return wins;
    }
    
    public int getLoses(){
        return defeats;
    }
    
    public int getDraws(){
        return draws;
    }
    
    
    public int getGoalsScored(){
        return goalsScored;
    }
    
    public String getLocation(){
    return location;
    }
    
    public int getGoalsConceded(){
        return  goalsConceded;
    }
    public int goalDifference(){
        return (goalsScored-goalsConceded);
    }
    
    public void updateStats(String score){
        StringTokenizer st=new StringTokenizer(score,"-"); 
        String[] s=new String[2];
        int x=0;
        while(st.hasMoreTokens()){
        s[x]=st.nextToken();
        x++;
        }
        if(Integer.parseInt(s[0])>Integer.parseInt(s[1])){
            wins++;
            points+=3;
            goalsScored=goalsScored+Integer.parseInt(s[0]);
            goalsConceded=goalsConceded+Integer.parseInt(s[1]);
            matchesPlayed++;
        }
        else if(Integer.parseInt(s[0])<Integer.parseInt(s[1])){
            defeats++;
            goalsScored=goalsScored+Integer.parseInt(s[0]);
            goalsConceded=goalsConceded+Integer.parseInt(s[1]);
            matchesPlayed++;
        }
        else{
            draws++;
            points++;
            goalsScored=goalsScored+Integer.parseInt(s[0]);
            goalsConceded=goalsConceded+Integer.parseInt(s[1]);
            matchesPlayed++;
        }
    }
    
    public String toString(){
     String s=String.format("|%-30s", clubName);
     s=s+String.format("|%-6d", matchesPlayed);
     s=s+String.format("|%-4d", wins);
     s=s+String.format("|%-7d", defeats);
     s=s+String.format("|%-5d", draws);
     s=s+String.format("|%-6d", points);
     s=s+String.format("|%-12d", goalsScored);
     s=s+String.format("|%-5d", goalsConceded);
//     System.out.println(s);
     return s;
    }
}
