package com.example.demo.mathexam;

import java.util.ArrayList;
import java.util.List;

public class AccountService {
    /**
     * 계좌 배열 인스턴스 변수 (객체 프로퍼티, 인스턴스 필드)
     */
    private List<Account> accountList = new ArrayList<>();

    /**
     * 계좌 배열 깅리를 int 형으로 리턴한다
     * @return
     */
    public int size() {
        return this.accountList.size();
    }

    /**
     * 계좌 목록을 전체 삭제하고 Clear 한다.
     * clear Accounts all array elements. size will be 0.
     */
    public void clear() {
        this.accountList.clear();
    }

    public boolean addAccount(String name, String bankAccount, int money) {
        return this.accountList.add(new Account(name, bankAccount, money));
    }

    public boolean addAccount(Account account) {
        return this.accountList.add(account);
    }

    public List<Account> getAllAccount() {
        return this.accountList;
    }

    public boolean deposit(String bankAccount, int money) {
        Account account = this.findAccountByNumber(bankAccount);
        if ( account == null ) {
            return false;
        }
        account.setCurrent(account.getCurrent() + money);
        return true;
    }

    public boolean withdraw(String bankAccount, int money) {
        Account account = this.findAccountByNumber(bankAccount);
        if ( account == null ) {
            return false;
        }
        if ( account.getCurrent() >= money ) {
            account.setCurrent(account.getCurrent() - money);
            return true;
        } else {
            return false;
        }
    }

    public Account findAccountByNumber( String bankAccount ) {
        if ( bankAccount == null || bankAccount.isEmpty() ) {
            return null;
        }
        for ( Account account : accountList ) {
            if ( bankAccount.equals(account.getBankNumber()) ) {
                return account;
            }
        }
        return null;
    }
}
