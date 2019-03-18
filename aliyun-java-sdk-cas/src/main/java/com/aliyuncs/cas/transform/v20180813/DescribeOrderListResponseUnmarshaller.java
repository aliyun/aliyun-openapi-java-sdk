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

package com.aliyuncs.cas.transform.v20180813;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cas.model.v20180813.DescribeOrderListResponse;
import com.aliyuncs.cas.model.v20180813.DescribeOrderListResponse.Order;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeOrderListResponseUnmarshaller {

	public static DescribeOrderListResponse unmarshall(DescribeOrderListResponse describeOrderListResponse, UnmarshallerContext context) {
		
		describeOrderListResponse.setRequestId(context.stringValue("DescribeOrderListResponse.RequestId"));
		describeOrderListResponse.setTotalCount(context.integerValue("DescribeOrderListResponse.TotalCount"));
		describeOrderListResponse.setShowSize(context.integerValue("DescribeOrderListResponse.ShowSize"));
		describeOrderListResponse.setCurrentPage(context.integerValue("DescribeOrderListResponse.CurrentPage"));

		List<Order> orderList = new ArrayList<Order>();
		for (int i = 0; i < context.lengthValue("DescribeOrderListResponse.OrderList.Length"); i++) {
			Order order = new Order();
			order.setId(context.longValue("DescribeOrderListResponse.OrderList["+ i +"].Id"));
			order.setSourceType(context.stringValue("DescribeOrderListResponse.OrderList["+ i +"].SourceType"));
			order.setCertType(context.stringValue("DescribeOrderListResponse.OrderList["+ i +"].CertType"));
			order.setInstanceId(context.stringValue("DescribeOrderListResponse.OrderList["+ i +"].InstanceId"));
			order.setYear(context.longValue("DescribeOrderListResponse.OrderList["+ i +"].Year"));
			order.setOrderId(context.longValue("DescribeOrderListResponse.OrderList["+ i +"].OrderId"));
			order.setOrderType(context.stringValue("DescribeOrderListResponse.OrderList["+ i +"].OrderType"));
			order.setBrandName(context.stringValue("DescribeOrderListResponse.OrderList["+ i +"].BrandName"));
			order.setBuyDate(context.longValue("DescribeOrderListResponse.OrderList["+ i +"].BuyDate"));
			order.setStatusCode(context.stringValue("DescribeOrderListResponse.OrderList["+ i +"].StatusCode"));
			order.setDomain(context.stringValue("DescribeOrderListResponse.OrderList["+ i +"].Domain"));
			order.setProductAliasName(context.stringValue("DescribeOrderListResponse.OrderList["+ i +"].ProductAliasName"));
			order.setDomainCount(context.integerValue("DescribeOrderListResponse.OrderList["+ i +"].DomainCount"));
			order.setWildDomainCount(context.integerValue("DescribeOrderListResponse.OrderList["+ i +"].WildDomainCount"));
			order.setVerifyStatus(context.integerValue("DescribeOrderListResponse.OrderList["+ i +"].VerifyStatus"));
			order.setMaybeIssueDate(context.longValue("DescribeOrderListResponse.OrderList["+ i +"].MaybeIssueDate"));
			order.setBeforeDate(context.longValue("DescribeOrderListResponse.OrderList["+ i +"].BeforeDate"));
			order.setAfterDate(context.longValue("DescribeOrderListResponse.OrderList["+ i +"].AfterDate"));
			order.setShowCancel(context.booleanValue("DescribeOrderListResponse.OrderList["+ i +"].ShowCancel"));

			orderList.add(order);
		}
		describeOrderListResponse.setOrderList(orderList);
	 
	 	return describeOrderListResponse;
	}
}