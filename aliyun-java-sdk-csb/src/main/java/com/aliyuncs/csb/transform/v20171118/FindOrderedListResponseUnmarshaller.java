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

	public static FindOrderedListResponse unmarshall(FindOrderedListResponse findOrderedListResponse, UnmarshallerContext _ctx) {
		
		findOrderedListResponse.setRequestId(_ctx.stringValue("FindOrderedListResponse.RequestId"));
		findOrderedListResponse.setCode(_ctx.integerValue("FindOrderedListResponse.Code"));
		findOrderedListResponse.setMessage(_ctx.stringValue("FindOrderedListResponse.Message"));

		Data data = new Data();
		data.setCurrentPage(_ctx.integerValue("FindOrderedListResponse.Data.CurrentPage"));
		data.setPageNumber(_ctx.integerValue("FindOrderedListResponse.Data.PageNumber"));

		List<Order> orderList = new ArrayList<Order>();
		for (int i = 0; i < _ctx.lengthValue("FindOrderedListResponse.Data.OrderList.Length"); i++) {
			Order order = new Order();
			order.setAlias(_ctx.stringValue("FindOrderedListResponse.Data.OrderList["+ i +"].Alias"));
			order.setProjectName(_ctx.stringValue("FindOrderedListResponse.Data.OrderList["+ i +"].ProjectName"));
			order.setServiceName(_ctx.stringValue("FindOrderedListResponse.Data.OrderList["+ i +"].ServiceName"));
			order.setServiceVersion(_ctx.stringValue("FindOrderedListResponse.Data.OrderList["+ i +"].ServiceVersion"));
			order.setOrderStatus(_ctx.integerValue("FindOrderedListResponse.Data.OrderList["+ i +"].OrderStatus"));
			order.setAliveOrderCount(_ctx.integerValue("FindOrderedListResponse.Data.OrderList["+ i +"].AliveOrderCount"));
			order.setGmtCreate(_ctx.longValue("FindOrderedListResponse.Data.OrderList["+ i +"].GmtCreate"));
			order.setMaxRT(_ctx.integerValue("FindOrderedListResponse.Data.OrderList["+ i +"].MaxRT"));
			order.setMinRT(_ctx.integerValue("FindOrderedListResponse.Data.OrderList["+ i +"].MinRT"));
			order.setServiceId(_ctx.stringValue("FindOrderedListResponse.Data.OrderList["+ i +"].ServiceId"));
			order.setServiceStatus(_ctx.integerValue("FindOrderedListResponse.Data.OrderList["+ i +"].ServiceStatus"));

			Total total = new Total();
			total.setErrorNum(_ctx.integerValue("FindOrderedListResponse.Data.OrderList["+ i +"].Total.ErrorNum"));
			total.setTotal(_ctx.integerValue("FindOrderedListResponse.Data.OrderList["+ i +"].Total.Total"));
			order.setTotal(total);

			List<ErrorTypeCatagory> errorTypeCatagoryList = new ArrayList<ErrorTypeCatagory>();
			for (int j = 0; j < _ctx.lengthValue("FindOrderedListResponse.Data.OrderList["+ i +"].ErrorTypeCatagoryList.Length"); j++) {
				ErrorTypeCatagory errorTypeCatagory = new ErrorTypeCatagory();
				errorTypeCatagory.setName(_ctx.stringValue("FindOrderedListResponse.Data.OrderList["+ i +"].ErrorTypeCatagoryList["+ j +"].Name"));
				errorTypeCatagory.setTotal(_ctx.longValue("FindOrderedListResponse.Data.OrderList["+ i +"].ErrorTypeCatagoryList["+ j +"].Total"));
				errorTypeCatagory.setErrorNum(_ctx.longValue("FindOrderedListResponse.Data.OrderList["+ i +"].ErrorTypeCatagoryList["+ j +"].ErrorNum"));

				errorTypeCatagoryList.add(errorTypeCatagory);
			}
			order.setErrorTypeCatagoryList(errorTypeCatagoryList);

			List<Order1> orders = new ArrayList<Order1>();
			for (int j = 0; j < _ctx.lengthValue("FindOrderedListResponse.Data.OrderList["+ i +"].Orders.Length"); j++) {
				Order1 order1 = new Order1();
				order1.setAlias(_ctx.stringValue("FindOrderedListResponse.Data.OrderList["+ i +"].Orders["+ j +"].Alias"));
				order1.setApproveComments(_ctx.stringValue("FindOrderedListResponse.Data.OrderList["+ i +"].Orders["+ j +"].ApproveComments"));
				order1.setCsbId(_ctx.longValue("FindOrderedListResponse.Data.OrderList["+ i +"].Orders["+ j +"].CsbId"));
				order1.setGmtCreate(_ctx.longValue("FindOrderedListResponse.Data.OrderList["+ i +"].Orders["+ j +"].GmtCreate"));
				order1.setGmtModified(_ctx.longValue("FindOrderedListResponse.Data.OrderList["+ i +"].Orders["+ j +"].GmtModified"));
				order1.setGroupName(_ctx.stringValue("FindOrderedListResponse.Data.OrderList["+ i +"].Orders["+ j +"].GroupName"));
				order1.setId(_ctx.longValue("FindOrderedListResponse.Data.OrderList["+ i +"].Orders["+ j +"].Id"));
				order1.setProjectName(_ctx.stringValue("FindOrderedListResponse.Data.OrderList["+ i +"].Orders["+ j +"].ProjectName"));
				order1.setServiceId(_ctx.longValue("FindOrderedListResponse.Data.OrderList["+ i +"].Orders["+ j +"].ServiceId"));
				order1.setServiceName(_ctx.stringValue("FindOrderedListResponse.Data.OrderList["+ i +"].Orders["+ j +"].ServiceName"));
				order1.setServiceStatus(_ctx.integerValue("FindOrderedListResponse.Data.OrderList["+ i +"].Orders["+ j +"].ServiceStatus"));
				order1.setServiceVersion(_ctx.stringValue("FindOrderedListResponse.Data.OrderList["+ i +"].Orders["+ j +"].ServiceVersion"));
				order1.setStatisticName(_ctx.stringValue("FindOrderedListResponse.Data.OrderList["+ i +"].Orders["+ j +"].StatisticName"));
				order1.setStatus(_ctx.integerValue("FindOrderedListResponse.Data.OrderList["+ i +"].Orders["+ j +"].Status"));
				order1.setUserId(_ctx.stringValue("FindOrderedListResponse.Data.OrderList["+ i +"].Orders["+ j +"].UserId"));

				SlaInfo slaInfo = new SlaInfo();
				slaInfo.setQph(_ctx.stringValue("FindOrderedListResponse.Data.OrderList["+ i +"].Orders["+ j +"].SlaInfo.Qph"));
				slaInfo.setQps(_ctx.stringValue("FindOrderedListResponse.Data.OrderList["+ i +"].Orders["+ j +"].SlaInfo.Qps"));
				order1.setSlaInfo(slaInfo);

				Total2 total2 = new Total2();
				total2.setErrorNum(_ctx.integerValue("FindOrderedListResponse.Data.OrderList["+ i +"].Orders["+ j +"].Total.ErrorNum"));
				total2.setTotal(_ctx.integerValue("FindOrderedListResponse.Data.OrderList["+ i +"].Orders["+ j +"].Total.Total"));
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