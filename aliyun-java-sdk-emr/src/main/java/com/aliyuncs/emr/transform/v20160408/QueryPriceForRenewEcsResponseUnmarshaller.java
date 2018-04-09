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

import com.aliyuncs.emr.model.v20160408.QueryPriceForRenewEcsResponse;
import com.aliyuncs.emr.model.v20160408.QueryPriceForRenewEcsResponse.EcsPriceDO;
import com.aliyuncs.emr.model.v20160408.QueryPriceForRenewEcsResponse.EmrPriceDO;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryPriceForRenewEcsResponseUnmarshaller {

	public static QueryPriceForRenewEcsResponse unmarshall(QueryPriceForRenewEcsResponse queryPriceForRenewEcsResponse, UnmarshallerContext context) {
		
		queryPriceForRenewEcsResponse.setRequestId(context.stringValue("QueryPriceForRenewEcsResponse.RequestId"));
		queryPriceForRenewEcsResponse.setEcsId(context.stringValue("QueryPriceForRenewEcsResponse.EcsId"));
		queryPriceForRenewEcsResponse.setEmrPrice(context.stringValue("QueryPriceForRenewEcsResponse.EmrPrice"));
		queryPriceForRenewEcsResponse.setEcsPrice(context.stringValue("QueryPriceForRenewEcsResponse.EcsPrice"));

		EmrPriceDO emrPriceDO = new EmrPriceDO();
		emrPriceDO.setOriginalPrice(context.stringValue("QueryPriceForRenewEcsResponse.EmrPriceDO.OriginalPrice"));
		emrPriceDO.setDiscountPrice(context.stringValue("QueryPriceForRenewEcsResponse.EmrPriceDO.DiscountPrice"));
		emrPriceDO.setTradePrice(context.stringValue("QueryPriceForRenewEcsResponse.EmrPriceDO.TradePrice"));
		emrPriceDO.setTaxPrice(context.stringValue("QueryPriceForRenewEcsResponse.EmrPriceDO.TaxPrice"));
		emrPriceDO.setCurrency(context.stringValue("QueryPriceForRenewEcsResponse.EmrPriceDO.Currency"));
		queryPriceForRenewEcsResponse.setEmrPriceDO(emrPriceDO);

		EcsPriceDO ecsPriceDO = new EcsPriceDO();
		ecsPriceDO.setOriginalPrice(context.stringValue("QueryPriceForRenewEcsResponse.EcsPriceDO.OriginalPrice"));
		ecsPriceDO.setDiscountPrice(context.stringValue("QueryPriceForRenewEcsResponse.EcsPriceDO.DiscountPrice"));
		ecsPriceDO.setTradePrice(context.stringValue("QueryPriceForRenewEcsResponse.EcsPriceDO.TradePrice"));
		ecsPriceDO.setTaxPrice(context.stringValue("QueryPriceForRenewEcsResponse.EcsPriceDO.TaxPrice"));
		ecsPriceDO.setCurrency(context.stringValue("QueryPriceForRenewEcsResponse.EcsPriceDO.Currency"));
		queryPriceForRenewEcsResponse.setEcsPriceDO(ecsPriceDO);
	 
	 	return queryPriceForRenewEcsResponse;
	}
}