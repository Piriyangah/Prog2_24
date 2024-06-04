package uebung8_280524;

public class FizzBuzz {
    public String fizzbussPruefung(int n) {
        if(n % 3==0 && n % 5== 0) {
            return "FizzBuzz";
        }
        if(n % 5==0){
            return "Buzz";
        }
        if(n % 5==0){
            return "Fizz";
        }
        else return String.valueOf(n); //gibt den Wert von n wenn es oben nichts von zutrifft
    }

    public void printFizzBuzz(){
        for (int i = 1; i <= 100 ; i++) {
            String result = fizzbussPruefung(i);
            System.out.println(result);
        }
    }

    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.printFizzBuzz();
    }


}
