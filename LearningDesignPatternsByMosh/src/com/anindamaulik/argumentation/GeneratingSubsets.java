//package com.anindamaulik.argumentation;
//
///*
//https://www.geeksforgeeks.org/finding-all-subsets-of-a-given-set-in-java/
// */
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class GeneratingSubsets {
//    // Print all subsets of given set[]
//    static void printSubsets(char set[])
//    {
//        List<String> listContainingTheSubsets = new ArrayList<String>();
//        int n = set.length;
//
//        // Run a loop for printing all 2^n
//        // subsets one by one
//        for (int i = 0; i < (1<<n); i++)
//        {
//            System.out.print("{ ");
//
//            // Print current subset
//            for (int j = 0; j < n; j++)
//
//                // (1<<j) is a number with jth bit 1
//                // so when we 'and' them with the
//                // subset number we get which numbers
//                // are present in the subset and which
//                // are not
//                if ((i & (1 << j)) > 0)
//
//
//                    System.out.print(set[j] + ",");
//
//
//            System.out.printf("}");
//        }
//
//    }
////    public static  generatingSubset()
////    {
////        char set[] = {'a', 'b', 'c','d','e'};
////        return GeneratingSubsets.printSubsets(set);
////
////
////    }
//}
//
