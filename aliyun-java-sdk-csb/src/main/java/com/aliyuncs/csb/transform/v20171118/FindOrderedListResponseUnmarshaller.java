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
package com.aliyuncs.csb.transform.v20171118;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.csb.model.v20171118.FindOrderedListResponse;
import com.aliyuncs.csb.model.v20171118.FindOrderedListResponse.Data;
import com.aliyuncs.csb.model.v20171118.FindOrderedListResponse.Data.Order;
import com.aliyuncs.csb.model.v20171118.FindOrderedListResponse.Data.Order.ErrorTypeCatagory;
import com.aliyuncs.csb.model.v20171118.FindOrderedListResponse.Data.Order.Order1;
import com.aliyuncs.csb.model.v20171118.FindOrderedListResponse.Data.Order.Order1.SlaInfo;
import com.aliyuncs.csb.model.v20171118.FindOrderedListResponse.Data.Order.Order1.Total2;
import com.aliyuncs.csb.model.v20171118.FindOrderedListResponse.Data.Order.Total;
import com.aliyuncs.transform.UnmarshallerContext;


public class FindOrderedListResponseUnmarshaller {

	public static FindOrderedListResponse unmarshall(FindOrderedListResponse findOrderedListResponse, UnmarshallerContext context) {
		
		findOrderedListResponse.setRequestId(context.stringValue("FindOrderedListResponse.RequestId"));
		findOrderedListResponse.setCode(context.integerValue("FindOrderedListResponse.Code"));
		findOrderedListResponse.setMessage(context.stringValue("FindOrderedListResponse.Message"));

		Data data = new Data();
		data.setCurrentPage(context.integerValue("FindOrderedListResponse.Data.CurrentPage"));
		data.setPageNumber(context.integerValue("FindOrderedListResponse.Data.PageNumber"));

		List<Order> orderList = new ArrayList<Order>();
		for (int i = 0; i < context.lengthValue("FindOrderedListResponse.Data.OrderList.Length"); i++) {
			Order order = new Order();
			order.setAlias(context.stringValue("FindOrderedListResponse.Data.OrderList["+ i +"].Alias"));
			order.setProjectName(context.stringValue("FindOrderedListResponse.Data.OrderList["+ i +"].ProjectName"));
			order.setServiceName(context.stringValue("FindOrderedListResponse.Data.OrderList["+ i +"].ServiceName"));
			order.setServiceVersion(context.stringValue("FindOrderedListResponse.Data.OrderList["+ i +"].ServiceVersion"));
			order.setOrderStatus(context.integerValue("FindOrderedListResponse.Data.OrderList["+ i +"].OrderStatus"));
			order.setAliveOrderCount(context.integerValue("FindOrderedListResponse.Data.OrderList["+ i +"].AliveOrderCount"));
			order.setGmtCreate(context.longValue("FindOrderedListResponse.Data.OrderList["+ i +"].GmtCreate"));
			order.setMaxRT(context.integerValue("FindOrderedListResponse.Data.OrderList["+ i +"].MaxRT"));
			order.setMinRT(context.integerValue("FindOrderedListResponse.Data.OrderList["+ i +"].MinRT"));
			order.setServiceId(context.stringValue("FindOrderedListResponse.Data.OrderList["+ i +"].ServiceId"));
			order.setServiceStatus(context.integerValue("FindOrderedListResponse.Data.OrderList["+ i +"].ServiceStatus"));

			Total total = new Total();
			total.setErrorNum(context.integerValue("FindOrderedListResponse.Data.OrderList["+ i +"].Total.ErrorNum"));
			total.setTotal(context.integerValue("FindOrderedListResponse.Data.OrderList["+ i +"].Total.Total"));
			order.setTotal(total);

			List<ErrorTypeCatagory> errorTypeCatagoryList = new ArrayList<ErrorTypeCatagory>();
			for (int j = 0; j < context.lengthValue("FindOrderedListResponse.Data.OrderList["+ i +"].ErrorTypeCatagoryList.Length"); j++) {
				ErrorTypeCatagory errorTypeCatagory = new ErrorTypeCatagory();
				errorTypeCatagory.setName(context.stringValue("FindOrderedListResponse.Data.OrderList["+ i +"].ErrorTypeCatagoryList["+ j +"].Name"));
				errorTypeCatagory.setTotal(context.longValue("FindOrderedListResponse.Data.OrderList["+ i +"].ErrorTypeCatagoryList["+ j +"].Total"));
				errorTypeCatagory.setErrorNum(context.longValue("FindOrderedListResponse.Data.OrderList["+ i +"].ErrorTypeCatagoryList["+ j +"].ErrorNum"));

				errorTypeCatagoryList.add(errorTypeCatagory);
			}
			order.setErrorTypeCatagoryList(errorTypeCatagoryList);

			List<Order1> orders = new ArrayList<Order1>();
			for (int j = 0; j < context.lengthValue("FindOrderedListResponse.Data.OrderList["+ i +"].Orders.Length"); j++) {
				Order1 order1 = new Order1();
				order1.setAlias(context.stringValue("FindOrderedListResponse.Data.OrderList["+ i +"].Orders["+ j +"].Alias"));
				order1.setApproveComments(context.stringValue("FindOrderedListResponse.Data.OrderList["+ i +"].Orders["+ j +"].ApproveComments"));
				order1.setCsbId(context.longValue("FindOrderedListResponse.Data.OrderList["+ i +"].Orders["+ j +"].CsbId"));
				order1.setGmtCreate(context.longValue("FindOrderedListResponse.Data.OrderList["+ i +"].Orders["+ j +"].GmtCreate"));
				order1.setGmtModified(context.longValue("FindOrderedListResponse.Data.OrderList["+ i +"].Orders["+ j +"].GmtModified"));
				order1.setGroupName(context.stringValue("FindOrderedListResponse.Data.OrderList["+ i +"].Orders["+ j +"].GroupName"));
				order1.setId(context.longValue("FindOrderedListResponse.Data.OrderList["+ i +"].Orders["+ j +"].Id"));
				order1.setProjectName(context.stringValue("FindOrderedListResponse.Data.OrderList["+ i +"].Orders["+ j +"].ProjectName"));
				order1.setServiceId(context.longValue("FindOrderedListResponse.Data.OrderList["+ i +"].Orders["+ j +"].ServiceId"));
				order1.setServiceName(context.stringValue("FindOrderedListResponse.Data.OrderList["+ i +"].Orders["+ j +"].ServiceName"));
				order1.setServiceStatus(context.integerValue("FindOrderedListResponse.Data.OrderList["+ i +"].Orders["+ j +"].ServiceStatus"));
				order1.setServiceVersion(context.stringValue("FindOrderedListResponse.Data.OrderList["+ i +"].Orders["+ j +"].ServiceVersion"));
				order1.setStatisticName(context.stringValue("FindOrderedListResponse.Data.OrderList["+ i +"].Orders["+ j +"].StatisticName"));
				order1.setStatus(context.integerValue("FindOrderedListResponse.Data.OrderList["+ i +"].Orders["+ j +"].Status"));
				order1.setUserId(context.stringValue("FindOrderedListResponse.Data.OrderList["+ i +"].Orders["+ j +"].UserId"));

				SlaInfo slaInfo = new SlaInfo();
				slaInfo.setQph(context.stringValue("FindOrderedListResponse.Data.OrderList["+ i +"].Orders["+ j +"].SlaInfo.Qph"));
				slaInfo.setQps(context.stringValue("FindOrderedListResponse.Data.OrderList["+ i +"].Orders["+ j +"].SlaInfo.Qps"));
				order1.setSlaInfo(slaInfo);

				Total2 total2 = new Total2();
				total2.setErrorNum(context.integerValue("FindOrderedListResponse.Data.OrderList["+ i +"].Orders["+ j +"].Total.ErrorNum"));
				total2.setTotal(context.integerValue("FindOrderedListResponse.Data.OrderList["+ i +"].Orders["+ j +"].Total.Total"));
				order1.setTotal2(total2);

				orders.add(order1);
			}
			order.setOrders(orders);

			orderList.add(order);
		}
		data.setOrderList(orderList);
		findOrderedListResponse.setData(data);
	 
	 	return findOrderedListResponse;
	}
}