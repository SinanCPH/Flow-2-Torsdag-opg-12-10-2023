package Task1;

public class Metoder {
    public void methodA(){

    }
    public void methodB(){

    }
    public void methodC(){

    }
    public void methodD(){

    }

    public void methodA(String input){
        System.out.println("J");
        System.out.println("a");
        System.out.println("v");
        System.out.println("a");
        System.out.println("");
        methodB("start");
    }

    public void methodB(String start){
        System.out.println("e");
        System.out.println("r");
        System.out.println("");
        methodC(2);
    }

    public void methodC(int input){
        System.out.println("s");
        System.out.println("j");
        System.out.println("o");
        methodD(11);
    }

    public void methodD(int number){
        if(number > 10){
            System.out.println("v");
            System.out.println("t");
        }
        else{
            System.out.println("that's not how you spell \"Java er sjovt\"");
        }
    }

}
