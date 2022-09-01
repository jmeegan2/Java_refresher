public class LearnJava {
    public static void main(String[] args) {

//        //Primitive data types
//        int a = 5; //stores value of 5 into a
//        char b = 'i';
//        long c = 400;
//        double d = 3.2;
//
//        //A string is an object
//        String name = "Susan";
//
//        //the period allows u to manipulate variables
//        System.out.println(name.toUpperCase());
//        System.out.println(name.toLowerCase());

        //this part is for the method
       String exclaim =  addExclamationPoint("hot dogs");
       System.out.println(exclaim);
    }
        //Adding a method
        public static String addExclamationPoint(String s) {
            return s + "!";
        }
    }

