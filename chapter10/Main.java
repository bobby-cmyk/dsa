package chapter10;

public class Main {
    public static void main(String[] args) {
        Object[] array = new Object[]{
            1,
            2,
            3,
            new Object[]{4, 5, 6},
            7,
            new Object[]{
                8,
                new Object[]{
                    9, 10, 11,
                    new Object[]{12, 13, 14}
                }
            },
            new Object[]{
                15, 16, 17, 18, 19,
                new Object[]{
                    20, 21, 22,
                    new Object[]{
                        23, 24, 25,
                        new Object[]{
                            new Object[]{26, 27, 29}
                        },
                        30, 31
                    },
                    32
                },
                32
            },
            33
        };

        printNumbers(array);
    }

    private static void printNumbers(Object[] array) {
        for (Object item : array) {
            if (item instanceof Object[]) {
                printNumbers((Object[]) item);
            }

            else if (item instanceof Number) {
                System.out.println(item);
            }
        }
    }
}
