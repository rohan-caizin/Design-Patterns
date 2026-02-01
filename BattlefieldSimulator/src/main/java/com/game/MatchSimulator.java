package com.game;

import com.game.observer.DeadPlayerView;
import com.game.observer.MatchFeed;
import com.game.roles.*;

public class MatchSimulator {
    public static void main(String[] args) {

        System.out.println("--- MATCH START ---");

        Soldier alphaSniper = new Sniper("Alpha");
        Soldier alphaAssaulter = new Assaulter("Alpha");

        Soldier bravoSniper = new Sniper("Bravo");

        MatchFeed feed = new MatchFeed();
        alphaSniper.addObserver(feed);
        alphaAssaulter.addObserver(feed);
        bravoSniper.addObserver(feed);

        alphaSniper.fight();
        bravoSniper.fight();

        System.out.println("\n--- EVENT: Alpha Sniper dies! ---");

        DeadPlayerView deadAlphaPlayer = new DeadPlayerView("DeadSniper", "Alpha");

        alphaAssaulter.addObserver(deadAlphaPlayer);
        bravoSniper.addObserver(deadAlphaPlayer);

        System.out.println("\n--- ACTION: Alpha Teammate moves ---");
        alphaAssaulter.fight();

        System.out.println("\n--- ACTION: Bravo Enemy moves ---");
        bravoSniper.fight();
    }
}