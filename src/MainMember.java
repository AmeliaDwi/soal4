
package member;
import java.util.ArrayList;
import java.util.Scanner;

public class MainMember {
  
    public static ArrayList<Member> main = new ArrayList<>();
    private static Object member;

    public static void main(String[] args) {
        Member s1 = new Member();
        s1.setNama("Amelia");
        s1.setTeam("Kelas E");
        s1.setUmur("18");
        s1.setPenampilan(90);
        s1.setSuara(85);
        s1.setAttitude(80);

        Member s2 = new Member();
        s2.setNama("Desty");
        s2.setTeam("Kelas F");
        s2.setUmur("18");
        s2.setPenampilan(85);
        s2.setSuara(85);
        s2.setAttitude(90);

        Member s3 = new Member();
        s3.setNama("Elsa");
        s3.setTeam("Kelas E");
        s3.setUmur("17");
        s3.setPenampilan(80);
        s3.setSuara(85);
        s3.setAttitude(80);

        

        main.add(s1);
        main.add(s2);
        main.add(s3);
        
          MainMember.Output();
          
    }

    public static void Output() {
        for (int i = 0; i < main.size(); i++) {
            System.out.println("Nama\t: " + main.get(i).getNama());
            System.out.println("Team\t: " + main.get(i).getTeam());
            System.out.println("Umur\t: " + main.get(i).getUmur());
            System.out.println("Nilai\t: " + main.get(i).getNilai());
            System.out.println("========================");

        }
      

    }
} 

