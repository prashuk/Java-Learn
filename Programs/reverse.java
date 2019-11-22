import java.util.HashMap;
import java.util.Map;


class reverse {
    public static void main(String[] args) {
        String x = "asdasd sdf sdf sdf ffg";
        String[] x1 = x.split(" ");
        String ans = "";
        for(int i = 0; i < x1.length; i++) {
            ans = ans + reversS(x1[i]) + " ";
        }
        
        System.out.println(ans);
    }

    public static String reversS(String str) {
        
        char[] arr = str.toCharArray();
        for(int i = 0; i < arr.length/2; i++) {
            char temp = arr[i];
            arr[i] = arr[(arr.length - 1) - i];
            arr[(arr.length - 1) - i] = temp;
        }
        return new String(arr);
    }
}