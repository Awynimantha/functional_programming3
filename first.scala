object second extends App{ 
     def give_interest(deposit:Double):Double=deposit match{
          case x if(x>200000) =>6.5
          case x if(x>=20000)=>4
          case _ =>2
     }
     println(give_interest(2000000))
     println(give_interest(40000))
        
}