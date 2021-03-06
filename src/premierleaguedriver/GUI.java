/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package premierleaguedriver;

import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USER
 */
public class GUI extends javax.swing.JFrame {

    /**
     * Creates new form GUI
     */
    public static FootballClub[] fb;
    public static int teamCount;
    public static ArrayList<MatchPlayed> mp;
    public static int matchPlayedCounter=0;
    public GUI(FootballClub[] fb, int teamCount, ArrayList<MatchPlayed> mp) {
        initComponents();
        this.fb = fb;
        this.mp=mp;
        this.teamCount = teamCount;
        updateTable(fb, teamCount);
    }

    public void updateTable(FootballClub[] fb, int teamCount) {

        DefaultTableModel tb = (DefaultTableModel) Table1.getModel();

        for (int i = 0; i < teamCount; i++) {
            tb.addRow(new Object[]{fb[i].getName(), fb[i].getMatchPlayed(), fb[i].getWins(), fb[i].getLoses(), fb[i].getDraws(), fb[i].getPoints(), fb[i].getGoalsScored(), fb[i].getGoalsConceded()});
        }
//        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Table1 = new javax.swing.JTable();
        btn_sortbyGoalsScored = new javax.swing.JButton();
        btn_sortByWins = new javax.swing.JButton();
        btn_viewMatchedPlayed = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Table2 = new javax.swing.JTable();
        txt_dateSearch = new javax.swing.JTextField();
        btn_search = new javax.swing.JButton();
        btn_sortByPoint = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        Table1.setAutoCreateRowSorter(true);
        Table1.setBackground(new java.awt.Color(255, 255, 255));
        Table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Club Name", "Matches Played", "Wins", "Defeats", "Draws", "Points", "Goals Scored", "Goals Conceded"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Table1);
        if (Table1.getColumnModel().getColumnCount() > 0) {
            Table1.getColumnModel().getColumn(0).setPreferredWidth(200);
        }

        btn_sortbyGoalsScored.setText("Sort by Goals Scored");
        btn_sortbyGoalsScored.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sortbyGoalsScoredActionPerformed(evt);
            }
        });

        btn_sortByWins.setText("Sort by Wins");
        btn_sortByWins.setPreferredSize(new java.awt.Dimension(138, 25));
        btn_sortByWins.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sortByWinsActionPerformed(evt);
            }
        });

        btn_viewMatchedPlayed.setText(" View Matches Played");
        btn_viewMatchedPlayed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_viewMatchedPlayedActionPerformed(evt);
            }
        });

        Table2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Team 1", "Team 2", "Score"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(Table2);

        btn_search.setText("Search");
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchActionPerformed(evt);
            }
        });

        btn_sortByPoint.setText("Sort by Points");
        btn_sortByPoint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sortByPointActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_sortbyGoalsScored, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_sortByWins, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_sortByPoint, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_viewMatchedPlayed, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_dateSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_search)
                        .addGap(37, 37, 37))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 905, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_sortbyGoalsScored)
                    .addComponent(btn_sortByWins, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_viewMatchedPlayed)
                    .addComponent(txt_dateSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_search)
                    .addComponent(btn_sortByPoint))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(160, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_sortbyGoalsScoredActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sortbyGoalsScoredActionPerformed
        // TODO add your handling code here:
        
        for(int i=0;i<teamCount-1;i++){
        for(int j=i+1;j<teamCount;j++){
            if(fb[j].getGoalsScored()>fb[i].getGoalsScored()){
                FootballClub temp=fb[j];
                fb[j]=fb[i];
                fb[i]=temp;
            }
        }
    }
        
        DefaultTableModel tb = (DefaultTableModel) Table1.getModel();
        
        for(int i=0;i<teamCount;i++){
        tb.removeRow(0);
        }
        
        for (int i = 0; i < teamCount; i++) {
            tb.addRow(new Object[]{fb[i].getName(), fb[i].getMatchPlayed(), fb[i].getWins(), fb[i].getLoses(), fb[i].getDraws(), fb[i].getPoints(), fb[i].getGoalsScored(), fb[i].getGoalsConceded()});
        }
    }//GEN-LAST:event_btn_sortbyGoalsScoredActionPerformed

    private void btn_sortByWinsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sortByWinsActionPerformed
        // TODO add your handling code here:
        
        for(int i=0;i<teamCount-1;i++){
        for(int j=i+1;j<teamCount;j++){
            if(fb[j].getWins()>fb[i].getWins()){
                FootballClub temp=fb[j];
                fb[j]=fb[i];
                fb[i]=temp;
            }
        }
        }

        DefaultTableModel tb = (DefaultTableModel) Table1.getModel();
        for(int i=0;i<teamCount;i++){
        tb.removeRow(0);
        }
        for (int i = 0; i < teamCount; i++) {
            tb.addRow(new Object[]{fb[i].getName(), fb[i].getMatchPlayed(), fb[i].getWins(), fb[i].getLoses(), fb[i].getDraws(), fb[i].getPoints(), fb[i].getGoalsScored(), fb[i].getGoalsConceded()});
        }
    }//GEN-LAST:event_btn_sortByWinsActionPerformed

    private void btn_viewMatchedPlayedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_viewMatchedPlayedActionPerformed
        // TODO add your handling code here:

        DefaultTableModel tb1 = (DefaultTableModel) Table2.getModel();
        if(tb1.getRowCount()>0){
        for(int i=0;i<mp.size();i++){
        tb1.removeRow(0);    
        }
        }
        
        for(int i=0;i<mp.size()-1;i++){
        for(int j=i+1;j<mp.size();j++){
            String[] s=new String[3];
            String[] s1=new String[3];
            int x=0;
            int y=0;
            StringTokenizer st=new StringTokenizer(mp.get(i).getDate(),"/");
            while(st.hasMoreTokens()){
                s[x]=st.nextToken();
                x++;
            }
            StringTokenizer st1=new StringTokenizer(mp.get(j).getDate(),"/");
            while(st1.hasMoreTokens()){
                s1[y]=st1.nextToken();
                y++;
            }
            if(Integer.parseInt(s1[2])<Integer.parseInt(s[2])){
                MatchPlayed temp=mp.get(j);
                MatchPlayed temp1=mp.get(i);
                
                mp.add(j,temp1);
                mp.remove(j+1);
                mp.add(i, temp);
                mp.remove(i+1);
            }
            else if(Integer.parseInt(s1[2])==Integer.parseInt(s[2])){
             if(Integer.parseInt(s1[1])<Integer.parseInt(s[1])){
                MatchPlayed temp=mp.get(j);
                MatchPlayed temp1=mp.get(i);
                
                mp.add(j,temp1);
                mp.remove(j+1);
                mp.add(i, temp);
                mp.remove(i+1);
            }
             else if(Integer.parseInt(s1[1])==Integer.parseInt(s[1])){
                 if(Integer.parseInt(s1[0])<Integer.parseInt(s[0])){
                MatchPlayed temp=mp.get(j);
                MatchPlayed temp1=mp.get(i);
                
                mp.add(j,temp1);
                mp.remove(j+1);
                mp.add(i, temp);
                mp.remove(i+1);
            }
             }
            }
        }
        }
        
        for (int i = 0; i < mp.size(); i++) {
            tb1.addRow(new Object[]{mp.get(i).getDate(), mp.get(i).getTeam1(), mp.get(i).getTeam2(), mp.get(i).getScore()});
        }
    }//GEN-LAST:event_btn_viewMatchedPlayedActionPerformed

    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tb1 = (DefaultTableModel) Table2.getModel();
        
        if(tb1.getRowCount()>0){
        for(int i=0;i<mp.size();i++){
        tb1.removeRow(0);     
        }
        }

        for (int i = 0; i < mp.size(); i++) {
            if(mp.get(i).getDate().equals(txt_dateSearch.getText().toString())){
            tb1.addRow(new Object[]{mp.get(i).getDate(), mp.get(i).getTeam1(), mp.get(i).getTeam2(), mp.get(i).getScore()});
            }
        }
    }//GEN-LAST:event_btn_searchActionPerformed

    private void btn_sortByPointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sortByPointActionPerformed
        // TODO add your handling code here:
        
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
    }//GEN-LAST:event_btn_sortByPointActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI(fb, teamCount,mp).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table1;
    private javax.swing.JTable Table2;
    private javax.swing.JButton btn_search;
    private javax.swing.JButton btn_sortByPoint;
    private javax.swing.JButton btn_sortByWins;
    private javax.swing.JButton btn_sortbyGoalsScored;
    private javax.swing.JButton btn_viewMatchedPlayed;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txt_dateSearch;
    // End of variables declaration//GEN-END:variables
}
