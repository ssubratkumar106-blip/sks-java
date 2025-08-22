import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter your name: ");
        String s = br.readLine();

        System.out.print("Enter your mark: ");
        int a = Integer.parseInt(br.readLine());

        System.out.print("Enter your float: ");
        float f = Float.parseFloat(br.readLine());

        System.out.println("Name is: " + s + ", marks is: " + a + ", float is: " + f);
    }
}
