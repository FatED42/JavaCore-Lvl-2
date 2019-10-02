import Exception.MyArraySizeException;
import Exception.MyArrayDataException;


public class Main {

    static String[][] ArrayError = new String[][]{
            {"1", "2", "3", "4"},
            {"8", "44", "6", "5"},
            {"9", "10", "Error", "12"},
            {"13", "14", "15", "16"}};

    enum DayOfWeek {MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY}



    public static void main(String[] args) throws MyArrayDataException {

        System.out.println("До конца рабочей недели" + (40-DayOfWeek.valueOf("SATURDAY").ordinal()*8) + " часов ");

        String[][] arrayTestSize = new String[5][5];

        try {
            Test(arrayTestSize);
        } catch (MyArraySizeException e) {
            e.printStackTrace();
            sumTest(ArrayError);
        }
    }

    public static void Test(String[][] testSize) throws MyArraySizeException, MyArrayDataException {
        if ((testSize.length > ArrayError.length) || (testSize[0].length > ArrayError.length))
            throw new MyArraySizeException("Размер массива больше допустимого!");

        sumTest(ArrayError);
    }

    private static void sumTest(String[][] testSize) throws MyArrayDataException {
        int[][] sumTesting = new int[4][4];
        for (int i = 0; i < testSize.length; i++) {
            for (int j = 0; j < testSize.length; j++) {
                try {
                    sumTesting[i][j] = Integer.parseInt(testSize[i][j]);
                } catch (Exception e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
    }

}
