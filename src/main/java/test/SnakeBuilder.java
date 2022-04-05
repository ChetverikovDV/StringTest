package test;

import java.util.Scanner;

public class SnakeBuilder {
    private String buildSnake(int length, int hight) {
        int curves = 80 / length;
        System.out.println(curves + " извилин(ы)");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < hight - 1; i++) {
            if (i == 0) {
                for (int c = 0; c < curves; c++) {
                    for (int j = 0; j < length + 1; j++) {
                        if (j >= length / 2) {
                            result.append("*");
                        } else {
                            result.append(" ");
                        }
                    }
                }
            } else
                for (int c = 0; c < curves; c++) {
                    for (int j = 0; j <= length; j++) {
                        if (j == length / 2)
                            result.append("|");
                        else if (j == length)
                            result.append("|");
                        else
                            result.append(" ");
                    }
                }
            result.append("\n");
        }
        for (int c = 0; c < curves; c++) {
            for (int j = 0; j <= length - 1; j++) {
                if (j >= length / 2 + 1)
                    result.append(" ");
                else
                    result.append("*");
            }
            result.append("*");
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