import java.io.IOException;
import java.io.File;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        File f = new File("companies.txt");
        Scanner s = new Scanner(f);
        DogWalkCompany[] companies = new DogWalkCompany[100];
        for (int i = 0; i < 100; i++)
            companies[i] = new DogWalkCompany(s.nextLine());
        s.close();

        f = new File("walkers.txt");
        s = new Scanner(f);
        int totalWalkers = countLines(f);
        int curWalker = 1;
        int company;
        int maxDogs;
        DogWalker walker;
        int startHour;
        int endHour;
        int pay;
        while (curWalker <= totalWalkers) {
            company = s.nextInt();
            maxDogs = s.nextInt();
            walker = new DogWalker(maxDogs, companies[company], curWalker);
            startHour = s.nextInt();
            endHour = s.nextInt();
            pay = walker.dogWalkShift(startHour, endHour);
            System.out.println("$" + pay + " " + walker);
        }
        s.close();
    }
    public static int countLines(File f) throws IOException {
        Scanner s = new Scanner(f);
        int line = 0;
        while (s.hasNextLine()) {
            s.nextLine();
            line++;
        }
        s.close();
        return line;
    }
}
