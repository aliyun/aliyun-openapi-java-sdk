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

import com.aliyuncs.csb.model.v20171118.FindApprovalOrderListResponse;
import com.aliyuncs.csb.model.v20171118.FindApprovalOrderListResponse.Data;
import com.aliyuncs.csb.model.v20171118.FindApprovalOrderListResponse.Data.Order;
import com.aliyuncs.csb.model.v20171118.FindApprovalOrderListResponse.Data.Order.SlaInfo;
import com.aliyuncs.csb.model.v20171118.FindApprovalOrderListResponse.Data.Order.Total;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class FindApprovalOrderListResponseUnmarshaller {

	public static FindApprovalOrderListResponse unmarshall(FindApprovalOrderListResponse findApprovalOrderListResponse, UnmarshallerContext context) {
		
		findApprovalOrderListResponse.setRequestId(context.stringValue("FindApprovalOrderListResponse.RequestId"));
		findApprovalOrderListResponse.setCode(context.integerValue("FindApprovalOrderListResponse.Code"));
		findApprovalOrderListResponse.setMessage(context.stringValue("FindApprovalOrderListResponse.Message"));

		Data data = new Data();
		data.setCurrentPage(context.integerValue("FindApprovalOrderListResponse.Data.CurrentPage"));
		data.setPageNumber(context.integerValue("FindApprovalOrderListResponse.Data.PageNumber"));

		List<Order> orderList = new ArrayList<Order>();
		for (int i = 0; i < context.lengthValue("FindApprovalOrderListResponse.Data.OrderList.Length"); i++) {
			Order order = new Order();
			order.setAlias(context.stringValue("FindApprovalOrderListResponse.Data.OrderList["+ i +"].Alias"));
			order.setCredentialGroupId(context.longValue("FindApprovalOrderListResponse.Data.OrderList["+ i +"].CredentialGroupId"));
			order.setCsbId(context.longValue("FindApprovalOrderListResponse.Data.OrderList["+ i +"].CsbId"));
			order.setGmtCreate(context.longValue("FindApprovalOrderListResponse.Data.OrderList["+ i +"].GmtCreate"));
			order.setGmtModified(context.longValue("FindApprovalOrderListResponse.Data.OrderList["+ i +"].GmtModified"));
			order.setGroupName(context.stringValue("FindApprovalOrderListResponse.Data.OrderList["+ i +"].GroupName"));
			order.setId(context.longValue("FindApprovalOrderListResponse.Data.OrderList["+ i +"].Id"));
			order.setProjectName(context.stringValue("FindApprovalOrderListResponse.Data.OrderList["+ i +"].ProjectName"));
			order.setServiceId(context.longValue("FindApprovalOrderListResponse.Data.OrderList["+ i +"].ServiceId"));
			order.setServiceName(context.stringValue("FindApprovalOrderListResponse.Data.OrderList["+ i +"].ServiceName"));
			order.setServiceStatus(context.integerValue("FindApprovalOrderListResponse.Data.OrderList["+ i +"].ServiceStatus"));
			order.setServiceVersion(context.stringValue("FindApprovalOrderListResponse.Data.OrderList["+ i +"].ServiceVersion"));
			order.setStatisticName(context.stringValue("FindApprovalOrderListResponse.Data.OrderList["+ i +"].StatisticName"));
			order.setStatus(context.integerValue("FindApprovalOrderListResponse.Data.OrderList["+ i +"].Status"));
			order.setStrictWhiteListJson(context.stringValue("FindApprovalOrderListResponse.Data.OrderList["+ i +"].StrictWhiteListJson"));
			order.setUserId(context.stringValue("FindApprovalOrderListResponse.Data.OrderList["+ i +"].UserId"));
			order.setUserName(context.stringValue("FindApprovalOrderListResponse.Data.OrderList["+ i +"].UserName"));

			SlaInfo slaInfo = new SlaInfo();
			slaInfo.setQph(context.integerValue("FindApprovalOrderListResponse.Data.OrderList["+ i +"].SlaInfo.Qph"));
			slaInfo.setQps(context.integerValue("FindApprovalOrderListResponse.Data.OrderList["+ i +"].SlaInfo.Qps"));
			order.setSlaInfo(slaInfo);

			Total total = new Total();
			total.setErrorNum(context.integerValue("FindApprovalOrderListResponse.Data.OrderList["+ i +"].Total.ErrorNum"));
			total.setTotal(context.integerValue("FindApprovalOrderListResponse.Data.OrderList["+ i +"].Total.Total"));
			order.setTotal(total);

			orderList.add(order);
		}
		data.setOrderList(orderList);
		findApprovalOrderListResponse.setData(data);
	 
	 	return findApprovalOrderListResponse;
	}
}