import java.util.*;


public class PuzzleJava{
    public static ArrayList<Integer>printarray(){
        int[] arr= {3,5,1,2,7,9,8,13,25,32};
        int sum = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
            if(arr[i]>10){
                list.add(arr[i]); 
            }  
        }
        System.out.println(sum);
        return list;
    }

    public static ArrayList<String>shuffling(){
        String[] arrs={"Nancy","Jinichi","Fujibayashi","Momochi","Ishikawa"};
        ArrayList<String> namelist = new ArrayList();
        List list = Arrays.asList(arrs);
        Collections.shuffle(namelist);
        for(String arr : arrs){
            System.out.println(arr);
            if(arr.length()>5){
                namelist.add(arr);
            }
        } return namelist;
    }

    public static void shufflealpha(){
        String[] alpharrs= {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        Collections.shuffle(Arrays.asList(alpharrs));
        String first = alpharrs[0];
        System.out.println(alpharrs[25]);
        System.out.println(first);
        if(first == "a" || first=="e"||first=="u"||first=="i"||first=="o"){
            System.out.println("First letter is a vowel");
        }
    }
    public static int[] randomnumber(){
        int[] arr= new int[10];
        Random rand = new Random();
        for(int i=0; i<10; i++){
            arr[i] = rand.nextInt(46)+55;
        }
        return arr;
    }
    public static int[] sortrandomnumber(){
        int[] arr= randomnumber();
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[0]);
        System.out.println(arr[9]);
        return arr;
    }
    public static String randomestring(){
        Random rand = new Random();
        String[] alpha = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        String str="";
        for(int i=0; i<5; i++){
            int random = rand.nextInt(26);
            str += alpha[random];
        }
        return str;
    }
    public static String[] randomstring10(){
        String[] stringlist = new String[10];
        for(int i=0; i<10; i++){
            stringlist[i] = randomestring();
        }
        return stringlist;
    }
       
    //     }
    //     return newarr;
    public static void main(String[] args) {
        // System.out.println(printarray());
        // System.out.println(shuffling());
        // shufflealpha();
        // System.out.println(Arrays.toString(randomnumber()));
        // sortrandomnumber();
        // System.out.println(randomestring());
        System.out.println(Arrays.toString(randomstring10()));
 }
}

    