import scala.collection.mutable.Stack;
import scala.util.control.Breaks._;

object Main extends App {

  def parenthesesAreBalanced(chars: String): Boolean = {
    val parentheses = "[]{}()"
    var stack = new Stack[Int]()
    var bracePosition: Int = -1;

    for (character <- chars) {
      breakable {
        bracePosition = parentheses.indexOf(character)

        if (bracePosition < 0) {
          break
        }

        if (bracePosition % 2 == 0) {
          stack.push(bracePosition + 1)
        } else {
          if(stack.isEmpty || (stack.pop() != bracePosition)) {
            return false;
          }
        }
      }
    }

    stack.isEmpty
  }

  println(parenthesesAreBalanced("()[]{}"))
  println(parenthesesAreBalanced("(())()"))
  println(parenthesesAreBalanced("((())"))
}