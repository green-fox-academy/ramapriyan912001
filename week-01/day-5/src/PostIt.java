public class PostIt {
    public String backgroundColour;
    public String text;
    public String textColour;

    public PostIt(String backgroundColour, String text, String textColour) {
        this.backgroundColour = backgroundColour;
        this.text = text;
        this.textColour = textColour;
    }

    public static void main(String[] args) {
        PostIt postIt1 = new PostIt("Orange", "Idea 1", "Blue");
        PostIt postIt2 = new PostIt("Pink", "Awesome", "Black");
        PostIt postIt3 = new PostIt("Ywllow", "Superb", "Green");
    }

}