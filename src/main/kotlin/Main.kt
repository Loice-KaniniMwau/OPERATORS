fun main(){
    name("faith")
    name("rebecca")

    var result= remainder(600, 198)
    println(result)

    var y= add(456,467,8390, 4628)
    println(y)

    name1("loice")




}
fun name(name: String){
    println("hello " + name)


}
fun remainder(num1:Int, num2: Int):Int{
    var remains= num1 % num2
    return(remains)

}
fun add(num1: Int, num2: Int,num3: Int,num4: Int):Int{
    var addition= num1+ num2+ num3+ num4
    return addition
}
fun name1(name: String){
println(name + "is afraid of swimming pools")
}


