import java.util.Scanner;

public class GitHubSchool {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your project name: ");
        String projectName = sc.nextLine();
        System.out.print("Enter your project description: ");
        String projectDescription = sc.nextLine();
        System.out.print("Enter your project license: ");
        String projectLicense = sc.nextLine();
        GitHubSchool school = new GitHubSchool(projectName, projectDescription, projectLicense);
    }
}
