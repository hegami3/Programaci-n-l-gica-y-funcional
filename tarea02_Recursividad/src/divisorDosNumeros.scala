import scala.math._

object divisorDosNumeros {
  
  def generación ():Unit={
    println("Ingresé el primer numero:")
    val numero1=abs(readInt())
    println ("Ingresé el segundo número:")
    val numero2=abs(readInt())
    if(numero1>numero2){
      divisores(numero1,numero2, numero1)
    } else {
    divisores(numero1,numero2, numero2)
    }
  }

  def divisores (numero1: Int, numero2:Int,divisor:Int):Unit={
    if(divisor>0){
      if(numero1 % divisor ==0 && numero2 % divisor==0) {
        println ("divisor: "+divisor)
        divisores (numero1, numero2, divisor-1)
      } else{
        divisores (numero1, numero2,divisor-1)
      }
    }
  }
  
  def main(args: Array[String]): Unit = {
    generación()
  }
}