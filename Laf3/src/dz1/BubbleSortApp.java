package dz1;

class BubbleSortApp {

    public static void main(String[] args) {
        int maxSize = 100000;            // array size ..10000дз
        ArrayBub arr;                 // reference to array
        arr = new ArrayBub(maxSize);  // create the array

        for (int i = 0; i < maxSize; i++) {
            // Заполнение массива случайными числами 
            long n = (long)(java.lang.Math.random()*(maxSize-1));
            arr.insert(n);
        }

        arr.display();                // display items

        arr.bubbleSort();             // bubble sort them

        arr.display();                // display them again
    }  // end main()
} // end class BubbleSortApp