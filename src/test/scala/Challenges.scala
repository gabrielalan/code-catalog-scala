import org.scalatest._;
import Challenges.Collection._;

class ChallengeSpec extends FlatSpec with Matchers {
	"balancedParentheses fn" should "return correct boolean checking a string" in {
		balancedParentheses("()[]{}") should be (true)
		balancedParentheses("(())()") should be (true)
		balancedParentheses("((())") should be (false)
	}
}