import java.util.ArrayList;

public class RandomArray {
    public static void main(String[] args) {
        ArrayList<Integer> rand = new ArrayList<>();
        int a = rand.size();
        while (a <= 10){
            rand.add((int) Math.random());
        }
    }
}
