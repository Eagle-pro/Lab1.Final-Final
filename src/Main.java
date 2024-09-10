//Lab1
// for submission
public class Main {
        public static void main(String[] args) {
//Task 1 -Range
                int[] numbers = {93, 67, 3, 7, 86, 45};
                int smallest = Integer.MAX_VALUE;
                int largest = Integer.MIN_VALUE;
                for (int number : numbers) {
                    if (number < smallest) {
                        smallest = number;
                    }
                    if (number > largest) {
                        largest = number;
                    }
                }
                int difference = largest - smallest;
                System.out.println("Task 1. Solution\n 1.1. The smallest number is: " + smallest);
                System.out.println(" 1.2. The largest number is: " + largest);
                System.out.println(" 1.3. The difference between the largest and smallest numbers is: " + difference);
//Task 2
                int firstBiggest = Integer.MIN_VALUE;
                int secondBiggest = Integer.MIN_VALUE;
                for (int number : numbers) {
                    if (number > firstBiggest) {
                        secondBiggest = firstBiggest;
                        firstBiggest = number;
                    } else if (number > secondBiggest && number != firstBiggest) {
                        secondBiggest = number;
                    }
                }
                System.out.println("Task 2. Solution\n 2.1. The first biggest number is: " + firstBiggest);
                System.out.println(" 2.2. The second biggest number is: " + secondBiggest);
//Task 3- calculate
                double x = 1;
                double y = 2;
                double xSquared = Math.pow(x, 2);
                double term = (4 * y / 5) - x;
                double termSquared = Math.pow(term, 2);
                double result;
                result = xSquared + termSquared;
                System.out.println("Task 3. Solution\n 3.1. The result of the expression x^2 + ((4y/5) - x)^2 is: " + result);
            }
        }
