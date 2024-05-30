import java.util.ArrayList;
import java.util.Random;

public class DominoPile {

    // prop.
    public ArrayList<Domino> dominoes;

    // const.
    public DominoPile(){

        dominoes = new ArrayList<>();

    }

    // mthd.

    public ArrayList<Domino> getPile(){

        return dominoes;

    }

    public void newStack6() {

        for(int i = 0; i < 7; i++) {

            for(int j = 0; j < 7; j++) {

                if(i <= j) {

                    dominoes.add(new Domino(i,j));

                }

            }
        }
    }
    private boolean sameDomino(Domino domino) {

        for (Domino d : dominoes) {

            if (d.getTop() == domino.getBottom() && d.getBottom() == domino.getTop())  {

                return true;

            }

        }

        return false;
    }

    public void shuffle() {

        for (int i = dominoes.size() - 1; i > 0; i--) {

            int j = randomNumber(i + 1);

            Domino temp = dominoes.get(i);

            dominoes.set(i, dominoes.get(j));

            dominoes.set(j, temp);

        }

    }

    // helper method to generate random number
    private int randomNumber(int num) {

        Random random = new Random();

        return random.nextInt(num);

    }

}
