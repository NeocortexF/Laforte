package dz1;

class SelectSortApp {

    public static void main(String[] args) {
        int maxSize = 100000;            // array size
        ArraySel arr;                 // reference to array
        arr = new ArraySel(maxSize);  // create the array

        for (int i = 0; i < maxSize; i++) {
            // Заполнение массива случайными числами 
            long n = (long) (java.lang.Math.random() * (maxSize - 1));
            arr.insert(n);
        }

        arr.display();                // display items

        arr.selectionSort();          // selection-sort them

        arr.display();                // display them again
    }  // end main()
} // end class SelectSortApp