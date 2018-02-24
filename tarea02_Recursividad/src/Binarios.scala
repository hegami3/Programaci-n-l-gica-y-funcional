

object Binarios {
 def binarios(numero: Int):Unit={
  if(numero>0){
        if(numero % 2==0)
        {par(numero)
          binarios(numero/2) 
          
        }else{
          impar(numero)
          binarios((numero-1)/2)
        }
          
     def par(numero:Int):Unit={
     println(numero+"\t0(par). Dividimos entre dos:")        
     }
     def impar(numero:Int):Unit={
     println(numero+"\t1(impar). Dividimos entre dos:")        
     }
  }
 }
   def main(args: Array[String]): Unit = {
   println("Ingrese el numero correspondiente:")
   val numero=readInt()
   binarios(numero)
   }
}