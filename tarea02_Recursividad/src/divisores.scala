

object divisores {
  
  def generacion():Unit={
println ("Ingrese el número correspondiente")
val numero=readInt ()
divisores(numero,numero)
}

  def divisores (numero: Int, divisor:Int):Unit={
if(divisor>0)
if(numero % divisor ==0) {
println ("divisor:"+divisor)
divisores (numero, divisor-1)
} else{
divisores (numero, divisor-1)
 }
}

  

  def main(args: Array[String]): Unit = {
   
generacion()
    
  }
  
}