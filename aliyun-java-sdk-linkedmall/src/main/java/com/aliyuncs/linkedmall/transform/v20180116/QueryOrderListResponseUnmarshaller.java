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
import com.aliyuncs.linkedmall.model.v20180116.QueryOrderListResponse.LmOrderListItem.PostFee1;
import com.aliyuncs.linkedmall.model.v20180116.QueryOrderListResponse.LmOrderListItem.SubOrderListItem;
import com.aliyuncs.linkedmall.model.v20180116.QueryOrderListResponse.LmOrderListItem.SubOrderListItem.ItemPriceListItem;
import com.aliyuncs.linkedmall.model.v20180116.QueryOrderListResponse.PostFee;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryOrderListResponseUnmarshaller {

	public static QueryOrderListResponse unmarshall(QueryOrderListResponse queryOrderListResponse, UnmarshallerContext _ctx) {
		
		queryOrderListResponse.setRequestId(_ctx.stringValue("QueryOrderListResponse.RequestId"));
		queryOrderListResponse.setCode(_ctx.stringValue("QueryOrderListResponse.Code"));
		queryOrderListResponse.setMessage(_ctx.stringValue("QueryOrderListResponse.Message"));
		queryOrderListResponse.setTotalCount(_ctx.longValue("QueryOrderListResponse.TotalCount"));
		queryOrderListResponse.setPageSize(_ctx.integerValue("QueryOrderListResponse.PageSize"));
		queryOrderListResponse.setPageNumber(_ctx.integerValue("QueryOrderListResponse.PageNumber"));

		PostFee postFee = new PostFee();
		postFee.setFundAmount(_ctx.longValue("QueryOrderListResponse.PostFee.FundAmount"));
		postFee.setFundAmountMoney(_ctx.longValue("QueryOrderListResponse.PostFee.FundAmountMoney"));
		postFee.setFundType(_ctx.stringValue("QueryOrderListResponse.PostFee.FundType"));
		queryOrderListResponse.setPostFee(postFee);

		List<LmOrderListItem> lmOrderList = new ArrayList<LmOrderListItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryOrderListResponse.LmOrderList.Length"); i++) {
			LmOrderListItem lmOrderListItem = new LmOrderListItem();
			lmOrderListItem.setCreateDate(_ctx.stringValue("QueryOrderListResponse.LmOrderList["+ i +"].CreateDate"));
			lmOrderListItem.setLmOrderId(_ctx.longValue("QueryOrderListResponse.LmOrderList["+ i +"].LmOrderId"));
			lmOrderListItem.setOrderAmount(_ctx.longValue("QueryOrderListResponse.LmOrderList["+ i +"].OrderAmount"));
			lmOrderListItem.setOrderStatus(_ctx.integerValue("QueryOrderListResponse.LmOrderList["+ i +"].OrderStatus"));
			lmOrderListItem.setExtJson(_ctx.stringValue("QueryOrderListResponse.LmOrderList["+ i +"].ExtJson"));
			lmOrderListItem.setShopName(_ctx.stringValue("QueryOrderListResponse.LmOrderList["+ i +"].ShopName"));
			lmOrderListItem.setLogisticsStatus(_ctx.integerValue("QueryOrderListResponse.LmOrderList["+ i +"].LogisticsStatus"));
			lmOrderListItem.setEnableStatus(_ctx.integerValue("QueryOrderListResponse.LmOrderList["+ i +"].EnableStatus"));
			lmOrderListItem.setTbOrderId(_ctx.longValue("QueryOrderListResponse.LmOrderList["+ i +"].TbOrderId"));

			PostFee1 postFee1 = new PostFee1();
			postFee1.setFundAmount(_ctx.longValue("QueryOrderListResponse.LmOrderList["+ i +"].PostFee.FundAmount"));
			postFee1.setFundAmountMoney(_ctx.longValue("QueryOrderListResponse.LmOrderList["+ i +"].PostFee.FundAmountMoney"));
			postFee1.setFundType(_ctx.stringValue("QueryOrderListResponse.LmOrderList["+ i +"].PostFee.FundType"));
			lmOrderListItem.setPostFee1(postFee1);

			List<FundStructureModelsItem> fundStructureModels = new ArrayList<FundStructureModelsItem>();
			for (int j = 0; j < _ctx.lengthValue("QueryOrderListResponse.LmOrderList["+ i +"].FundStructureModels.Length"); j++) {
				FundStructureModelsItem fundStructureModelsItem = new FundStructureModelsItem();
				fundStructureModelsItem.setFundAmount(_ctx.longValue("QueryOrderListResponse.LmOrderList["+ i +"].FundStructureModels["+ j +"].FundAmount"));
				fundStructureModelsItem.setFundAmountMoney(_ctx.longValue("QueryOrderListResponse.LmOrderList["+ i +"].FundStructureModels["+ j +"].FundAmountMoney"));
				fundStructureModelsItem.setFundType(_ctx.stringValue("QueryOrderListResponse.LmOrderList["+ i +"].FundStructureModels["+ j +"].FundType"));

				fundStructureModels.add(fundStructureModelsItem);
			}
			lmOrderListItem.setFundStructureModels(fundStructureModels);

			List<SubOrderListItem> subOrderList = new ArrayList<SubOrderListItem>();
			for (int j = 0; j < _ctx.lengthValue("QueryOrderListResponse.LmOrderList["+ i +"].SubOrderList.Length"); j++) {
				SubOrderListItem subOrderListItem = new SubOrderListItem();
				subOrderListItem.setItemId(_ctx.longValue("QueryOrderListResponse.LmOrderList["+ i +"].SubOrderList["+ j +"].ItemId"));
				subOrderListItem.setItemPic(_ctx.stringValue("QueryOrderListResponse.LmOrderList["+ i +"].SubOrderList["+ j +"].ItemPic"));
				subOrderListItem.setItemTitle(_ctx.stringValue("QueryOrderListResponse.LmOrderList["+ i +"].SubOrderList["+ j +"].ItemTitle"));
				subOrderListItem.setNumber(_ctx.longValue("QueryOrderListResponse.LmOrderList["+ i +"].SubOrderList["+ j +"].Number"));
				subOrderListItem.setSkuId(_ctx.longValue("QueryOrderListResponse.LmOrderList["+ i +"].SubOrderList["+ j +"].SkuId"));
				subOrderListItem.setSkuName(_ctx.stringValue("QueryOrderListResponse.LmOrderList["+ i +"].SubOrderList["+ j +"].SkuName"));
				subOrderListItem.setLmOrderId(_ctx.longValue("QueryOrderListResponse.LmOrderList["+ i +"].SubOrderList["+ j +"].LmOrderId"));
				subOrderListItem.setOrderStatus(_ctx.integerValue("QueryOrderListResponse.LmOrderList["+ i +"].SubOrderList["+ j +"].OrderStatus"));
				subOrderListItem.setEnableStatus(_ctx.integerValue("QueryOrderListResponse.LmOrderList["+ i +"].SubOrderList["+ j +"].EnableStatus"));
				subOrderListItem.setTbOrderId(_ctx.longValue("QueryOrderListResponse.LmOrderList["+ i +"].SubOrderList["+ j +"].TbOrderId"));

				List<ItemPriceListItem> itemPriceList = new ArrayList<ItemPriceListItem>();
				for (int k = 0; k < _ctx.lengthValue("QueryOrderListResponse.LmOrderList["+ i +"].SubOrderList["+ j +"].ItemPriceList.Length"); k++) {
					ItemPriceListItem itemPriceListItem = new ItemPriceListItem();
					itemPriceListItem.setFundAmount(_ctx.longValue("QueryOrderListResponse.LmOrderList["+ i +"].SubOrderList["+ j +"].ItemPriceList["+ k +"].FundAmount"));
					itemPriceListItem.setFundAmountMoney(_ctx.longValue("QueryOrderListResponse.LmOrderList["+ i +"].SubOrderList["+ j +"].ItemPriceList["+ k +"].FundAmountMoney"));
					itemPriceListItem.setFundType(_ctx.stringValue("QueryOrderListResponse.LmOrderList["+ i +"].SubOrderList["+ j +"].ItemPriceList["+ k +"].FundType"));

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