

object sumatoriaAB {
  def sumatoriaIF(inicio: Int, fin:Int):Int={   
   if(inicio<=fin)
     return inicio+sumatoriaIF(inicio+1, fin)
   else return 0
 }
  
  def main(args: Array[String]): Unit = {    
  println(sumatoriaIF(3, 10))
    
  }
}