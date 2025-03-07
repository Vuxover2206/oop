package HW1;

public class Introduction {

    public static void main(String[] args) {

        String fullName = "Đào Gia Thế Vũ";
        String studentID = "24022491";
        String className = "K69A-AI1";
        String githubUsername = "Vuxover2206";
        String email = "24022491@vnu.edu.vn";


        System.out.println(fullName + "\t" + studentID + "\t" + className + "\t" + githubUsername + "\t" + email);

        for (int i = 9; i >= 1; i--) {
            String bottles = (i > 1) ? "bottles" : "bottle";
            System.out.println(i + " " + bottles + " of beer on the wall, " + i + " " + bottles + " of beer.");
            System.out.println("Take one down, pass it around,");
        }
        System.out.println("No more bottles of beer on the wall.");
    }
}