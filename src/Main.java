import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ManagerDocument managerDocument = new ManagerDocument();
        while (true){
            System.out.println("Application Manager Document");
            System.out.println("Enter 1: To insert document");
            System.out.println("Enter 2: To remove document by id");
            System.out.println("Enter 3: To search document by id");
            System.out.println("Enter 4: To show information document");
            System.out.println("Enter 5: To exit");
            String line = scanner.nextLine();
            switch (line){
                case "1":{
                    System.out.println("Enter 1: To insert Book");
                    System.out.println("Enter 2: To insert Journal");
                    System.out.println("Enter 3: To insert Newspaper");
                    String type = scanner.nextLine();
                    switch (type){
                        case "1":{
                            System.out.print("Enter ID: ");
                            String id = scanner.nextLine();
                            System.out.print("Enter Host: ");
                            String host= scanner.nextLine();
                            System.out.print("Enter Number: ");
                            int number=scanner.nextInt();
                            System.out.print("Enter Author: ");
                            String author=scanner.nextLine();
                            System.out.print("Enter PageNum: ");
                            int num=scanner.nextInt();
                            Document book= new Book(id,host,number,author,num);
                            managerDocument.addDocument(book);
                            System.out.println(book.toString());
                            scanner.nextLine();
                            break;
                        }
                        case "2":{
                            System.out.print("Enter ID: ");
                            String id = scanner.nextLine();
                            System.out.print("Enter Host: ");
                            String host = scanner.nextLine();
                            System.out.print("Enter Number: ");
                            int number = scanner.nextInt();
                            System.out.print("Enter Month: ");
                            int month = scanner.nextInt();
                            System.out.print("Enter Num2: ");
                            int num2 = scanner.nextInt();
                            Document journal = new Journal(id,host,number,month,num2);
                            managerDocument.addDocument(journal);
                            System.out.println(journal.toString());
                            scanner.nextLine();
                            break;
                        }
                        case "3":{
                            System.out.print("Enter ID: ");
                            String id = scanner.nextLine();
                            System.out.print("Enter Host: ");
                            String host = scanner.nextLine();
                            System.out.print("Enter Number: ");
                            int number = scanner.nextInt();
                            System.out.print("Enter Day: ");
                            int day = scanner.nextInt();
                            Document newspaper = new Newspaper(id,host,number,day);
                            managerDocument.addDocument(newspaper);
                            System.out.println(newspaper.toString());
                            scanner.nextLine();
                            break;
                        }
                        default:
                            break;

                    }
                    break;

                }
                case "2":{
                    System.out.print("Enter id to remove: ");
                    String id = scanner.nextLine();
                    System.out.println(managerDocument.deleteDocument(id) ? "Success" : "Fail");
                }
                break;
                case "3":{
                    System.out.println("Enter a to search book");
                    System.out.println("Enter b to search newspaper");
                    System.out.println("Enter a to search journal");
                    String choise = scanner.nextLine();
                    switch (choise) {
                        case "a": {
                            managerDocument.searchByBook();
                            break;
                        }
                        case "b": {
                            managerDocument.searchByNewspaper();
                            break;
                        }
                        case "c":
                            managerDocument.searchByJournal();
                            break;
                        default:
                            System.out.println("Invalid");
                            break;
                    }
                    break;
                }
                case "4":{
                    managerDocument.showInfor();
                    break;
                }
                case "5":{
                    return;
                }
                default:
                    System.out.println("Invalid");
                    continue;
            }

        }
    }
}