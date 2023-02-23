package org.example.sumofcubes;

public class SumOfCubes {
    public long sumCubes(long n)
    {
        long sum=0;
        for(long i =1 ; i<=n; i++){
            sum+=i*i*i;
        }
        return sum;
    }
}