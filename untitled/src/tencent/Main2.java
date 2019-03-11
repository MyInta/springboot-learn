package tencent;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author inta
 * @date 2019/3/9
 * @describe
 */
public class Main2 {

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

    public static int sum(int n,List<Integer> msgs){
        int temp = 0;
        List<Integer> temps = new ArrayList<>();
        for(int i=0;i<n;i++){
            temps.add(i+1);
        }

        for(int msg:msgs){
            for(int i=0;i<temps.size();i++){
                if (msg == temps.get(i)) {
                    temp++;
                    temps.remove(i);
                    break;
                }
            }
        }
        return temp;
    }

    public static List<Integer> toList(int[] msgs){
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<msgs.length;i++){
            list.add(msgs[i]);
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        List<Integer> sumList = new ArrayList<>();
        int[] msgs = getInt(str);
        int n = msgs[0];
        int m = msgs[1];

        str = scanner.nextLine();
        msgs = getInt(str);
        List<Integer> list = toList(msgs);
        int x = sum(m,list);
        sumList.add(x);
        for(int i=0;i<msgs.length-n;i++){
            list.remove(0);
            int k = sum(m,list);
            if(k<x){
                x = k;
            }
        }
        System.out.println(x);
    }
}
