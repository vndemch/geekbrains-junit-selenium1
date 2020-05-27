package geekbrains.ru.selenium.pom;

public class TestApp {

    public static void main(String[] args) {
        String[] firstnames = {"John","David","Bob","Max","Alex"};
        String[] lastnames = {"Red","Black","White","Green","Yellow"};

        for (int i = 0; i < 15; i++) {
            System.out.println(getRandomArrayItem(firstnames)+"  "+getRandomArrayItem(lastnames));
        }
    }

    public static String getRandomArrayItem(String[] arr) {
        return arr[(int)(Math.random()*(arr.length))];
    }

}
