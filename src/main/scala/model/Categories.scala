package model

sealed abstract class Category(displayText: String)
sealed abstract class Condition(displayText: String, description: String)

object Category {
  case object Hoodies extends Category("Hoodies")
  case object Jackets extends Category("Jackets")
  case object Jeans extends Category("Jeans")
}

object Condition {
  case object BrandNew extends Condition("Brand new", "Unused with original packaging or tags")
  case object LikeNew extends Condition("Like new", "Mint condition pre-owned or new without tags")
  case object UsedExcellent extends Condition("Used - Excellent", "Lightly used but no noticeable flaws")
  case object UsedGood extends Condition("Used - Good", "Minor flaws or signs of wear, to be noted in the description or photos")
  case object UsedFair extends Condition("Used - Fair", "Obvious flaws or signs of wear, to be noted in the description or photos")
}

