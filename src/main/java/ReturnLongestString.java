
public class ReturnLongestString {
    /**
     * Return the longest String out of arr.
     * Remember that you can get the length of String with str.length().
     *
     * @param arr an array of Strings.
     * @return the longest String within arr. You can assume that there are no ties for the longest string.
     */
    public String longest(String[] arr){
        int ind = 0;
       for(int x = 0; x < arr.length; x++){
        if(arr[x].length() > arr[ind].length()){
            ind = x;
        }
       }
       return arr[ind];
        
    }
}

