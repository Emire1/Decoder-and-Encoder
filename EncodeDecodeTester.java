//package lab1;

public class EncodeDecodeTester {
    public static void main(String[] args) {

        //Initialize the elements to be tested
        String[] test1 = {"Emmanuel", "Tegan", "Broc$port", "me145",
                "colors", " University", "Super", "258Hello", "ABcde", "Alphabet"};


        //Instantiate the new class and pass in test1 as argument
        EncodeDecode encodeDecode = new EncodeDecode(test1);

        //Set eList and get the encoded list
        String[] eList = encodeDecode.getEncodedList();

        //Set dList and get the decoded list
        String[] dList = encodeDecode.getDecodedList();


        //Print out the test
        System.out.println("Test Plan" + "\n" +
                "--------------------------------------------------------");
        for (int i = 0; i < test1.length; i++) {
            System.out.println("\nOriginal list: " + test1[i] + "\t" + " \nEncoded list: " + eList[i] + "\t" + " " +
                    "\nDecoded list: " + dList[i]);

        }


    }
}
