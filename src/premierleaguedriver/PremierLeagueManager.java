/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package premierleaguedriver;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author USER
 */
public class PremierLeagueManager implements LeagueManager {
    private FootballClub[] fb=new FootballClub[200];
    private int teamCount=0;
    ArrayList<MatchPlayed> mp=new ArrayList<MatchPlayed>();
    Scanner sc=new Scanner(System.in);
    public void menu(){
        try {
            loadClub();
        } catch (IOException ex) {
            Logger.getLogger(PremierLeagueManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            loadMatches();
        } catch (IOException ex) {
            Logger.getLogger(PremierLeagueManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        String input="0";
        System.out.println("Welcome to Premier League Manager!");
        do{
            System.out.println("Enter 1 to add Football Club to League\nEnter 2 to religate Football Club from the League\nEnter 3 to display Club Statistics\n"
                    + "Enter 4 view the league table\nEnter 5 to add played games\nEnter 6 open GUI\nEnter 7 to to quit\n");
            
             input=sc.nextLine();
            
            switch(input){
               case("1"):
                   if(teamCount<19){
                   addClub();
                   }
                   break;
               case("2"):
                   deleteClub();
                   break;
               case("3"):
                   showStats();
                   break;
               case("4"):   
                   displayTabe();
                   break;
               case("5"):
                   matchPlayed();
               case("6"):
                   openGUI();
                   break;
            }
        }while(!input.equals("7"));
        saveClub();
        saveMatchPlayed();
    }
    
    public void addClub(){
        System.out.print("Enter club name: ");
        String name=sc.nextLine();
        System.out.print("Enter club location: ");
        String location=sc.nextLine();
           
        
        FootballClub fc=new FootballClub(name,location);
        fb[teamCount]=fc;
        teamCount++;
        
    }
    
    public void deleteClub(){
    System.out.print("Enter club name");
    String name=sc.nextLine();
    
    for(int i=0;i<teamCount;i++){
    if(fb[i].getName().equals(name)){
        fb[i]=null;
        teamCount--;
    }
    }
    }
    
    public void displayTabe(){
    for(int i=0;i<teamCount-1;i++){
        for(int j=i+1;j<teamCount;j++){
            if(fb[j].getPoints()>fb[i].getPoints()){
                FootballClub temp=fb[j];
                fb[j]=fb[i];
                fb[i]=temp;
            }
            else if(fb[j].getPoints()==fb[i].getPoints()){
                if(fb[j].goalDifference()>fb[i].goalDifference()){
                    FootballClub temp=fb[j];
                fb[j]=fb[i];
                fb[i]=temp;
                }
            }
        }
    }
    String s=String.format("|%-30s", "Club Names");
     s=s+String.format("|%-2s", "Played");
     s=s+String.format("|%-2s", "Wins");
     s=s+String.format("|%-2s", "Defeats");
     s=s+String.format("|%-2s", "Draws");
     s=s+String.format("|%-2s", "Points");
     s=s+String.format("|%-2s", "Goals Scores");
     s=s+String.format("|%-2s", "Goals Conceded");
     System.out.println(s);
    for(int i=0;i<teamCount;i++){
        System.out.println(fb[i]);
    }
    
    
    }
    
    public void showStats(){
    System.out.print("Enter club name:");
    String name=sc.nextLine();
    
    for(int i=0;i<teamCount;i++){
    if(fb[i].getName().equals(name)){
        fb[i].clubStatistics();
    }
    }
    }
    
    public void matchPlayed(){
    System.out.print("Enter date: ");    
    String date=sc.nextLine();
    System.out.println(date);
        
    System.out.print("Enter club 1: ");    
    String team1=sc.nextLine();
    System.out.println(team1);
    
    System.out.print("Enter club 2: ");    
    String team2=sc.nextLine();
    System.out.println(team2);
    
    System.out.print("Enter score: ");    
    String score=sc.nextLine();
    System.out.println(score);
    
    MatchPlayed match=new MatchPlayed(team1,team2,score,date);
    mp.add(match);
    
    for(int i=0;i<teamCount;i++){
    if(fb[i].getName().equals(team1)){
        fb[i].setMatch(team2,score);
    }    
    }
    
    for(int i=0;i<teamCount;i++){
    if(fb[i].getName().equals(team2)){
        StringBuilder score1 = new StringBuilder();

        score1.append(score);
 
        score1 = score1.reverse();
         score=score1+"";
        fb[i].setMatch(team1,score);
    }
    }
    }
    
    public void openGUI(){
    GUI g=new GUI(fb,teamCount,mp);
    g.setVisible(true);
    }
    
    
    public void saveMatchPlayed()
      {
            try{
            String s="";
            for(int i=0;i<mp.size();i++){
                s=s+(mp.get(i).getDate()+"_"+mp.get(i).getTeam1()+"_"+mp.get(i).getTeam2()+"_"+mp.get(i).getScore()+"\n");
            }
            FileWriter fw=new FileWriter("src\\premierleaguedriver\\MatchPlayed");
                fw.write(s);
                fw.close();
          }catch(Exception e){
              System.out.println(e);
          }           
      }
    public void saveClub(){
        try{
            String s="";
            for(int i=0;i<teamCount;i++){
                s=s+(fb[i].getName()+"_"+fb[i].getLocation()+"\n");
            }
            FileWriter fw=new FileWriter("src\\premierleaguedriver\\clubname");
                fw.write(s);
                fw.close();
          }catch(Exception e){
              System.out.println(e);
          } 
    }
    
    public void loadClub() throws FileNotFoundException, IOException{
         FileReader fr=new FileReader("src\\premierleaguedriver\\clubname");    
          BufferedReader br=new BufferedReader(fr);    
  
          String line=br.readLine();
          while(line!=null){ 
              String[] s=new String[2];
              int x=0;
              StringTokenizer st=new StringTokenizer(line,"_");
              while(st.hasMoreTokens()){
                  s[x]=st.nextToken();
                  x++;
              }
              FootballClub fc=new FootballClub(s[0], s[1]);
              fb[teamCount]=fc;
              teamCount++;
              line=br.readLine();
          }  
          br.close();    
          fr.close();    
    }
    
    public void loadMatches() throws FileNotFoundException, IOException{
         FileReader fr=new FileReader("src\\premierleaguedriver\\MatchPlayed");    
          BufferedReader br=new BufferedReader(fr);    
  
          String line=br.readLine();
          while(line!=null){ 
              String[] s=new String[4];
              int x=0;
              StringTokenizer st=new StringTokenizer(line,"_");
              while(st.hasMoreTokens()){
                  s[x]=st.nextToken();
                  x++;
              }
              MatchPlayed mc=new MatchPlayed(s[1], s[2], s[3], s[0]);
              mp.add(mc);
              
              for(int i=0;i<teamCount;i++){
                if(fb[i].getName().equals(s[1])){
                    fb[i].setMatch(s[2],s[3]);
                }    
                }

                for(int i=0;i<teamCount;i++){
                if(fb[i].getName().equals(s[2])){
                    StringBuilder score1 = new StringBuilder();

                    score1.append(s[3]);

                    score1 = score1.reverse();
                     s[3]=score1+"";
                    fb[i].setMatch(s[1],s[3]);
                }
                }
              line=br.readLine();
          }  
          br.close();    
          fr.close(); 
          
          
    }
}
