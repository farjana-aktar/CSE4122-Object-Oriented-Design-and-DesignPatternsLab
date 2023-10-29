package Decorator_Pattern;

class BasicWebPage implements WebPage {
    private String content;

    public BasicWebPage(String content) {
        this.content = content;
    }

    public void display() {
        System.out.println("Basic Web Page: " + content);
    }
}
