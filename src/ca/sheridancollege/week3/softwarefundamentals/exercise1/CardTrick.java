/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.exercise1;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye
 */
// Oluwatoyin Ogunsuyi
// Prof asidhu
// June 10 2021
// Software Fundamentals

public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Random rnd = new Random();
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            c.setValue(rnd.nextInt(13)+1);
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[rnd.nextInt(3)]);
            magicHand[i]= c;
            System.out.println(c.getValue());
            System.out.println(c.getSuit());
        }
        
        //insert code to ask the user for Card value and suit, create their card
        System.out.println("Enter Your Card Value and Card Suit");
       System.out.println("Card Value:");
       int cardNumber = sc.nextInt();
       System.out.println("Suit Value:");
        String suit = sc.nextLine();
        boolean doesExist = false;
        
        
        // and search magicHand here  
        for (int i= 0; i < magicHand.length; i++) {
          if(magicHand[i].getValue()== cardNumber && magicHand[i].getSuit()== suit){
                 doesExist = true;
             }
        
        
        
        //Then report the result here
 if(doesExist) 
         {
            System.out.println("The Card exist in your hand");
        }
       else
       {
           System.out.println("The Card does not exist in your hand");  
       }
     
        } 
    }
