package LOTR;

import java.util.Random;

import LOTR.Strategies.NobleKick;

public abstract class Noble extends Character{
    public Noble(int min, int max){
        super(new Random().nextInt(min, max), new Random().nextInt(min, max), new NobleKick());
    }

}
