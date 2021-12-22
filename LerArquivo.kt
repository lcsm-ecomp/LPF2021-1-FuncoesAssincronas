import java.io.*
import kotlin.io.*
import kotlinx.coroutines.*


fun main() {
    runBlocking {
       val start = System.currentTimeMillis();
       val job1 = GlobalScope.async {
          File("ola.txt").readText();
       }
       val job2 = GlobalScope.async {
          File("oi.txt").readText();
       }
    
       val end = System.currentTimeMillis();
    
       // fiz um monte de outras tarefas....

       job1.join()

       println("Conteudo 1 = ${job1.await()}")
       println("Conteudo 2 = ${job2.await()}")

       println("Tempo gasto : ${end-start}ms")
    }
}