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

import com.aliyuncs.csb.model.v20171118.FindOrderedServiceListResponse;
import com.aliyuncs.csb.model.v20171118.FindOrderedServiceListResponse.Data;
import com.aliyuncs.csb.model.v20171118.FindOrderedServiceListResponse.Data.Order;
import com.aliyuncs.csb.model.v20171118.FindOrderedServiceListResponse.Data.Order.SlaInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class FindOrderedServiceListResponseUnmarshaller {

	public static FindOrderedServiceListResponse unmarshall(FindOrderedServiceListResponse findOrderedServiceListResponse, UnmarshallerContext _ctx) {
		
		findOrderedServiceListResponse.setRequestId(_ctx.stringValue("FindOrderedServiceListResponse.RequestId"));
		findOrderedServiceListResponse.setCode(_ctx.integerValue("FindOrderedServiceListResponse.Code"));
		findOrderedServiceListResponse.setMessage(_ctx.stringValue("FindOrderedServiceListResponse.Message"));

		Data data = new Data();
		data.setCurrentPage(_ctx.integerValue("FindOrderedServiceListResponse.Data.CurrentPage"));
		data.setPageNumber(_ctx.integerValue("FindOrderedServiceListResponse.Data.PageNumber"));
		data.setTotal(_ctx.longValue("FindOrderedServiceListResponse.Data.Total"));

		List<Order> orderList = new ArrayList<Order>();
		for (int i = 0; i < _ctx.lengthValue("FindOrderedServiceListResponse.Data.OrderList.Length"); i++) {
			Order order = new Order();
			order.setServiceName(_ctx.stringValue("FindOrderedServiceListResponse.Data.OrderList["+ i +"].ServiceName"));
			order.setServiceVersion(_ctx.stringValue("FindOrderedServiceListResponse.Data.OrderList["+ i +"].ServiceVersion"));
			order.setOrderStatus(_ctx.integerValue("FindOrderedServiceListResponse.Data.OrderList["+ i +"].OrderStatus"));
			order.setGmtCreate(_ctx.longValue("FindOrderedServiceListResponse.Data.OrderList["+ i +"].GmtCreate"));
			order.setServiceId(_ctx.stringValue("FindOrderedServiceListResponse.Data.OrderList["+ i +"].ServiceId"));
			order.setServiceStatus(_ctx.integerValue("FindOrderedServiceListResponse.Data.OrderList["+ i +"].ServiceStatus"));
			order.setCredentialGroupId(_ctx.longValue("FindOrderedServiceListResponse.Data.OrderList["+ i +"].CredentialGroupId"));
			order.setGmtModified(_ctx.longValue("FindOrderedServiceListResponse.Data.OrderList["+ i +"].GmtModified"));
			order.setProjectName(_ctx.stringValue("FindOrderedServiceListResponse.Data.OrderList["+ i +"].ProjectName"));
			order.setId(_ctx.longValue("FindOrderedServiceListResponse.Data.OrderList["+ i +"].Id"));
			order.setCredentialGroupName(_ctx.stringValue("FindOrderedServiceListResponse.Data.OrderList["+ i +"].CredentialGroupName"));

			SlaInfo slaInfo = new SlaInfo();
			slaInfo.setQps(_ctx.longValue("FindOrderedServiceListResponse.Data.OrderList["+ i +"].SlaInfo.Qps"));
			slaInfo.setQph(_ctx.longValue("FindOrderedServiceListResponse.Data.OrderList["+ i +"].SlaInfo.Qph"));
			order.setSlaInfo(slaInfo);

			orderList.add(order);
		}
		data.setOrderList(orderList);
		findOrderedServiceListResponse.setData(data);
	 
	 	return findOrderedServiceListResponse;
	}
}