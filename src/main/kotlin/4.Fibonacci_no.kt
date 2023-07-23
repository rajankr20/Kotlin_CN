import java.util.Scanner



fun main (args:Array<String>){
    val sc = Scanner(System.`in`)
    val n= sc.nextInt()
    var num1 = 0
    var num2 =1
    print("first $n terms:")
    for(i in 1..n){
        print("$num1 ,")
        var temp = num1+num2
        num1=num2
        num2=temp
    }
                  }



// given number n , figure out if it is a member of fibonacci series or not. return true if the number is member
// of fibonacci : fibonacci series is defined by the redurrence f(n)= f(n-1)+f(n-2) , f(0)=0 , f(1)=1.

//fun main(args: Array<String>) {
//    var sc = Scanner(System.`in`)
//    println("enter the value of n: ")
//    var n = sc.nextInt()
//
//    print(isMember(n))
//}
//    fun isMember (num : Int): Boolean{
//        var num1 =0
//        var num2 = 1
//        while (num> num2 ){
//            var temp = num1+num2
//            num1 = num2
//            num2= temp
//        }
//        if (num==0 || num2==num) {
//            return true
//        }else{
//            return false
//
//        }
//
//    }

