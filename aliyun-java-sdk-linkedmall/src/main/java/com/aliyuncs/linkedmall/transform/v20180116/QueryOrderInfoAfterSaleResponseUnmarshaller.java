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

	public static QueryOrderInfoAfterSaleResponse unmarshall(QueryOrderInfoAfterSaleResponse queryOrderInfoAfterSaleResponse, UnmarshallerContext context) {
		
		queryOrderInfoAfterSaleResponse.setRequestId(context.stringValue("QueryOrderInfoAfterSaleResponse.RequestId"));
		queryOrderInfoAfterSaleResponse.setCode(context.stringValue("QueryOrderInfoAfterSaleResponse.Code"));
		queryOrderInfoAfterSaleResponse.setMessage(context.stringValue("QueryOrderInfoAfterSaleResponse.Message"));

		Model model = new Model();
		model.setLmOrderId(context.longValue("QueryOrderInfoAfterSaleResponse.Model.LmOrderId"));
		model.setTbOrderId(context.longValue("QueryOrderInfoAfterSaleResponse.Model.TbOrderId"));
		model.setCreateDate(context.stringValue("QueryOrderInfoAfterSaleResponse.Model.CreateDate"));
		model.setCashAmount(context.stringValue("QueryOrderInfoAfterSaleResponse.Model.CashAmount"));
		model.setPoints(context.longValue("QueryOrderInfoAfterSaleResponse.Model.Points"));
		model.setPointsAmount(context.longValue("QueryOrderInfoAfterSaleResponse.Model.PointsAmount"));
		model.setOrderStatus(context.stringValue("QueryOrderInfoAfterSaleResponse.Model.OrderStatus"));
		model.setShopName(context.stringValue("QueryOrderInfoAfterSaleResponse.Model.ShopName"));
		model.setRefundStatus(context.stringValue("QueryOrderInfoAfterSaleResponse.Model.RefundStatus"));
		model.setRefundAmount(context.longValue("QueryOrderInfoAfterSaleResponse.Model.RefundAmount"));
		model.setRefundRate(context.stringValue("QueryOrderInfoAfterSaleResponse.Model.RefundRate"));
		model.setXiaomiCode(context.stringValue("QueryOrderInfoAfterSaleResponse.Model.XiaomiCode"));
		model.setShopServiceTelephone(context.stringValue("QueryOrderInfoAfterSaleResponse.Model.ShopServiceTelephone"));
		model.setExtJson(context.stringValue("QueryOrderInfoAfterSaleResponse.Model.ExtJson"));

		List<Logistics> logisticsList = new ArrayList<Logistics>();
		for (int i = 0; i < context.lengthValue("QueryOrderInfoAfterSaleResponse.Model.LogisticsList.Length"); i++) {
			Logistics logistics = new Logistics();
			logistics.setLogisticsNo(context.stringValue("QueryOrderInfoAfterSaleResponse.Model.LogisticsList["+ i +"].LogisticsNo"));
			logistics.setLogisticsStatus(context.stringValue("QueryOrderInfoAfterSaleResponse.Model.LogisticsList["+ i +"].LogisticsStatus"));
			logistics.setLogisticsCompanyName(context.stringValue("QueryOrderInfoAfterSaleResponse.Model.LogisticsList["+ i +"].LogisticsCompanyName"));
			logistics.setLogisticsCompanyCode(context.stringValue("QueryOrderInfoAfterSaleResponse.Model.LogisticsList["+ i +"].LogisticsCompanyCode"));

			logisticsList.add(logistics);
		}
		model.setLogisticsList(logisticsList);
		queryOrderInfoAfterSaleResponse.setModel(model);
	 
	 	return queryOrderInfoAfterSaleResponse;
	}
}