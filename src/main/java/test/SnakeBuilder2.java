package test;

import java.util.Scanner;

public class SnakeBuilder2 {
    private String buildSnake(int length, int hight) {
        int curves = 80 / (2 * length - 2) * 2;
        System.out.println(curves / 2 + " извилин(ы)");
        StringBuilder result = new StringBuilder();

        result.append(" ");                                         // Отступ 1
        for (int c = 0; c < curves / 2; c++) {                      // Формируем верхнюю границу
            for (int l = 0; l < length - 2; l++) {
                result.append(" ");
            }
            for (int l = 0; l < length; l++) {
                result.append("-");
            }
        }
        result.append("\n");

        for (int h = 0; h < hight - 2; h++) {
            result.append(" ");                                   //Отступ 1

            for (int c = 0; c < curves; c++) {                    // Формируем вертикальные стенки
                for (int l = 0; l < length - 2; l++) {
                    result.append(" ");
                }
                result.append("|");
            }
            result.append("\n");
        }

        for (int c = 0; c < curves / 2; c++) {                    //формируем нижнюю границу
            for (int l = 0; l < length; l++) {
                result.append("-");
            }
            for (int l = 0; l < length - 2; l++) {
                result.append(" ");
            }
        }
        return result.toString();
    }

    public String dialog(int length, int hight) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Длина фрагмента");
        length = scanner.nextInt();
        System.out.println("Высота фрагмента");
        hight = scanner.nextInt();
        return buildSnake(length, hight);

    }
}