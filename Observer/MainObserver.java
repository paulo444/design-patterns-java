package Observer;

class MainObserver{
    public static void main(String[] args){
        Employee prodEmployee1 = new Employee("Prod Employee 1");
        Employee prodEmployee2 = new Employee("Prod Employee 2");
        Employee prodEmployee3 = new Employee("Prod Employee 3");
        Employee salesEmployee1 = new Employee("Sales Employee 1");
        Employee salesEmployee2 = new Employee("Sales Employee 2");
        Employee salesEmployee3 = new Employee("Sales Employee 3");

        ChurrosNews churrosNews = new ChurrosNews();
        SalesChurrosNews salesChurrosNews = new SalesChurrosNews();

        churrosNews.subscribeObserver(prodEmployee1);
        churrosNews.subscribeObserver(prodEmployee2);
        churrosNews.subscribeObserver(prodEmployee3);
        churrosNews.subscribeObserver(salesEmployee1);
        churrosNews.subscribeObserver(salesEmployee2);
        churrosNews.subscribeObserver(salesEmployee3);

        salesChurrosNews.subscribeObserver(salesEmployee1);
        salesChurrosNews.subscribeObserver(salesEmployee2);
        salesChurrosNews.subscribeObserver(salesEmployee3);

        churrosNews.notifyObservers("A trabajar!");
        System.out.println();
        salesChurrosNews.notifyObservers("A trabajar los de ventas!");
    }
}