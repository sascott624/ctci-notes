function getMaxProfit(prices) {
  
  if(prices.length < 2) {
    return false
  }

  var min = prices[0];
  var difference = prices[1] - prices[0];

  for(let i = 1; i < prices.length; i++) {    
    difference = Math.max(prices[i] - min, difference)
    min = Math.min(min, prices[i])
        
    console.log(i + ": " + difference)
  }
  
  return difference
}

var stockPricesYesterday = [ 10, 7, 5, 8, 11, 9 ];
console.log(getMaxProfit(stockPricesYesterday) === 6);

var newStocks = [ 10, 9, 7, 4, 1];
console.log(getMaxProfit(newStocks) === -1);

var newestStocks = [ 22, 1, 20, 19, 50, 4, 33 ];
console.log(getMaxProfit(newestStocks) === 49);

var profitNotPossible = [ 100 ];
console.log(getMaxProfit(profitNotPossible) === false);

