package Challenges;

import scala.collection.mutable.Stack;
import scala.collection.immutable.Set;
import scala.util.control.Breaks._;

object Collection {

  def pairSum(list: List[Double], sum: Double): Boolean = {
    var set = Set[Double]();

    for (num <- list) {
      if (set contains num) {
        return true;
      }

      set = set + (sum - num);
    }

    return false;
  }

  def balancedParentheses(chars: String): Boolean = {
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
}