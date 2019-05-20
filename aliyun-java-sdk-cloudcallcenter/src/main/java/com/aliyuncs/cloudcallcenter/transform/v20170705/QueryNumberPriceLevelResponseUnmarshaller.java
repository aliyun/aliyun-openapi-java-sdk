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

package com.aliyuncs.cloudcallcenter.transform.v20170705;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudcallcenter.model.v20170705.QueryNumberPriceLevelResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.QueryNumberPriceLevelResponse.NumberPrice;
import com.aliyuncs.cloudcallcenter.model.v20170705.QueryNumberPriceLevelResponse.NumberPrice.CommonNumberPrice;
import com.aliyuncs.cloudcallcenter.model.v20170705.QueryNumberPriceLevelResponse.NumberPrice.PrettyNumberPrice;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryNumberPriceLevelResponseUnmarshaller {

	public static QueryNumberPriceLevelResponse unmarshall(QueryNumberPriceLevelResponse queryNumberPriceLevelResponse, UnmarshallerContext context) {
		
		queryNumberPriceLevelResponse.setRequestId(context.stringValue("QueryNumberPriceLevelResponse.RequestId"));
		queryNumberPriceLevelResponse.setSuccess(context.booleanValue("QueryNumberPriceLevelResponse.Success"));
		queryNumberPriceLevelResponse.setCode(context.stringValue("QueryNumberPriceLevelResponse.Code"));
		queryNumberPriceLevelResponse.setMessage(context.stringValue("QueryNumberPriceLevelResponse.Message"));
		queryNumberPriceLevelResponse.setHttpStatusCode(context.integerValue("QueryNumberPriceLevelResponse.HttpStatusCode"));

		NumberPrice numberPrice = new NumberPrice();

		List<CommonNumberPrice> commonNumberPrices = new ArrayList<CommonNumberPrice>();
		for (int i = 0; i < context.lengthValue("QueryNumberPriceLevelResponse.NumberPrice.CommonNumberPrices.Length"); i++) {
			CommonNumberPrice commonNumberPrice = new CommonNumberPrice();
			commonNumberPrice.setPrice(context.integerValue("QueryNumberPriceLevelResponse.NumberPrice.CommonNumberPrices["+ i +"].Price"));
			commonNumberPrice.setDescription(context.stringValue("QueryNumberPriceLevelResponse.NumberPrice.CommonNumberPrices["+ i +"].Description"));

			commonNumberPrices.add(commonNumberPrice);
		}
		numberPrice.setCommonNumberPrices(commonNumberPrices);

		List<PrettyNumberPrice> prettyNumberPrices = new ArrayList<PrettyNumberPrice>();
		for (int i = 0; i < context.lengthValue("QueryNumberPriceLevelResponse.NumberPrice.PrettyNumberPrices.Length"); i++) {
			PrettyNumberPrice prettyNumberPrice = new PrettyNumberPrice();
			prettyNumberPrice.setPrice(context.integerValue("QueryNumberPriceLevelResponse.NumberPrice.PrettyNumberPrices["+ i +"].Price"));
			prettyNumberPrice.setDescription(context.stringValue("QueryNumberPriceLevelResponse.NumberPrice.PrettyNumberPrices["+ i +"].Description"));

			prettyNumberPrices.add(prettyNumberPrice);
		}
		numberPrice.setPrettyNumberPrices(prettyNumberPrices);
		queryNumberPriceLevelResponse.setNumberPrice(numberPrice);
	 
	 	return queryNumberPriceLevelResponse;
	}
}