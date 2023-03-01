import model.Listing

import java.util.UUID

trait ListingsStore {
  def getAllListings: Seq[Listing]
}

class HardcodedListingsStore extends ListingsStore {
  val customer = UUID.fromString("6e7d8b2c-540d-459a-a84c-301d92548f40")

  val hardCodedListings = Seq(
    Listing(
      id = UUID.randomUUID(),
      userId = customer,
      title = "Best Jeans",
      description = "They don't make em like this anymore",
      price = BigDecimal.int2bigDecimal(15),
      sold = false,
      category = None,
      condition = None
    ),
    Listing(
      id = UUID.randomUUID(),
      userId = customer,
      title = "Second Best Jeans",
      description = "They don't make em like this anymore",
      price = BigDecimal.int2bigDecimal(10),
      sold = false,
      category = None,
      condition = None
    )
  )

  def getAllListings = hardCodedListings
}
