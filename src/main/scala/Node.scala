import scala.annotation.tailrec

case class Node(elem: Int, left: IntTree, right: IntTree) extends IntTree {

  override def contains(v: Int): Boolean = {
    @tailrec
    def contains(tree: IntTree, v: Int): Boolean = tree match {
      case Node(value, _, _) if (value == v) => true
      case Node(value, l, r) =>
        if (value > v) contains(l, v)
        else contains(r, v)
      case _ => false
    }
    contains(this,v)
  }

  override def insert(x: Int): IntTree = {
    def insert(tree: IntTree, x: Int): IntTree = tree match {
      case Node(data, l, r) if (data > x)  => Node(data, insert(l, x), r)
      case EmptyTree => tree insert x
      case _ => tree
    }

    insert(this,x)
  }
}