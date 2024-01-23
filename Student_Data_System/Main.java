import java.util.*;
public class Main{
	public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);

      ArrayList<StudentData> list = new ArrayList<>();
 
      boolean flag = true;

      while(flag){
      try{
        System.out.print("Enter student Name: ");
        String name = scanner.next();
        System.out.println();
        
        System.out.print("Enter student ID: ");
        int id = scanner.nextInt();
        System.out.println();

        System.out.print("Enter Maths Marks: ");
        int maths = scanner.nextInt();
        System.out.println();

        System.out.print("Enter Physics Marks: ");
        int phy = scanner.nextInt();
        System.out.println();

        System.out.print("Enter Chemistry Marks: ");
        int che = scanner.nextInt();
        System.out.println();

        System.out.print("Enter English Marks: ");
        int eng = scanner.nextInt();
        System.out.println();

        System.out.print("Enter Computer Marks: ");
        int com = scanner.nextInt();
        System.out.println();

        StudentData data = new StudentData(name,id,maths,phy,che,eng,com);

        list.add(data);

        System.out.print("Do you want to add another Student? [true / false]: ");
        flag = scanner.nextBoolean();
        System.out.println();

       } catch (Exception e){
            System.out.print("Enter valid answer");
        }

      }

      System.out.print("Do you want to see data [true / false]: ");
      boolean ask = true;
      try{
       ask = scanner.nextBoolean();
      } catch (Exception e){
            System.out.print("Enter valid answer");
        }

    if(ask){  

        System.out.println();
        System.out.println("\t\t\t\t\t-:STUDENT DATA:-");
        System.out.println("\t\t\t\t\t----------------");System.out.println();
        
      for(StudentData data: list){
        System.out.println("\tID: "+data.getId() + "\tNAME: " +data.getName()+ "\tTOTAL: " +data.getTotal()+ "\tAVERAGE: "+data.getAvg()+ "\tPERCENTAGE: " +data.percent()+ "%\tGRADE: " +data.getGrade());
      }

    }else{
        System.out.println("THANK YOU");
    }
 }
}