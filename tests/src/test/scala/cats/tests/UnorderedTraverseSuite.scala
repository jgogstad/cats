package cats.tests

import cats.Id
import cats.syntax.unorderedTraverse._

class UnorderedTraverseSuite extends CatsSuite {
  test("UnorderedTraverse[Set[Int]].unorderedTraverse via syntax") {
    forAll { (ins: Set[Int]) =>
      ins.unorderedTraverse(in => in: Id[Int]).toList.sorted should ===(ins.toList.sorted)
    }
  }
}
