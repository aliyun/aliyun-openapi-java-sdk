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

package com.aliyuncs.linkedmall.transform.v20180116;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.linkedmall.model.v20180116.QueryOrderListResponse;
import com.aliyuncs.linkedmall.model.v20180116.QueryOrderListResponse.LmOrderListItem;
import com.aliyuncs.linkedmall.model.v20180116.QueryOrderListResponse.LmOrderListItem.FundStructureModelsItem;
import com.aliyuncs.linkedmall.model.v20180116.QueryOrderListResponse.LmOrderListItem.SubOrderListItem;
import com.aliyuncs.linkedmall.model.v20180116.QueryOrderListResponse.LmOrderListItem.SubOrderListItem.ItemPriceListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryOrderListResponseUnmarshaller {

	public static QueryOrderListResponse unmarshall(QueryOrderListResponse queryOrderListResponse, UnmarshallerContext context) {
		
		queryOrderListResponse.setRequestId(context.stringValue("QueryOrderListResponse.RequestId"));
		queryOrderListResponse.setCode(context.stringValue("QueryOrderListResponse.Code"));
		queryOrderListResponse.setMessage(context.stringValue("QueryOrderListResponse.Message"));
		queryOrderListResponse.setTotalCount(context.longValue("QueryOrderListResponse.TotalCount"));

		List<LmOrderListItem> lmOrderList = new ArrayList<LmOrderListItem>();
		for (int i = 0; i < context.lengthValue("QueryOrderListResponse.LmOrderList.Length"); i++) {
			LmOrderListItem lmOrderListItem = new LmOrderListItem();
			lmOrderListItem.setCreateDate(context.stringValue("QueryOrderListResponse.LmOrderList["+ i +"].CreateDate"));
			lmOrderListItem.setLmOrderId(context.longValue("QueryOrderListResponse.LmOrderList["+ i +"].LmOrderId"));
			lmOrderListItem.setOrderAmount(context.longValue("QueryOrderListResponse.LmOrderList["+ i +"].OrderAmount"));
			lmOrderListItem.setOrderStatus(context.integerValue("QueryOrderListResponse.LmOrderList["+ i +"].OrderStatus"));
			lmOrderListItem.setExtJson(context.stringValue("QueryOrderListResponse.LmOrderList["+ i +"].ExtJson"));
			lmOrderListItem.setShopName(context.stringValue("QueryOrderListResponse.LmOrderList["+ i +"].ShopName"));

			List<FundStructureModelsItem> fundStructureModels = new ArrayList<FundStructureModelsItem>();
			for (int j = 0; j < context.lengthValue("QueryOrderListResponse.LmOrderList["+ i +"].FundStructureModels.Length"); j++) {
				FundStructureModelsItem fundStructureModelsItem = new FundStructureModelsItem();
				fundStructureModelsItem.setFundAmount(context.longValue("QueryOrderListResponse.LmOrderList["+ i +"].FundStructureModels["+ j +"].FundAmount"));
				fundStructureModelsItem.setFundAmountMoney(context.longValue("QueryOrderListResponse.LmOrderList["+ i +"].FundStructureModels["+ j +"].FundAmountMoney"));
				fundStructureModelsItem.setFundType(context.stringValue("QueryOrderListResponse.LmOrderList["+ i +"].FundStructureModels["+ j +"].FundType"));

				fundStructureModels.add(fundStructureModelsItem);
			}
			lmOrderListItem.setFundStructureModels(fundStructureModels);

			List<SubOrderListItem> subOrderList = new ArrayList<SubOrderListItem>();
			for (int j = 0; j < context.lengthValue("QueryOrderListResponse.LmOrderList["+ i +"].SubOrderList.Length"); j++) {
				SubOrderListItem subOrderListItem = new SubOrderListItem();
				subOrderListItem.setItemId(context.longValue("QueryOrderListResponse.LmOrderList["+ i +"].SubOrderList["+ j +"].ItemId"));
				subOrderListItem.setItemPic(context.stringValue("QueryOrderListResponse.LmOrderList["+ i +"].SubOrderList["+ j +"].ItemPic"));
				subOrderListItem.setItemTitle(context.stringValue("QueryOrderListResponse.LmOrderList["+ i +"].SubOrderList["+ j +"].ItemTitle"));
				subOrderListItem.setNumber(context.longValue("QueryOrderListResponse.LmOrderList["+ i +"].SubOrderList["+ j +"].Number"));
				subOrderListItem.setSkuId(context.longValue("QueryOrderListResponse.LmOrderList["+ i +"].SubOrderList["+ j +"].SkuId"));
				subOrderListItem.setSkuName(context.stringValue("QueryOrderListResponse.LmOrderList["+ i +"].SubOrderList["+ j +"].SkuName"));
				subOrderListItem.setLmOrderId(context.longValue("QueryOrderListResponse.LmOrderList["+ i +"].SubOrderList["+ j +"].LmOrderId"));

				List<ItemPriceListItem> itemPriceList = new ArrayList<ItemPriceListItem>();
				for (int k = 0; k < context.lengthValue("QueryOrderListResponse.LmOrderList["+ i +"].SubOrderList["+ j +"].ItemPriceList.Length"); k++) {
					ItemPriceListItem itemPriceListItem = new ItemPriceListItem();
					itemPriceListItem.setFundAmount(context.longValue("QueryOrderListResponse.LmOrderList["+ i +"].SubOrderList["+ j +"].ItemPriceList["+ k +"].FundAmount"));
					itemPriceListItem.setFundAmountMoney(context.longValue("QueryOrderListResponse.LmOrderList["+ i +"].SubOrderList["+ j +"].ItemPriceList["+ k +"].FundAmountMoney"));
					itemPriceListItem.setFundType(context.integerValue("QueryOrderListResponse.LmOrderList["+ i +"].SubOrderList["+ j +"].ItemPriceList["+ k +"].FundType"));

					itemPriceList.add(itemPriceListItem);
				}
				subOrderListItem.setItemPriceList(itemPriceList);

				subOrderList.add(subOrderListItem);
			}
			lmOrderListItem.setSubOrderList(subOrderList);

			lmOrderList.add(lmOrderListItem);
		}
		queryOrderListResponse.setLmOrderList(lmOrderList);
	 
	 	return queryOrderListResponse;
	}
}