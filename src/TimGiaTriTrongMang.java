import java.util.Scanner;

public class TimGiaTriTrongMang {
    public static void main(String[] args) {
        String[] students = {"Christian","Michael","Camila","Sienna","Tanya","Connor","Zachariah","Mallory","Zoe","Emily"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao ten student");
        String input_name = scanner.nextLine();
        boolean isExits = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(input_name)){
                System.out.println("student list "+input_name+"ïs "+i);
                isExits = true;
                break;
            }
        }
        if (!isExits){
            System.out.println("not found"+ input_name+" in the list");
        }
    }
}
