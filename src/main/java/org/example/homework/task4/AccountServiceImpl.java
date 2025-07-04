package org.example.homework.task4;

class AccountServiceImpl implements AccountService{
    // Поле для хранения массива аккаунтов, передается через конструктор
    private Account[] accounts;

    public AccountServiceImpl(Account[] accounts){
        this.accounts = accounts;
    }
  
    public AccountServiceImpl(Account[] accounts){
        this.accounts = accounts;
    }
  
    @Override
    public Account findAccountByOwnerId(long id) {
        for (Account account : accounts) {
            if(account.getOwner() != null && account.getId() == id) {
                return account;
            }
        }
        return null;
    }

    @Override
    public long countAccountsWithBalanceGreaterThan(long balance) {
        long count = 0;
        for(Account account : accounts) {
            if(account.getBalance() > balance) {
                count ++;
            }
        }
        return count;
    }
}
