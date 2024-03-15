package diaryApp;

import java.util.Scanner;

public class DiaryMainApp {
    public static void main(String[] args) {
        mainApp();
    }

    public static void mainApp() {
        String menu = """
                    Welcome To Your Friendly Mavericks Diary
                    What would you like to do?
                    1.createDiary
                    2.createEntry
                    3.createPassword
                    4.findEntry
                    6.updateEntry
                    5.deleteEntry
                    7.exitApp
                    """;

        display(menu);
        String option = input("Enter your desired option:");
        switch (option) {
            case "1":
                createDiary();
            case "2":
                createEntry();
            case "3":
                findEntry();
            case "4":
                deleteEntry();
            case "5":
                updateEntry();
            case "6":
                exitApp();
            default:
                mainApp();
        }
    }


    private static String input(String message) {
        System.out.println(message);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
    private static void display(String prompt) {
        System.out.println(prompt);
    }
    private static Diaries diaries = new Diaries();

    private static void createDiary () {
        String username = input("Enter your username:");
        String password = input("Enter your password");
        diaries.add(username, password);
        display("Diary created successfully!");
        mainApp();
    }

    private static void createEntry () {
        String username = input("Enter username:");
        String title = input("Enter title: ");
        String body = input("Write your thoughts here: ");
        Diary diary = diaries.findByUsername(username);
        diary.createEntry(title, body);
        display("Diary created successfully!!!");
        mainApp();

    }

    private static void findEntry() {
        String username = input("Enter username: ");
        String id = input("Enter diary ID: ");
        Diary diary = diaries.findByUsername(username);
        diary.findEntryById(Integer.parseInt(id));
        display("Entry Found Successfully!");

    }
    private static void updateEntry() {
        String username = input("Enter username: ");
        String id = input("Enter diary ID: ");
        String title = input("Enter title: ");
        String body = input("Write your thoughts here: ");
        Diary diary = diaries.findByUsername(username);
        diary.updateEntry(Integer.parseInt(id), title, body);
        display("Entry Updated Successfully!");
    }

    private static void deleteEntry() {
        String username = input("Enter username: ");
        String id = input("Enter diary ID: ");
        Diary diary = diaries.findByUsername(username);
        diary.deleteEntry(Integer.parseInt(id));
        display("Entry Deleted Successfully!");

    }

    private static void exitApp() {
        mainApp();
    }


}