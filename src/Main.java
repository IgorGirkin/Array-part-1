public class Main {
    public static void main(String[] args) {
        int[] weidhts = {90,91,93,92,85,87,88,89,0,0,0,0};
        weidhts[0]=90;
        int januaryWeigtht=weidhts[0];
        System.out.println(weidhts[0]);
        System.out.println(januaryWeigtht);
        int january=0;
        System.out.println(weidhts[january]);
        for (int i = 0; i < weidhts.length; i++) {
            System.out.println(weidhts[i]);
        }
    }
}