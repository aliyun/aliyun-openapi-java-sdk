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

package com.aliyuncs.cas.transform.v20180713;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cas.model.v20180713.DescribeOrderInstanceListResponse;
import com.aliyuncs.cas.model.v20180713.DescribeOrderInstanceListResponse.Order;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeOrderInstanceListResponseUnmarshaller {

	public static DescribeOrderInstanceListResponse unmarshall(DescribeOrderInstanceListResponse describeOrderInstanceListResponse, UnmarshallerContext _ctx) {
		
		describeOrderInstanceListResponse.setRequestId(_ctx.stringValue("DescribeOrderInstanceListResponse.RequestId"));
		describeOrderInstanceListResponse.setTotalCount(_ctx.integerValue("DescribeOrderInstanceListResponse.TotalCount"));

		List<Order> orderList = new ArrayList<Order>();
		for (int i = 0; i < _ctx.lengthValue("DescribeOrderInstanceListResponse.OrderList.Length"); i++) {
			Order order = new Order();
			order.setId(_ctx.longValue("DescribeOrderInstanceListResponse.OrderList["+ i +"].Id"));
			order.setInstanceId(_ctx.stringValue("DescribeOrderInstanceListResponse.OrderList["+ i +"].InstanceId"));
			order.setSource(_ctx.stringValue("DescribeOrderInstanceListResponse.OrderList["+ i +"].Source"));
			order.setStatus(_ctx.stringValue("DescribeOrderInstanceListResponse.OrderList["+ i +"].Status"));
			order.setCertType(_ctx.stringValue("DescribeOrderInstanceListResponse.OrderList["+ i +"].CertType"));

			orderList.add(order);
		}
		describeOrderInstanceListResponse.setOrderList(orderList);
	 
	 	return describeOrderInstanceListResponse;
	}
}