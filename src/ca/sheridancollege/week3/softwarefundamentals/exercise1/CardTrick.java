/* @modifier Sandra Fernando
 * Student Number : 991634673
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.exercise1;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that models playing card Objects. Cards have a value (note that Ace =
 * 1, Jack -11, Queen =12, King = 13) A suit (clubs, hearts, spades, diamonds).
 * There are 52 cards in a deck, no jokers. This code is to be used in ICE1.
 * When you create your own branch, add your name as a modifier.
 *
 * @author dancye
 * * @modifier Sandra Fernando 991634673
 */
public class CardTrick {
private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        Card[] magicHand = new Card[7];
        Random rand = new Random();

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            c.setValue(rand.nextInt(13) + 1);
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[rand.nextInt(4)]);
            magicHand[i] = c;
            //System.out.println("Suit : " + c.getSuit() + ", Value : " + c.getValue());

        }
        
        
        try {
            //insert code to ask the user for Card value and suit, create their card

            int userEnteredCardValue;
            String userEnteredCardSuit;

            System.out.println("------Pick a card------");

            System.out.print("Enter Card Value between [1-13]: ");
            userEnteredCardValue = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter a Suit from following [\"Hearts\", \"Diamonds\", \"Spades\", \"Clubs\"] : ");

            userEnteredCardSuit = sc.nextLine();
            if (!(userEnteredCardSuit.equalsIgnoreCase("Hearts") || userEnteredCardSuit.equalsIgnoreCase("Diamonds") || userEnteredCardSuit.equalsIgnoreCase("Spades") || userEnteredCardSuit.equalsIgnoreCase("Clubs"))) {
                throw new Exception("invalid Suit");
            }
            Card luckyCard = new Card();
            luckyCard.setSuit(userEnteredCardSuit);
            luckyCard.setValue(userEnteredCardValue);
            System.out.println("You Picked : " + luckyCard.getSuit() + " " + luckyCard.getValue());

             // and search magicHand here
            for (Card card : magicHand) {
                //System.out.println("Suit : " + card.getSuit() + ", Value : " + card.getValue());
                //Then report the result here
                if (card.getSuit().equals(userEnteredCardSuit) && card.getValue() == userEnteredCardValue) {
                    System.out.println("Winner => The card you picked found in Magic Hand : " + card.getSuit() + " " + card.getValue());

                    return;
                }
            }
            System.out.println("Loss => card not found in Magic Hand");
            //Then report the result here

        } catch (Exception e) {
            System.out.println("There was an error in your input, try again!");
            System.out.println(e.getMessage());
        }

    }
}
