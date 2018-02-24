

object cosiente {
  def cocienteDivision(dividendo: Int,divisor:Int):Int={
    if(divisor<=dividendo){
    return 1+cocienteDivision(dividendo-divisor, divisor)
    }else return 0
  }
  def main(args: Array[String]): Unit = {
    
    println("Ingrese el dividendo:")
    val dividendo=readInt()
    println("ingrese el divisor")
    val divisor=readInt()
    
    println("El cosiente entero es:"+cocienteDivision(dividendo, divisor))
        
    
  }
}