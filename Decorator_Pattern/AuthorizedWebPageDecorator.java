package Decorator_Pattern;

class AuthorizedWebPageDecorator implements WebPage {
    private WebPage page;

    public AuthorizedWebPageDecorator(WebPage page) {
        this.page = page;
    }

    public void display() {

        if (isUserAuthorized()) {
            page.display();
        } else {
            System.out.println("Unauthorized access: You need to be logged in to view this page.");
        }
    }

    private boolean isUserAuthorized() {
        return true;
    }
}
