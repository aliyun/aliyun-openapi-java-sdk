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

package com.aliyuncs.ehpc.transform.v20180412;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ehpc.model.v20180412.DescribePriceResponse;
import com.aliyuncs.ehpc.model.v20180412.DescribePriceResponse.PriceInfo;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePriceResponseUnmarshaller {

	public static DescribePriceResponse unmarshall(DescribePriceResponse describePriceResponse, UnmarshallerContext context) {
		
		describePriceResponse.setRequestId(context.stringValue("DescribePriceResponse.RequestId"));
		describePriceResponse.setTotalTradePrice(context.floatValue("DescribePriceResponse.TotalTradePrice"));

		List<PriceInfo> prices = new ArrayList<PriceInfo>();
		for (int i = 0; i < context.lengthValue("DescribePriceResponse.Prices.Length"); i++) {
			PriceInfo priceInfo = new PriceInfo();
			priceInfo.setNodeType(context.stringValue("DescribePriceResponse.Prices["+ i +"].NodeType"));
			priceInfo.setOriginalPrice(context.floatValue("DescribePriceResponse.Prices["+ i +"].OriginalPrice"));
			priceInfo.setTradePrice(context.floatValue("DescribePriceResponse.Prices["+ i +"].TradePrice"));
			priceInfo.setCurrency(context.stringValue("DescribePriceResponse.Prices["+ i +"].Currency"));

			prices.add(priceInfo);
		}
		describePriceResponse.setPrices(prices);
	 
	 	return describePriceResponse;
	}
}