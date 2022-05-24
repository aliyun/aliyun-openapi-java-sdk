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

package com.aliyuncs.rds.transform.v20140815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rds.model.v20140815.DescribeDBProxyEndpointResponse;
import com.aliyuncs.rds.model.v20140815.DescribeDBProxyEndpointResponse.EndpointConnectItemsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBProxyEndpointResponseUnmarshaller {

	public static DescribeDBProxyEndpointResponse unmarshall(DescribeDBProxyEndpointResponse describeDBProxyEndpointResponse, UnmarshallerContext _ctx) {
		
		describeDBProxyEndpointResponse.setRequestId(_ctx.stringValue("DescribeDBProxyEndpointResponse.RequestId"));
		describeDBProxyEndpointResponse.setDBProxyConnectStringNetType(_ctx.stringValue("DescribeDBProxyEndpointResponse.DBProxyConnectStringNetType"));
		describeDBProxyEndpointResponse.setDBProxyFeatures(_ctx.stringValue("DescribeDBProxyEndpointResponse.DBProxyFeatures"));
		describeDBProxyEndpointResponse.setReadOnlyInstanceWeight(_ctx.stringValue("DescribeDBProxyEndpointResponse.ReadOnlyInstanceWeight"));
		describeDBProxyEndpointResponse.setReadOnlyInstanceDistributionType(_ctx.stringValue("DescribeDBProxyEndpointResponse.ReadOnlyInstanceDistributionType"));
		describeDBProxyEndpointResponse.setReadOnlyInstanceMaxDelayTime(_ctx.stringValue("DescribeDBProxyEndpointResponse.ReadOnlyInstanceMaxDelayTime"));
		describeDBProxyEndpointResponse.setDbProxyEndpointReadWriteMode(_ctx.stringValue("DescribeDBProxyEndpointResponse.DbProxyEndpointReadWriteMode"));
		describeDBProxyEndpointResponse.setDbProxyEndpointAliases(_ctx.stringValue("DescribeDBProxyEndpointResponse.DbProxyEndpointAliases"));
		describeDBProxyEndpointResponse.setDBProxyEndpointId(_ctx.stringValue("DescribeDBProxyEndpointResponse.DBProxyEndpointId"));
		describeDBProxyEndpointResponse.setDBProxyConnectStringPort(_ctx.stringValue("DescribeDBProxyEndpointResponse.DBProxyConnectStringPort"));
		describeDBProxyEndpointResponse.setDBProxyConnectString(_ctx.stringValue("DescribeDBProxyEndpointResponse.DBProxyConnectString"));

		List<EndpointConnectItemsItem> endpointConnectItems = new ArrayList<EndpointConnectItemsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDBProxyEndpointResponse.EndpointConnectItems.Length"); i++) {
			EndpointConnectItemsItem endpointConnectItemsItem = new EndpointConnectItemsItem();
			endpointConnectItemsItem.setDbProxyEndpointPort(_ctx.stringValue("DescribeDBProxyEndpointResponse.EndpointConnectItems["+ i +"].DbProxyEndpointPort"));
			endpointConnectItemsItem.setDbProxyEndpointConnectString(_ctx.stringValue("DescribeDBProxyEndpointResponse.EndpointConnectItems["+ i +"].DbProxyEndpointConnectString"));
			endpointConnectItemsItem.setDbProxyEndpointNetType(_ctx.stringValue("DescribeDBProxyEndpointResponse.EndpointConnectItems["+ i +"].DbProxyEndpointNetType"));

			endpointConnectItems.add(endpointConnectItemsItem);
		}
		describeDBProxyEndpointResponse.setEndpointConnectItems(endpointConnectItems);
	 
	 	return describeDBProxyEndpointResponse;
	}
}