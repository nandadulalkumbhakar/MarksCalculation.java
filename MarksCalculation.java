import java.util.Scanner;
public class MarksCalculation {
    public static void main(String s[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of Subject: ");
        int noOfSub=sc.nextInt();
        int marks[]=new int [noOfSub];
        for(int i=0;i<noOfSub;i++)
        {
            int j=i+1;
            System.out.println("Enter "+j+"Subject marks: ");
            marks[i]=sc.nextInt();
        }
        int totalMarks=0;
        for(int i=0;i<noOfSub;i++)
            totalMarks+=marks[i];
        System.out.println("Total marks "+totalMarks);
        double averageMarks=(double)totalMarks/noOfSub;
        System.out.println("Average percentage : "+averageMarks);
        if(averageMarks>=90.0)
            System.out.println("Grade O");
        else if(averageMarks>=80.0)
            System.out.println("Grade E");
        else if(averageMarks>=70.0)
            System.out.println("Grade A");
        else if(averageMarks>=60.0)
            System.out.println("Grade B");
        else if(averageMarks>=50.0)
            System.out.println("Grade C");
        else if(averageMarks>=40.0)
            System.out.println("Grade D");
        else
            System.out.println("Fail");
    }
}
