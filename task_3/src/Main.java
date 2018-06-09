import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
    }

    public static double inputParameters(String parameters) throws IOException {
        double a = 0.D;
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));

        while (true) {
            String str = br.readLine();
            if (str.equalsIgnoreCase("stop")) {
                a = -1D;
                break;
            }
            try {
                a = Double.parseDouble(str);
                if (a <= 0) throw new ZeroException();
                break;
            } catch (NumberFormatException e) {
                System.out.println("It's not a number.");
            } catch (ZeroException e) {
                System.out.println("There are no rectangles with such parameters. ");
            }
        }
        if (a == -1.0)
            System.exit(0);
        return a;
    }
}
