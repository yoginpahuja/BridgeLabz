import java.util.*;

// Card class representing a single playing card
class Card {
    String suit;
    String rank;

    public Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return rank + " of " + suit;
    }
}

// DeckOfCards class representing a deck of cards
class DeckOfCards {
    private Card[] deck;

    public DeckOfCards() {
        initializeDeck();
        shuffleDeck();
    }

    private void initializeDeck() {
        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        deck = new Card[suits.length * ranks.length];

        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = new Card(suit, rank);
            }
        }
    }

    private void shuffleDeck() {
        Random rand = new Random();
        for (int i = deck.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            Card temp = deck[i];
            deck[i] = deck[j];
            deck[j] = temp;
        }
    }

    public Card[] getDeck() {
        return deck;
    }
}

// Player class representing a player with a deck of cards
class Player {
    private String name;
    private Card[] hand;

    public Player(String name, Card[] hand) {
        this.name = name;
        this.hand = hand;
    }

    public String getName() {
        return name;
    }

    public Card[] getHand() {
        return hand;
    }
}

public class CardGame {
    public static void main(String[] args) {
        DeckOfCards deckOfCards = new DeckOfCards();
        Card[] deck = deckOfCards.getDeck();

        Player[] players = new Player[4];
        for (int i = 0; i < players.length; i++) {
            Card[] playerHand = new Card[9];
            System.arraycopy(deck, i * 9, playerHand, 0, 9);
            players[i] = new Player("Player " + (i + 1), playerHand);
        }

        // Print the cards received by each player
        for (int i = 0; i < players.length; i++) {
            System.out.println(players[i].getName() + " received the following cards:");
            for (Card card : players[i].getHand()) {
                System.out.println(card);
            }
            System.out.println();
        }
    }
}
