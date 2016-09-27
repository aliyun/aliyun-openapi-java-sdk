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
package com.aliyuncs.market.transform.v20151101;

import com.aliyuncs.market.model.v20151101.DescribeOrderResponse;
import com.aliyuncs.transform.UnmarshallerContext;

import java.util.ArrayList;
import java.util.List;


public class DescribeOrderResponseUnmarshaller {

	public static DescribeOrderResponse unmarshall(DescribeOrderResponse describeOrderResponse, UnmarshallerContext context) {
		
		describeOrderResponse.setOrderId(context.longValue("DescribeOrderResponse.OrderId"));
		describeOrderResponse.setAliUid(context.longValue("DescribeOrderResponse.AliUid"));
		describeOrderResponse.setSupplierCompanyName(context.stringValue("DescribeOrderResponse.SupplierCompanyName"));
		describeOrderResponse.setProductCode(context.stringValue("DescribeOrderResponse.ProductCode"));
		describeOrderResponse.setProductSkuCode(context.stringValue("DescribeOrderResponse.ProductSkuCode"));
		describeOrderResponse.setProductName(context.stringValue("DescribeOrderResponse.ProductName"));
		describeOrderResponse.setPeriodType(context.stringValue("DescribeOrderResponse.PeriodType"));
		describeOrderResponse.setQuantity(context.integerValue("DescribeOrderResponse.Quantity"));
		describeOrderResponse.setAccountQuantity(context.longValue("DescribeOrderResponse.AccountQuantity"));
		describeOrderResponse.setOrderType(context.stringValue("DescribeOrderResponse.OrderType"));
		describeOrderResponse.setOrderStatus(context.stringValue("DescribeOrderResponse.OrderStatus"));
		describeOrderResponse.setPayStatus(context.stringValue("DescribeOrderResponse.PayStatus"));
		describeOrderResponse.setPaidOn(context.longValue("DescribeOrderResponse.PaidOn"));
		describeOrderResponse.setCreatedOn(context.longValue("DescribeOrderResponse.CreatedOn"));
		describeOrderResponse.setOriginalPrice(context.floatValue("DescribeOrderResponse.OriginalPrice"));
		describeOrderResponse.setTotalPrice(context.floatValue("DescribeOrderResponse.TotalPrice"));
		describeOrderResponse.setPaymentPrice(context.floatValue("DescribeOrderResponse.PaymentPrice"));
		describeOrderResponse.setCouponPrice(context.floatValue("DescribeOrderResponse.CouponPrice"));

		List<String> supplierTelephones = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeOrderResponse.SupplierTelephones.Length"); i++) {
			supplierTelephones.add(context.stringValue("DescribeOrderResponse.SupplierTelephones["+ i +"]"));
		}
		describeOrderResponse.setSupplierTelephones(supplierTelephones);

		List<String> instanceIds = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeOrderResponse.InstanceIds.Length"); i++) {
			instanceIds.add(context.stringValue("DescribeOrderResponse.InstanceIds["+ i +"]"));
		}
		describeOrderResponse.setInstanceIds(instanceIds);
	 
	 	return describeOrderResponse;
	}
}