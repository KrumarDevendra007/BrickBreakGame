/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.game;

/**
 *
 * @author VIPER
 */
import javax.swing.JFrame;
public class Game {

    public static void main(String[] args) {
       JFrame obj = new JFrame();
       GamePlay gameplay = new GamePlay();
       obj.setBounds(10, 10, 700, 600);
       obj.setTitle("BrickBreak");
       obj.setResizable(false);
       obj.setVisible(true);
       obj.setLocationRelativeTo(null);
       obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       obj.add(gameplay);
       
    }
}
