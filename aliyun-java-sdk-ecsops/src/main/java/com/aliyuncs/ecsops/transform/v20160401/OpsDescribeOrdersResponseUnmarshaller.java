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

package com.aliyuncs.ecsops.transform.v20160401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsops.model.v20160401.OpsDescribeOrdersResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeOrdersResponse.OrderSet;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribeOrdersResponseUnmarshaller {

	public static OpsDescribeOrdersResponse unmarshall(OpsDescribeOrdersResponse opsDescribeOrdersResponse, UnmarshallerContext _ctx) {
		
		opsDescribeOrdersResponse.setRequestId(_ctx.stringValue("OpsDescribeOrdersResponse.RequestId"));
		opsDescribeOrdersResponse.setTotalCount(_ctx.integerValue("OpsDescribeOrdersResponse.TotalCount"));
		opsDescribeOrdersResponse.setPageNumber(_ctx.integerValue("OpsDescribeOrdersResponse.PageNumber"));
		opsDescribeOrdersResponse.setPageSize(_ctx.integerValue("OpsDescribeOrdersResponse.PageSize"));

		List<OrderSet> orderSets = new ArrayList<OrderSet>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeOrdersResponse.OrderSets.Length"); i++) {
			OrderSet orderSet = new OrderSet();
			orderSet.setId(_ctx.longValue("OpsDescribeOrdersResponse.OrderSets["+ i +"].Id"));
			orderSet.setOrderId(_ctx.longValue("OpsDescribeOrdersResponse.OrderSets["+ i +"].OrderId"));
			orderSet.setAliUid(_ctx.longValue("OpsDescribeOrdersResponse.OrderSets["+ i +"].AliUid"));
			orderSet.setStatus(_ctx.integerValue("OpsDescribeOrdersResponse.OrderSets["+ i +"].Status"));
			orderSet.setOrderDetail(_ctx.stringValue("OpsDescribeOrdersResponse.OrderSets["+ i +"].OrderDetail"));
			orderSet.setActionType(_ctx.integerValue("OpsDescribeOrdersResponse.OrderSets["+ i +"].ActionType"));
			orderSet.setIsAsync(_ctx.booleanValue("OpsDescribeOrdersResponse.OrderSets["+ i +"].IsAsync"));
			orderSet.setChargeType(_ctx.integerValue("OpsDescribeOrdersResponse.OrderSets["+ i +"].ChargeType"));
			orderSet.setGmtCreate(_ctx.stringValue("OpsDescribeOrdersResponse.OrderSets["+ i +"].GmtCreate"));
			orderSet.setGmtModified(_ctx.stringValue("OpsDescribeOrdersResponse.OrderSets["+ i +"].GmtModified"));

			orderSets.add(orderSet);
		}
		opsDescribeOrdersResponse.setOrderSets(orderSets);
	 
	 	return opsDescribeOrdersResponse;
	}
}