public class Primes {
    public static void main(String[] args) {
        // Replace this statement with your code
        int n = Integer.parseInt(args[0]);
        int i=0, p=2;
        boolean[] arr = new boolean[n+1];
        for(i=2; i<n+1; i++){
            arr[i] = true;
        }
        arr[0] = false;
        arr[1] = false;
        while(p <= Math.sqrt(n)){
            for(i=p+1; i<n+1; i++){
                if(i % p ==0){
                    arr[i] = false;
                }
            }
            p++;
            while (arr[p]!=true){
                p++;
            }
        }
        for(i=0 ; i<n+1 ; i++){
            if(arr[i]){
                System.out.println(i);
            }
        }

    }
}