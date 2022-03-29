package test;

public class BuildRhomb {
    public void buildRhomb(int size) {
        for (int j = 0; j <= size / 2; j++) {                   //пробегаем все строки
            for (int i = 0; i < size; i++) {                    //пробегаем строку по символу
                if ((size) / 2 - j <= i && (size / 2) + j >= i) //попадает в отрезок
                    System.out.print("*");
                else                                            //не попадает в отрезок
                    System.out.print(".");
            }
            System.out.println();
        }
        for (int j = size / 2 - 1; j >= 0; j--) {
            for (int i = 0; i < size; i++) {
                if ((size) / 2 - j <= i && (size / 2) + j >= i)
                    System.out.print("*");
                else
                    System.out.print(".");
            }
            System.out.println();
        }
    }
}

