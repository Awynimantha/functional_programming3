object second extends App{ 

    def checknum(n:Int):Unit=n match{
            case x if(x<=0)=>{ 
                println("Negative/Zero")
                if(x%2==0) println("Even")
                else println("Odd")
                }
    }
    checknum(-2)


}