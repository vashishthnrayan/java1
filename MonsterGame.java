public class MonsterGame {
    static int defeatWays(int monsters) {
        if (monsters == 0) {
            return 1; // One way to defeat zero monsters (do nothing)
        }
        if (monsters < 0) {
            return 0; // No way to defeat negative monsters
        }
        // Defeat one monster or two monsters
        return defeatWays(monsters - 1) + defeatWays(monsters - 2);
    }
    public static void main(String[] args) {
        System.out.println(defeatWays(5)); // Example: 5 monsters
    }
}
