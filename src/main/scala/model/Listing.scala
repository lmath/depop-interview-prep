package model

import java.util.UUID

case class Listing (
  id: UUID,
  userId: UUID,
  title: String,
  description: String,
  category: Option[Category],
  condition: Option[Condition],
  price: BigDecimal,
  sold: Boolean
)
