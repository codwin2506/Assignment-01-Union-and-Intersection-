import org.scalatest.funsuite.AnyFunSuite

class NodeTest extends AnyFunSuite{

  val test1: Node =  Node(1,EmptyTree,EmptyTree)
  val test2: Node =  Node(2,test1,EmptyTree)
  val test3: Node =  Node(3, Node(4, Node(5,EmptyTree,EmptyTree),EmptyTree), Node(6,EmptyTree, Node(7,EmptyTree,EmptyTree)))
  test1.insert(15)
  test1.insert(30)
  test1.insert(45)

  test("Check whether node is present in the tree or not ") {
    assert(test1.contains(1) == true)
    assert(test2.contains(2) == true)
    assert(test2.contains(8) == false)
    assert(test2.contains(35) == false)
    assert(test1.contains(42) == false)
  }
}
