import org.scalatest._;
import Challenges.Collection._;

class ChallengeSpec extends FlatSpec with Matchers {
	"balancedParentheses fn" should "return correct boolean checking a string" in {
		balancedParentheses("()[]{}") should be (true)
		balancedParentheses("(())()") should be (true)
		balancedParentheses("((())") should be (false)
	}

	"pairSum fn" should "return correct boolean checking if an array has a pair equals to sum" in {
		val correct = List(1, 2, 3, 4);
		pairSum(correct, 7) should be (true)
		pairSum(correct, 71) should be (false)
	}
}