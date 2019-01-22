package quick
import org.openjdk.jmh.annotations.{Benchmark, Scope, State}

@State(Scope.Thread)
class QuickBench {
   private val testSmallXS: List[Int] = (1 to 20).toList
   private val testSmallVec: Vector[Int] = testSmallXS.toVector

   private val testMedXS: List[Int] = (1 to 1000000).toList
   private val testMedlVec: Vector[Int] = testMedXS.toVector

   @Benchmark def mapSmallList: List[Int] = testSmallXS.map(_ + 1)
   @Benchmark def mapMedList: List[Int] = testMedXS.map(_ + 1)

}
