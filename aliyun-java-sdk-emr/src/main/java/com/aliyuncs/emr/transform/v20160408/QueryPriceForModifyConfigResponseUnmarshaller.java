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

import com.aliyuncs.emr.model.v20160408.QueryPriceForModifyConfigResponse;
import com.aliyuncs.emr.model.v20160408.QueryPriceForModifyConfigResponse.EcsPriceDO;
import com.aliyuncs.emr.model.v20160408.QueryPriceForModifyConfigResponse.EmrPriceDO;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryPriceForModifyConfigResponseUnmarshaller {

	public static QueryPriceForModifyConfigResponse unmarshall(QueryPriceForModifyConfigResponse queryPriceForModifyConfigResponse, UnmarshallerContext context) {
		
		queryPriceForModifyConfigResponse.setRequestId(context.stringValue("QueryPriceForModifyConfigResponse.RequestId"));
		queryPriceForModifyConfigResponse.setEcsId(context.stringValue("QueryPriceForModifyConfigResponse.EcsId"));

		EmrPriceDO emrPriceDO = new EmrPriceDO();
		emrPriceDO.setOriginalPrice(context.stringValue("QueryPriceForModifyConfigResponse.EmrPriceDO.OriginalPrice"));
		emrPriceDO.setDiscountPrice(context.stringValue("QueryPriceForModifyConfigResponse.EmrPriceDO.DiscountPrice"));
		emrPriceDO.setTradePrice(context.stringValue("QueryPriceForModifyConfigResponse.EmrPriceDO.TradePrice"));
		emrPriceDO.setTaxPrice(context.stringValue("QueryPriceForModifyConfigResponse.EmrPriceDO.TaxPrice"));
		emrPriceDO.setCurrency(context.stringValue("QueryPriceForModifyConfigResponse.EmrPriceDO.Currency"));
		queryPriceForModifyConfigResponse.setEmrPriceDO(emrPriceDO);

		EcsPriceDO ecsPriceDO = new EcsPriceDO();
		ecsPriceDO.setOriginalPrice(context.stringValue("QueryPriceForModifyConfigResponse.EcsPriceDO.OriginalPrice"));
		ecsPriceDO.setDiscountPrice(context.stringValue("QueryPriceForModifyConfigResponse.EcsPriceDO.DiscountPrice"));
		ecsPriceDO.setTradePrice(context.stringValue("QueryPriceForModifyConfigResponse.EcsPriceDO.TradePrice"));
		ecsPriceDO.setTaxPrice(context.stringValue("QueryPriceForModifyConfigResponse.EcsPriceDO.TaxPrice"));
		ecsPriceDO.setCurrency(context.stringValue("QueryPriceForModifyConfigResponse.EcsPriceDO.Currency"));
		queryPriceForModifyConfigResponse.setEcsPriceDO(ecsPriceDO);
	 
	 	return queryPriceForModifyConfigResponse;
	}
}