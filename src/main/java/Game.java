import java.util.ArrayList;

public class Game {

    private ArrayList<Player> players;

    public Game(ArrayList<Player> players){
        this.players = players;

    }

    public void dealCards(Deck deck){
        for (Player player : players ){
        player.addCardToHand(deck.dealOne());
        }
    }

    public Player pickWinner(){
        Player winner = players.get(0);

        for(Player player : players){

<<<<<<< HEAD

=======
>>>>>>> a48b6cff6b8c96b5c330037d87e7bd50fe47f137
            if(player.returnCardRank() > winner.returnCardRank()){
                winner = player;
            }

        }
        return winner;

    }
}
