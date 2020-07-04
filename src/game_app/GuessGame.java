package game_app;

public class GuessGame {
    Player p1;
    Player p2;
    Player p3;

    public void startGame() {
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        // Переменные для хранения вариантов от каждого игрока
        int guessp1 = 0;
        int guessp2 = 0;
        int guessp3 = 0;

        // Переменные для хранения правильности/неправильности ответов
        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;

        int targetNumber = (int) (Math.random() * 10); // Генерирует число, которое игроки должны угадать
        System.out.println("I choose a number between 0 and 9..."); // Начало игры

        while (true) {
            System.out.println("(The number is " + targetNumber + ")");

            p1.guess();
            p2.guess();
            p3.guess();

            // Извлечение вариантов каждого игрока
            guessp1 = p1.number;
            System.out.println("First player says, the number is " + guessp1);

            guessp2 = p2.number;
            System.out.println("Second player says, the number is " + guessp2);

            guessp3 = p3.number;
            System.out.println("Third player says, the number is " + guessp3);

            // Проверка вариантов
            if (guessp1 == targetNumber) {
                p1isRight = true;
            }

            if (guessp2 == targetNumber) {
                p1isRight = true;
            }

            if (guessp3 == targetNumber) {
                p1isRight = true;
            }

            // Цикл подводит итоги
            if (p1isRight || p2isRight || p3isRight) {
                System.out.println("WE GOT THE WINNER!");
                System.out.println("Did first player predict? " + p1isRight);
                System.out.println("Did second player predict? " + p2isRight);
                System.out.println("Did third player predict? " + p3isRight);
                System.out.println("THE END.");
                break; // Цикл будет завершён в случае, если 1 из игроков угадает заданное число
            } else {
                // В случае, если никто не угадал
                System.out.println("\n PLAYERS SHOULD TRY AGAIN. \n");
            }
        } // Конец цикла
    } // Конец метода
}