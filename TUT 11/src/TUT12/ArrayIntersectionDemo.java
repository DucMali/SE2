package TUT12;

import java.util.HashSet;

public class ArrayIntersectionDemo {
    static HashSet<Integer> intersection(HashSet<Integer> A, HashSet<Integer> B){
        HashSet<Integer> C = new HashSet<>();
        if(A.size()>B.size()){
            HashSet<Integer> D = A;
            A=B;
            B=D;
        }
        for(int x: A){
            if(B.contains(x)){
                C.add(x);
            }
        }
        return C;
    }

    public static void main(String[] args) {
        HashSet<Integer> A= new HashSet<>();
        A.add(2);
        A.add(4);
        A.add(11);
        A.add(9);
        A.add(33);
        A.add(8);
        A.add(7);
        System.out.print("Elements of A : ");
        for(int a: A){
            System.out.print(a+ " ");
        }
        System.out.println();

        HashSet<Integer> B= new HashSet<>();
        B.add(3);
        B.add(4);
        B.add(33);
        B.add(7);
        B.add(22);
        B.add(50);
        System.out.print("Elements of B : ");
        for(int b: B){
            System.out.print(b + " ");
        }
        System.out.println();


        System.out.print("Common elements: ");
        for(int c: intersection(A,B)){
            System.out.print(c+" ");
        }
    }
}
