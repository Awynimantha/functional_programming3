object second extends App{ 
     def toUpper(string:String):String={
          var str=""
          for(i<-string){
               if(i.isLower)   str=str.concat(((i-32).toChar).toString)
               else str=str.concat(i.toString)
          }
          str
     }
  
     def toLower(string:String):String={
          var str=""
          for(i<-string){
               if(i.isUpper)   str=str.concat(((i+32).toChar).toString)
               else str=str.concat(i.toString)
          }
          str
     }   


     def formatNames(names:String,f:(String)=>String):String={
          f(names)
     }

     
     println(formatNames("Benny",toUpper))
     println(formatNames("Saman",toLower))
  
}