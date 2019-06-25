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

import com.aliyuncs.market.model.v20151101.DescribeInstancesResponse;
import com.aliyuncs.market.model.v20151101.DescribeInstancesResponse.InstanceItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstancesResponseUnmarshaller {

	public static DescribeInstancesResponse unmarshall(DescribeInstancesResponse describeInstancesResponse, UnmarshallerContext context) {
		
		describeInstancesResponse.setRequestId(context.stringValue("DescribeInstancesResponse.RequestId"));
		describeInstancesResponse.setPageNumber(context.integerValue("DescribeInstancesResponse.PageNumber"));
		describeInstancesResponse.setPageSize(context.integerValue("DescribeInstancesResponse.PageSize"));
		describeInstancesResponse.setTotalCount(context.integerValue("DescribeInstancesResponse.TotalCount"));

		List<InstanceItem> instanceItems = new ArrayList<InstanceItem>();
		for (int i = 0; i < context.lengthValue("DescribeInstancesResponse.InstanceItems.Length"); i++) {
			InstanceItem instanceItem = new InstanceItem();
			instanceItem.setInstanceId(context.longValue("DescribeInstancesResponse.InstanceItems["+ i +"].InstanceId"));
			instanceItem.setOrderId(context.longValue("DescribeInstancesResponse.InstanceItems["+ i +"].OrderId"));
			instanceItem.setSupplierName(context.stringValue("DescribeInstancesResponse.InstanceItems["+ i +"].SupplierName"));
			instanceItem.setProductCode(context.stringValue("DescribeInstancesResponse.InstanceItems["+ i +"].ProductCode"));
			instanceItem.setProductSkuCode(context.stringValue("DescribeInstancesResponse.InstanceItems["+ i +"].ProductSkuCode"));
			instanceItem.setProductName(context.stringValue("DescribeInstancesResponse.InstanceItems["+ i +"].ProductName"));
			instanceItem.setProductType(context.stringValue("DescribeInstancesResponse.InstanceItems["+ i +"].ProductType"));
			instanceItem.setStatus(context.stringValue("DescribeInstancesResponse.InstanceItems["+ i +"].Status"));
			instanceItem.setBeganOn(context.longValue("DescribeInstancesResponse.InstanceItems["+ i +"].BeganOn"));
			instanceItem.setEndOn(context.longValue("DescribeInstancesResponse.InstanceItems["+ i +"].EndOn"));
			instanceItem.setCreatedOn(context.longValue("DescribeInstancesResponse.InstanceItems["+ i +"].CreatedOn"));
			instanceItem.setExtendJson(context.stringValue("DescribeInstancesResponse.InstanceItems["+ i +"].ExtendJson"));
			instanceItem.setHostJson(context.stringValue("DescribeInstancesResponse.InstanceItems["+ i +"].HostJson"));
			instanceItem.setAppJson(context.stringValue("DescribeInstancesResponse.InstanceItems["+ i +"].AppJson"));
			instanceItem.setApiJson(context.stringValue("DescribeInstancesResponse.InstanceItems["+ i +"].ApiJson"));
			instanceItem.setImageJson(context.stringValue("DescribeInstancesResponse.InstanceItems["+ i +"].ImageJson"));
			instanceItem.setIdaasJson(context.stringValue("DescribeInstancesResponse.InstanceItems["+ i +"].IdaasJson"));

			instanceItems.add(instanceItem);
		}
		describeInstancesResponse.setInstanceItems(instanceItems);
	 
	 	return describeInstancesResponse;
	}
}