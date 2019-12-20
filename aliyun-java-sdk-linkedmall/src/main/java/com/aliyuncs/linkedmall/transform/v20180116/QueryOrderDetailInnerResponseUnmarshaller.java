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

import com.aliyuncs.linkedmall.model.v20180116.QueryOrderDetailInnerResponse;
import com.aliyuncs.linkedmall.model.v20180116.QueryOrderDetailInnerResponse.Model;
import com.aliyuncs.linkedmall.model.v20180116.QueryOrderDetailInnerResponse.Model.Order;
import com.aliyuncs.linkedmall.model.v20180116.QueryOrderDetailInnerResponse.Model.Order.FundStructure;
import com.aliyuncs.linkedmall.model.v20180116.QueryOrderDetailInnerResponse.Model.Order.PostFee;
import com.aliyuncs.linkedmall.model.v20180116.QueryOrderDetailInnerResponse.Model.Order.SubItemOrder;
import com.aliyuncs.linkedmall.model.v20180116.QueryOrderDetailInnerResponse.Model.Order.SubItemOrder.ItemPrice;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryOrderDetailInnerResponseUnmarshaller {

	public static QueryOrderDetailInnerResponse unmarshall(QueryOrderDetailInnerResponse queryOrderDetailInnerResponse, UnmarshallerContext _ctx) {
		
		queryOrderDetailInnerResponse.setRequestId(_ctx.stringValue("QueryOrderDetailInnerResponse.RequestId"));
		queryOrderDetailInnerResponse.setCode(_ctx.stringValue("QueryOrderDetailInnerResponse.Code"));
		queryOrderDetailInnerResponse.setMessage(_ctx.stringValue("QueryOrderDetailInnerResponse.Message"));

		Model model = new Model();

		Order order = new Order();
		order.setLmOrderId(_ctx.longValue("QueryOrderDetailInnerResponse.Model.order.LmOrderId"));
		order.setChannelCode(_ctx.stringValue("QueryOrderDetailInnerResponse.Model.order.ChannelCode"));
		order.setChannelOrderId(_ctx.stringValue("QueryOrderDetailInnerResponse.Model.order.ChannelOrderId"));
		order.setChannelBizType(_ctx.stringValue("QueryOrderDetailInnerResponse.Model.order.ChannelBizType"));
		order.setOrderPayInfo(_ctx.stringValue("QueryOrderDetailInnerResponse.Model.order.OrderPayInfo"));
		order.setSellerId(_ctx.longValue("QueryOrderDetailInnerResponse.Model.order.SellerId"));
		order.setSellerNick(_ctx.stringValue("QueryOrderDetailInnerResponse.Model.order.SellerNick"));
		order.setShopName(_ctx.stringValue("QueryOrderDetailInnerResponse.Model.order.ShopName"));
		order.setCreateDate(_ctx.stringValue("QueryOrderDetailInnerResponse.Model.order.CreateDate"));
		order.setPayStatus(_ctx.integerValue("QueryOrderDetailInnerResponse.Model.order.PayStatus"));
		order.setPayWaterStatus(_ctx.integerValue("QueryOrderDetailInnerResponse.Model.order.PayWaterStatus"));
		order.setRefundStatus(_ctx.integerValue("QueryOrderDetailInnerResponse.Model.order.RefundStatus"));
		order.setLogisticsStatus(_ctx.integerValue("QueryOrderDetailInnerResponse.Model.order.LogisticsStatus"));
		order.setLogisticsStatusDesc(_ctx.stringValue("QueryOrderDetailInnerResponse.Model.order.LogisticsStatusDesc"));
		order.setLogisticsAddress(_ctx.stringValue("QueryOrderDetailInnerResponse.Model.order.LogisticsAddress"));
		order.setLogisticsUserName(_ctx.stringValue("QueryOrderDetailInnerResponse.Model.order.LogisticsUserName"));
		order.setLogisticsMobilePhone(_ctx.stringValue("QueryOrderDetailInnerResponse.Model.order.LogisticsMobilePhone"));
		order.setLogisticsNo(_ctx.stringValue("QueryOrderDetailInnerResponse.Model.order.LogisticsNo"));
		order.setOrderAmount(_ctx.longValue("QueryOrderDetailInnerResponse.Model.order.OrderAmount"));
		order.setLogisticsCompName(_ctx.stringValue("QueryOrderDetailInnerResponse.Model.order.LogisticsCompName"));
		order.setResExtInfo(_ctx.stringValue("QueryOrderDetailInnerResponse.Model.order.ResExtInfo"));
		order.setEndTime(_ctx.longValue("QueryOrderDetailInnerResponse.Model.order.EndTime"));
		order.setShipping(_ctx.stringValue("QueryOrderDetailInnerResponse.Model.order.Shipping"));
		order.setEticket(_ctx.booleanValue("QueryOrderDetailInnerResponse.Model.order.Eticket"));
		order.setEnableStatus(_ctx.integerValue("QueryOrderDetailInnerResponse.Model.order.EnableStatus"));
		order.setTbOrderId(_ctx.stringValue("QueryOrderDetailInnerResponse.Model.order.TbOrderId"));
		order.setExtInfo(_ctx.mapValue("QueryOrderDetailInnerResponse.Model.order.ExtInfo"));

		PostFee postFee = new PostFee();
		postFee.setLmOrderId(_ctx.longValue("QueryOrderDetailInnerResponse.Model.order.PostFee.LmOrderId"));
		postFee.setTbSubOrderId(_ctx.longValue("QueryOrderDetailInnerResponse.Model.order.PostFee.TbSubOrderId"));
		postFee.setFundType(_ctx.stringValue("QueryOrderDetailInnerResponse.Model.order.PostFee.FundType"));
		postFee.setFundAmount(_ctx.longValue("QueryOrderDetailInnerResponse.Model.order.PostFee.FundAmount"));
		postFee.setFundAmountMoney(_ctx.longValue("QueryOrderDetailInnerResponse.Model.order.PostFee.FundAmountMoney"));
		order.setPostFee(postFee);

		List<SubItemOrder> subItemOrderList = new ArrayList<SubItemOrder>();
		for (int i = 0; i < _ctx.lengthValue("QueryOrderDetailInnerResponse.Model.order.SubItemOrderList.Length"); i++) {
			SubItemOrder subItemOrder = new SubItemOrder();
			subItemOrder.setPayStatus(_ctx.integerValue("QueryOrderDetailInnerResponse.Model.order.SubItemOrderList["+ i +"].PayStatus"));
			subItemOrder.setItemTitle(_ctx.stringValue("QueryOrderDetailInnerResponse.Model.order.SubItemOrderList["+ i +"].ItemTitle"));
			subItemOrder.setLmItemId(_ctx.stringValue("QueryOrderDetailInnerResponse.Model.order.SubItemOrderList["+ i +"].LmItemId"));
			subItemOrder.setItemId(_ctx.longValue("QueryOrderDetailInnerResponse.Model.order.SubItemOrderList["+ i +"].ItemId"));
			subItemOrder.setItemPic(_ctx.stringValue("QueryOrderDetailInnerResponse.Model.order.SubItemOrderList["+ i +"].ItemPic"));
			subItemOrder.setItemPriceInfo(_ctx.stringValue("QueryOrderDetailInnerResponse.Model.order.SubItemOrderList["+ i +"].ItemPriceInfo"));
			subItemOrder.setNumber(_ctx.integerValue("QueryOrderDetailInnerResponse.Model.order.SubItemOrderList["+ i +"].Number"));
			subItemOrder.setTbSubOrderId(_ctx.longValue("QueryOrderDetailInnerResponse.Model.order.SubItemOrderList["+ i +"].TbSubOrderId"));
			subItemOrder.setLmOrderId(_ctx.longValue("QueryOrderDetailInnerResponse.Model.order.SubItemOrderList["+ i +"].LmOrderId"));
			subItemOrder.setSkuName(_ctx.stringValue("QueryOrderDetailInnerResponse.Model.order.SubItemOrderList["+ i +"].SkuName"));
			subItemOrder.setSkuId(_ctx.longValue("QueryOrderDetailInnerResponse.Model.order.SubItemOrderList["+ i +"].SkuId"));
			subItemOrder.setTotalPaymentInfo(_ctx.stringValue("QueryOrderDetailInnerResponse.Model.order.SubItemOrderList["+ i +"].TotalPaymentInfo"));
			subItemOrder.setChannelCode(_ctx.stringValue("QueryOrderDetailInnerResponse.Model.order.SubItemOrderList["+ i +"].ChannelCode"));

			List<ItemPrice> itemPriceList = new ArrayList<ItemPrice>();
			for (int j = 0; j < _ctx.lengthValue("QueryOrderDetailInnerResponse.Model.order.SubItemOrderList["+ i +"].ItemPriceList.Length"); j++) {
				ItemPrice itemPrice = new ItemPrice();
				itemPrice.setTbOrderId(_ctx.longValue("QueryOrderDetailInnerResponse.Model.order.SubItemOrderList["+ i +"].ItemPriceList["+ j +"].TbOrderId"));
				itemPrice.setTbSubOrderId(_ctx.longValue("QueryOrderDetailInnerResponse.Model.order.SubItemOrderList["+ i +"].ItemPriceList["+ j +"].TbSubOrderId"));
				itemPrice.setFundType(_ctx.stringValue("QueryOrderDetailInnerResponse.Model.order.SubItemOrderList["+ i +"].ItemPriceList["+ j +"].FundType"));
				itemPrice.setFundAmount(_ctx.longValue("QueryOrderDetailInnerResponse.Model.order.SubItemOrderList["+ i +"].ItemPriceList["+ j +"].FundAmount"));
				itemPrice.setFundAmountMoney(_ctx.longValue("QueryOrderDetailInnerResponse.Model.order.SubItemOrderList["+ i +"].ItemPriceList["+ j +"].FundAmountMoney"));

				itemPriceList.add(itemPrice);
			}
			subItemOrder.setItemPriceList(itemPriceList);

			subItemOrderList.add(subItemOrder);
		}
		order.setSubItemOrderList(subItemOrderList);

		List<FundStructure> fundStructureModels = new ArrayList<FundStructure>();
		for (int i = 0; i < _ctx.lengthValue("QueryOrderDetailInnerResponse.Model.order.FundStructureModels.Length"); i++) {
			FundStructure fundStructure = new FundStructure();
			fundStructure.setLmOrderId(_ctx.longValue("QueryOrderDetailInnerResponse.Model.order.FundStructureModels["+ i +"].LmOrderId"));
			fundStructure.setTbSubOrderId(_ctx.longValue("QueryOrderDetailInnerResponse.Model.order.FundStructureModels["+ i +"].TbSubOrderId"));
			fundStructure.setFundType(_ctx.stringValue("QueryOrderDetailInnerResponse.Model.order.FundStructureModels["+ i +"].FundType"));
			fundStructure.setFundAmount(_ctx.longValue("QueryOrderDetailInnerResponse.Model.order.FundStructureModels["+ i +"].FundAmount"));
			fundStructure.setFundAmountMoney(_ctx.longValue("QueryOrderDetailInnerResponse.Model.order.FundStructureModels["+ i +"].FundAmountMoney"));

			fundStructureModels.add(fundStructure);
		}
		order.setFundStructureModels(fundStructureModels);
		model.setOrder(order);
		queryOrderDetailInnerResponse.setModel(model);
	 
	 	return queryOrderDetailInnerResponse;
	}
}