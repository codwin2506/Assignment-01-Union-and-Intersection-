
import org.scalatest.funsuite.AnyFunSuite
class UnionIntersectionTest extends AnyFunSuite {

    val set1:Set[Int]=Set(1,2,3,4,5)
    val set2:Set[Int]=Set(1,6,3,7,7)
    val test1: UnionIntersection = new UnionIntersection()
    val test2: UnionIntersection = new UnionIntersection()
    test("Intersection of two sets ") {
      assert(test1.theIntersection(set1,set2) == Set(1,3))
      assert(test1.theUnion(set1,set2) == Set(1,2,3,4,5,6,7))
    }

  val set3:Set[Int]=Set(1,25,3,40,5)
  val set4:Set[Int]=Set(10,6,3,75,7)

  test("Union of two sets ") {
    assert(test1.theUnion(set1,set2) == Set(1,2,3,4,5,6,7))
  }
}
