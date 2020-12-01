public class Chess {
    public static void makeBoard() {
        for (int i = 0; i<8; i++) {
            String s = "";
            for (int j = 0; j < 4; j++ ){
                s += "% ";
            }
            s = i % 2 == 0 ? s : " " + s;
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        makeBoard();
    }
}