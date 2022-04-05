package test;

public class Main {
    public static void main(String[] args) {
//        ToStringTest j = new ToStringTest();
//        System.out.println(j);
//        String test = "Two beEr, Or nOt tWo beeR?";
//        System.out.println(test.toLowerCase(Locale.ROOT));
//          System.out.println(test.length());
//        System.out.println(test.equalsIgnoreCase("dfgsdfg"));
//        System.out.println(test.toLowerCase(Locale.ROOT).substring(5,9));
//        System.out.println(test.trim());
//        System.out.println(test.strip());
//        System.out.println(test.substring(11));
//        System.out.println(test.toLowerCase(Locale.ROOT).lastIndexOf("r"));
//        System.out.println(test.toLowerCase(Locale.ROOT).indexOf("two"));
//        System.out.println(test.startsWith("Two"));
//        System.out.println(test.toLowerCase(Locale.ROOT).endsWith("beer?"));
//        System.out.println(test.concat(" Is ").concat("not ").concat("a question!"));
//        System.out.println(test.compareToIgnoreCase("Two beEr, Or nOt tWo beeR?"));
//BuildRhomb buildRhomb = new BuildRhomb();
//buildRhomb.buildRhomb(19);

        // BuildRhombWithStringBuilder rhomb = new BuildRhombWithStringBuilder();
        // System.out.println(rhomb.buildRhomb(11));

        // SnakeBuilder snakeBuilder = new SnakeBuilder();
        // System.out.println(snakeBuilder.buildSnake(2,9,7));

        SnakeBuilder2 snakeBuilder = new SnakeBuilder2();
        int length = 0;
        int hight = 0;
        System.out.println(snakeBuilder.dialog(length, hight));

    }
}
