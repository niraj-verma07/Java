public class TrappingRainwater {

    public static int trapRainwater(int height[]){
        int n = height.length;
        // Calculate left max boundary
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for(int i =1; i<height.length; i++){
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }
        // Calculate right max boundary
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i= n-2;i>=0; i--){
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }

        //loop
        int trappedWater = 0;
        for(int i=0; i<n; i++){
            //waterlevel = min(leftmax bound, rightmax bound);
            int waterLevel = Math.min(leftMax[i], rightMax[i]);

            //trappedwater = waterlevel - height[i]
            trappedWater += waterLevel - height[i];
        }

        return trappedWater;

    }

    //2nd Way of trappingWater
    public static int findTotalWater(int arr[], int n){
        int lmax[] = new int[n];
        int max=0;
        for(int i=0;i<n; i++){
            max = Math.max(max, arr[i]);
            lmax[i] = max;
        }

        int rmax[] = new int[n];
        max =0;
        for(int i = n-1; i>=0; i--){
            max = Math.max(max, arr[i]);
            rmax[i] = max;
        }

        int totalWater =0;
        for(int i=0; i<n; i++){
            int lb=lmax[i];
            int rb = rmax[i];

            int min = Math.min(lb, rb);
            int currentWater = min - arr[i];
            totalWater = totalWater + currentWater;
        }

        return totalWater;

    }

    public static void main(String[] args) {
        // int height[] = {4,2,0,6,3,2,5};
        // System.out.println(trapRainwater(height));

        int arr[] = {3,0,2,0,4};
        int n = arr.length;
        System.out.println(findTotalWater(arr, n));;
    }
}
