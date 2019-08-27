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

	public static DescribeInstancesResponse unmarshall(DescribeInstancesResponse describeInstancesResponse, UnmarshallerContext _ctx) {
		
		describeInstancesResponse.setRequestId(_ctx.stringValue("DescribeInstancesResponse.RequestId"));
		describeInstancesResponse.setPageNumber(_ctx.integerValue("DescribeInstancesResponse.PageNumber"));
		describeInstancesResponse.setPageSize(_ctx.integerValue("DescribeInstancesResponse.PageSize"));
		describeInstancesResponse.setTotalCount(_ctx.integerValue("DescribeInstancesResponse.TotalCount"));

		List<InstanceItem> instanceItems = new ArrayList<InstanceItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInstancesResponse.InstanceItems.Length"); i++) {
			InstanceItem instanceItem = new InstanceItem();
			instanceItem.setInstanceId(_ctx.longValue("DescribeInstancesResponse.InstanceItems["+ i +"].InstanceId"));
			instanceItem.setOrderId(_ctx.longValue("DescribeInstancesResponse.InstanceItems["+ i +"].OrderId"));
			instanceItem.setSupplierName(_ctx.stringValue("DescribeInstancesResponse.InstanceItems["+ i +"].SupplierName"));
			instanceItem.setProductCode(_ctx.stringValue("DescribeInstancesResponse.InstanceItems["+ i +"].ProductCode"));
			instanceItem.setProductSkuCode(_ctx.stringValue("DescribeInstancesResponse.InstanceItems["+ i +"].ProductSkuCode"));
			instanceItem.setProductName(_ctx.stringValue("DescribeInstancesResponse.InstanceItems["+ i +"].ProductName"));
			instanceItem.setProductType(_ctx.stringValue("DescribeInstancesResponse.InstanceItems["+ i +"].ProductType"));
			instanceItem.setStatus(_ctx.stringValue("DescribeInstancesResponse.InstanceItems["+ i +"].Status"));
			instanceItem.setBeganOn(_ctx.longValue("DescribeInstancesResponse.InstanceItems["+ i +"].BeganOn"));
			instanceItem.setEndOn(_ctx.longValue("DescribeInstancesResponse.InstanceItems["+ i +"].EndOn"));
			instanceItem.setCreatedOn(_ctx.longValue("DescribeInstancesResponse.InstanceItems["+ i +"].CreatedOn"));
			instanceItem.setExtendJson(_ctx.stringValue("DescribeInstancesResponse.InstanceItems["+ i +"].ExtendJson"));
			instanceItem.setHostJson(_ctx.stringValue("DescribeInstancesResponse.InstanceItems["+ i +"].HostJson"));
			instanceItem.setAppJson(_ctx.stringValue("DescribeInstancesResponse.InstanceItems["+ i +"].AppJson"));
			instanceItem.setApiJson(_ctx.stringValue("DescribeInstancesResponse.InstanceItems["+ i +"].ApiJson"));
			instanceItem.setImageJson(_ctx.stringValue("DescribeInstancesResponse.InstanceItems["+ i +"].ImageJson"));
			instanceItem.setIdaasJson(_ctx.stringValue("DescribeInstancesResponse.InstanceItems["+ i +"].IdaasJson"));

			instanceItems.add(instanceItem);
		}
		describeInstancesResponse.setInstanceItems(instanceItems);
	 
	 	return describeInstancesResponse;
	}
}