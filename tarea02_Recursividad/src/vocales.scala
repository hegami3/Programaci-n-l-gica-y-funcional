
object vocales {
  def detectarVocal(palabra:String):Int={
  if(palabra.length()>0){  
    if(palabra.charAt(0).equals('a') || 
       palabra.charAt(0).equals('e') || 
       palabra.charAt(0).equals('i') ||
       palabra.charAt(0).equals('o') ||
       palabra.charAt(0).equals('u'))
    return 1+detectarVocal(palabra.substring(1))
    else return detectarVocal(palabra.substring(1))    
    } else 0
  }  
  
  def main(args: Array[String]): Unit = {
    println("Ingrese la palabra correspondiente:")
    val palabra=readLine()
    println("El numero de vocales es: "+detectarVocal(palabra))
  }
}