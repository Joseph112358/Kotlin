

fun main(){

        val num1 = Num(3)
        val num2 = Num(2)
        val sum = Sum(num1,num2)
        println(eval(sum))


}
sealed interface Expr
class Num(val value: Int) :Expr
class Sum(val left: Expr, val right: Expr) : Expr

fun eval(expr: Expr): Int =
    when (expr) {
        is Num -> expr.value
        is Sum -> eval(expr.left) + eval(expr.right)
    }