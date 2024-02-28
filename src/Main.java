import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Book b1 = new Book("ex1",34,"author1");
        System.out.println("book "+b1.getName() +" price is: "+b1.getPrice()+", price after discount: " + b1.getDiscount());

        Movie m1 = new Movie("mov1",36,"director 1");
        System.out.println("movie "+m1.getName() +" price is: "+m1.getPrice()+", price after discount: " + m1.getDiscount());


        System.out.println("--------------------------------------------------------------------------------------------");
        MovablePoint p1 = new MovablePoint(0,0,5,5);

        while(true){

            System.out.println("write up, down, right, or left to move the point, write done to exit");
            String state = s.nextLine();
            switch(state.toLowerCase()){
                case "up":
                    p1.moveUp();
                    break;
                case "down":
                    p1.moveDown();
                    break;
                case "left":
                    p1.movieLeft();
                    break;
                case "right":
                    p1.moveRight();
                    break;
                default:
                continue;
            }
            if(state.equalsIgnoreCase("done")){
                break;
            }
            System.out.println("x:y position ("+p1.getX()+"."+p1.getY()+")");
        }
    }
}