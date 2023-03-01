import org.scalatest._
import flatspec._
import matchers._

class SellerStatsServiceTest extends AnyFlatSpec with should.Matchers {

  val listingsStore = new HardcodedListingsStore()
  val sellerStatsService = new SellerStatsService(listingsStore)

  "SellerStatsService sum" should "sum the total for all listings" in {
    (sellerStatsService.getTotalSales) should equal (BigDecimal.int2bigDecimal(25))
  }
}
