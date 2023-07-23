import java.util.Scanner

fun main(args: Array<String>){
    val sc = Scanner(System.`in`)
    println("Enter the number: ")
    var num= sc.nextInt()
    var reverse =0

    while (num !=0 ){
        val digit = num % 10
        reverse= (reverse*10)+digit
        num = num/10

     }
    println("The reverse number is: $reverse ")


}