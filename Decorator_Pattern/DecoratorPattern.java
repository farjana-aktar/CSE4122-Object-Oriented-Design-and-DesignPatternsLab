package Decorator_Pattern;

public class DecoratorPattern {
    public static void main(String[] args) {


        WebPage basicPage = new BasicWebPage("This is a basic web page");

        WebPage authorizedPage = new AuthorizedWebPageDecorator(basicPage);
        WebPage paginatedPage = new PaginatedWebPageDecorator(basicPage, 10);

        System.out.println("Displaying authorized page:");
        authorizedPage.display();

        System.out.println("\nDisplaying paginated page:");
        paginatedPage.display();
    }
}

