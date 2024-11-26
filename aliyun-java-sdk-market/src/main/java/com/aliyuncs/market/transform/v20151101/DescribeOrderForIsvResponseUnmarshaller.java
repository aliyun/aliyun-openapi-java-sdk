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

package com.aliyuncs.market.transform.v20151101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.market.model.v20151101.DescribeOrderForIsvResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeOrderForIsvResponseUnmarshaller {

	public static DescribeOrderForIsvResponse unmarshall(DescribeOrderForIsvResponse describeOrderForIsvResponse, UnmarshallerContext _ctx) {
		
		describeOrderForIsvResponse.setRequestId(_ctx.stringValue("DescribeOrderForIsvResponse.RequestId"));
		describeOrderForIsvResponse.setProductName(_ctx.stringValue("DescribeOrderForIsvResponse.ProductName"));
		describeOrderForIsvResponse.setOriginalPrice(_ctx.floatValue("DescribeOrderForIsvResponse.OriginalPrice"));
		describeOrderForIsvResponse.setAliUid(_ctx.longValue("DescribeOrderForIsvResponse.AliUid"));
		describeOrderForIsvResponse.setCouponPrice(_ctx.floatValue("DescribeOrderForIsvResponse.CouponPrice"));
		describeOrderForIsvResponse.setAccountQuantity(_ctx.longValue("DescribeOrderForIsvResponse.AccountQuantity"));
		describeOrderForIsvResponse.setPeriodType(_ctx.stringValue("DescribeOrderForIsvResponse.PeriodType"));
		describeOrderForIsvResponse.setPayStatus(_ctx.stringValue("DescribeOrderForIsvResponse.PayStatus"));
		describeOrderForIsvResponse.setPaymentPrice(_ctx.floatValue("DescribeOrderForIsvResponse.PaymentPrice"));
		describeOrderForIsvResponse.setOrderStatus(_ctx.stringValue("DescribeOrderForIsvResponse.OrderStatus"));
		describeOrderForIsvResponse.setProductSkuCode(_ctx.stringValue("DescribeOrderForIsvResponse.ProductSkuCode"));
		describeOrderForIsvResponse.setPaidOn(_ctx.longValue("DescribeOrderForIsvResponse.PaidOn"));
		describeOrderForIsvResponse.setComponents(_ctx.mapValue("DescribeOrderForIsvResponse.Components"));
		describeOrderForIsvResponse.setCreatedOn(_ctx.longValue("DescribeOrderForIsvResponse.CreatedOn"));
		describeOrderForIsvResponse.setOrderType(_ctx.stringValue("DescribeOrderForIsvResponse.OrderType"));
		describeOrderForIsvResponse.setTotalPrice(_ctx.floatValue("DescribeOrderForIsvResponse.TotalPrice"));
		describeOrderForIsvResponse.setQuantity(_ctx.integerValue("DescribeOrderForIsvResponse.Quantity"));
		describeOrderForIsvResponse.setOrderId(_ctx.longValue("DescribeOrderForIsvResponse.OrderId"));
		describeOrderForIsvResponse.setProductCode(_ctx.stringValue("DescribeOrderForIsvResponse.ProductCode"));

		List<String> instanceIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeOrderForIsvResponse.InstanceIds.Length"); i++) {
			instanceIds.add(_ctx.stringValue("DescribeOrderForIsvResponse.InstanceIds["+ i +"]"));
		}
		describeOrderForIsvResponse.setInstanceIds(instanceIds);
	 
	 	return describeOrderForIsvResponse;
	}
}