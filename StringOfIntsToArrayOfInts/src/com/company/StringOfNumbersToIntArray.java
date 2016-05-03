package com.company;

public class StringOfNumbersToIntArray {

    public String removeSpaces (String numbers) {
        String numberStringWithoutSpaces = numbers.replaceAll(" ", "");

        return numberStringWithoutSpaces;
    }

    public void arrayOfNumbersAsStrings(String numbersWithOutSpaces) {
        String stringWithSpacesRemoved = removeSpaces(numbersWithOutSpaces);
        int negativeValueTracker = 0;
        for (int i = 0; i < stringWithSpacesRemoved.length(); i++) {
            if (stringWithSpacesRemoved.charAt(i)== '-') {
                negativeValueTracker += 1;
            }
        }
        String[] valueHolder = new String[stringWithSpacesRemoved.length()-negativeValueTracker];
        int k = 0;
        for(int j = 0; j< stringWithSpacesRemoved.length(); j++){
            if(stringWithSpacesRemoved.charAt(j)== '-'){
                valueHolder[k] = (stringWithSpacesRemoved.charAt(j)+"")+(stringWithSpacesRemoved.charAt(j+1)+"");
                k++;
                j++;
            } else{
                valueHolder[k] = stringWithSpacesRemoved.charAt(j) + "";
                k++;
            }
        }
        int[] numberArray = new int[valueHolder.length];
        for(int q = 0; q < valueHolder.length; q++){
            numberArray[q] = Integer.parseInt(valueHolder[q]);
        }

        for(int r = 0; r < numberArray.length; r++){
            System.out.println(numberArray[r]);
        }
    }



    public static void main(String[] args) {
        StringOfNumbersToIntArray solution = new StringOfNumbersToIntArray();
        solution.arrayOfNumbersAsStrings("-1 -2 3 4");
    }
}
