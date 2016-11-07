public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[] {5,3,3,3,2,-1,6};

        for (int i = 0; i < numbers.length-1; i++)
        {
            int index = i;
            for (int j = i+1; j < numbers.length; j++)
                if (numbers[j] < numbers[index]) //Finds smallest numbers
                    index = j;

            int smallerNumber = numbers[index];  //Swap
            numbers[index] = numbers[i];
            numbers[i] = smallerNumber;

        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

    }
    //psvm
    //sout
    //fori
    //ctrl + alt + v - extract variable
    //ctrl + alt + m - extract method
    //shift + F6 - rename

}