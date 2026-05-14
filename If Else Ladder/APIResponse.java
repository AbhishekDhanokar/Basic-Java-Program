// 46. Categorize API response status codes

import java.util.Scanner;

public class APIResponse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter response code: ");
        int code = sc.nextInt();

        if (code == 200)
            System.out.println("Success");
        else if (code >= 400 && code < 500)
            System.out.println("Client Error");
        else if (code >= 500 && code < 600)
            System.out.println("Server Error");
        else
            System.out.println("Unknown");

        sc.close();
    }
}