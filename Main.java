import java.sql.SQLException;
import java.sql.Savepoint;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {

        DBlogic db = new DBlogic();

       // db.addUser("kas", "kas");

       // db.delUser(6);

        db.updatePass("jaunaparole",4);
        db.getUsers();










//        DBlogic db = new DBlogic();
//        Scanner scan = new Scanner(System.in);

//      pievienot lietotāju
//        System.out.println("Ievadi lietotājvārdu: ");
//        String user = scan.nextLine();
//
//        System.out.println("Ievadi paroli: ");
//        String pass = scan.nextLine();

//        db.register(user, pass); //pievieno ierakstu


//       dzēst Lietotāju
//      db.select(); // parāda ierakstus
//      System.out.println("Apskati kuru lietotāju gribi dzēst?: ");
//      int user_choice = scan.nextInt();
//
//      db.delete(user_choice); //dzēš ierakstu

//       Labo lietotāju
//        db.select(); // parāda ierakstus
//        System.out.println("Apskati kuru lietotāju gribi labot?: ");
//        int user_choice = scan.nextInt();
//
//        System.out.println("Ievadi jaumu paroli");
//        String new_pass = scan.next();
//
//        db.update(new_pass, user_choice);
    }
}