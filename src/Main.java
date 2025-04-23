import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        String[] quotes = createQuotes();
        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.println("Вы сегодня в хорошем настроении?");
            String answer = in.nextLine();
            System.out.println(answer.equals("да") ? "Ответ верный" : "Ответ неверный, повторите попытку");
            if (answer.equals("нет")) continue;
            System.out.println("Вы хорошо себя чувствуете?");
            answer = in.nextLine();
            System.out.println(answer.equals("да") ? "Отлично, держите цитату для еще большего поднятия настроения!"
                    : "Это грустно, держите цитату для поднятия настроения");
            //String randQuote = quotes[rand.nextInt(quotes.length)];
            System.out.println(quotes[rand.nextInt(quotes.length)]);
        }
    }
    public static String[] createQuotes() {
        String[] quotes = {"Мечтай, верь, достигай!","Счастье — это путь.", "Ты сильнее, чем думаешь!", "Жизнь — это праздник!",
                "Улыбнись новому дню!","Всё получится, не сдавайся!","Любовь творит чудеса.","Сегодня — твой день!","Двигайся к мечте!"};
        return quotes;
    }
}