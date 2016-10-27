import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter how many students: ");
        int n = scan.nextInt();
        String[] names = new String[n];
        int[][] grades = new int[n][1000000];
        int[] numGrades = new int[n];
        scan.nextLine();
        for(int i = 0; i < n; i++){
            System.out.println("Enter a student's name. ");
            names[i] = scan.nextLine();
            System.out.println("Enter a grade. enter -1 to stop");
            while(true){
                int temp = scan.nextInt();
                if(temp==-1) break;
                grades[i][numGrades[i]] = temp;
                numGrades[i]++;
            }
            scan.nextLine();
        }
        for(int i = 0; i < n; i++){
            double avg = 0;
            for(int j = 0; j < numGrades[i]; j++){
                avg += grades[i][j];
            }
            System.out.println(names[i] + " " + avg/numGrades[i]);
        }
    }
}
