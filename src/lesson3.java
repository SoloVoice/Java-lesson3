import java.util.Scanner;

public class lesson3 {
    public static void main(String[] args) {
        //Задание 3.1
        int game_continue;
        int try_num = 3;
        int target_num = generateRandom();
        gameInfo(try_num);
        Scanner input = new Scanner(System.in);
        while (true) {
            while (true) {
                if (try_num == 0) {
                    System.out.println("====================\n" +
                            "Вы не угадали.\n" +
                            "Загаданное число: " + target_num + "\n" +
                            "Попробуйте еще раз.\n" +
                            "====================");
                    break;
                }
                System.out.print("Введите число: ");
                int user_input = input.nextInt();
                if (user_input == target_num) {
                    System.out.println("Вы выйграли. Загаданное чило: " + target_num);
                    break;
                } else if (user_input > target_num) {
                    try_num--;
                    System.out.println("Загаданное число меньше\nОставшиеся попытки: " + try_num);
                } else if (user_input < target_num) {
                    try_num--;
                    System.out.println("Загаданное число больше\nОставшиеся попытки: " + try_num);
                }
            }
            while (true) {
                System.out.print("Играть заново? (0 - нет, 1 - да)");
                game_continue = input.nextInt();
                if (0 <= game_continue && game_continue < 2) {
                    break;
                } else {
                    System.out.println("Тайой команды не существует. 0 - закончить, 1 - начать играть заново");
                }
            }
            if (game_continue == 0) {
                System.out.println("GAME OVER");
                break;
            } else if (game_continue == 1) {
                try_num = 3;
                target_num = generateRandom();
                gameInfo(try_num);
            }
        }
    }

    static int generateRandom() {
        return (int) (Math.random() * 10);
    }

    static void gameInfo(int num) {
        System.out.println("============================================================\n" +
                "Необходио угадать загаданное число в диапазоне от 0 до 9.\n" +
                "У вас есть " + num + " попытки\n" +
                "============================================================");
    }
}
