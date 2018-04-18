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

import com.aliyuncs.market.model.v20151101.DescribeInstanceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstanceResponseUnmarshaller {

	public static DescribeInstanceResponse unmarshall(DescribeInstanceResponse describeInstanceResponse, UnmarshallerContext context) {
		
		describeInstanceResponse.setInstanceId(context.longValue("DescribeInstanceResponse.InstanceId"));
		describeInstanceResponse.setOrderId(context.longValue("DescribeInstanceResponse.OrderId"));
		describeInstanceResponse.setSupplierName(context.stringValue("DescribeInstanceResponse.SupplierName"));
		describeInstanceResponse.setProductCode(context.stringValue("DescribeInstanceResponse.ProductCode"));
		describeInstanceResponse.setProductSkuCode(context.stringValue("DescribeInstanceResponse.ProductSkuCode"));
		describeInstanceResponse.setProductName(context.stringValue("DescribeInstanceResponse.ProductName"));
		describeInstanceResponse.setProductType(context.stringValue("DescribeInstanceResponse.ProductType"));
		describeInstanceResponse.setStatus(context.stringValue("DescribeInstanceResponse.Status"));
		describeInstanceResponse.setBeganOn(context.longValue("DescribeInstanceResponse.BeganOn"));
		describeInstanceResponse.setEndOn(context.longValue("DescribeInstanceResponse.EndOn"));
		describeInstanceResponse.setCreatedOn(context.longValue("DescribeInstanceResponse.CreatedOn"));
		describeInstanceResponse.setExtendJson(context.stringValue("DescribeInstanceResponse.ExtendJson"));
		describeInstanceResponse.setHostJson(context.stringValue("DescribeInstanceResponse.HostJson"));
		describeInstanceResponse.setAppJson(context.stringValue("DescribeInstanceResponse.AppJson"));
	 
	 	return describeInstanceResponse;
	}
}