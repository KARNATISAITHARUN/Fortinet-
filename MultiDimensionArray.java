package com.fortinet;

public class MultiDimensionArray {
	  // This is a provided function, Assume it works
    public static Long getValue(int... indexOfDimension) {
        //... 
        return 0L;
    }

    public static Long sum(MultiDimensionArray mArray, int[] lengthOfDeminsion) {
        int dimlen = lengthOfDeminsion.length;
        int[] data = new int[dimlen];
        int s = dimlen - 2;
        Long sum = 0L;
        do {
            int datdim=data[dimlen - 1];
            for (datdim = 0; datdim < lengthOfDeminsion[dimlen - 1]; datdim++) {
                sum = sum + getValue(data);
            }
            while (s >= 0 && +data[s] == lengthOfDeminsion[s]) {
                data[s] = 0;
                s--;
            }
            if (s >= 0) {
                s = dimlen - 2;
            }
        } while (s >= 0);
        System.out.println(sum);
        return sum;
    }

}
