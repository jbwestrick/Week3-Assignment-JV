import java.lang.reflect.Array;

public class wk3_coding_assignment {

  public static void main(String[] args) {
    /*1.    Create an array of int called ages that contains the following 
     * values: 3, 9, 23, 64, 2, 8, 28, 93.
     */
 int [] ages = {3, 9, 23, 64, 2, 8, 28, 93};
/*a.Programmatically subtract the value of the first element in the array from the 
 * value in the last element of the array
 *(i.e. do not use ages[7] in your code). 
 * Print the result to the console.
 */
 int size = ages.length;
 
 int result = (ages[size-1]) - (ages[0]);
  System.out.println("#1a. Result: " + result);
  
/*b.Add a new age to your array and repeat the step above to
 * ensure it is dynamic (works for arrays of different lengths).
 */
  int [] ages2 = {3, 9, 23, 64, 2, 8, 28, 93, 88, 98, 6}; 
  int size2 = ages2.length;
  int result2 = (ages2[size2 -1]) - (ages2[0]);
System.out.println("#1b. Result2: " + result2);
 
  /*c.Use a loop to iterate through the array and calculate the average age. 
  * Print the result to the console.
  */

double sum = 0;
for (int number: ages) {
  sum+=number;
}
 double average = sum / ages.length ;
  System.out.println("#1c. Average of Age: " + average);
     
  //2.  Create an array of String called names that contains the following 
  //values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
  
  String[] names = {"Sam","Tommy","Tim","Sally","Buck","Bob"};
  
  //a.    Use a loop to iterate through the array and calculate the 
  //average number of letters per name. Print the result to the console.
  var total = 0;
  for (var i = 0; i<Array.getLength(names); i++) {
    total += Array.getLength(names);
      }
  var averages = total/Array.getLength(names);
  System.out.println("#2a. Average number of letters per name: " + averages);
  
  /*b.  Use a loop to iterate through the array again and concatenate all 
   * the names together, separated by spaces, and print the result to the console.
   */
for (String name: names)
{System.out.print( name +" ");
  }System.out.print(System.lineSeparator());

//3.    How do you access the last element of any array? -by using nameOfArray[-1]

//4.    How do you access the first element of any array? -- by using nameOfArray[0]

//5.  Create a new array of int called nameLengths. Write a loop to iterate over the previously 
//created names array and add the length of each name to the nameLengths array.


  int[] nameLengths = new int[names.length];
  for(int i = 0; i < names.length; i++){
      nameLengths[i] = names[i].length();
      System.out.print(nameLengths[i] + " "); }  
  System.out.print(System.lineSeparator());
  
  /* 6. Write a loop to iterate over the nameLengths array and 
   * calculate the sum of all the elements in the array. Print the result to the console.
   */
 sum = 0; 
  for (int i = 0; i < nameLengths.length; i++) {
    sum = sum + nameLengths[i];
           } 
  System.out.println("#6. The sum of all lengths in nameLengths[] is:" + sum);

  /*7.  Write a method that takes a String, word, and an int, n, as arguments and 
   * returns the word concatenated to itself n number of times.
   *  (i.e. if I pass in “Hello” and 3, I would expect the method to return “HelloHelloHello”).
   */
  String userWord = "Hello";
  String longString ="";
  for (int u= 0; u < 3; u++) {
     longString += userWord;
  }
  System.out.println("#7. " +longString);
  
  /*8.  Write a method that takes two Strings, firstName and lastName, and returns a 
   * full name (the full name should be the first and the last name as a String separated by a space).
   */

  String firstName = "Bob";
  String lastName = "Ross";
  String fullName =  createFullName(firstName, lastName);
  System.out.println("#8. " + fullName);
 
  
/*9.    Write a method that takes an array of int and returns 
 * true if the sum of all the ints in the array is greater than 100.  
 */

   System.out.println("#9. " + (sumIntsArray(ages)));
 
   /*10.Write a method that takes an array of double 
    * and returns the average of all the elements in the array.
    */
   double[] doubles = {40, 30, 62};
   System.out.println("#10. " +(calculateAverage(doubles)));
   
   /*11.Write a method that takes two arrays of double 
    * and returns true if the average of the elements in the first array is 
    * greater than the average of the elements in the second array.
    */
  double[] array1 = new double [] {5,3,8,10,115,293};
  double[] array2 = new double [] {8,15,64,85};
  System.out.println("#11. " + (average(array1, array2)));
  
  //12.  Write a method called willBuyDrink that takes a boolean isHotOutside, 
  //and a double moneyInPocket, and returns true if it is hot outside
  // and if moneyInPocket is greater than 10.50.
  
  boolean isHotOutside1 = true;
  double moneyInPocket1 = 20.12;
  System.out.println("#12. " + (willBuyDrink(isHotOutside1, moneyInPocket1)));

  
  //13. Create a method of your own that solves a problem. 
  //In comments, write what the method does and why you created it.
  //can I take a nap?
  double hoursFree = 2;
  boolean haveHomeWork = true;
System.out.println("#13. " + (canITakeNap(haveHomeWork, hoursFree)));
  
  }
    
  //#8
  public static String createFullName(String x, String y) {
    return  x + " " + y;
  }
  
  //#9
  public static boolean sumIntsArray(int[] ages) {
    int sum = 0; 
    for (int i = 0; i < ages.length; i++) {
      sum = sum + ages[i];
    if (sum > 100) {
      return true;
    } 
    }
    return false; 
  }
  
  //#10
  public static double calculateAverage(double[] ages) {
    double sum = 0;
    for (double number: ages) {
      sum += number;
    }
    return sum / ages.length;
  }
  
//#11
  public static boolean average(double[] array1, double[] array2) {
    double sum1 = 0.0;
    double sum2 = 0.0;
    for (double number : array1) {
      sum1 += number;
          }
//System.out.println(sum1 / array1.length);
    for (double number : array2) {
      sum2 += number;
          }
  //  System.out.println(sum2 / array2.length);
   if ((sum1 / array1.length) > (sum2 / array2.length)) {
   return true;
  }return false;
  }
  
  //#12
  public static boolean willBuyDrink (boolean isHotOutside, double moneyInPocket) {
        if ((moneyInPocket > 10.50) && isHotOutside) {
      return true;
    }else {
    return false;
  } 
  }
  
  //#13 can I go to sleep 
  public static boolean canITakeNap(boolean haveHomeWork, double hoursFree) {
    if((hoursFree >= 5) && haveHomeWork) {
      return true;
    } else {
      return false;
    }
  }
  }
  
