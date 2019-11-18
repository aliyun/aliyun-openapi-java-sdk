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

package com.aliyuncs.cloudesl.transform.v20190801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudesl.model.v20190801.DescribePayOrdersResponse;
import com.aliyuncs.cloudesl.model.v20190801.DescribePayOrdersResponse.PayOrderInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePayOrdersResponseUnmarshaller {

	public static DescribePayOrdersResponse unmarshall(DescribePayOrdersResponse describePayOrdersResponse, UnmarshallerContext _ctx) {
		
		describePayOrdersResponse.setRequestId(_ctx.stringValue("DescribePayOrdersResponse.RequestId"));
		describePayOrdersResponse.setErrorMessage(_ctx.stringValue("DescribePayOrdersResponse.ErrorMessage"));
		describePayOrdersResponse.setTotalCount(_ctx.integerValue("DescribePayOrdersResponse.TotalCount"));
		describePayOrdersResponse.setErrorCode(_ctx.stringValue("DescribePayOrdersResponse.ErrorCode"));
		describePayOrdersResponse.setMessage(_ctx.stringValue("DescribePayOrdersResponse.Message"));
		describePayOrdersResponse.setPageSize(_ctx.integerValue("DescribePayOrdersResponse.PageSize"));
		describePayOrdersResponse.setDynamicCode(_ctx.stringValue("DescribePayOrdersResponse.DynamicCode"));
		describePayOrdersResponse.setCode(_ctx.stringValue("DescribePayOrdersResponse.Code"));
		describePayOrdersResponse.setDynamicMessage(_ctx.stringValue("DescribePayOrdersResponse.DynamicMessage"));
		describePayOrdersResponse.setSuccess(_ctx.booleanValue("DescribePayOrdersResponse.Success"));
		describePayOrdersResponse.setPageNumber(_ctx.integerValue("DescribePayOrdersResponse.PageNumber"));

		List<PayOrderInfo> payOrders = new ArrayList<PayOrderInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribePayOrdersResponse.PayOrders.Length"); i++) {
			PayOrderInfo payOrderInfo = new PayOrderInfo();
			payOrderInfo.setGmtPay(_ctx.stringValue("DescribePayOrdersResponse.PayOrders["+ i +"].GmtPay"));
			payOrderInfo.setPayAmount(_ctx.floatValue("DescribePayOrdersResponse.PayOrders["+ i +"].PayAmount"));
			payOrderInfo.setQuantity(_ctx.integerValue("DescribePayOrdersResponse.PayOrders["+ i +"].Quantity"));
			payOrderInfo.setOrderType(_ctx.stringValue("DescribePayOrdersResponse.PayOrders["+ i +"].OrderType"));
			payOrderInfo.setIsAccepted(_ctx.booleanValue("DescribePayOrdersResponse.PayOrders["+ i +"].IsAccepted"));
			payOrderInfo.setOrderId(_ctx.stringValue("DescribePayOrdersResponse.PayOrders["+ i +"].OrderId"));
			payOrderInfo.setOriginalAmount(_ctx.floatValue("DescribePayOrdersResponse.PayOrders["+ i +"].OriginalAmount"));
			payOrderInfo.setDetailName(_ctx.stringValue("DescribePayOrdersResponse.PayOrders["+ i +"].DetailName"));
			payOrderInfo.setOrderStatus(_ctx.stringValue("DescribePayOrdersResponse.PayOrders["+ i +"].OrderStatus"));
			payOrderInfo.setCommodityCode(_ctx.stringValue("DescribePayOrdersResponse.PayOrders["+ i +"].CommodityCode"));
			payOrderInfo.setCommodityName(_ctx.stringValue("DescribePayOrdersResponse.PayOrders["+ i +"].CommodityName"));
			payOrderInfo.setGmtCreate(_ctx.stringValue("DescribePayOrdersResponse.PayOrders["+ i +"].GmtCreate"));

			payOrders.add(payOrderInfo);
		}
		describePayOrdersResponse.setPayOrders(payOrders);
	 
	 	return describePayOrdersResponse;
	}
}