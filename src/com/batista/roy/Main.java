package com.batista.roy;

public class Main {
    public static void main(String[] args) {
        System.out.println("JavaGit2018");
        System.out.println(new Main().addNumbers(5,8));
    }


    private int addNumbers(int i, int j){
        j = i + j;
        return j;

    }
}
