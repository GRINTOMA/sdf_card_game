/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

/**
 *
 * @author Richard
 */
public class Game {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CrazyEights ce = new CrazyEights("testing");
        ce.play();
    }
}
