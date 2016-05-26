/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.domain.transform.v20160511;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.domain.model.v20160511.QueryOrderResponse;
import com.aliyuncs.domain.model.v20160511.QueryOrderResponse.SubOrderResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryOrderResponseUnmarshaller {

	public static QueryOrderResponse unmarshall(QueryOrderResponse queryOrderResponse, UnmarshallerContext context) {
		
		queryOrderResponse.setRequestId(context.stringValue("QueryOrderResponse.RequestId"));
		queryOrderResponse.setOrderID(context.stringValue("QueryOrderResponse.OrderID"));
		queryOrderResponse.setUserID(context.stringValue("QueryOrderResponse.UserID"));
		queryOrderResponse.setMoney(context.stringValue("QueryOrderResponse.Money"));
		queryOrderResponse.setOrderDate(context.stringValue("QueryOrderResponse.OrderDate"));
		queryOrderResponse.setCheckFlag(context.booleanValue("QueryOrderResponse.CheckFlag"));
		queryOrderResponse.setCheckDate(context.stringValue("QueryOrderResponse.CheckDate"));
		queryOrderResponse.setValidFlag(context.booleanValue("QueryOrderResponse.ValidFlag"));
		queryOrderResponse.setCheckType(context.booleanValue("QueryOrderResponse.CheckType"));

		List<SubOrderResult> orderProducts = new ArrayList<SubOrderResult>();
		for (int i = 0; i < context.lengthValue("QueryOrderResponse.OrderProducts.Length"); i++) {
			SubOrderResult subOrderResult = new SubOrderResult();
			subOrderResult.setTrackID(context.stringValue("QueryOrderResponse.OrderProducts["+ i +"].TrackID"));
			subOrderResult.setOrderID(context.stringValue("QueryOrderResponse.OrderProducts["+ i +"].OrderID"));
			subOrderResult.setSaleID(context.stringValue("QueryOrderResponse.OrderProducts["+ i +"].SaleID"));
			subOrderResult.setUserID(context.stringValue("QueryOrderResponse.OrderProducts["+ i +"].UserID"));
			subOrderResult.setClassID(context.stringValue("QueryOrderResponse.OrderProducts["+ i +"].ClassID"));
			subOrderResult.setProductName(context.stringValue("QueryOrderResponse.OrderProducts["+ i +"].ProductName"));
			subOrderResult.setRelatedName(context.stringValue("QueryOrderResponse.OrderProducts["+ i +"].RelatedName"));
			subOrderResult.setActionType(context.stringValue("QueryOrderResponse.OrderProducts["+ i +"].ActionType"));
			subOrderResult.setPeriodUnit(context.integerValue("QueryOrderResponse.OrderProducts["+ i +"].PeriodUnit"));
			subOrderResult.setPeriodNum(context.integerValue("QueryOrderResponse.OrderProducts["+ i +"].PeriodNum"));
			subOrderResult.setAmount(context.integerValue("QueryOrderResponse.OrderProducts["+ i +"].Amount"));
			subOrderResult.setOrderDate(context.stringValue("QueryOrderResponse.OrderProducts["+ i +"].OrderDate"));
			subOrderResult.setCheckFlag(context.booleanValue("QueryOrderResponse.OrderProducts["+ i +"].CheckFlag"));
			subOrderResult.setCheckDate(context.stringValue("QueryOrderResponse.OrderProducts["+ i +"].CheckDate"));
			subOrderResult.setBizStatus(context.integerValue("QueryOrderResponse.OrderProducts["+ i +"].BizStatus"));
			subOrderResult.setUpdateDate(context.stringValue("QueryOrderResponse.OrderProducts["+ i +"].UpdateDate"));
			subOrderResult.setDeadDate(context.stringValue("QueryOrderResponse.OrderProducts["+ i +"].DeadDate"));
			subOrderResult.setValidFlag(context.booleanValue("QueryOrderResponse.OrderProducts["+ i +"].ValidFlag"));
			subOrderResult.setMoney(context.stringValue("QueryOrderResponse.OrderProducts["+ i +"].Money"));
			subOrderResult.setParentSaleID(context.stringValue("QueryOrderResponse.OrderProducts["+ i +"].ParentSaleID"));

			orderProducts.add(subOrderResult);
		}
		queryOrderResponse.setOrderProducts(orderProducts);
	 
	 	return queryOrderResponse;
	}
}