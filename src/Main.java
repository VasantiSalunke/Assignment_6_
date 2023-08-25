public class Main {
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.display();
        System.out.println("--------------------------------------------");
        l1.addfromfirst(40);
        l1.display();
        System.out.println("-------------------------------------------------");
        l1.addfromfirst(20);
        l1.addfromfirst(30);
        l1.display();

        System.out.println("----------------------------------------------------");

        l1.deleteFromLast();
        l1.display();

        System.out.println("--------------------------------------------------");
        l1.removefromFirst();
        l1.display();
        System.out.println("----------------------------------------------------");
        l1.addfromfirst(15);
        l1.display();
        System.out.println("-----------------------------------------------------");
        l1.deleteFromLast();
        l1.display();
        l1.addfromfirst(30);
        System.out.println("------------------------------------------------------");
        l1.display();


    }
}