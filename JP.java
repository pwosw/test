import java.util.Scanner;

public class JP {
    static Scanner a = new Scanner(System.in);
    public static void main(String[] args) {
        String point = a.nextLine();
        int count = 1;
        for (int i = 0;i<point.length();i++){
            int num = Character.getNumericValue(point.charAt(i));
            System.out.print(num);
            count *= num;
            if (i<point.length()-1){
                System.out.print("*");
            }
        }
        System.out.print("="+count);
















  }
  }      
// public class JPMain {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.println("請輸入一個長度不超過50字元的字串，此字串均為小寫字母：");
//         String input = scanner.nextLine();

//         char[] charArray = input.toCharArray();
//         int[] frequency = new int[26]; // 26個字母的頻率表，a-z

//         // 計算字母頻率
//         for (char c : charArray) {
//             if (Character.isLetter(c)) {
//                 frequency[c - 'a']++;
//             }
//         }

//         // 找出出現最多次的字母及其出現次數
//         char mostFrequentChar = ' ';
//         int maxFrequency = 0;
//         for (int i = 0; i < 26; i++) {
//             if (frequency[i] > maxFrequency) {
//                 maxFrequency = frequency[i];
//                 mostFrequentChar = (char) (i + 'a');
//             }
//         }

//         System.out.println("該字串出現最多次的英文字母為：" + mostFrequentChar);
//         System.out.println("出現的次數為：" + maxFrequency);
//     }
// }

























// import java.util.Scanner;

// public class JP {
//     static Scanner a = new Scanner(System.in);
//     public static void main(String[] args) {
//             int s = a.nextInt();
//             int s2 = a.nextInt();
//             int s3 = a.nextInt();
//             int s4 = a.nextInt();
//             int s5 = a.nextInt();
//             int q[] ={s,s2,s3,s4,s5};
//             int ans = compute(q);
//             System.out.println(ans);
    
//         }
//         public static int compute(int q[]){
//         int max=q[0];
//         for(int i=1;i<q.length;i++){
//             if(q[i]>max){
//                 max=q[i];
//             }
//         }
//         return max;
//     }
// }
 

//System.out.printf("%d+%d+%d=%.0f\n",s,x,c,p);
//System.out.printf("result=%.2f",prime);
//(s<0 && s>100){System.out.println("error");}
//    if (s<0 || s>100){System.out.println("error");}
//else if (0< s && s <=60){System.out.println(s+5);}
//else if (100> s && s >60){ System.out.println(s+10);}
// int s = a.nextInt();
// int x = a.nextInt();
// String c = a.next();
// int ans=compute(s);
// for(int i = s;i>=1;i--){
//     System.out.println("fib(" +i+ ")="+compute(i));
// }

// }
// public static int compute(int k){
// if(k==0){
//     return 0;
// }
// else if(k==1){
//     return 1;
// }
// else {
//     return compute(k-1)+compute(k-2);
    
// }
// }

    //     int Ans = compute(n);
    //     System.out.println(Ans);

    // }
    // public static int compute(int n){
    //     int total = 0;
    //     for (int i = 1;i<=n;i++){
    //         int a = i/100;
    //         int b = (i%100)/10;
    //         int c = (i%100)%10;
    //         int count = 0;
    //         if (0<i&&i<10){
    //             count = c;
    //         }
    //         else if(10<=i&&i<100){
    //             count = (b*b)+(c*c);
    //         }
    //         else if (100<=i&&i<1000){
    //             count = (a*a*a)+(b*b*b)+(c*c*c);
    //         }
    //         if (i==count){
    //             System.out.println(i);
    //             total += i; 
    //         }
    //     }
    //     return total;
    // }