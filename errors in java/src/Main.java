                                           //errors==>>>
//                3 type of errors...
//1.syntax errors
//2.logical errors
//3.runtime errors---> also called exaptions.
//
//                        1.syntax errors--
//  when compiler find something worng whit our program
//  it is throw a syntax error.
//
//int a=5 ( there is no semicolon , syntax error)
//d=4   ( variable not  declared , syntax error)
//
//                                2.logical errors -->>( bug)

//when a program compiles and runs but does the wrong thing
//
//if we want to print prime no-
// public class Main{
//  public static void main(String[] args) {
//      System.out.println("2");
//      int i;
//      for (i=1;i<=10;i++){
//          System.out.println(2*i+1);
//      }
//
//  }
//}
                          //   3.runtime errors---->>

//public classMain {
//    public static void main(String[] args) {
//        int a=5000;
//        int b=0;
//        int c=a/b;
//        System.out.println("the result is "+c);
//    }// yhan par isne error show kar di kyun ki ismain runtime error show ho rahi h .
//}
        // now we can use try catch methods-->>
//        int a = 5000;
//        int b = 0;
//        try {
//            int c = a / b;
//            System.out.println(c);
//        }
//       catch(Exception e){
//       System.out.println("there are some problem);
//           System.out.println(e);
//        }
//    }
//}

                                      //     type of commonly occuring exceptions-->

//1.null pointer exception.
//2.arithmetic exception.
//3.array index out of bound exception.
//4.llegal argument excaption.
//number format excaption.

//
//                                           import java.util.Scanner;
//
//                                                                                      import java.util.Scanner;
//
//                                           public class Main{
//    public static void main(String[] args) {
//        int[] marks={ 12,23,13,14,124,2323,4354};
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter  the array index");
//        int  ind = sc.nextInt();
//        System.out.println("enter the the number");
//        int num=sc.nextInt();
//       try{
//           System.out.println("the value at array index entered is  "+marks[ind]);
//       }
//       catch (ArithmeticException e){
//           System.out.println("ArithmeticException occured");
//       }
//       catch (ArrayIndexOutOfBoundsException e){
//           System.out.println("ArrayIndexOutOfBoundsException occured");
//       }
//       catch (Exception e){
//           System.out.println("some other exception");
//       }
//
//
//
//    }
//}
//                                        //   nested try catch in java-->
//
//
// public class Main{
//    public static void main(String[] args) {
//        int marks[]={12,13,34,35,45,56,};
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter the value of index");
//        int value= sc.nextInt();
//        try {
//            System.out.println("welcome to java ");
//            try {
//                System.out.println(marks[value]);
//            }
//            catch (ArrayIndexOutOfBoundsException e){
//                System.out.println("exception  in level 2");
//                System.out.println(e);
//            }
//        }
//        catch (Exception e){
//            System.out.println("exception in level 1");
//            System.out.println(e);
//        }
//    }
//}
// quiz-->
//            write the java program that allows you to keeep acceussing array unitl a valid index given by the user
//                                           public class Main{
//                                               public static void main(String[] args) {
//                                                   int marks[]={12,13,34,35,45,56,};
//                                                   Scanner sc=new Scanner(System.in);
//                                                   boolean flash=true;
//                                                   while (flash) {
//                                                       System.out.println("enter the value of index");
//                                                       int value = sc.nextInt();
//                                                       try {
//                                                           System.out.println("welcome to java ");
//                                                           try {
//                                                               System.out.println(marks[value]);
//                                                               flash=false;
//                                                           } catch (ArrayIndexOutOfBoundsException e) {
//                                                               System.out.println("exception  in level 2");
//                                                               System.out.println(e);
//                                                           }
//                                                       } catch (Exception e) {
//                                                           System.out.println("exception in level 1");
//                                                           System.out.println(e);
//                                                       }
//                                                   }
//                                               }
//                                           }


                            //throw key words in java---->>>


//      jab hum apni exception ki  class  bnate h tab exception ko show karne ke leye hum "throw " ka use karte h

//question == voting karni h aur >18 ko exception show karna h ......

                                           import java.util.Scanner;

                                           class youngerageexception extends Exception {
    public  youngerageexception(String msg){
        super(msg);
    }
}
 class voting{
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("enter your age= ");

         int age=sc.nextInt();
         try{


         if (age<18){
             throw  new youngerageexception("you are not eligible");
         }
         else {
             System.out.println("voted succesfully");
         }
         }
         catch (youngerageexception e){
             System.out.println(e);
         }
     }

}
                                   // use of throws keyword in java--->>>
//
// throws keywords ka use hum log kiss class main exception a skta h usko btane ke leye karte h isko ressolve jab kiya
// jata h jab koi aur usser uss method ko calll karwata h

//class readandwrite {
//    void readfile() throws FileNotFoundException {
//        FileInputStream fis=new FileInputStream("d:/abc");
//    }
//    void savefile() throws FileNotFoundException{
//        String text="my name is lakhan";
//        FileOutputStream fos = new FileOutputStream("g:/hgfsaaygt");
//    }
//    void ayush(int a){
//        System.out.println(a+" write your name");
//    }
//}


//public class Main {
//    public static void main(String[] args) {
//        readandwrite rw = new readandwrite();
//        try {
//            rw.readfile();
//        } catch (FileNotFoundException e) {
//            System.out.println(e);
//        }
//        try {
//            rw.savefile();
//        }
//        catch (FileNotFoundException e){
//            System.out.println(e);
//        }
//        rw.ayush(1);
//    }
//}
//class Exaption extends Exception{
//    public Exaption(String msg){
//        super(msg);
//    }
//}


//       public class Main {
//    public static void main(String[] args) throws Exaption {
//        int[]marks={12,13,14,15,16,};
//        Scanner sc=new Scanner(System.in);
//
//        boolean flash =true;
//        int i;
//        for (i=0;i<5;i++){
//            if (flash&&i<5){
//            System.out.println("enter your no-");
//        int num=sc.nextInt();
//        try {
//            System.out.println(marks[num]);
//break;
//
//        }
//        catch ( ArrayIndexOutOfBoundsException e){
//            System.out.println(e);
//        }
//    }
//}
//        if (i<5){
//            throw new Exaption("this is error");
//        }
//    }}

// class Exaption {
//  void readfile(int i) throws ArrayIndexOutOfBoundsException {
//if (i<5){
//    System.out.println("ArrayIndexOutOfBounds");
//}
//
//   }
//}
//       public class Main {
//    public static void main(String[] args)  {
//        int[]marks={12,13,14,15,16,};
//        Scanner sc=new Scanner(System.in);
//
//        boolean flash =true;
//        int i;
//        for (i=0;i<5;i++){
//            if (flash&&i<5){
//            System.out.println("enter your no-");
//        int num=sc.nextInt();
//        try {
//            System.out.println(marks[num]);
//break;
//
//        }
//        catch ( ArrayIndexOutOfBoundsException e){
//            System.out.println(e);
//        }
//    }
//}
//
//     Exaption ayush= new Exaption();
//        try {
//            ayush.readfile(i);
//        }
//        catch(ArrayIndexOutOfBoundsException e){
//            System.out.println(e);
//
//        }
//
//    }}
