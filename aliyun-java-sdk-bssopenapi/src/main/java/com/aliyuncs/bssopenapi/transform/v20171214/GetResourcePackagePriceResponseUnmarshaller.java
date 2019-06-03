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

package com.aliyuncs.bssopenapi.transform.v20171214;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.bssopenapi.model.v20171214.GetResourcePackagePriceResponse;
import com.aliyuncs.bssopenapi.model.v20171214.GetResourcePackagePriceResponse.Data;
import com.aliyuncs.bssopenapi.model.v20171214.GetResourcePackagePriceResponse.Data.Promotion;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetResourcePackagePriceResponseUnmarshaller {

	public static GetResourcePackagePriceResponse unmarshall(GetResourcePackagePriceResponse getResourcePackagePriceResponse, UnmarshallerContext context) {
		
		getResourcePackagePriceResponse.setRequestId(context.stringValue("GetResourcePackagePriceResponse.RequestId"));
		getResourcePackagePriceResponse.setSuccess(context.booleanValue("GetResourcePackagePriceResponse.Success"));
		getResourcePackagePriceResponse.setCode(context.stringValue("GetResourcePackagePriceResponse.Code"));
		getResourcePackagePriceResponse.setMessage(context.stringValue("GetResourcePackagePriceResponse.Message"));

		Data data = new Data();
		data.setCurrency(context.stringValue("GetResourcePackagePriceResponse.Data.Currency"));
		data.setOriginalPrice(context.floatValue("GetResourcePackagePriceResponse.Data.OriginalPrice"));
		data.setTradePrice(context.floatValue("GetResourcePackagePriceResponse.Data.TradePrice"));
		data.setDiscountPrice(context.floatValue("GetResourcePackagePriceResponse.Data.DiscountPrice"));

		List<Promotion> promotions = new ArrayList<Promotion>();
		for (int i = 0; i < context.lengthValue("GetResourcePackagePriceResponse.Data.Promotions.Length"); i++) {
			Promotion promotion = new Promotion();
			promotion.setId(context.longValue("GetResourcePackagePriceResponse.Data.Promotions["+ i +"].Id"));
			promotion.setName(context.stringValue("GetResourcePackagePriceResponse.Data.Promotions["+ i +"].Name"));

			promotions.add(promotion);
		}
		data.setPromotions(promotions);
		getResourcePackagePriceResponse.setData(data);
	 
	 	return getResourcePackagePriceResponse;
	}
}