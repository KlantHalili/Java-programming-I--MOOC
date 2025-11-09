/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Helius
 */
public class Matches {
    private String firstTeam;
    private String secondTeam;
    private int firstPoints;
    private int secondPoints;
    private int games;
    private int wins;
    private int looses;
    
    public Matches(String ekipiH, String ekipiA, int pointsH, int pointsA){
        this.firstTeam = ekipiH;
        this.secondTeam = ekipiA;
        this.firstPoints = pointsH;
        this.secondPoints = pointsA;
        this.games = 0;
        this.wins = 0;
        this.looses =0;
    }
    
    public int showPoints(String ekipi){
        if (ekipi.equals(this.firstTeam)){
            return this.firstPoints;
        } else if (ekipi.equals(this.secondTeam)){
            return this.secondPoints;
        }
        return 0;
    }
    
    public int resultOfMatches (String ekipi1, String ekipi2, int points1, int points2){
        int n = 0;
        if (ekipi1.equals(this.firstTeam) || ekipi1.equals(this.secondTeam)){
            n++;
        }
        int win1 =0;
        int loose1 = 0;
        if (points1 > points2){
            win1 ++;
        } else {
            loose1 ++;
        }
        return n;
    }
    
   
    public String getFirstTeam() {
    return firstTeam;
}

public String getSecondTeam() {
    return secondTeam;
}

public int getFirstPoints() {
    return firstPoints;
}

public int getSecondPoints() {
    return secondPoints;
}
public void resultOfMatchess (String ekipi1){
        if (ekipi1.equals(this.firstTeam) || ekipi1.equals(this.secondTeam)){
            this.games++;
        }
        if (this.firstPoints > this.secondPoints){
            this.wins++;
        } else {
            this.looses++;
        }
}
public void showResults(){
    System.out.println("Games: "+this.games+" Wins: "+this.wins+" Losses: "+this.looses);
}
}
