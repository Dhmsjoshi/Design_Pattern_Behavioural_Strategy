package Design_Pattern_Behavioural_Strategy;



public class Client {
    public static void main(String[] args) {
        Maps maps = new Maps();
        maps.getPath("Bihar","Rajasthan",TransportationMode.BIKE);



    }
}

//Sorter -> sort(int[] array)
//BubbleSorter -> implement Sorter
//MergerSorter -> implement sorter

//Sorter Factory -> Give objects
//Main -> use factory to get sorter objects , then use sorter objects to sort.