/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.exercise1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        
        //double ranNum = 0;
        Card a = new Card();
        
        Card[] magicHand = new Card[7];
        Card c = new Card();
        String[] cardSuit = {"","","","","","",""};
        
        
        for (int i=0; i<magicHand.length; i++)
        {
            
            //System.out.println((int) 1 + Math.random() * 10);
            c.setValue((int)Math.floor(1+Math.random()*10));
            c.setSuit(Card.SUITS[(int)Math.floor(Math.random()*4)]);
            
            //System.out.print(c.getValue() + " of " + c.getSuit());
            System.out.println(/*(int)Math.floor(1+Math.random()*10)*/);
            
            cardSuit[i] = c.getSuit()+c.getValue();
            
        }
        System.out.println("Here are your cards...");
        for (int z = 0; z<cardSuit.length; z++){
            System.out.println(cardSuit[z]);
        }
        System.out.println(/*(int)Math.floor(1+Math.random()*10)*/);
        
        if(Arrays.asList(cardSuit).contains("Hearts1")){
            System.out.println("YES, You got the Lucky Card!!! CONGRATULATIONS!");
        }
        else{
            System.out.println("Yeah nah! You don't have the lucky card");
        }
        
        
 
        
        
        
//        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
//        System.out.println(cars[0]);
//        Outputs Volvo
        
//        insert code to ask the user for Card value and suit, create their card
//        Scanner input = new Scanner(System.in);
//        System.out.println("Please pick a card. Your choices are 'Hearts', 'Diamonds',"
//                + " 'Spades', & 'Clubs'. Type the Card suit exactly as you see them.");
//        a.setSuit(input.nextLine());
//        System.out.println(a.getSuit());
//        
//        System.out.println("Please pick a number for your card. This could be from 1 to 10");
//        a.setValue(input.nextInt());
//        System.out.println(a.getValue());
//        
//        
//        System.out.println("The card is..." + a.getValue() + " of " + a.getSuit());
//         and search magicHand here
//        Then report the result here
        
          
      
    }
    
}
