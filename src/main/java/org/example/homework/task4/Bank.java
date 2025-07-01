package org.example.homework.task4;

class Bank {
    public static void main(String [] args){
        // Создаю объекты класса User
        User user1 = new User(5001L, "Элис", "Вандербильт");
        User user2 = new User(5002L, "Марк", "Дэвенпорт");
        User user3 = new User(5003L, "София", "Бэнкс");
        User user4 = new User(5004L, "Лео", "Морган");
        User user5 = new User(5005L, "Виктория", "Стоун");
        User user6 = new User(5006L, "Дэвид", "Рокфеллер");

        // Создаю аккаунты для юзеров и записываю их в массив аккаунтов
        Account[] accounts = {
                new Account(5001L, 1089L, user1),
                new Account(5006L, 11L, user6),
                new Account(5004L, 88000000L, user4),
                new Account(5003L, 106789L, user3),
                new Account(5002L, 9L, user2),
                new Account(5005L, 13L, user5)
        };

        AccountService service = new AccountServiceImpl(accounts);
        Account account = service.findAccountByOwnerId(5001L);
        System.out.println("Found account: Name " + account.getOwner().getFirstName()
                + ", LastName " + account.getOwner().getLastName()
                + ", Owner id " + account.getOwner().getId());

        long balance = 100000;
        long countAccountsExceedingBalance = service.countAccountsWithBalanceGreaterThan(balance);
        System.out.println("Found " + countAccountsExceedingBalance + " accounts with balance exceeding " + balance);
    }
}
