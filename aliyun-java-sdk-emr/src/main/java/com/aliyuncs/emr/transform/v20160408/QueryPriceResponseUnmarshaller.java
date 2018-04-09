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

package com.aliyuncs.emr.transform.v20160408;

import com.aliyuncs.emr.model.v20160408.QueryPriceResponse;
import com.aliyuncs.emr.model.v20160408.QueryPriceResponse.EcsPriceDO;
import com.aliyuncs.emr.model.v20160408.QueryPriceResponse.EmrPriceDO;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryPriceResponseUnmarshaller {

	public static QueryPriceResponse unmarshall(QueryPriceResponse queryPriceResponse, UnmarshallerContext context) {
		
		queryPriceResponse.setRequestId(context.stringValue("QueryPriceResponse.RequestId"));
		queryPriceResponse.setEmrPrice(context.stringValue("QueryPriceResponse.EmrPrice"));
		queryPriceResponse.setEcsPrice(context.stringValue("QueryPriceResponse.EcsPrice"));

		EmrPriceDO emrPriceDO = new EmrPriceDO();
		emrPriceDO.setOriginalPrice(context.stringValue("QueryPriceResponse.EmrPriceDO.OriginalPrice"));
		emrPriceDO.setDiscountPrice(context.stringValue("QueryPriceResponse.EmrPriceDO.DiscountPrice"));
		emrPriceDO.setTradePrice(context.stringValue("QueryPriceResponse.EmrPriceDO.TradePrice"));
		emrPriceDO.setTaxPrice(context.stringValue("QueryPriceResponse.EmrPriceDO.TaxPrice"));
		emrPriceDO.setCurrency(context.stringValue("QueryPriceResponse.EmrPriceDO.Currency"));
		queryPriceResponse.setEmrPriceDO(emrPriceDO);

		EcsPriceDO ecsPriceDO = new EcsPriceDO();
		ecsPriceDO.setOriginalPrice(context.stringValue("QueryPriceResponse.EcsPriceDO.OriginalPrice"));
		ecsPriceDO.setDiscountPrice(context.stringValue("QueryPriceResponse.EcsPriceDO.DiscountPrice"));
		ecsPriceDO.setTradePrice(context.stringValue("QueryPriceResponse.EcsPriceDO.TradePrice"));
		ecsPriceDO.setTaxPrice(context.stringValue("QueryPriceResponse.EcsPriceDO.TaxPrice"));
		ecsPriceDO.setCurrency(context.stringValue("QueryPriceResponse.EcsPriceDO.Currency"));
		queryPriceResponse.setEcsPriceDO(ecsPriceDO);
	 
	 	return queryPriceResponse;
	}
}