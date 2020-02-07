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

import com.aliyuncs.market.model.v20151101.DescribeOrderResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeOrderResponseUnmarshaller {

	public static DescribeOrderResponse unmarshall(DescribeOrderResponse describeOrderResponse, UnmarshallerContext _ctx) {
		
		describeOrderResponse.setOrderId(_ctx.longValue("DescribeOrderResponse.OrderId"));
		describeOrderResponse.setAliUid(_ctx.longValue("DescribeOrderResponse.AliUid"));
		describeOrderResponse.setSupplierCompanyName(_ctx.stringValue("DescribeOrderResponse.SupplierCompanyName"));
		describeOrderResponse.setProductCode(_ctx.stringValue("DescribeOrderResponse.ProductCode"));
		describeOrderResponse.setProductSkuCode(_ctx.stringValue("DescribeOrderResponse.ProductSkuCode"));
		describeOrderResponse.setProductName(_ctx.stringValue("DescribeOrderResponse.ProductName"));
		describeOrderResponse.setPeriodType(_ctx.stringValue("DescribeOrderResponse.PeriodType"));
		describeOrderResponse.setQuantity(_ctx.integerValue("DescribeOrderResponse.Quantity"));
		describeOrderResponse.setAccountQuantity(_ctx.longValue("DescribeOrderResponse.AccountQuantity"));
		describeOrderResponse.setOrderType(_ctx.stringValue("DescribeOrderResponse.OrderType"));
		describeOrderResponse.setOrderStatus(_ctx.stringValue("DescribeOrderResponse.OrderStatus"));
		describeOrderResponse.setPayStatus(_ctx.stringValue("DescribeOrderResponse.PayStatus"));
		describeOrderResponse.setPaidOn(_ctx.longValue("DescribeOrderResponse.PaidOn"));
		describeOrderResponse.setCreatedOn(_ctx.longValue("DescribeOrderResponse.CreatedOn"));
		describeOrderResponse.setOriginalPrice(_ctx.floatValue("DescribeOrderResponse.OriginalPrice"));
		describeOrderResponse.setTotalPrice(_ctx.floatValue("DescribeOrderResponse.TotalPrice"));
		describeOrderResponse.setPaymentPrice(_ctx.floatValue("DescribeOrderResponse.PaymentPrice"));
		describeOrderResponse.setCouponPrice(_ctx.floatValue("DescribeOrderResponse.CouponPrice"));
		describeOrderResponse.setComponents(_ctx.mapValue("DescribeOrderResponse.Components"));

		List<String> supplierTelephones = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeOrderResponse.SupplierTelephones.Length"); i++) {
			supplierTelephones.add(_ctx.stringValue("DescribeOrderResponse.SupplierTelephones["+ i +"]"));
		}
		describeOrderResponse.setSupplierTelephones(supplierTelephones);

		List<String> instanceIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeOrderResponse.InstanceIds.Length"); i++) {
			instanceIds.add(_ctx.stringValue("DescribeOrderResponse.InstanceIds["+ i +"]"));
		}
		describeOrderResponse.setInstanceIds(instanceIds);
	 
	 	return describeOrderResponse;
	}
}