package uber;

/**
 * Created by makoto on 25/06/17.
 */
public class SlideWindow {

    private String input;
    private int left;
    private int right;


    public SlideWindow(String input, int left, int right) {
        this.input = input;
        this.left = left;
        this.right = right;
    }

    public String getKeyByWindow(){
        return input.substring(left, right);
    }
    public void increment(){
        left++;
        right++;
    }

    public int getLeft() {
        return left;
    }

    public int getRight() {
        return right;
    }
}
