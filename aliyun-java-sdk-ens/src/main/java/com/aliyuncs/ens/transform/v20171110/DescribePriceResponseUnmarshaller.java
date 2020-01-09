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

package com.aliyuncs.ens.transform.v20171110;

import com.aliyuncs.ens.model.v20171110.DescribePriceResponse;
import com.aliyuncs.ens.model.v20171110.DescribePriceResponse.PriceInfo;
import com.aliyuncs.ens.model.v20171110.DescribePriceResponse.PriceInfo.Price;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePriceResponseUnmarshaller {

	public static DescribePriceResponse unmarshall(DescribePriceResponse describePriceResponse, UnmarshallerContext _ctx) {
		
		describePriceResponse.setRequestId(_ctx.stringValue("DescribePriceResponse.RequestId"));

		PriceInfo priceInfo = new PriceInfo();

		Price price = new Price();
		price.setDiscountPrice(_ctx.floatValue("DescribePriceResponse.PriceInfo.Price.DiscountPrice"));
		price.setOriginalPrice(_ctx.floatValue("DescribePriceResponse.PriceInfo.Price.OriginalPrice"));
		price.setTradePrice(_ctx.floatValue("DescribePriceResponse.PriceInfo.Price.TradePrice"));
		price.setCurrency(_ctx.stringValue("DescribePriceResponse.PriceInfo.Price.Currency"));
		priceInfo.setPrice(price);
		describePriceResponse.setPriceInfo(priceInfo);
	 
	 	return describePriceResponse;
	}
}