import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.io.File;

public class Day01 {

    private final static String DATA_FILE = "Day01/input.txt";

    public static void part1() {
        Scanner in;
        try {
            in = new Scanner(new File(DATA_FILE));
        } catch (Exception e) {
            System.out.println(e);
            return;
        }
        int mostCalories = 0;

        while (in.hasNextLine()) {
            String line = in.nextLine();
            int calories = 0;

            // get total calories not separated by a space
            while (!line.equals("") && in.hasNext()) {
                calories += Integer.parseInt(line);
                line = in.nextLine();
            }

            if (calories > mostCalories) {
                mostCalories = calories;
            }
        }

        System.out.println("Day 01-1: " + mostCalories);
    }

    public static void part2() {
        Scanner in;
        try {
            in = new Scanner(new File(DATA_FILE));
        } catch (Exception e) {
            System.out.println(e);
            return;
        }
        ArrayList<Integer> calorieList = new ArrayList<Integer>();

        while (in.hasNext()) {
            String line = in.nextLine();
            int calories = 0;

            // get total calories not separated by a space
            while (!line.equals("")) {
                calories += Integer.parseInt(line);
                if (in.hasNext()) {
                    line = in.nextLine();
                } else {
                    break;
                }
            }

            calorieList.add(calories);

        }
        Collections.sort(calorieList);
        Collections.reverse(calorieList);
        // System.out.println(calorieList);
        int tempCalories = calorieList.remove(0) + calorieList.remove(0) + calorieList.remove(0);
        System.out.println("Day 01-2: " + tempCalories) ;

    }

    public static void main(String[] args) {
        part1();
        part2();
    }

}