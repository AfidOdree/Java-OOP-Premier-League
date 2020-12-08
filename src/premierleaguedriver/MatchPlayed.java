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
public class MatchPlayed {
    private String team1;
    private String team2;
    private String score;
    private String date;
    
    public MatchPlayed(String t1,String t2,String s,String d){
    team1=t1;
    team2=t2;
    score=s;
    date=d;
    
    }
    
    public String getDate(){
    return date;
    }
    
    public String getTeam1(){
    return team1;
    }
    
    public String getTeam2(){
    return team2;
    }
    
    public String getScore(){
    return score;
    }
}
