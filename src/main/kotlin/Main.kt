fun main() {
    enterName("Hello everyone")
    addTwoNumbers(25,7)
    sumOfNumbers(6,8,5,9)
    printOfInterest("My interests are discovering new things, travelling  and reading novels")

}
fun enterName(name:String):String{
    println(name)
    return name

}
fun addTwoNumbers(num1:Int,num2:Int):Int{
     var result=num1%num2
    println(result)
    return result

}
fun sumOfNumbers(numb1:Int,numb2:Int,numb3:Int,numb4:Int):Int{
    var sum=numb1+numb2+numb3+numb4
    println(sum)
    return sum
}
fun printOfInterest(Interest:String):String{
    println(Interest)
    return Interest

}
