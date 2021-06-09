/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.exercise1;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye 
 * @modifier Jihyun Lim
 * Student #: 991322922
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Card c = new Card();
        
        for (int i=0; i<magicHand.length; i++)
        {
            magicHand[i] = c;
            
            //c.setValue(insert call to random number generator here)
            c.setValue((int)Math.random()*13+1);
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[(int)Math.random()*4]);
        }
        
        //insert code to ask the user for Card value and suit, create their card
        Scanner input1 = new Scanner(System.in);
        
        System.out.println("Choose your suit, Heart, Diamonds, spades, Clubs)");
        
        c.setSuit(input1.next());
        
        System.out.println("Enter the number of card - J = 11, Q = 12, K = 13");
       
        c.setValue(input1.nextInt());
        
        System.out.println("Your card number is "+ c.getValue() + " and it is suit of " + c.getSuit());
    }
    
}
