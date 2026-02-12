
public class main {

    static String[] items = new String[50];
    static Boolean[] checked = new Boolean[50];

    static int itemCount = 0;

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        boolean running = true;

        while (running) {
            printMenu();

            //TODO: read menu choices

            int choice = -1;
            
            switch (choice) {
                case 1:
                    //call addItem
                    break;
                
                case 2:
                    //call removeItem
                    break;

                case 3:
                    //call checkOffItem
                    break;

                case 4:
                    //call printList
                    break;

                case 5:
                    //print final list 
                    //goodbye message
                    //set running to false
                    break;

                default:
                    //make sure menu options are valid
            }

        }
    }

}