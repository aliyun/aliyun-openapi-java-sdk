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

import com.aliyuncs.linkedmall.model.v20180116.QueryOrderAndPaymentListResponse;
import com.aliyuncs.linkedmall.model.v20180116.QueryOrderAndPaymentListResponse.LmOrderListItem;
import com.aliyuncs.linkedmall.model.v20180116.QueryOrderAndPaymentListResponse.LmOrderListItem.FundStructureModelsItem;
import com.aliyuncs.linkedmall.model.v20180116.QueryOrderAndPaymentListResponse.LmOrderListItem.PostFee1;
import com.aliyuncs.linkedmall.model.v20180116.QueryOrderAndPaymentListResponse.LmOrderListItem.SubOrderListItem;
import com.aliyuncs.linkedmall.model.v20180116.QueryOrderAndPaymentListResponse.LmOrderListItem.SubOrderListItem.ItemPriceListItem;
import com.aliyuncs.linkedmall.model.v20180116.QueryOrderAndPaymentListResponse.PostFee;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryOrderAndPaymentListResponseUnmarshaller {

	public static QueryOrderAndPaymentListResponse unmarshall(QueryOrderAndPaymentListResponse queryOrderAndPaymentListResponse, UnmarshallerContext _ctx) {
		
		queryOrderAndPaymentListResponse.setRequestId(_ctx.stringValue("QueryOrderAndPaymentListResponse.RequestId"));
		queryOrderAndPaymentListResponse.setCode(_ctx.stringValue("QueryOrderAndPaymentListResponse.Code"));
		queryOrderAndPaymentListResponse.setMessage(_ctx.stringValue("QueryOrderAndPaymentListResponse.Message"));
		queryOrderAndPaymentListResponse.setTotalCount(_ctx.longValue("QueryOrderAndPaymentListResponse.TotalCount"));
		queryOrderAndPaymentListResponse.setPageSize(_ctx.integerValue("QueryOrderAndPaymentListResponse.PageSize"));
		queryOrderAndPaymentListResponse.setPageNumber(_ctx.integerValue("QueryOrderAndPaymentListResponse.PageNumber"));

		PostFee postFee = new PostFee();
		postFee.setFundAmount(_ctx.longValue("QueryOrderAndPaymentListResponse.PostFee.FundAmount"));
		postFee.setFundAmountMoney(_ctx.longValue("QueryOrderAndPaymentListResponse.PostFee.FundAmountMoney"));
		postFee.setFundType(_ctx.stringValue("QueryOrderAndPaymentListResponse.PostFee.FundType"));
		queryOrderAndPaymentListResponse.setPostFee(postFee);

		List<LmOrderListItem> lmOrderList = new ArrayList<LmOrderListItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryOrderAndPaymentListResponse.LmOrderList.Length"); i++) {
			LmOrderListItem lmOrderListItem = new LmOrderListItem();
			lmOrderListItem.setCreateDate(_ctx.stringValue("QueryOrderAndPaymentListResponse.LmOrderList["+ i +"].CreateDate"));
			lmOrderListItem.setLmOrderId(_ctx.longValue("QueryOrderAndPaymentListResponse.LmOrderList["+ i +"].LmOrderId"));
			lmOrderListItem.setOrderAmount(_ctx.longValue("QueryOrderAndPaymentListResponse.LmOrderList["+ i +"].OrderAmount"));
			lmOrderListItem.setOrderStatus(_ctx.integerValue("QueryOrderAndPaymentListResponse.LmOrderList["+ i +"].OrderStatus"));
			lmOrderListItem.setExtJson(_ctx.stringValue("QueryOrderAndPaymentListResponse.LmOrderList["+ i +"].ExtJson"));
			lmOrderListItem.setShopName(_ctx.stringValue("QueryOrderAndPaymentListResponse.LmOrderList["+ i +"].ShopName"));
			lmOrderListItem.setLogisticsStatus(_ctx.integerValue("QueryOrderAndPaymentListResponse.LmOrderList["+ i +"].LogisticsStatus"));
			lmOrderListItem.setEnableStatus(_ctx.integerValue("QueryOrderAndPaymentListResponse.LmOrderList["+ i +"].EnableStatus"));
			lmOrderListItem.setTbOrderId(_ctx.longValue("QueryOrderAndPaymentListResponse.LmOrderList["+ i +"].TbOrderId"));
			lmOrderListItem.setLmPaymentId(_ctx.stringValue("QueryOrderAndPaymentListResponse.LmOrderList["+ i +"].LmPaymentId"));

			PostFee1 postFee1 = new PostFee1();
			postFee1.setFundAmount(_ctx.longValue("QueryOrderAndPaymentListResponse.LmOrderList["+ i +"].PostFee.FundAmount"));
			postFee1.setFundAmountMoney(_ctx.longValue("QueryOrderAndPaymentListResponse.LmOrderList["+ i +"].PostFee.FundAmountMoney"));
			postFee1.setFundType(_ctx.stringValue("QueryOrderAndPaymentListResponse.LmOrderList["+ i +"].PostFee.FundType"));
			lmOrderListItem.setPostFee1(postFee1);

			List<FundStructureModelsItem> fundStructureModels = new ArrayList<FundStructureModelsItem>();
			for (int j = 0; j < _ctx.lengthValue("QueryOrderAndPaymentListResponse.LmOrderList["+ i +"].FundStructureModels.Length"); j++) {
				FundStructureModelsItem fundStructureModelsItem = new FundStructureModelsItem();
				fundStructureModelsItem.setFundAmount(_ctx.longValue("QueryOrderAndPaymentListResponse.LmOrderList["+ i +"].FundStructureModels["+ j +"].FundAmount"));
				fundStructureModelsItem.setFundAmountMoney(_ctx.longValue("QueryOrderAndPaymentListResponse.LmOrderList["+ i +"].FundStructureModels["+ j +"].FundAmountMoney"));
				fundStructureModelsItem.setFundType(_ctx.stringValue("QueryOrderAndPaymentListResponse.LmOrderList["+ i +"].FundStructureModels["+ j +"].FundType"));

				fundStructureModels.add(fundStructureModelsItem);
			}
			lmOrderListItem.setFundStructureModels(fundStructureModels);

			List<SubOrderListItem> subOrderList = new ArrayList<SubOrderListItem>();
			for (int j = 0; j < _ctx.lengthValue("QueryOrderAndPaymentListResponse.LmOrderList["+ i +"].SubOrderList.Length"); j++) {
				SubOrderListItem subOrderListItem = new SubOrderListItem();
				subOrderListItem.setItemId(_ctx.longValue("QueryOrderAndPaymentListResponse.LmOrderList["+ i +"].SubOrderList["+ j +"].ItemId"));
				subOrderListItem.setItemPic(_ctx.stringValue("QueryOrderAndPaymentListResponse.LmOrderList["+ i +"].SubOrderList["+ j +"].ItemPic"));
				subOrderListItem.setItemTitle(_ctx.stringValue("QueryOrderAndPaymentListResponse.LmOrderList["+ i +"].SubOrderList["+ j +"].ItemTitle"));
				subOrderListItem.setNumber(_ctx.longValue("QueryOrderAndPaymentListResponse.LmOrderList["+ i +"].SubOrderList["+ j +"].Number"));
				subOrderListItem.setSkuId(_ctx.longValue("QueryOrderAndPaymentListResponse.LmOrderList["+ i +"].SubOrderList["+ j +"].SkuId"));
				subOrderListItem.setSkuName(_ctx.stringValue("QueryOrderAndPaymentListResponse.LmOrderList["+ i +"].SubOrderList["+ j +"].SkuName"));
				subOrderListItem.setLmOrderId(_ctx.longValue("QueryOrderAndPaymentListResponse.LmOrderList["+ i +"].SubOrderList["+ j +"].LmOrderId"));
				subOrderListItem.setOrderStatus(_ctx.integerValue("QueryOrderAndPaymentListResponse.LmOrderList["+ i +"].SubOrderList["+ j +"].OrderStatus"));
				subOrderListItem.setEnableStatus(_ctx.integerValue("QueryOrderAndPaymentListResponse.LmOrderList["+ i +"].SubOrderList["+ j +"].EnableStatus"));
				subOrderListItem.setTbOrderId(_ctx.longValue("QueryOrderAndPaymentListResponse.LmOrderList["+ i +"].SubOrderList["+ j +"].TbOrderId"));
				subOrderListItem.setLmItemId(_ctx.stringValue("QueryOrderAndPaymentListResponse.LmOrderList["+ i +"].SubOrderList["+ j +"].LmItemId"));

				List<ItemPriceListItem> itemPriceList = new ArrayList<ItemPriceListItem>();
				for (int k = 0; k < _ctx.lengthValue("QueryOrderAndPaymentListResponse.LmOrderList["+ i +"].SubOrderList["+ j +"].ItemPriceList.Length"); k++) {
					ItemPriceListItem itemPriceListItem = new ItemPriceListItem();
					itemPriceListItem.setFundAmount(_ctx.longValue("QueryOrderAndPaymentListResponse.LmOrderList["+ i +"].SubOrderList["+ j +"].ItemPriceList["+ k +"].FundAmount"));
					itemPriceListItem.setFundAmountMoney(_ctx.longValue("QueryOrderAndPaymentListResponse.LmOrderList["+ i +"].SubOrderList["+ j +"].ItemPriceList["+ k +"].FundAmountMoney"));
					itemPriceListItem.setFundType(_ctx.stringValue("QueryOrderAndPaymentListResponse.LmOrderList["+ i +"].SubOrderList["+ j +"].ItemPriceList["+ k +"].FundType"));

					itemPriceList.add(itemPriceListItem);
				}
				subOrderListItem.setItemPriceList(itemPriceList);

				subOrderList.add(subOrderListItem);
			}
			lmOrderListItem.setSubOrderList(subOrderList);

			lmOrderList.add(lmOrderListItem);
		}
		queryOrderAndPaymentListResponse.setLmOrderList(lmOrderList);
	 
	 	return queryOrderAndPaymentListResponse;
	}
}