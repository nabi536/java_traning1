package Collections;

public class HelloHash {
    public static void main(String[] args) {
        String name = "mani";
        Integer age = 25;
        Boolean flag = false;
        Boolean flag1 = true;
        System.out.println(name.hashCode()%16);
        System.out.println(age.hashCode()%16);
        System.out.println(flag.hashCode()%16);
        System.out.println(flag1.hashCode()%16);
    }
}
//HashSet
//HashTable
//HashMap
//ConcurenthashMap
//LinkedHashSet
//LinkedHashMap