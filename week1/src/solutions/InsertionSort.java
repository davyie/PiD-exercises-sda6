public class InsertionSort {
    private Object[] list; 

    
    public InsertionSort(Object[] list) {
        this.list = list; 
    }

    public Object[] sort() {
        int i = 1, j = 1;
        while (i < list.length) {
            j = i; 
            while (j >= 0 && (int) list[j-1] > (int) list[j]) {
                // Swap the elements 
                Object obj = list[j]; 
                list[j] = list[j-1];
                list[j-1] = obj;
                j--;
            } 
            i++; // Move to next element 
        }

        return list;
    }

    public static void main(String[] args) {
        Object[] list = {0, 2, 1, 4, 3, 1, 3, 10, 5, 6, 7, 8, 9, 33, 41, 111};
        InsertionSort is = new InsertionSort(list);
        list = is.sort();
        for (Object obj : list) {
            System.out.println((int) obj);
        }
    }
}