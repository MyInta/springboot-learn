package tencent;


import java.util.Scanner;

public class Main {

/*
    public static void checkN(int n) {
        if(1>n||2000>n) {
            try {
                throw new Exception();
            } catch (Exception e) {
            }
        }
    }
    public static void checkCard(int n) {
        if(n!=0&n!=1&n!=2) {
            try {
                throw new Exception();
            } catch (Exception e) {
            }
        }
    }

    public static int[] getInt(String str){
        String[] strs = str.split(" ");
        int[] msgs = new int[strs.length];
        int i = 0;
        for(String temp:strs) {
            msgs[i] = Integer.parseInt(temp);
            i++;
        }
        return msgs;
    }

    public static int sum(int[] msgs,int n,int m){
        int i = 0;
        for(int temp:msgs){
            checkCard(temp);
            i = n*(n-1);
            m--;
            if(m<=0){
                break;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int[] msgs = getInt(str);
        int n = msgs[0];
        int m = msgs[1];
        checkN(n);
        checkN(m);
        str = scanner.nextLine();
        msgs = getInt(str);
        if(msgs.length!=n){
            try {
                throw new Exception();
            } catch (Exception e) {
            }
        }
        int x = sum(msgs,n,m);
        System.out.println(x);
    }
*/

}
