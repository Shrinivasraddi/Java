package basics.Numerical;

public class Triplet_Sum {
    public static void main(String[] args) {
        int[] a= {0,1,7,3,-10};
        Triplet_Sum r= new Triplet_Sum();
        System.out.println(r.triplet(a));
    }
    public int triplet(int[] a){
        int n= a.length;

        for (int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<i+3 && j<n;j++){
                sum+=a[j];
                if (sum==0 && j==i+2)
                    return 1;
            }

        }
        return 0;
    }
}
