package Decorator_Pattern;

class PaginatedWebPageDecorator implements WebPage {
    private WebPage page;
    private int itemsPerPage;

    public PaginatedWebPageDecorator(WebPage page, int itemsPerPage) {
        this.page = page;
        this.itemsPerPage = itemsPerPage;
    }

    public void display() {
        page.display();
        System.out.println("Pagination: Displaying " + itemsPerPage + " items per page");
    }
}
