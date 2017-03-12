package dz1;

class InsertSortApp {
    //3 секунды
    public static void main(String[] args) {
        int maxSize = 100000;            // array size
        ArrayIns arr;                 // reference to array
        arr = new ArrayIns(maxSize);  // create the array

        for (int i = 0; i < maxSize; i++) {
            // Заполнение массива случайными числами 
            long n = (long)(java.lang.Math.random()*(maxSize-1));
            arr.insert(n);
        }

        arr.display();                // display items

        arr.insertionSort();          // insertion-sort them

        arr.display();                // display them again
    }  // end main()
} // end class InsertSortApp
