class SellerStatsService(listingsStore: HardcodedListingsStore) {
  def getTotalSales: BigDecimal = listingsStore.getAllListings.map(_.price).sum
}
