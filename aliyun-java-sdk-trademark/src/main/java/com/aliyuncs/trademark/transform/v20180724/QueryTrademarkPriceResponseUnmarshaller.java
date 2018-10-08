/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.trademark.transform.v20180724;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.trademark.model.v20180724.QueryTrademarkPriceResponse;
import com.aliyuncs.trademark.model.v20180724.QueryTrademarkPriceResponse.PricesItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryTrademarkPriceResponseUnmarshaller {

	public static QueryTrademarkPriceResponse unmarshall(QueryTrademarkPriceResponse queryTrademarkPriceResponse, UnmarshallerContext context) {
		
		queryTrademarkPriceResponse.setRequestId(context.stringValue("QueryTrademarkPriceResponse.RequestId"));
		queryTrademarkPriceResponse.setDiscountPrice(context.floatValue("QueryTrademarkPriceResponse.DiscountPrice"));
		queryTrademarkPriceResponse.setOriginalPrice(context.floatValue("QueryTrademarkPriceResponse.OriginalPrice"));
		queryTrademarkPriceResponse.setTradePrice(context.floatValue("QueryTrademarkPriceResponse.TradePrice"));
		queryTrademarkPriceResponse.setCurrency(context.stringValue("QueryTrademarkPriceResponse.Currency"));

		List<PricesItem> prices = new ArrayList<PricesItem>();
		for (int i = 0; i < context.lengthValue("QueryTrademarkPriceResponse.Prices.Length"); i++) {
			PricesItem pricesItem = new PricesItem();
			pricesItem.setClassificationCode(context.stringValue("QueryTrademarkPriceResponse.Prices["+ i +"].ClassificationCode"));
			pricesItem.setDiscountPrice(context.floatValue("QueryTrademarkPriceResponse.Prices["+ i +"].DiscountPrice"));
			pricesItem.setOriginalPrice(context.floatValue("QueryTrademarkPriceResponse.Prices["+ i +"].OriginalPrice"));
			pricesItem.setTradePrice(context.floatValue("QueryTrademarkPriceResponse.Prices["+ i +"].TradePrice"));
			pricesItem.setCurrency(context.stringValue("QueryTrademarkPriceResponse.Prices["+ i +"].Currency"));

			prices.add(pricesItem);
		}
		queryTrademarkPriceResponse.setPrices(prices);
	 
	 	return queryTrademarkPriceResponse;
	}
}