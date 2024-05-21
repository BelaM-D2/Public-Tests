public class VariousSortingAlgorithmsTests {
    private static final String RESET = "\u001B[0m";
    private static final String BLACK = "\u001B[30m";
    private static final String RED = "\u001B[31m";
    private static final String GREEN = "\u001B[32m";
    private static final String YELLOW = "\u001B[33m";
    private static final String BLUE = "\u001B[34m";
    private static final String MAGENTA = "\u001B[35m";
    private static final String CYAN = "\u001B[36m";
    private static final String WHITE = "\u001B[37m";

    public static void main(String[] args) {
        executeTests();
    }

    private static void executeTests() {
        System.out.println();
        System.out.println(GREEN + "starting tests" + RESET);
        System.out.println();


        testPivotFinder();
        testQuicksort();
        testMergesort();
        testSelectionsort();
        testDualPivotFinder();
        testDualPivotQuicksort();


        System.out.println();
        System.out.println(GREEN + "tests executed" + RESET);
        System.out.println();
    }

    private static void testPivotFinder() {
        System.out.println();
        System.out.println(GREEN + "starting PivotFinder tests" + RESET);


        testPivotLast();
        testPivotRandom();
        testPivotMid();
        testPivotMedianFront();
        testPivotMedianDistributed();


        System.out.println(GREEN + "PivotFinder tests executed" + RESET);
        System.out.println();
    }

    private static void testPivotLast() {
        System.out.println();
        System.out.println(GREEN + "starting PivotLast tests" + RESET);


        System.out.println(YELLOW + "Not implemented yet" + RESET);


        System.out.println(GREEN + "PivotLast tests executed" + RESET);
        System.out.println();
    }

    private static void testPivotRandom() {
        System.out.println();
        System.out.println(GREEN + "starting PivotRandom tests" + RESET);


        System.out.println(YELLOW + "Not implemented yet" + RESET);


        System.out.println(GREEN + "PivotRandom tests executed" + RESET);
        System.out.println();
    }

    private static void testPivotMid() {
        System.out.println();
        System.out.println(GREEN + "starting PivotMid tests" + RESET);


        System.out.println(YELLOW + "Not implemented yet" + RESET);


        System.out.println(GREEN + "PivotMid tests executed" + RESET);
        System.out.println();
    }

    private static void testPivotMedianFront() {
        System.out.println();
        System.out.println(GREEN + "starting PivotMedianFront tests" + RESET);


        System.out.println(YELLOW + "Not implemented yet" + RESET);


        System.out.println(GREEN + "PivotMedianFront tests executed" + RESET);
        System.out.println();
    }

    private static void testMergesort() {
        System.out.println();
        System.out.println(GREEN + "starting Mergesort tests" + RESET);


        System.out.println(YELLOW + "Not implemented yet" + RESET);


        System.out.println(GREEN + "Mergesort tests executed" + RESET);
        System.out.println();
    }

    private static void testSelectionsort() {
        System.out.println();
        System.out.println(GREEN + "starting Selectionsort tests" + RESET);


        System.out.println(YELLOW + "Not implemented yet" + RESET);


        System.out.println(GREEN + "Selectionsort tests executed" + RESET);
        System.out.println();
    }

    private static void testDualPivotFinder() {
        System.out.println();
        System.out.println(GREEN + "starting DualPivotFinder tests" + RESET);


        testDualPivotFirstLast();
        testDualPivotRandom();
        testDualPivotMedianFront();
        testDualPivotDistributed();


        System.out.println(GREEN + "DualPivotFinder tests executed" + RESET);
        System.out.println();
    }

    private static void testDualPivotDistributed() {
        int[] indexedArrayZeroToNine = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] smallIndexedArrayZeroToOne = new int[] {0, 1};
        int[] bigIndexedArrayZeroToTwentyNine = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29};
        int[] randomArrayLengthTen = new int[] {9, 1, 8, 5, 2, 3, 5, 1, 0, 7};


        System.out.println();
        System.out.println(GREEN + "starting DualPivotDistributed tests" + RESET);


        testDualPivotDistributed(indexedArrayZeroToNine, 0, 9, 3, new int[] {0, 8});
        testDualPivotDistributed(indexedArrayZeroToNine, 0, 9, 5, new int[] {2, 6});
        testDualPivotDistributed(indexedArrayZeroToNine, 0, 9, 2, new int[] {0,9});
        testDualPivotDistributed(indexedArrayZeroToNine, 0, 9, 4, new int[] {3,6});
        testDualPivotDistributed(indexedArrayZeroToNine, 0, 9, 10, new int[] {3,6});
        testDualPivotDistributed(indexedArrayZeroToNine, 0, 9, 100, new int[] {3,6});
        testDualPivotDistributed(indexedArrayZeroToNine, 0, 9, 8, new int[] {2,5});
        testDualPivotDistributed(indexedArrayZeroToNine, 0, 9, 7, new int[] {2,4});
        testDualPivotDistributed(indexedArrayZeroToNine, 0, 9, 9, new int[] {2,6});

        testDualPivotDistributed(indexedArrayZeroToNine, 1, 8, 3, new int[] {1,7});
        testDualPivotDistributed(indexedArrayZeroToNine, 6, 9, 2, new int[] {6,9});
        testDualPivotDistributed(indexedArrayZeroToNine, 4, 9, 4, new int[] {5,6});
        testDualPivotDistributed(indexedArrayZeroToNine, 1, 8, 10, new int[] {3,6});
        testDualPivotDistributed(indexedArrayZeroToNine, 3, 5, 100, new int[] {3,5});
        testDualPivotDistributed(indexedArrayZeroToNine, 1, 7, 8, new int[] {3,5});
        testDualPivotDistributed(indexedArrayZeroToNine, 8, 9, 7, new int[] {8,9});

        testDualPivotDistributed(indexedArrayZeroToNine, 5, 8, 3, new int[] {5,7});
        testDualPivotDistributed(indexedArrayZeroToNine, 6, 9, 3, new int[] {6,8});
        testDualPivotDistributed(indexedArrayZeroToNine, 7, 8, 3, new int[] {7,8});

        testDualPivotDistributed(indexedArrayZeroToNine, 0, 6, 3, new int[] {0,6});
        testDualPivotDistributed(indexedArrayZeroToNine, 0, 7, 3, new int[] {0,6});
        testDualPivotDistributed(indexedArrayZeroToNine, 0, 8, 3, new int[] {0,8});
        testDualPivotDistributed(indexedArrayZeroToNine, 1, 5, 3, new int[] {1,5});
        testDualPivotDistributed(indexedArrayZeroToNine, 1, 7, 3, new int[] {1,7});

        testDualPivotDistributed(indexedArrayZeroToNine, 5, 8, 5, new int[] {6,7});
        testDualPivotDistributed(indexedArrayZeroToNine, 6, 9, 5, new int[] {7,8});
        testDualPivotDistributed(indexedArrayZeroToNine, 7, 8, 5, new int[] {7,8});

        testDualPivotDistributed(indexedArrayZeroToNine, 0, 6, 5, new int[] {1,3});
        testDualPivotDistributed(indexedArrayZeroToNine, 0, 7, 5, new int[] {1,3});
        testDualPivotDistributed(indexedArrayZeroToNine, 0, 8, 5, new int[] {2,6});
        testDualPivotDistributed(indexedArrayZeroToNine, 1, 5, 5, new int[] {2,4});
        testDualPivotDistributed(indexedArrayZeroToNine, 1, 7, 5, new int[] {2,4});

        testDualPivotDistributed(smallIndexedArrayZeroToOne, 0, 1, 2, new int[] {0, 1});
        testDualPivotDistributed(smallIndexedArrayZeroToOne, 0, 1, 3, new int[] {0, 1});

        testDualPivotDistributed(bigIndexedArrayZeroToTwentyNine, 0, 29, 3, new int[] {0,28});
        testDualPivotDistributed(bigIndexedArrayZeroToTwentyNine, 0, 29, 5, new int[] {7,21});
        testDualPivotDistributed(bigIndexedArrayZeroToTwentyNine, 0, 29, 2, new int[] {0,29});
        testDualPivotDistributed(bigIndexedArrayZeroToTwentyNine, 0, 29, 4, new int[] {9,18});
        testDualPivotDistributed(bigIndexedArrayZeroToTwentyNine, 0, 29, 10, new int[] {9,18});
        testDualPivotDistributed(bigIndexedArrayZeroToTwentyNine, 0, 29, 100, new int[] {9,20});
        testDualPivotDistributed(bigIndexedArrayZeroToTwentyNine, 0, 29, 8, new int[] {8,20});
        testDualPivotDistributed(bigIndexedArrayZeroToTwentyNine, 0, 29, 7, new int[] {8,16});
        testDualPivotDistributed(bigIndexedArrayZeroToTwentyNine, 0, 29, 9, new int[] {6,18});

        testDualPivotDistributed(bigIndexedArrayZeroToTwentyNine, 21, 28, 3, new int[] {21,27});
        testDualPivotDistributed(bigIndexedArrayZeroToTwentyNine, 16, 19, 2, new int[] {16,19});
        testDualPivotDistributed(bigIndexedArrayZeroToTwentyNine, 4, 9, 4, new int[] {5,6});
        testDualPivotDistributed(bigIndexedArrayZeroToTwentyNine, 1, 8, 10, new int[] {3,6});
        testDualPivotDistributed(bigIndexedArrayZeroToTwentyNine, 13, 25, 100, new int[] {17,21});
        testDualPivotDistributed(bigIndexedArrayZeroToTwentyNine, 1, 27, 8, new int[] {7,16});
        testDualPivotDistributed(bigIndexedArrayZeroToTwentyNine, 18, 19, 7, new int[] {18,19});
        testDualPivotDistributed(bigIndexedArrayZeroToTwentyNine, 9, 29, 9, new int[] {13,21});

        testDualPivotDistributed(bigIndexedArrayZeroToTwentyNine, 18, 28, 3, new int[] {18,28});
        testDualPivotDistributed(bigIndexedArrayZeroToTwentyNine, 19, 29, 3, new int[] {19,29});
        testDualPivotDistributed(bigIndexedArrayZeroToTwentyNine, 5, 8, 3, new int[] {5,7});
        testDualPivotDistributed(bigIndexedArrayZeroToTwentyNine, 6, 29, 3, new int[] {6,28});
        testDualPivotDistributed(bigIndexedArrayZeroToTwentyNine, 7, 18, 3, new int[] {7,17});

        testDualPivotDistributed(bigIndexedArrayZeroToTwentyNine, 0, 26, 3, new int[] {0,26});
        testDualPivotDistributed(bigIndexedArrayZeroToTwentyNine, 0, 27, 3, new int[] {0,26});
        testDualPivotDistributed(bigIndexedArrayZeroToTwentyNine, 0, 28, 3, new int[] {0,28});
        testDualPivotDistributed(bigIndexedArrayZeroToTwentyNine, 1, 25, 3, new int[] {1,25});
        testDualPivotDistributed(bigIndexedArrayZeroToTwentyNine, 1, 17, 3, new int[] {1,17});

        testDualPivotDistributed(bigIndexedArrayZeroToTwentyNine, 18, 28, 5, new int[] {20,24});
        testDualPivotDistributed(bigIndexedArrayZeroToTwentyNine, 5, 18, 5, new int[] {8,14});
        testDualPivotDistributed(bigIndexedArrayZeroToTwentyNine, 26, 29, 5, new int[] {27,28});
        testDualPivotDistributed(bigIndexedArrayZeroToTwentyNine, 7, 11, 5, new int[] {8,10});

        testDualPivotDistributed(bigIndexedArrayZeroToTwentyNine, 0, 6, 5, new int[] {1,3});
        testDualPivotDistributed(bigIndexedArrayZeroToTwentyNine, 0, 7, 5, new int[] {1,3});
        testDualPivotDistributed(bigIndexedArrayZeroToTwentyNine, 0, 8, 5, new int[] {2,6});
        testDualPivotDistributed(bigIndexedArrayZeroToTwentyNine, 1, 5, 5, new int[] {2,4});
        testDualPivotDistributed(bigIndexedArrayZeroToTwentyNine, 1, 7, 5, new int[] {2,4});

        testDualPivotDistributed(randomArrayLengthTen, 0, 9, 3, new int[] {8,0});
        testDualPivotDistributed(randomArrayLengthTen, 0, 9, 5, new int[] {4,2});
        testDualPivotDistributed(randomArrayLengthTen, 1, 9, 5, new int[] {1,3});
        testDualPivotDistributed(randomArrayLengthTen, 0, 9, 2, new int[] {9,0});
        testDualPivotDistributed(randomArrayLengthTen, 0, 9, 4, new int[] {3,9});
        testDualPivotDistributed(randomArrayLengthTen, 0, 9, 10, new int[] {4,3});
        testDualPivotDistributed(randomArrayLengthTen, 0, 9, 100, new int[] {4,3});
        testDualPivotDistributed(randomArrayLengthTen, 0, 9, 8, new int[] {4,3});
        testDualPivotDistributed(randomArrayLengthTen, 0, 9, 7, new int[] {5,3});
        testDualPivotDistributed(randomArrayLengthTen, 0, 9, 9, new int[] {1,3});

        testDualPivotDistributed(randomArrayLengthTen, 1, 8, 3, new int[] {1,4});
        testDualPivotDistributed(randomArrayLengthTen, 6, 9, 2, new int[] {6,9});
        testDualPivotDistributed(randomArrayLengthTen, 4, 9, 4, new int[] {4,5});
        testDualPivotDistributed(randomArrayLengthTen, 1, 8, 10, new int[] {1,3});
        testDualPivotDistributed(randomArrayLengthTen, 3, 5, 100, new int[] {4,3});
        testDualPivotDistributed(randomArrayLengthTen, 1, 7, 8, new int[] {4,3});
        testDualPivotDistributed(randomArrayLengthTen, 8, 9, 7, new int[] {8,9});

        testDualPivotDistributed(randomArrayLengthTen, 5, 8, 3, new int[] {7,6});
        testDualPivotDistributed(randomArrayLengthTen, 6, 9, 3, new int[] {8,6});
        testDualPivotDistributed(randomArrayLengthTen, 7, 8, 3, new int[] {8,7});

        testDualPivotDistributed(randomArrayLengthTen, 0, 6, 3, new int[] {3,0});
        testDualPivotDistributed(randomArrayLengthTen, 0, 7, 3, new int[] {3,0});
        testDualPivotDistributed(randomArrayLengthTen, 0, 8, 3, new int[] {8,0});
        testDualPivotDistributed(randomArrayLengthTen, 1, 5, 3, new int[] {1,3});
        testDualPivotDistributed(randomArrayLengthTen, 1, 7, 3, new int[] {1,4});

        testDualPivotDistributed(randomArrayLengthTen, 5, 8, 5, new int[] {7,5});
        testDualPivotDistributed(randomArrayLengthTen, 6, 9, 5, new int[] {7,6});
        testDualPivotDistributed(randomArrayLengthTen, 7, 8, 5, new int[] {8,7});

        testDualPivotDistributed(randomArrayLengthTen, 0, 6, 5, new int[] {4,2});
        testDualPivotDistributed(randomArrayLengthTen, 0, 7, 5, new int[] {4,2});
        testDualPivotDistributed(randomArrayLengthTen, 0, 8, 5, new int[] {4,2});
        testDualPivotDistributed(randomArrayLengthTen, 1, 5, 5, new int[] {4,3});
        testDualPivotDistributed(randomArrayLengthTen, 1, 7, 5, new int[] {4,3});


        System.out.println(GREEN + "DualPivotDistributed tests executed" + RESET);
        System.out.println();
    }

    private static void testDualPivotDistributed(int[] array, int from, int to, int numberOfConsideredElements, int[] expected) {
        try {
            if(array == null) System.out.println(YELLOW + "Invalid test parameter: array can not be null" + RESET);
            if(array.length == 0) System.out.println(YELLOW + "Invalid test parameter: array can not be empty" + RESET);
            if(array.length < 2) System.out.println(YELLOW + "Invalid test parameter: array has to contain at least two elements" + RESET);
            if(from < 0 || from >= array.length) System.out.println(YELLOW + "Invalid test parameter: from can not be outside the array" + RESET);
            if(to < 0 || to >= array.length) System.out.println(YELLOW + "Invalid test parameter: to can not be outside the array" + RESET);
            if(from >= to) System.out.println(YELLOW + "Invalid test parameter: from can not be larger or equal than to" + RESET);
            if(numberOfConsideredElements <= 1) System.out.println(YELLOW + "Invalid test parameter: numberOfConsideredElements can not be below or equal to one" + RESET);
            if(expected == null) System.out.println(YELLOW + "Invalid test parameter: the expected value array can not be null" + RESET);
            if(expected.length != 2) System.out.println(YELLOW + "Invalid test parameter: the expected value array does not contain exactly two elements" + RESET);
            if(expected[0] < 0 || expected[0] >= array.length) System.out.println(YELLOW + "Invalid test parameter: the first expected value has to be within the array bounds" + RESET);
            if(expected[1] < 0 || expected[1] >= array.length) System.out.println(YELLOW + "Invalid test parameter: the second expected value has to be within the array bounds" + RESET);
            DualPivotFinder pv = DualPivotFinder.getMedianPivotDistributed(numberOfConsideredElements);
            int[] result = pv.findPivot(array, from, to);
            if(!Arrays.equals(result, expected)) System.out.println(RED + "Test with " + Arrays.toString(array) + " for values from = " + from + ", to = " + to + ", numberOfConsideredElements = " + numberOfConsideredElements + " failed. Expected " + Arrays.toString(expected) + " but got " + Arrays.toString(result) + RESET);
        } catch(IndexOutOfBoundsException e) {
            System.out.println(RED + "Test with " + Arrays.toString(array) + " for values from = " + from + ", to = " + to + ", numberOfConsideredElements = " + numberOfConsideredElements + " had an IndexOutOfBoundsException." + RESET);
        }
    }

    private static void testDualPivotMedianFront() {
        int[] indexedArrayZeroToNine = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] smallIndexedArrayZeroToOne = new int[] {0, 1};
        int[] bigIndexedArrayZeroToTwentyNine = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29};
        int[] randomArrayLengthTen = new int[] {9, 1, 8, 5, 2, 3, 5, 1, 0, 7};


        System.out.println();
        System.out.println(GREEN + "starting DualPivotMedianFront tests" + RESET);


        testDualPivotMedianFront(indexedArrayZeroToNine, 0, 9, 3, new int[] {0, 2});
        testDualPivotMedianFront(indexedArrayZeroToNine, 0, 9, 5, new int[] {1,3});
        testDualPivotMedianFront(indexedArrayZeroToNine, 0, 9, 2, new int[] {0,1});
        testDualPivotMedianFront(indexedArrayZeroToNine, 0, 9, 4, new int[] {1,2});
        testDualPivotMedianFront(indexedArrayZeroToNine, 0, 9, 10, new int[] {3,6});
        testDualPivotMedianFront(indexedArrayZeroToNine, 0, 9, 100, new int[] {3,6});
        testDualPivotMedianFront(indexedArrayZeroToNine, 0, 9, 8, new int[] {2,5});
        testDualPivotMedianFront(indexedArrayZeroToNine, 0, 9, 7, new int[] {2,4});
        testDualPivotMedianFront(indexedArrayZeroToNine, 0, 9, 9, new int[] {2,6});

        testDualPivotMedianFront(indexedArrayZeroToNine, 1, 8, 3, new int[] {1,3});
        testDualPivotMedianFront(indexedArrayZeroToNine, 6, 9, 2, new int[] {6,7});
        testDualPivotMedianFront(indexedArrayZeroToNine, 4, 9, 4, new int[] {5,6});
        testDualPivotMedianFront(indexedArrayZeroToNine, 1, 8, 10, new int[] {3,6});
        testDualPivotMedianFront(indexedArrayZeroToNine, 3, 5, 100, new int[] {3,5});
        testDualPivotMedianFront(indexedArrayZeroToNine, 1, 7, 8, new int[] {3,5});
        testDualPivotMedianFront(indexedArrayZeroToNine, 8, 9, 7, new int[] {8,9});

        testDualPivotMedianFront(indexedArrayZeroToNine, 5, 8, 3, new int[] {5,7});
        testDualPivotMedianFront(indexedArrayZeroToNine, 6, 9, 3, new int[] {6,8});
        testDualPivotMedianFront(indexedArrayZeroToNine, 7, 8, 3, new int[] {7,8});

        testDualPivotMedianFront(indexedArrayZeroToNine, 0, 6, 3, new int[] {0,2});
        testDualPivotMedianFront(indexedArrayZeroToNine, 0, 7, 3, new int[] {0,2});
        testDualPivotMedianFront(indexedArrayZeroToNine, 0, 8, 3, new int[] {0,2});
        testDualPivotMedianFront(indexedArrayZeroToNine, 1, 5, 3, new int[] {1,3});
        testDualPivotMedianFront(indexedArrayZeroToNine, 1, 7, 3, new int[] {1,3});

        testDualPivotMedianFront(indexedArrayZeroToNine, 5, 8, 5, new int[] {6,7});
        testDualPivotMedianFront(indexedArrayZeroToNine, 6, 9, 5, new int[] {7,8});
        testDualPivotMedianFront(indexedArrayZeroToNine, 7, 8, 5, new int[] {7,8});

        testDualPivotMedianFront(indexedArrayZeroToNine, 0, 6, 5, new int[] {1,3});
        testDualPivotMedianFront(indexedArrayZeroToNine, 0, 7, 5, new int[] {1,3});
        testDualPivotMedianFront(indexedArrayZeroToNine, 0, 8, 5, new int[] {1,3});
        testDualPivotMedianFront(indexedArrayZeroToNine, 1, 5, 5, new int[] {2,4});
        testDualPivotMedianFront(indexedArrayZeroToNine, 1, 7, 5, new int[] {2,4});

        testDualPivotMedianFront(smallIndexedArrayZeroToOne, 0, 1, 2, new int[] {0, 1});
        testDualPivotMedianFront(smallIndexedArrayZeroToOne, 0, 1, 3, new int[] {0, 1});

        testDualPivotMedianFront(bigIndexedArrayZeroToTwentyNine, 0, 29, 3, new int[] {0,2});
        testDualPivotMedianFront(bigIndexedArrayZeroToTwentyNine, 0, 29, 5, new int[] {1,3});
        testDualPivotMedianFront(bigIndexedArrayZeroToTwentyNine, 0, 29, 2, new int[] {0,1});
        testDualPivotMedianFront(bigIndexedArrayZeroToTwentyNine, 0, 29, 4, new int[] {1,2});
        testDualPivotMedianFront(bigIndexedArrayZeroToTwentyNine, 0, 29, 10, new int[] {3,6});
        testDualPivotMedianFront(bigIndexedArrayZeroToTwentyNine, 0, 29, 100, new int[] {9,20});
        testDualPivotMedianFront(bigIndexedArrayZeroToTwentyNine, 0, 29, 8, new int[] {2,5});
        testDualPivotMedianFront(bigIndexedArrayZeroToTwentyNine, 0, 29, 7, new int[] {2,4});
        testDualPivotMedianFront(bigIndexedArrayZeroToTwentyNine, 0, 29, 9, new int[] {2,6});

        testDualPivotMedianFront(bigIndexedArrayZeroToTwentyNine, 21, 28, 3, new int[] {21,23});
        testDualPivotMedianFront(bigIndexedArrayZeroToTwentyNine, 16, 19, 2, new int[] {16,17});
        testDualPivotMedianFront(bigIndexedArrayZeroToTwentyNine, 4, 9, 4, new int[] {5,6});
        testDualPivotMedianFront(bigIndexedArrayZeroToTwentyNine, 1, 8, 10, new int[] {3,6});
        testDualPivotMedianFront(bigIndexedArrayZeroToTwentyNine, 13, 25, 100, new int[] {17,21});
        testDualPivotMedianFront(bigIndexedArrayZeroToTwentyNine, 1, 27, 8, new int[] {3,6});
        testDualPivotMedianFront(bigIndexedArrayZeroToTwentyNine, 18, 19, 7, new int[] {18,19});
        testDualPivotMedianFront(bigIndexedArrayZeroToTwentyNine, 9, 29, 9, new int[] {11,15});

        testDualPivotMedianFront(bigIndexedArrayZeroToTwentyNine, 18, 28, 3, new int[] {18,20});
        testDualPivotMedianFront(bigIndexedArrayZeroToTwentyNine, 19, 29, 3, new int[] {19,21});
        testDualPivotMedianFront(bigIndexedArrayZeroToTwentyNine, 5, 8, 3, new int[] {5,7});
        testDualPivotMedianFront(bigIndexedArrayZeroToTwentyNine, 6, 29, 3, new int[] {6,8});
        testDualPivotMedianFront(bigIndexedArrayZeroToTwentyNine, 7, 18, 3, new int[] {7,9});

        testDualPivotMedianFront(bigIndexedArrayZeroToTwentyNine, 0, 26, 3, new int[] {0, 2});
        testDualPivotMedianFront(bigIndexedArrayZeroToTwentyNine, 0, 27, 3, new int[] {0, 2});
        testDualPivotMedianFront(bigIndexedArrayZeroToTwentyNine, 0, 28, 3, new int[] {0, 2});
        testDualPivotMedianFront(bigIndexedArrayZeroToTwentyNine, 1, 25, 3, new int[] {1,3});
        testDualPivotMedianFront(bigIndexedArrayZeroToTwentyNine, 1, 17, 3, new int[] {1,3});

        testDualPivotMedianFront(bigIndexedArrayZeroToTwentyNine, 18, 28, 5, new int[] {19,21});
        testDualPivotMedianFront(bigIndexedArrayZeroToTwentyNine, 5, 18, 5, new int[] {6,8});
        testDualPivotMedianFront(bigIndexedArrayZeroToTwentyNine, 26, 29, 5, new int[] {27,28});
        testDualPivotMedianFront(bigIndexedArrayZeroToTwentyNine, 7, 11, 5, new int[] {8,10});

        testDualPivotMedianFront(bigIndexedArrayZeroToTwentyNine, 0, 6, 5, new int[] {1,3});
        testDualPivotMedianFront(bigIndexedArrayZeroToTwentyNine, 0, 7, 5, new int[] {1,3});
        testDualPivotMedianFront(bigIndexedArrayZeroToTwentyNine, 0, 8, 5, new int[] {1,3});
        testDualPivotMedianFront(bigIndexedArrayZeroToTwentyNine, 1, 5, 5, new int[] {2,4});
        testDualPivotMedianFront(bigIndexedArrayZeroToTwentyNine, 1, 7, 5, new int[] {2,4});

        testDualPivotMedianFront(randomArrayLengthTen, 0, 9, 3, new int[] {1,0});
        testDualPivotMedianFront(randomArrayLengthTen, 0, 9, 5, new int[] {4,2});
        testDualPivotMedianFront(randomArrayLengthTen, 1, 9, 5, new int[] {4,3});
        testDualPivotMedianFront(randomArrayLengthTen, 0, 9, 2, new int[] {1,0});
        testDualPivotMedianFront(randomArrayLengthTen, 0, 9, 4, new int[] {3,2});
        testDualPivotMedianFront(randomArrayLengthTen, 0, 9, 10, new int[] {4,3});
        testDualPivotMedianFront(randomArrayLengthTen, 0, 9, 100, new int[] {4,3});
        testDualPivotMedianFront(randomArrayLengthTen, 0, 9, 8, new int[] {4,3});
        testDualPivotMedianFront(randomArrayLengthTen, 0, 9, 7, new int[] {5,3});
        testDualPivotMedianFront(randomArrayLengthTen, 0, 9, 9, new int[] {1,3});

        testDualPivotMedianFront(randomArrayLengthTen, 1, 8, 3, new int[] {1,2});
        testDualPivotMedianFront(randomArrayLengthTen, 6, 9, 2, new int[] {7,6});
        testDualPivotMedianFront(randomArrayLengthTen, 4, 9, 4, new int[] {4,5});
        testDualPivotMedianFront(randomArrayLengthTen, 1, 8, 10, new int[] {1,3});
        testDualPivotMedianFront(randomArrayLengthTen, 3, 5, 100, new int[] {4,3});
        testDualPivotMedianFront(randomArrayLengthTen, 1, 7, 8, new int[] {4,3});
        testDualPivotMedianFront(randomArrayLengthTen, 8, 9, 7, new int[] {8,9});

        testDualPivotMedianFront(randomArrayLengthTen, 5, 8, 3, new int[] {7,6});
        testDualPivotMedianFront(randomArrayLengthTen, 6, 9, 3, new int[] {8,6});
        testDualPivotMedianFront(randomArrayLengthTen, 7, 8, 3, new int[] {8,7});

        testDualPivotMedianFront(randomArrayLengthTen, 0, 6, 3, new int[] {1,0});
        testDualPivotMedianFront(randomArrayLengthTen, 0, 7, 3, new int[] {1,0});
        testDualPivotMedianFront(randomArrayLengthTen, 0, 8, 3, new int[] {1,0});
        testDualPivotMedianFront(randomArrayLengthTen, 1, 5, 3, new int[] {1,2});
        testDualPivotMedianFront(randomArrayLengthTen, 1, 7, 3, new int[] {1,2});

        testDualPivotMedianFront(randomArrayLengthTen, 5, 8, 5, new int[] {7,5});
        testDualPivotMedianFront(randomArrayLengthTen, 6, 9, 5, new int[] {7,6});
        testDualPivotMedianFront(randomArrayLengthTen, 7, 8, 5, new int[] {8,7});

        testDualPivotMedianFront(randomArrayLengthTen, 0, 6, 5, new int[] {4,2});
        testDualPivotMedianFront(randomArrayLengthTen, 0, 7, 5, new int[] {4,2});
        testDualPivotMedianFront(randomArrayLengthTen, 0, 8, 5, new int[] {4,2});
        testDualPivotMedianFront(randomArrayLengthTen, 1, 5, 5, new int[] {4,3});
        testDualPivotMedianFront(randomArrayLengthTen, 1, 7, 5, new int[] {4,3});


        System.out.println(GREEN + "DualPivotMedianFront tests executed" + RESET);
        System.out.println();
    }

    private static void testDualPivotMedianFront(int[] array, int from, int to, int numberOfConsideredElements, int[] expected) {
        try {
            if(array == null) System.out.println(YELLOW + "Invalid test parameter: array can not be null" + RESET);
            if(array.length == 0) System.out.println(YELLOW + "Invalid test parameter: array can not be empty" + RESET);
            if(array.length < 2) System.out.println(YELLOW + "Invalid test parameter: array has to contain at least two elements" + RESET);
            if(from < 0 || from >= array.length) System.out.println(YELLOW + "Invalid test parameter: from can not be outside the array" + RESET);
            if(to < 0 || to >= array.length) System.out.println(YELLOW + "Invalid test parameter: to can not be outside the array" + RESET);
            if(from >= to) System.out.println(YELLOW + "Invalid test parameter: from can not be larger or equal than to" + RESET);
            if(numberOfConsideredElements <= 1) System.out.println(YELLOW + "Invalid test parameter: numberOfConsideredElements can not be below or equal to one" + RESET);
            if(expected == null) System.out.println(YELLOW + "Invalid test parameter: the expected value array can not be null" + RESET);
            if(expected.length != 2) System.out.println(YELLOW + "Invalid test parameter: the expected value array does not contain exactly two elements" + RESET);
            if(expected[0] < 0 || expected[0] >= array.length) System.out.println(YELLOW + "Invalid test parameter: the first expected value has to be within the array bounds" + RESET);
            if(expected[1] < 0 || expected[1] >= array.length) System.out.println(YELLOW + "Invalid test parameter: the second expected value has to be within the array bounds" + RESET);
            DualPivotFinder pv = DualPivotFinder.getMedianPivotFront(numberOfConsideredElements);
            int[] result = pv.findPivot(array, from, to);
            if(!Arrays.equals(result, expected)) System.out.println(RED + "Test with " + Arrays.toString(array) + " for values from = " + from + ", to = " + to + ", numberOfConsideredElements = " + numberOfConsideredElements + " failed. Expected " + Arrays.toString(expected) + " but got " + Arrays.toString(result) + RESET);
        } catch(IndexOutOfBoundsException e) {
            System.out.println(RED + "Test with " + Arrays.toString(array) + " for values from = " + from + ", to = " + to + ", numberOfConsideredElements = " + numberOfConsideredElements + " had an IndexOutOfBoundsException." + RESET);
        }
    }

    private static void testDualPivotRandom() {
        int[] indexedArrayZeroToNine = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] smallIndexedArrayZeroToOne = new int[] {0, 1};
        int[] bigIndexedArrayZeroToTwentyNine = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29};
        int[] randomArrayLengthTen = new int[] {9, 1, 8, 5, 2, 3, 5, 1, 0, 7};


        System.out.println();
        System.out.println(GREEN + "starting DualPivotRandom tests" + RESET);


        testDualPivotRandom(indexedArrayZeroToNine, 0, 9, new int[] {2, 6});
        testDualPivotRandom(indexedArrayZeroToNine, 1, 8, new int[] {6, 4});
        testDualPivotRandom(indexedArrayZeroToNine, 2, 3, new int[] {3, 2});
        testDualPivotRandom(indexedArrayZeroToNine, 5, 7, new int[] {6, 5});

        testDualPivotRandom(smallIndexedArrayZeroToOne, 0, 1, new int[] {1, 0});

        testDualPivotRandom(bigIndexedArrayZeroToTwentyNine, 0, 9, new int[] {2, 6});
        testDualPivotRandom(bigIndexedArrayZeroToTwentyNine, 1, 8, new int[] {6, 4});
        testDualPivotRandom(bigIndexedArrayZeroToTwentyNine, 0, 29, new int[] {22, 6});
        testDualPivotRandom(bigIndexedArrayZeroToTwentyNine, 8, 23, new int[] {13, 11});

        testDualPivotRandom(randomArrayLengthTen, 0, 9, new int[] {2, 6});
        testDualPivotRandom(randomArrayLengthTen, 1, 8, new int[] {6, 4});
        testDualPivotRandom(randomArrayLengthTen, 2, 3, new int[] {3, 2});
        testDualPivotRandom(randomArrayLengthTen, 5, 7, new int[] {6, 5});


        System.out.println(GREEN + "DualPivotRandom tests executed" + RESET);
        System.out.println();
    }

    private static void testDualPivotRandom(int[] array, int from, int to, int[] expected) {
        try {
            if(array == null) System.out.println(YELLOW + "Invalid test parameter: array can not be null" + RESET);
            if(array.length == 0) System.out.println(YELLOW + "Invalid test parameter: array can not be empty" + RESET);
            if(array.length < 2) System.out.println(YELLOW + "Invalid test parameter: array has to contain at least two elements" + RESET);
            if(from < 0 || from >= array.length) System.out.println(YELLOW + "Invalid test parameter: from can not be outside the array" + RESET);
            if(to < 0 || to >= array.length) System.out.println(YELLOW + "Invalid test parameter: to can not be outside the array" + RESET);
            if(from >= to) System.out.println(YELLOW + "Invalid test parameter: from can not be larger or equal than to" + RESET);
            if(expected == null) System.out.println(YELLOW + "Invalid test parameter: the expected value array can not be null" + RESET);
            if(expected.length != 2) System.out.println(YELLOW + "Invalid test parameter: the expected value array does not contain exactly two elements" + RESET);
            if(expected[0] < 0 || expected[0] >= array.length) System.out.println(YELLOW + "Invalid test parameter: the first expected value has to be within the array bounds" + RESET);
            if(expected[1] < 0 || expected[1] >= array.length) System.out.println(YELLOW + "Invalid test parameter: the second expected value has to be within the array bounds" + RESET);
            DualPivotFinder pv = DualPivotFinder.getRandomPivot(69);
            int[] result = pv.findPivot(array, from, to);
            if(!Arrays.equals(result, expected)) System.out.println(RED + "Test with " + Arrays.toString(array) + " for values from = " + from + ", to = " + to + " failed. Expected " + Arrays.toString(expected) + " but got " + Arrays.toString(result) + RESET);
        } catch(IndexOutOfBoundsException e) {
            System.out.println(RED + "Test with " + Arrays.toString(array) + " for values from = " + from + ", to = " + to + " had an IndexOutOfBoundsException." + RESET);
        }
    }

    private static void testDualPivotFirstLast() {
        int[] indexedArrayZeroToNine = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] smallIndexedArrayZeroToOne = new int[] {0, 1};
        int[] bigIndexedArrayZeroToTwentyNine = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29};
        int[] randomArrayLengthTen = new int[] {9, 1, 8, 5, 2, 3, 5, 1, 0, 7};


        System.out.println();
        System.out.println(GREEN + "starting DualPivotFirstLast tests" + RESET);


        testDualPivotFirstLast(indexedArrayZeroToNine, 0, 9, new int[] {0, 9});
        testDualPivotFirstLast(indexedArrayZeroToNine, 1, 8, new int[] {1, 8});
        testDualPivotFirstLast(indexedArrayZeroToNine, 2, 3, new int[] {2, 3});
        testDualPivotFirstLast(indexedArrayZeroToNine, 5, 7, new int[] {5, 7});

        testDualPivotFirstLast(smallIndexedArrayZeroToOne, 0, 1, new int[] {0, 1});

        testDualPivotFirstLast(bigIndexedArrayZeroToTwentyNine, 0, 9, new int[] {0, 9});
        testDualPivotFirstLast(bigIndexedArrayZeroToTwentyNine, 1, 8, new int[] {1, 8});
        testDualPivotFirstLast(bigIndexedArrayZeroToTwentyNine, 0, 29, new int[] {0, 29});
        testDualPivotFirstLast(bigIndexedArrayZeroToTwentyNine, 8, 23, new int[] {8, 23});

        testDualPivotFirstLast(randomArrayLengthTen, 0, 9, new int[] {0, 9});
        testDualPivotFirstLast(randomArrayLengthTen, 1, 8, new int[] {1, 8});
        testDualPivotFirstLast(randomArrayLengthTen, 2, 3, new int[] {2, 3});
        testDualPivotFirstLast(randomArrayLengthTen, 5, 7, new int[] {5, 7});


        System.out.println(GREEN + "DualPivotFirstLast tests executed" + RESET);
        System.out.println();
    }

    private static void testDualPivotFirstLast(int[] array, int from, int to, int[] expected) {
        try {
            if(array == null) System.out.println(YELLOW + "Invalid test parameter: array can not be null" + RESET);
            if(array.length == 0) System.out.println(YELLOW + "Invalid test parameter: array can not be empty" + RESET);
            if(array.length < 2) System.out.println(YELLOW + "Invalid test parameter: array has to contain at least two elements" + RESET);
            if(from < 0 || from >= array.length) System.out.println(YELLOW + "Invalid test parameter: from can not be outside the array" + RESET);
            if(to < 0 || to >= array.length) System.out.println(YELLOW + "Invalid test parameter: to can not be outside the array" + RESET);
            if(from >= to) System.out.println(YELLOW + "Invalid test parameter: from can not be larger or equal than to" + RESET);
            if(expected == null) System.out.println(YELLOW + "Invalid test parameter: the expected value array can not be null" + RESET);
            if(expected.length != 2) System.out.println(YELLOW + "Invalid test parameter: the expected value array does not contain exactly two elements" + RESET);
            if(expected[0] < 0 || expected[0] >= array.length) System.out.println(YELLOW + "Invalid test parameter: the first expected value has to be within the array bounds" + RESET);
            if(expected[1] < 0 || expected[1] >= array.length) System.out.println(YELLOW + "Invalid test parameter: the second expected value has to be within the array bounds" + RESET);
            if(expected[0] >= expected[1]) System.out.println(YELLOW + "Invalid test parameter: the first expected value can not be greater or equal than the second expected value" + RESET);
            DualPivotFinder pv = DualPivotFinder.getFirstLastPivot();
            int[] result = pv.findPivot(array, from, to);
            if(!Arrays.equals(result, expected)) System.out.println(RED + "Test with " + Arrays.toString(array) + " for values from = " + from + ", to = " + to + " failed. Expected " + Arrays.toString(expected) + " but got " + Arrays.toString(result) + RESET);
        } catch(IndexOutOfBoundsException e) {
            System.out.println(RED + "Test with " + Arrays.toString(array) + " for values from = " + from + ", to = " + to + " had an IndexOutOfBoundsException." + RESET);
        }
    }

    private static void testDualPivotQuicksort() {
        System.out.println();
        System.out.println(GREEN + "starting DualPivotQuicksort tests" + RESET);


        System.out.println(YELLOW + "Not implemented yet" + RESET);


        System.out.println(GREEN + "DualPivotQuicksort tests executed" + RESET);
        System.out.println();
    }

    private static void testQuicksort() {
        System.out.println();
        System.out.println(GREEN + "starting Quicksort tests" + RESET);


        testQuicksortWithMidPivot(10, 0, 9);
        testQuicksortWithMidPivot(10, 1, 9);
        testQuicksortWithMidPivot(10, 2, 9);
        testQuicksortWithMidPivot(10, 1, 8);
        testQuicksortWithMidPivot(10, 2, 8);
        testQuicksortWithMidPivot(10, 1, 1);
        testQuicksortWithMidPivot(10, 0, 0);
        testQuicksortWithMidPivot(10, 0, 3);
        testQuicksortWithMidPivot(10, 0, 1);
        testQuicksortWithMidPivot(10, 0, 2);
        testQuicksortWithMidPivot(10, 8, 9);
        testQuicksortWithMidPivot(10, 9, 9);
        testQuicksortWithMidPivot(10, 7, 9);
        testQuicksortWithMidPivot(10, 4, 7);
        testQuicksortWithMidPivot(1, 0, 0);
        testQuicksortWithMidPivot(2, 0, 0);
        testQuicksortWithMidPivot(2, 0, 1);
        testQuicksortWithMidPivot(2, 1, 1);
        testQuicksortWithMidPivot(3, 0, 2);
        testQuicksortWithMidPivot(3, 0, 1);
        testQuicksortWithMidPivot(3, 0, 0);
        testQuicksortWithMidPivot(3, 1, 2);
        testQuicksortWithMidPivot(3, 1, 1);
        testQuicksortWithMidPivot(3, 2, 2);
        testQuicksortWithMidPivot(50, 0, 49);
        testQuicksortWithMidPivot(50, 10, 49);
        testQuicksortWithMidPivot(50, 15, 38);
        testQuicksortWithMidPivot(100, 1, 99);
        testQuicksortWithMidPivot(100, 52, 85);
        testQuicksortWithMidPivot(250, 25, 158);

        testQuicksortWithMedianFrontPivot(10, 0, 9);
        testQuicksortWithMedianFrontPivot(10, 1, 9);
        testQuicksortWithMedianFrontPivot(10, 2, 9);
        testQuicksortWithMedianFrontPivot(10, 1, 8);
        testQuicksortWithMedianFrontPivot(10, 2, 8);
        testQuicksortWithMedianFrontPivot(10, 1, 1);
        testQuicksortWithMedianFrontPivot(10, 0, 0);
        testQuicksortWithMedianFrontPivot(10, 0, 3);
        testQuicksortWithMedianFrontPivot(10, 0, 1);
        testQuicksortWithMedianFrontPivot(10, 0, 2);
        testQuicksortWithMedianFrontPivot(10, 8, 9);
        testQuicksortWithMedianFrontPivot(10, 9, 9);
        testQuicksortWithMedianFrontPivot(10, 7, 9);
        testQuicksortWithMedianFrontPivot(10, 4, 7);
        testQuicksortWithMedianFrontPivot(1, 0, 0);
        testQuicksortWithMedianFrontPivot(2, 0, 0);
        testQuicksortWithMedianFrontPivot(2, 0, 1);
        testQuicksortWithMedianFrontPivot(2, 1, 1);
        testQuicksortWithMedianFrontPivot(3, 0, 2);
        testQuicksortWithMedianFrontPivot(3, 0, 1);
        testQuicksortWithMedianFrontPivot(3, 0, 0);
        testQuicksortWithMedianFrontPivot(3, 1, 2);
        testQuicksortWithMedianFrontPivot(3, 1, 1);
        testQuicksortWithMedianFrontPivot(3, 2, 2);
        testQuicksortWithMedianFrontPivot(50, 0, 49);
        testQuicksortWithMedianFrontPivot(50, 10, 49);
        testQuicksortWithMedianFrontPivot(50, 15, 38);
        testQuicksortWithMedianFrontPivot(100, 1, 99);
        testQuicksortWithMedianFrontPivot(100, 52, 85);
        testQuicksortWithMedianFrontPivot(250, 25, 158);

        testQuicksortWithMedianDistributedPivot(10, 0, 9);
        testQuicksortWithMedianDistributedPivot(10, 1, 9);
        testQuicksortWithMedianDistributedPivot(10, 2, 9);
        testQuicksortWithMedianDistributedPivot(10, 1, 8);
        testQuicksortWithMedianDistributedPivot(10, 2, 8);
        testQuicksortWithMedianDistributedPivot(10, 1, 1);
        testQuicksortWithMedianDistributedPivot(10, 0, 0);
        testQuicksortWithMedianDistributedPivot(10, 0, 3);
        testQuicksortWithMedianDistributedPivot(10, 0, 1);
        testQuicksortWithMedianDistributedPivot(10, 0, 2);
        testQuicksortWithMedianDistributedPivot(10, 8, 9);
        testQuicksortWithMedianDistributedPivot(10, 9, 9);
        testQuicksortWithMedianDistributedPivot(10, 7, 9);
        testQuicksortWithMedianDistributedPivot(10, 4, 7);
        testQuicksortWithMedianDistributedPivot(1, 0, 0);
        testQuicksortWithMedianDistributedPivot(2, 0, 0);
        testQuicksortWithMedianDistributedPivot(2, 0, 1);
        testQuicksortWithMedianDistributedPivot(2, 1, 1);
        testQuicksortWithMedianDistributedPivot(3, 0, 2);
        testQuicksortWithMedianDistributedPivot(3, 0, 1);
        testQuicksortWithMedianDistributedPivot(3, 0, 0);
        testQuicksortWithMedianDistributedPivot(3, 1, 2);
        testQuicksortWithMedianDistributedPivot(3, 1, 1);
        testQuicksortWithMedianDistributedPivot(3, 2, 2);
        testQuicksortWithMedianDistributedPivot(50, 0, 49);
        testQuicksortWithMedianDistributedPivot(50, 10, 49);
        testQuicksortWithMedianDistributedPivot(50, 15, 38);
        testQuicksortWithMedianDistributedPivot(100, 1, 99);
        testQuicksortWithMedianDistributedPivot(100, 52, 85);
        testQuicksortWithMedianDistributedPivot(250, 25, 158);

        testQuicksortWithLastPivot(10, 0, 9);
        testQuicksortWithLastPivot(10, 1, 9);
        testQuicksortWithLastPivot(10, 2, 9);
        testQuicksortWithLastPivot(10, 1, 8);
        testQuicksortWithLastPivot(10, 2, 8);
        testQuicksortWithLastPivot(10, 1, 1);
        testQuicksortWithLastPivot(10, 0, 0);
        testQuicksortWithLastPivot(10, 0, 3);
        testQuicksortWithLastPivot(10, 0, 1);
        testQuicksortWithLastPivot(10, 0, 2);
        testQuicksortWithLastPivot(10, 8, 9);
        testQuicksortWithLastPivot(10, 9, 9);
        testQuicksortWithLastPivot(10, 7, 9);
        testQuicksortWithLastPivot(10, 4, 7);
        testQuicksortWithLastPivot(1, 0, 0);
        testQuicksortWithLastPivot(2, 0, 0);
        testQuicksortWithLastPivot(2, 0, 1);
        testQuicksortWithLastPivot(2, 1, 1);
        testQuicksortWithLastPivot(3, 0, 2);
        testQuicksortWithLastPivot(3, 0, 1);
        testQuicksortWithLastPivot(3, 0, 0);
        testQuicksortWithLastPivot(3, 1, 2);
        testQuicksortWithLastPivot(3, 1, 1);
        testQuicksortWithLastPivot(3, 2, 2);
        testQuicksortWithLastPivot(50, 0, 49);
        testQuicksortWithLastPivot(50, 10, 49);
        testQuicksortWithLastPivot(50, 15, 38);
        testQuicksortWithLastPivot(100, 1, 99);
        testQuicksortWithLastPivot(100, 52, 85);
        testQuicksortWithLastPivot(250, 25, 158);

        testQuicksortWithRandomPivot(10, 0, 9);
        testQuicksortWithRandomPivot(10, 1, 9);
        testQuicksortWithRandomPivot(10, 2, 9);
        testQuicksortWithRandomPivot(10, 1, 8);
        testQuicksortWithRandomPivot(10, 2, 8);
        testQuicksortWithRandomPivot(10, 1, 1);
        testQuicksortWithRandomPivot(10, 0, 0);
        testQuicksortWithRandomPivot(10, 0, 3);
        testQuicksortWithRandomPivot(10, 0, 1);
        testQuicksortWithRandomPivot(10, 0, 2);
        testQuicksortWithRandomPivot(10, 8, 9);
        testQuicksortWithRandomPivot(10, 9, 9);
        testQuicksortWithRandomPivot(10, 7, 9);
        testQuicksortWithRandomPivot(10, 4, 7);
        testQuicksortWithRandomPivot(1, 0, 0);
        testQuicksortWithRandomPivot(2, 0, 0);
        testQuicksortWithRandomPivot(2, 0, 1);
        testQuicksortWithRandomPivot(2, 1, 1);
        testQuicksortWithRandomPivot(3, 0, 2);
        testQuicksortWithRandomPivot(3, 0, 1);
        testQuicksortWithRandomPivot(3, 0, 0);
        testQuicksortWithRandomPivot(3, 1, 2);
        testQuicksortWithRandomPivot(3, 1, 1);
        testQuicksortWithRandomPivot(3, 2, 2);
        testQuicksortWithRandomPivot(50, 0, 49);
        testQuicksortWithRandomPivot(50, 10, 49);
        testQuicksortWithRandomPivot(50, 15, 38);
        testQuicksortWithRandomPivot(100, 1, 99);
        testQuicksortWithRandomPivot(100, 52, 85);
        testQuicksortWithRandomPivot(250, 25, 158);


        System.out.println(GREEN + "Quicksort tests executed" + RESET);
        System.out.println();
    }

    private static void testQuicksortWithMidPivot(int length, int from, int to) {
        for(int i = 1; i <= 10; i++) {
            try {
                if(from < 0 || from >= length) System.out.println(YELLOW + "Invalid test parameter: from can not be outside the array" + RESET);
                if(to < 0 || to >= length) System.out.println(YELLOW + "Invalid test parameter: to can not be outside the array" + RESET);
                if(from > to) System.out.println(YELLOW + "Invalid test parameter: from can not be larger than to" + RESET);
                PivotFinder pv = PivotFinder.getMidPivot();
                Quicksort quicksort = new Quicksort(pv, 0);
                int[] array = createRandomArray(length, 0, length);
                int[] copy = Arrays.copyOf(array, array.length);
                quicksort.sort(array, new SilentResult(), from, to);
                Arrays.sort(copy, from, to + 1);
                if(!Arrays.equals(array, copy)) System.out.println(RED + "Test with quicksort mid pivot for values length = " + length + ", from = " + from + ", to = " + to + " failed. Epected " + Arrays.toString(copy) + " but got " + Arrays.toString(array));
            } catch(Exception e) {
                System.out.println(RED + "Test with quicksort mid pivot for values length = " + length + ", from = " + from + ", to = " + to + " failed because of " + e.getMessage() + RESET);
            }
        }
    }

    private static void testQuicksortWithMedianFrontPivot(int length, int from, int to) {
        for(int i = 1; i <= 10; i++) {
            try {
                if(from < 0 || from >= length) System.out.println(YELLOW + "Invalid test parameter: from can not be outside the array" + RESET);
                if(to < 0 || to >= length) System.out.println(YELLOW + "Invalid test parameter: to can not be outside the array" + RESET);
                if(from > to) System.out.println(YELLOW + "Invalid test parameter: from can not be larger than to" + RESET);
                PivotFinder pv = PivotFinder.getMedianPivotFront(i);
                Quicksort quicksort = new Quicksort(pv, 0);
                int[] array = createRandomArray(length, 0, length);
                int[] copy = Arrays.copyOf(array, array.length);
                quicksort.sort(array, new SilentResult(), from, to);
                Arrays.sort(copy, from, to + 1);
                if(!Arrays.equals(array, copy)) System.out.println(RED + "Test with quicksort median front pivot for values length = " + length + ", from = " + from + ", to = " + to + " failed. Epected " + Arrays.toString(copy) + " but got " + Arrays.toString(array));
            } catch(Exception e) {
                System.out.println(RED + "Test with quicksort median front pivot for values length = " + length + ", from = " + from + ", to = " + to + " failed because of " + e.getMessage() + RESET);
            }
        }
    }

    private static void testQuicksortWithMedianDistributedPivot(int length, int from, int to) {
        for(int i = 1; i <= 10; i++) {
            try {
                if(from < 0 || from >= length) System.out.println(YELLOW + "Invalid test parameter: from can not be outside the array" + RESET);
                if(to < 0 || to >= length) System.out.println(YELLOW + "Invalid test parameter: to can not be outside the array" + RESET);
                if(from > to) System.out.println(YELLOW + "Invalid test parameter: from can not be larger than to" + RESET);
                PivotFinder pv = PivotFinder.getMedianPivotDistributed(i);
                Quicksort quicksort = new Quicksort(pv, 0);
                int[] array = createRandomArray(length, 0, length);
                int[] copy = Arrays.copyOf(array, array.length);
                quicksort.sort(array, new SilentResult(), from, to);
                Arrays.sort(copy, from, to + 1);
                if(!Arrays.equals(array, copy)) System.out.println(RED + "Test with quicksort median distributed pivot for values length = " + length + ", from = " + from + ", to = " + to + " failed. Epected " + Arrays.toString(copy) + " but got " + Arrays.toString(array));
            } catch(Exception e) {
                System.out.println(RED + "Test with quicksort median distributed pivot for values length = " + length + ", from = " + from + ", to = " + to + " failed because of " + e.getMessage() + RESET);
            }
        }
    }

    private static void testQuicksortWithLastPivot(int length, int from, int to) {
        for(int i = 1; i <= 10; i++) {
            try {
                if(from < 0 || from >= length) System.out.println(YELLOW + "Invalid test parameter: from can not be outside the array" + RESET);
                if(to < 0 || to >= length) System.out.println(YELLOW + "Invalid test parameter: to can not be outside the array" + RESET);
                if(from > to) System.out.println(YELLOW + "Invalid test parameter: from can not be larger than to" + RESET);
                PivotFinder pv = PivotFinder.getLastPivot();
                Quicksort quicksort = new Quicksort(pv, 0);
                int[] array = createRandomArray(length, 0, length);
                int[] copy = Arrays.copyOf(array, array.length);
                quicksort.sort(array, new SilentResult(), from, to);
                Arrays.sort(copy, from, to + 1);
                if(!Arrays.equals(array, copy)) System.out.println(RED + "Test with quicksort last pivot for values length = " + length + ", from = " + from + ", to = " + to + " failed. Epected " + Arrays.toString(copy) + " but got " + Arrays.toString(array));
            } catch(Exception e) {
                System.out.println(RED + "Test with quicksort last pivot for values length = " + length + ", from = " + from + ", to = " + to + " failed because of " + e.getMessage() + RESET);
            }
        }
    }

    private static void testQuicksortWithRandomPivot(int length, int from, int to) {
        for(int i = 1; i <= 10; i++) {
            try {
                if(from < 0 || from >= length) System.out.println(YELLOW + "Invalid test parameter: from can not be outside the array" + RESET);
                if(to < 0 || to >= length) System.out.println(YELLOW + "Invalid test parameter: to can not be outside the array" + RESET);
                if(from > to) System.out.println(YELLOW + "Invalid test parameter: from can not be larger than to" + RESET);
                PivotFinder pv = PivotFinder.getRandomPivot(69);
                Quicksort quicksort = new Quicksort(pv, 0);
                int[] array = createRandomArray(length, 0, length);
                int[] copy = Arrays.copyOf(array, array.length);
                quicksort.sort(array, new SilentResult(), from, to);
                Arrays.sort(copy, from, to + 1);
                if(!Arrays.equals(array, copy)) System.out.println(RED + "Test with quicksort random pivot for values length = " + length + ", from = " + from + ", to = " + to + " failed. Epected " + Arrays.toString(copy) + " but got " + Arrays.toString(array));
            } catch(Exception e) {
                System.out.println(RED + "Test with quicksort random pivot for values length = " + length + ", from = " + from + ", to = " + to + " failed because of " + e.getMessage() + RESET);
            }
        }
    }

    private static int[] createRandomArray(int length, int lowerBound, int upperBound) {
        Random random = new Random();
        int[] randomArray = new int[length];
        for (int i = 0; i < length; i++) {
            randomArray[i] = random.nextInt(lowerBound, upperBound);
        }

        return randomArray;
    }

    private static void testPivotMedianDistributed() {
        int[] indexedArrayZeroToNine = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] smallIndexedArrayZeroToThree = new int[] {0, 1, 2, 3};
        int[] oneElementArray = new int[] {0};
        int[] bigIndexedArrayZeroToTwentyNine = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29};
        int[] randomArrayLengthTen = new int[] {9, 1, 8, 5, 2, 3, 5, 1, 0, 7};


        System.out.println();
        System.out.println(GREEN + "starting MedianPivotDistributed tests" + RESET);


        testMedianPivotDistributed(indexedArrayZeroToNine, 0, 9, 3, 4);
        testMedianPivotDistributed(indexedArrayZeroToNine, 0, 9, 5, 4);
        testMedianPivotDistributed(indexedArrayZeroToNine, 0, 9, 1, 0);
        testMedianPivotDistributed(indexedArrayZeroToNine, 0, 9, 2, 0);
        testMedianPivotDistributed(indexedArrayZeroToNine, 0, 9, 4, 3);
        testMedianPivotDistributed(indexedArrayZeroToNine, 0, 9, 10, 4);
        testMedianPivotDistributed(indexedArrayZeroToNine, 0, 9, 100, 4);
        testMedianPivotDistributed(indexedArrayZeroToNine, 0, 9, 8, 3);
        testMedianPivotDistributed(indexedArrayZeroToNine, 0, 9, 7, 3);
        testMedianPivotDistributed(indexedArrayZeroToNine, 0, 9, 9, 4);

        testMedianPivotDistributed(indexedArrayZeroToNine, 1, 8, 3, 4);
        testMedianPivotDistributed(indexedArrayZeroToNine, 7, 7, 5, 7);
        testMedianPivotDistributed(indexedArrayZeroToNine, 2, 5, 1, 2);
        testMedianPivotDistributed(indexedArrayZeroToNine, 6, 9, 2, 6);
        testMedianPivotDistributed(indexedArrayZeroToNine, 4, 9, 4, 5);
        testMedianPivotDistributed(indexedArrayZeroToNine, 1, 8, 10, 4);
        testMedianPivotDistributed(indexedArrayZeroToNine, 3, 5, 100, 4);
        testMedianPivotDistributed(indexedArrayZeroToNine, 1, 7, 8, 4);
        testMedianPivotDistributed(indexedArrayZeroToNine, 8, 9, 7, 8);
        testMedianPivotDistributed(indexedArrayZeroToNine, 9, 9, 9, 9);

        testMedianPivotDistributed(indexedArrayZeroToNine, 8, 8, 3, 8);
        testMedianPivotDistributed(indexedArrayZeroToNine, 9, 9, 3, 9);
        testMedianPivotDistributed(indexedArrayZeroToNine, 5, 8, 3, 6);
        testMedianPivotDistributed(indexedArrayZeroToNine, 6, 9, 3, 7);
        testMedianPivotDistributed(indexedArrayZeroToNine, 7, 8, 3, 7);

        testMedianPivotDistributed(indexedArrayZeroToNine, 0, 6, 3, 3);
        testMedianPivotDistributed(indexedArrayZeroToNine, 0, 7, 3, 3);
        testMedianPivotDistributed(indexedArrayZeroToNine, 0, 8, 3, 4);
        testMedianPivotDistributed(indexedArrayZeroToNine, 1, 5, 3, 3);
        testMedianPivotDistributed(indexedArrayZeroToNine, 1, 7, 3, 4);

        testMedianPivotDistributed(indexedArrayZeroToNine, 8, 8, 5, 8);
        testMedianPivotDistributed(indexedArrayZeroToNine, 9, 9, 5, 9);
        testMedianPivotDistributed(indexedArrayZeroToNine, 5, 8, 5, 6);
        testMedianPivotDistributed(indexedArrayZeroToNine, 6, 9, 5, 7);
        testMedianPivotDistributed(indexedArrayZeroToNine, 7, 8, 5, 7);

        testMedianPivotDistributed(indexedArrayZeroToNine, 0, 6, 5, 2);
        testMedianPivotDistributed(indexedArrayZeroToNine, 0, 7, 5, 2);
        testMedianPivotDistributed(indexedArrayZeroToNine, 0, 8, 5, 4);
        testMedianPivotDistributed(indexedArrayZeroToNine, 1, 5, 5, 3);
        testMedianPivotDistributed(indexedArrayZeroToNine, 1, 7, 5, 3);

        testMedianPivotDistributed(oneElementArray, 0, 0, 1, 0);
        testMedianPivotDistributed(oneElementArray, 0, 0, 5, 0);
        testMedianPivotDistributed(oneElementArray, 0, 0, 1000, 0);

        testMedianPivotDistributed(smallIndexedArrayZeroToThree, 0, 3, 1, 0);
        testMedianPivotDistributed(smallIndexedArrayZeroToThree, 1, 3, 1, 1);
        testMedianPivotDistributed(smallIndexedArrayZeroToThree, 2, 3, 1, 2);
        testMedianPivotDistributed(smallIndexedArrayZeroToThree, 2, 2, 1, 2);

        testMedianPivotDistributed(smallIndexedArrayZeroToThree, 0, 3, 2, 0);
        testMedianPivotDistributed(smallIndexedArrayZeroToThree, 1, 3, 2, 1);
        testMedianPivotDistributed(smallIndexedArrayZeroToThree, 2, 3, 2, 2);
        testMedianPivotDistributed(smallIndexedArrayZeroToThree, 2, 2, 2, 2);

        testMedianPivotDistributed(smallIndexedArrayZeroToThree, 0, 3, 3, 1);
        testMedianPivotDistributed(smallIndexedArrayZeroToThree, 1, 3, 3, 2);
        testMedianPivotDistributed(smallIndexedArrayZeroToThree, 1, 3, 3, 2);
        testMedianPivotDistributed(smallIndexedArrayZeroToThree, 2, 3, 3, 2);
        testMedianPivotDistributed(smallIndexedArrayZeroToThree, 2, 2, 3, 2);

        testMedianPivotDistributed(bigIndexedArrayZeroToTwentyNine, 0, 29, 3, 14);
        testMedianPivotDistributed(bigIndexedArrayZeroToTwentyNine, 0, 29, 5, 14);
        testMedianPivotDistributed(bigIndexedArrayZeroToTwentyNine, 0, 29, 1, 0);
        testMedianPivotDistributed(bigIndexedArrayZeroToTwentyNine, 0, 29, 2, 0);
        testMedianPivotDistributed(bigIndexedArrayZeroToTwentyNine, 0, 29, 4, 9);
        testMedianPivotDistributed(bigIndexedArrayZeroToTwentyNine, 0, 29, 10, 12);
        testMedianPivotDistributed(bigIndexedArrayZeroToTwentyNine, 0, 29, 100, 14);
        testMedianPivotDistributed(bigIndexedArrayZeroToTwentyNine, 0, 29, 8, 12);
        testMedianPivotDistributed(bigIndexedArrayZeroToTwentyNine, 0, 29, 7, 12);
        testMedianPivotDistributed(bigIndexedArrayZeroToTwentyNine, 0, 29, 9, 12);

        testMedianPivotDistributed(bigIndexedArrayZeroToTwentyNine, 21, 28, 3, 24);
        testMedianPivotDistributed(bigIndexedArrayZeroToTwentyNine, 27, 27, 5, 27);
        testMedianPivotDistributed(bigIndexedArrayZeroToTwentyNine, 2, 25, 1, 2);
        testMedianPivotDistributed(bigIndexedArrayZeroToTwentyNine, 16, 19, 2, 16);
        testMedianPivotDistributed(bigIndexedArrayZeroToTwentyNine, 4, 9, 4, 5);
        testMedianPivotDistributed(bigIndexedArrayZeroToTwentyNine, 1, 8, 10, 4);
        testMedianPivotDistributed(bigIndexedArrayZeroToTwentyNine, 13, 25, 100, 19);
        testMedianPivotDistributed(bigIndexedArrayZeroToTwentyNine, 1, 27, 8, 10);
        testMedianPivotDistributed(bigIndexedArrayZeroToTwentyNine, 18, 19, 7, 18);
        testMedianPivotDistributed(bigIndexedArrayZeroToTwentyNine, 9, 29, 9, 17);

        testMedianPivotDistributed(bigIndexedArrayZeroToTwentyNine, 18, 28, 3, 23);
        testMedianPivotDistributed(bigIndexedArrayZeroToTwentyNine, 19, 29, 3, 24);
        testMedianPivotDistributed(bigIndexedArrayZeroToTwentyNine, 5, 8, 3, 6);
        testMedianPivotDistributed(bigIndexedArrayZeroToTwentyNine, 6, 29, 3, 17);
        testMedianPivotDistributed(bigIndexedArrayZeroToTwentyNine, 7, 18, 3, 12);

        testMedianPivotDistributed(bigIndexedArrayZeroToTwentyNine, 0, 26, 3, 13);
        testMedianPivotDistributed(bigIndexedArrayZeroToTwentyNine, 0, 27, 3, 13);
        testMedianPivotDistributed(bigIndexedArrayZeroToTwentyNine, 0, 28, 3, 14);
        testMedianPivotDistributed(bigIndexedArrayZeroToTwentyNine, 1, 25, 3, 13);
        testMedianPivotDistributed(bigIndexedArrayZeroToTwentyNine, 1, 17, 3, 9);

        testMedianPivotDistributed(bigIndexedArrayZeroToTwentyNine, 18, 28, 5, 22);
        testMedianPivotDistributed(bigIndexedArrayZeroToTwentyNine, 19, 19, 5, 19);
        testMedianPivotDistributed(bigIndexedArrayZeroToTwentyNine, 5, 18, 5, 11);
        testMedianPivotDistributed(bigIndexedArrayZeroToTwentyNine, 26, 29, 5, 27);
        testMedianPivotDistributed(bigIndexedArrayZeroToTwentyNine, 7, 11, 5, 9);

        testMedianPivotDistributed(bigIndexedArrayZeroToTwentyNine, 0, 6, 5, 2);
        testMedianPivotDistributed(bigIndexedArrayZeroToTwentyNine, 0, 7, 5, 2);
        testMedianPivotDistributed(bigIndexedArrayZeroToTwentyNine, 0, 8, 5, 4);
        testMedianPivotDistributed(bigIndexedArrayZeroToTwentyNine, 1, 5, 5, 3);
        testMedianPivotDistributed(bigIndexedArrayZeroToTwentyNine, 1, 7, 5, 3);

        testMedianPivotDistributed(randomArrayLengthTen, 0, 9, 3, 4);
        testMedianPivotDistributed(randomArrayLengthTen, 0, 9, 5, 6);
        testMedianPivotDistributed(randomArrayLengthTen, 1, 9, 5, 5);
        testMedianPivotDistributed(randomArrayLengthTen, 0, 9, 1, 0);
        testMedianPivotDistributed(randomArrayLengthTen, 0, 9, 2, 9);
        testMedianPivotDistributed(randomArrayLengthTen, 0, 9, 4, 3);
        testMedianPivotDistributed(randomArrayLengthTen, 0, 9, 10, 5);
        testMedianPivotDistributed(randomArrayLengthTen, 0, 9, 100, 5);
        testMedianPivotDistributed(randomArrayLengthTen, 0, 9, 8, 5);
        testMedianPivotDistributed(randomArrayLengthTen, 0, 9, 7, 3);
        testMedianPivotDistributed(randomArrayLengthTen, 0, 9, 9, 5);

        testMedianPivotDistributed(randomArrayLengthTen, 1, 8, 3, 1);
        testMedianPivotDistributed(randomArrayLengthTen, 7, 7, 5, 7);
        testMedianPivotDistributed(randomArrayLengthTen, 2, 5, 1, 2);
        testMedianPivotDistributed(randomArrayLengthTen, 6, 9, 2, 6);
        testMedianPivotDistributed(randomArrayLengthTen, 4, 9, 4, 4);
        testMedianPivotDistributed(randomArrayLengthTen, 1, 8, 10, 4);
        testMedianPivotDistributed(randomArrayLengthTen, 3, 5, 100, 5);
        testMedianPivotDistributed(randomArrayLengthTen, 1, 7, 8, 5);
        testMedianPivotDistributed(randomArrayLengthTen, 8, 9, 7, 8);
        testMedianPivotDistributed(randomArrayLengthTen, 9, 9, 9, 9);

        testMedianPivotDistributed(randomArrayLengthTen, 8, 8, 3, 8);
        testMedianPivotDistributed(randomArrayLengthTen, 9, 9, 3, 9);
        testMedianPivotDistributed(randomArrayLengthTen, 5, 8, 3, 5);
        testMedianPivotDistributed(randomArrayLengthTen, 6, 9, 3, 7);
        testMedianPivotDistributed(randomArrayLengthTen, 7, 8, 3, 8);

        testMedianPivotDistributed(randomArrayLengthTen, 0, 6, 3, 3);
        testMedianPivotDistributed(randomArrayLengthTen, 0, 7, 3, 3);
        testMedianPivotDistributed(randomArrayLengthTen, 0, 8, 3, 4);
        testMedianPivotDistributed(randomArrayLengthTen, 1, 5, 3, 5);
        testMedianPivotDistributed(randomArrayLengthTen, 1, 7, 3, 1);

        testMedianPivotDistributed(randomArrayLengthTen, 8, 8, 5, 8);
        testMedianPivotDistributed(randomArrayLengthTen, 9, 9, 5, 9);
        testMedianPivotDistributed(randomArrayLengthTen, 5, 8, 5, 7);
        testMedianPivotDistributed(randomArrayLengthTen, 6, 9, 5, 7);
        testMedianPivotDistributed(randomArrayLengthTen, 7, 8, 5, 8);

        testMedianPivotDistributed(randomArrayLengthTen, 0, 6, 5, 3);
        testMedianPivotDistributed(randomArrayLengthTen, 0, 7, 5, 3);
        testMedianPivotDistributed(randomArrayLengthTen, 0, 8, 5, 6);
        testMedianPivotDistributed(randomArrayLengthTen, 1, 5, 5, 5);
        testMedianPivotDistributed(randomArrayLengthTen, 1, 7, 5, 5);


        System.out.println(GREEN + "MedianPivotDistributed tests executed" + RESET);
        System.out.println();
    }

    private static void testMedianPivotDistributed(int[] array, int from, int to, int numberOfConsideredElements, int expected) {
        try {
            if(array == null) System.out.println(YELLOW + "Invalid test parameter: array can not be null" + RESET);
            if(array.length == 0) System.out.println(YELLOW + "Invalid test parameter: array can not be empty" + RESET);
            if(from < 0 || from >= array.length) System.out.println(YELLOW + "Invalid test parameter: from can not be outside the array" + RESET);
            if(to < 0 || to >= array.length) System.out.println(YELLOW + "Invalid test parameter: to can not be outside the array" + RESET);
            if(from > to) System.out.println(YELLOW + "Invalid test parameter: from can not be larger than to" + RESET);
            if(numberOfConsideredElements <= 0) System.out.println(YELLOW + "Invalid test parameter: numberOfConsideredElements can not be below or equal to one" + RESET);
            if(expected < 0 || expected >= array.length) System.out.println(YELLOW + "Invalid test parameter: the expected value has to be within the array" + RESET);
            PivotFinder pv = PivotFinder.getMedianPivotDistributed(numberOfConsideredElements);
            int result = pv.findPivot(array, from, to);
            if(result != expected) System.out.println(RED + "Test with " + Arrays.toString(array) + " for values from = " + from + ", to = " + to + ", numberOfConsideredElements = " + numberOfConsideredElements + " failed. Expected " + expected + " but got " + result + RESET);
        } catch(IndexOutOfBoundsException e) {
            System.out.println(RED + "Test with " + Arrays.toString(array) + " for values from = " + from + ", to = " + to + ", numberOfConsideredElements = " + numberOfConsideredElements + " had an IndexOutOfBoundsException." + RESET);
        }
    }
}
