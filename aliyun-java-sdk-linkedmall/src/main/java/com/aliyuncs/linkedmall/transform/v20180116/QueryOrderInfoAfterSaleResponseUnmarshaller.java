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

import com.aliyuncs.linkedmall.model.v20180116.QueryOrderInfoAfterSaleResponse;
import com.aliyuncs.linkedmall.model.v20180116.QueryOrderInfoAfterSaleResponse.Model;
import com.aliyuncs.linkedmall.model.v20180116.QueryOrderInfoAfterSaleResponse.Model.Logistics;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryOrderInfoAfterSaleResponseUnmarshaller {

	public static QueryOrderInfoAfterSaleResponse unmarshall(QueryOrderInfoAfterSaleResponse queryOrderInfoAfterSaleResponse, UnmarshallerContext _ctx) {
		
		queryOrderInfoAfterSaleResponse.setRequestId(_ctx.stringValue("QueryOrderInfoAfterSaleResponse.RequestId"));
		queryOrderInfoAfterSaleResponse.setCode(_ctx.stringValue("QueryOrderInfoAfterSaleResponse.Code"));
		queryOrderInfoAfterSaleResponse.setMessage(_ctx.stringValue("QueryOrderInfoAfterSaleResponse.Message"));

		Model model = new Model();
		model.setLmOrderId(_ctx.longValue("QueryOrderInfoAfterSaleResponse.Model.LmOrderId"));
		model.setTbOrderId(_ctx.longValue("QueryOrderInfoAfterSaleResponse.Model.TbOrderId"));
		model.setCreateDate(_ctx.stringValue("QueryOrderInfoAfterSaleResponse.Model.CreateDate"));
		model.setCashAmount(_ctx.stringValue("QueryOrderInfoAfterSaleResponse.Model.CashAmount"));
		model.setPoints(_ctx.longValue("QueryOrderInfoAfterSaleResponse.Model.Points"));
		model.setPointsAmount(_ctx.longValue("QueryOrderInfoAfterSaleResponse.Model.PointsAmount"));
		model.setOrderStatus(_ctx.stringValue("QueryOrderInfoAfterSaleResponse.Model.OrderStatus"));
		model.setShopName(_ctx.stringValue("QueryOrderInfoAfterSaleResponse.Model.ShopName"));
		model.setRefundStatus(_ctx.stringValue("QueryOrderInfoAfterSaleResponse.Model.RefundStatus"));
		model.setRefundAmount(_ctx.longValue("QueryOrderInfoAfterSaleResponse.Model.RefundAmount"));
		model.setRefundRate(_ctx.stringValue("QueryOrderInfoAfterSaleResponse.Model.RefundRate"));
		model.setXiaomiCode(_ctx.stringValue("QueryOrderInfoAfterSaleResponse.Model.XiaomiCode"));
		model.setShopServiceTelephone(_ctx.stringValue("QueryOrderInfoAfterSaleResponse.Model.ShopServiceTelephone"));
		model.setExtJson(_ctx.stringValue("QueryOrderInfoAfterSaleResponse.Model.ExtJson"));
		model.setRefundPoints(_ctx.longValue("QueryOrderInfoAfterSaleResponse.Model.RefundPoints"));

		List<Logistics> logisticsList = new ArrayList<Logistics>();
		for (int i = 0; i < _ctx.lengthValue("QueryOrderInfoAfterSaleResponse.Model.LogisticsList.Length"); i++) {
			Logistics logistics = new Logistics();
			logistics.setLogisticsNo(_ctx.stringValue("QueryOrderInfoAfterSaleResponse.Model.LogisticsList["+ i +"].LogisticsNo"));
			logistics.setLogisticsStatus(_ctx.stringValue("QueryOrderInfoAfterSaleResponse.Model.LogisticsList["+ i +"].LogisticsStatus"));
			logistics.setLogisticsCompanyName(_ctx.stringValue("QueryOrderInfoAfterSaleResponse.Model.LogisticsList["+ i +"].LogisticsCompanyName"));
			logistics.setLogisticsCompanyCode(_ctx.stringValue("QueryOrderInfoAfterSaleResponse.Model.LogisticsList["+ i +"].LogisticsCompanyCode"));

			logisticsList.add(logistics);
		}
		model.setLogisticsList(logisticsList);
		queryOrderInfoAfterSaleResponse.setModel(model);
	 
	 	return queryOrderInfoAfterSaleResponse;
	}
}