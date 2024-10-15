public class assignmenttt {


    // Question1
    // Write a Java method to compute the averageof three numbers..

    // public static int average(int a , int b , int c){
    //     return (a+b+c)/3;
    // }
    // public static void main(String[] args) {
    //     System.out.println(average(12, 15, 18));
    // }



    // Question2
    // WriteamethodnamedisEventhatacceptsanintargument.Themethod shouldreturntrueiftheargumentiseven,orfalseotherwise.Alsowriteaprogramtotestyourmethod.Question3:WriteaJavaprogramtocheckifanumberisapalindromeinJava?(121isapalindrome, 321 is not)Anumberiscalledapalindromeifthenumberisequaltothereverseofanumbere.g.,121isapalindromebecausethereverseof121is121itself.Ontheotherhand,321isnotapalindrome because the reverse of 321 is 123, which is not equal to 321.Question 4 :READ&CODEEXERCISESearch about(Google) & use the following methods of the Math class in Java:a.Math.min( )b.Math.max( )c.Math.sqrt( )d.Math.pow( )e.Math.avg( )f.Math.abs( )Free reading resource (https://www.javatpoint.com/java-math)Please feel free to look for more resources/websites on your own.Question 5 :Write a Java method to compute the sum of the digits in an integer.(Hint: Approach this question in the following way:a.Take a variable sum = 0b.Find the last digit of the numberc.Add it to the sumd.Repeat a & b until the number becomes 0 )nj22260@gmail.com
    public static boolean isEven(int n){
        
            if(n%2==0){
               
                return true;
                
                
            }else{
                return false;
            }

        }
        public static void main(String[] args) {
            System.out.println(isEven(6));
        }

    }
    

    




