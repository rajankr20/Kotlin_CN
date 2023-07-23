import java.util.Scanner

//Fahrenheit to Celcius
//
//Given three values - Start Fahrenheit Value (S), End Fahrenheit value (E) and Step Size (W),
// you need to convert all Fahrenheit values from Start to End at the gap of W, into their corresponding Celsius values and print the table.
//Input Format :
//3 integers - S, E and W respectively
//Output Format :
//Fahrenheit to Celsius conversion table. One line for every Fahrenheit and Celsius Fahrenheit value.
// Fahrenheit value and its corresponding Celsius value should be separate by tab ("\t")

fun main(args: Array<String>){
    val sc = Scanner(System.`in`)
    var s = sc.nextInt()
    var e = sc.nextInt()
    var w = sc.nextInt()

    printCelsius(s , e , w)
}
 fun  printCelsius(s:Int , e:Int, w:Int){
     (s..e step w).forEach{fr -> val cel = ((fr-32)*5/9)
     println("$fr  $cel")
     }
 }