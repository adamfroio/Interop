import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class Jhava {

    private int hitPoints = 52489112;
    private String greeting = "BLARGH";

    public static void main(String[] args) {
        System.out.println(Hero.makeProclamation());
    }

    @NotNull
    public String utterGreeting() {
        return greeting;
    }

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    @Nullable
    public String determineFriendshipLevel() {
        return null;
    }

    public int getHitPoints() {
        System.out.println("Bingo!");
        return hitPoints;
    }

}
