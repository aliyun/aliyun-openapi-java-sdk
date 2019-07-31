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

	public static GetResourcePackagePriceResponse unmarshall(GetResourcePackagePriceResponse getResourcePackagePriceResponse, UnmarshallerContext _ctx) {
		
		getResourcePackagePriceResponse.setRequestId(_ctx.stringValue("GetResourcePackagePriceResponse.RequestId"));
		getResourcePackagePriceResponse.setSuccess(_ctx.booleanValue("GetResourcePackagePriceResponse.Success"));
		getResourcePackagePriceResponse.setCode(_ctx.stringValue("GetResourcePackagePriceResponse.Code"));
		getResourcePackagePriceResponse.setMessage(_ctx.stringValue("GetResourcePackagePriceResponse.Message"));

		Data data = new Data();
		data.setCurrency(_ctx.stringValue("GetResourcePackagePriceResponse.Data.Currency"));
		data.setOriginalPrice(_ctx.floatValue("GetResourcePackagePriceResponse.Data.OriginalPrice"));
		data.setTradePrice(_ctx.floatValue("GetResourcePackagePriceResponse.Data.TradePrice"));
		data.setDiscountPrice(_ctx.floatValue("GetResourcePackagePriceResponse.Data.DiscountPrice"));

		List<Promotion> promotions = new ArrayList<Promotion>();
		for (int i = 0; i < _ctx.lengthValue("GetResourcePackagePriceResponse.Data.Promotions.Length"); i++) {
			Promotion promotion = new Promotion();
			promotion.setId(_ctx.longValue("GetResourcePackagePriceResponse.Data.Promotions["+ i +"].Id"));
			promotion.setName(_ctx.stringValue("GetResourcePackagePriceResponse.Data.Promotions["+ i +"].Name"));

			promotions.add(promotion);
		}
		data.setPromotions(promotions);
		getResourcePackagePriceResponse.setData(data);
	 
	 	return getResourcePackagePriceResponse;
	}
}