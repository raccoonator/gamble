public class Games {
    @Play(commandName = "poker")
    public static int poker() {
        return (int) (Math.random() * 1000);
    }
    @Play(commandName = "roulette")
    public static int roulette() {
        return (int) (Math.random() * 1000);
    }
    @Play(commandName = "machine")
    public static int machine() {
        return (int) (Math.random() * 1000);
    }
    @Play(commandName = "blackjack")
    public static int blackjack() {
        return (int) (Math.random() * 1000);
    }
    @Play(commandName = "weal")
    public static int weal() {
        return (int) (Math.random() * 1000);
    }
    @Play(commandName = "baccarat")
    public static int baccarat() {
        return (int) (Math.random() * 1000);
    }

}
