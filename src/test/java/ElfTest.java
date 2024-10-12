import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import LOTR.Character;
<<<<<<< HEAD
import LOTR.*;
=======
import LOTR.Hobbit;
import LOTR.Elf;
>>>>>>> 7cbca69 (Ultimate commit)

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ElfTest {
    private Character character;

    @BeforeEach
    public void init() {
        character = new Elf();
    }

    @Test
    public void testToString(){ assertEquals("Elf{hp=10, power=10}", character.toString());
    }

    @Test
    public void testKick() {
        Hobbit hobbit = new Hobbit();
        character.kick(hobbit);
        assertEquals(0, hobbit.getHp());
    }
}

