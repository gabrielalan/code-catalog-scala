import scala.collection.mutable.Stack;
import scala.util.control.Breaks._;
import Challenges.Collection._;

object Main extends App {
  println(balancedParentheses("()[]{}"))
  println(balancedParentheses("(())()"))
  println(balancedParentheses("((())"))
}