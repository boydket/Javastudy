package com.example.demo.mathexam;

public class BankApplication {
    Account[] ac;
    int top;

    BankApplication() {
        ac = new Account[100];
        top = 0;
    }


    public void Create(String num, String name, int balance) {
        ac[top] = new Account(num,name,balance);
        top++;
    }

    public void List() {
        for(int i=0; i<top; i++) {
            System.out.println(String.format("%s\t\t%s\t\t%s",
                    ac[i].getBankNumber(), ac[i].getName(), ac[i].getCurrent()));
        }
    }

    public boolean Depost(String num, int money) {
        for(int i=0; i<top; i++) {
            if(ac[i].getBankNumber().equals(num)) {
                ac[i].setCurrent(ac[i].getCurrent() + money);
                return true;
            }
        }
        return false;
    }

    public int Withdraw(String num, int money) { //0은 계좌 못찾음, 1은 예금액 부족, 2는 성공
        for(int i=0; i<top; i++) {
            if(ac[i].getBankNumber().equals(num)) {
                if(ac[i].getCurrent()<money) {
                    return 1;
                }
                else {
                    ac[i].setCurrent(ac[i].getCurrent()-money);
                    return 2;
                }
            }
        }
        return 0;
    }
}
