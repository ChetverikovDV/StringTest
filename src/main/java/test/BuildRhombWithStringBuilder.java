package test;

public class BuildRhombWithStringBuilder {
    public String buildRhomb(int size) {
        StringBuilder resultBuilder = new StringBuilder();
        for (int line = 0; line <= size / 2; line++) {               //пробегаем все строки
            for (int cChar = 0; cChar < size; cChar++) {                 //пробегаем строку по символу
                while (inRange(size, line, cChar)) {                        //проверяем услвия
                    resultBuilder.append("*");                                  //попадает в отрезок
                    cChar++;                                                    //
                }                                                               //
                resultBuilder.append(" ");                                      //не попадает в отрезок
            }
            resultBuilder.append("\n");
        }
        for (int line = size / 2 - 1; line >= 0; line--) {
            for (int cChar = 0; cChar < size; cChar++) {
                while (inRange(size, line, cChar)) {
                    resultBuilder.append("*");
                    cChar++;
                }
                resultBuilder.append(" ");
            }
            resultBuilder.append("\n");
        }
        return resultBuilder.toString();
    }

    private boolean inRange(int size, int line, int cChar) {
        return (cChar >= size / 2 - line && cChar <= size / 2 + line);
    }
}
