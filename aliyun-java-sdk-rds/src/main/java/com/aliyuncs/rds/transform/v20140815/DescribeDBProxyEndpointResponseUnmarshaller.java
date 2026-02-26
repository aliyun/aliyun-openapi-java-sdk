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
import com.aliyuncs.rds.model.v20140815.DescribeDBProxyEndpointResponse.DBProxyNodesItem;
import com.aliyuncs.rds.model.v20140815.DescribeDBProxyEndpointResponse.EndpointConnectItemsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBProxyEndpointResponseUnmarshaller {

	public static DescribeDBProxyEndpointResponse unmarshall(DescribeDBProxyEndpointResponse describeDBProxyEndpointResponse, UnmarshallerContext _ctx) {
		
		describeDBProxyEndpointResponse.setRequestId(_ctx.stringValue("DescribeDBProxyEndpointResponse.RequestId"));
		describeDBProxyEndpointResponse.setDBProxyConnectString(_ctx.stringValue("DescribeDBProxyEndpointResponse.DBProxyConnectString"));
		describeDBProxyEndpointResponse.setDBProxyConnectStringNetType(_ctx.stringValue("DescribeDBProxyEndpointResponse.DBProxyConnectStringNetType"));
		describeDBProxyEndpointResponse.setDBProxyConnectStringPort(_ctx.stringValue("DescribeDBProxyEndpointResponse.DBProxyConnectStringPort"));
		describeDBProxyEndpointResponse.setDBProxyEndpointId(_ctx.stringValue("DescribeDBProxyEndpointResponse.DBProxyEndpointId"));
		describeDBProxyEndpointResponse.setDBProxyEngineType(_ctx.stringValue("DescribeDBProxyEndpointResponse.DBProxyEngineType"));
		describeDBProxyEndpointResponse.setDBProxyFeatures(_ctx.stringValue("DescribeDBProxyEndpointResponse.DBProxyFeatures"));
		describeDBProxyEndpointResponse.setDbProxyEndpointAliases(_ctx.stringValue("DescribeDBProxyEndpointResponse.DbProxyEndpointAliases"));
		describeDBProxyEndpointResponse.setDbProxyEndpointReadWriteMode(_ctx.stringValue("DescribeDBProxyEndpointResponse.DbProxyEndpointReadWriteMode"));
		describeDBProxyEndpointResponse.setDbProxyEndpointVswitchId(_ctx.stringValue("DescribeDBProxyEndpointResponse.DbProxyEndpointVswitchId"));
		describeDBProxyEndpointResponse.setDbProxyEndpointVpcId(_ctx.stringValue("DescribeDBProxyEndpointResponse.DbProxyEndpointVpcId"));
		describeDBProxyEndpointResponse.setDbProxyEndpointZoneId(_ctx.stringValue("DescribeDBProxyEndpointResponse.DbProxyEndpointZoneId"));
		describeDBProxyEndpointResponse.setReadOnlyInstanceDistributionType(_ctx.stringValue("DescribeDBProxyEndpointResponse.ReadOnlyInstanceDistributionType"));
		describeDBProxyEndpointResponse.setReadOnlyInstanceMaxDelayTime(_ctx.stringValue("DescribeDBProxyEndpointResponse.ReadOnlyInstanceMaxDelayTime"));
		describeDBProxyEndpointResponse.setCausalConsistReadTimeout(_ctx.stringValue("DescribeDBProxyEndpointResponse.CausalConsistReadTimeout"));
		describeDBProxyEndpointResponse.setReadOnlyInstanceWeight(_ctx.stringValue("DescribeDBProxyEndpointResponse.ReadOnlyInstanceWeight"));
		describeDBProxyEndpointResponse.setDBProxyEndpointMinSlaveCount(_ctx.stringValue("DescribeDBProxyEndpointResponse.DBProxyEndpointMinSlaveCount"));

		List<DBProxyNodesItem> dBProxyNodes = new ArrayList<DBProxyNodesItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDBProxyEndpointResponse.DBProxyNodes.Length"); i++) {
			DBProxyNodesItem dBProxyNodesItem = new DBProxyNodesItem();
			dBProxyNodesItem.setCpuCores(_ctx.stringValue("DescribeDBProxyEndpointResponse.DBProxyNodes["+ i +"].cpuCores"));
			dBProxyNodesItem.setNodeId(_ctx.stringValue("DescribeDBProxyEndpointResponse.DBProxyNodes["+ i +"].nodeId"));
			dBProxyNodesItem.setZoneId(_ctx.stringValue("DescribeDBProxyEndpointResponse.DBProxyNodes["+ i +"].zoneId"));

			dBProxyNodes.add(dBProxyNodesItem);
		}
		describeDBProxyEndpointResponse.setDBProxyNodes(dBProxyNodes);

		List<EndpointConnectItemsItem> endpointConnectItems = new ArrayList<EndpointConnectItemsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDBProxyEndpointResponse.EndpointConnectItems.Length"); i++) {
			EndpointConnectItemsItem endpointConnectItemsItem = new EndpointConnectItemsItem();
			endpointConnectItemsItem.setDbProxyEndpointConnectString(_ctx.stringValue("DescribeDBProxyEndpointResponse.EndpointConnectItems["+ i +"].DbProxyEndpointConnectString"));
			endpointConnectItemsItem.setDbProxyEndpointNetType(_ctx.stringValue("DescribeDBProxyEndpointResponse.EndpointConnectItems["+ i +"].DbProxyEndpointNetType"));
			endpointConnectItemsItem.setDbProxyEndpointPort(_ctx.stringValue("DescribeDBProxyEndpointResponse.EndpointConnectItems["+ i +"].DbProxyEndpointPort"));

			endpointConnectItems.add(endpointConnectItemsItem);
		}
		describeDBProxyEndpointResponse.setEndpointConnectItems(endpointConnectItems);
	 
	 	return describeDBProxyEndpointResponse;
	}
}