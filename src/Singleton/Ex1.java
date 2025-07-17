package Singleton;

public class Ex1 {

        public int age=25;
        public String name="saheb";

        private static final Ex1 obj=new Ex1();

        private Ex1(){

        }

        public Ex1 cietGetObject(){
            return obj;
        }

        public static void main(String[] args) {
            Ex1 ciet = new Ex1();
            System.out.println(ciet.cietGetObject());
            System.out.println(obj.age);
            System.out.println(obj.name);
        }
    }