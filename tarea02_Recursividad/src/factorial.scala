

object factorial {
  
  def factoriales(numero:Int):Int={
    if(numero>0)
    return numero*factoriales(numero-1)
    else 1
  }
  
  def main(args: Array[String]): Unit = {
    println("ingrese el numero para calcular su factorial:")
    val numero=readInt()
    println(factoriales(numero))
    
  }
  
}