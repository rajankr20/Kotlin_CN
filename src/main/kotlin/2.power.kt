import java.util.Scanner

fun main(){
     val read = Scanner(System.`in`)
    println("Enter the value of x:")
    val x= read.nextInt()
    println("Enter the value of n:")
    val n= read.nextInt()

    var result =1
     for(i in 1..n)
         result *=x


    println("Result:"+ result)
}