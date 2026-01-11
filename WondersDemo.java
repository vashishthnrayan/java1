// Abstract Parent Class
abstract class SevenWonders {
    abstract void display();
}

// Child Classes
class TajMahal extends SevenWonders {
    public void display() {
        System.out.println("Taj Mahal - Agra, India");
        System.out.println("Famous for its white marble and four leaning minarets.\n");
    }
}

class GreatWall extends SevenWonders {
    public void display() {
        System.out.println("Great Wall of China - China");
        System.out.println("The longest man-made structure in the world.\n");
    }
}

class Petra extends SevenWonders {
    public void display() {
        System.out.println("Petra - Jordan");
        System.out.println("An ancient city carved in pink sandstone cliffs.\n");
    }
}

class ChristRedeemer extends SevenWonders {
    public void display() {
        System.out.println("Christ the Redeemer - Brazil");
        System.out.println("A giant statue of Jesus overlooking Rio de Janeiro.\n");
    }
}

class MachuPicchu extends SevenWonders {
    public void display() {
        System.out.println("Machu Picchu - Peru");
        System.out.println("A mysterious Inca city located in the Andes Mountains.\n");
    }
}

class ChichenItza extends SevenWonders {
    public void display() {
        System.out.println("Chichen Itza - Mexico");
        System.out.println("A Mayan pyramid known for astronomical accuracy.\n");
    }
}

class Colosseum extends SevenWonders {
    public void display() {
        System.out.println("Colosseum - Rome, Italy");
        System.out.println("A massive amphitheater used for gladiator fights.\n");
    }
}

// Main Class
public class WondersDemo {
    public static void main(String[] args) {

        SevenWonders[] wonders = new SevenWonders[7];

        wonders[0] = new TajMahal();
        wonders[1] = new GreatWall();
        wonders[2] = new Petra();
        wonders[3] = new ChristRedeemer();
        wonders[4] = new MachuPicchu();
        wonders[5] = new ChichenItza();
        wonders[6] = new Colosseum();

        System.out.println("===== SEVEN WONDERS OF THE WORLD =====\n");

        for (SevenWonders w : wonders) {
            w.display();   // Polymorphism in action
        }
    }
}
