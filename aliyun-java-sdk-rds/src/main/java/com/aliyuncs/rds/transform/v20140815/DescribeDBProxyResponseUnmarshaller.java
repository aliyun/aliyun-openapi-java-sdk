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

import com.aliyuncs.rds.model.v20140815.DescribeDBProxyResponse;
import com.aliyuncs.rds.model.v20140815.DescribeDBProxyResponse.DBProxyConnectStringItemsItem;
import com.aliyuncs.rds.model.v20140815.DescribeDBProxyResponse.DBProxyNodesItem;
import com.aliyuncs.rds.model.v20140815.DescribeDBProxyResponse.DbProxyEndpointItemsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBProxyResponseUnmarshaller {

	public static DescribeDBProxyResponse unmarshall(DescribeDBProxyResponse describeDBProxyResponse, UnmarshallerContext _ctx) {
		
		describeDBProxyResponse.setRequestId(_ctx.stringValue("DescribeDBProxyResponse.RequestId"));
		describeDBProxyResponse.setAccountName(_ctx.stringValue("DescribeDBProxyResponse.AccountName"));
		describeDBProxyResponse.setDBProxyEngineType(_ctx.stringValue("DescribeDBProxyResponse.DBProxyEngineType"));
		describeDBProxyResponse.setDBProxyInstanceCurrentMinorVersion(_ctx.stringValue("DescribeDBProxyResponse.DBProxyInstanceCurrentMinorVersion"));
		describeDBProxyResponse.setDBProxyInstanceLatestMinorVersion(_ctx.stringValue("DescribeDBProxyResponse.DBProxyInstanceLatestMinorVersion"));
		describeDBProxyResponse.setDBProxyInstanceName(_ctx.stringValue("DescribeDBProxyResponse.DBProxyInstanceName"));
		describeDBProxyResponse.setDBProxyInstanceNum(_ctx.integerValue("DescribeDBProxyResponse.DBProxyInstanceNum"));
		describeDBProxyResponse.setDBProxyInstanceSize(_ctx.stringValue("DescribeDBProxyResponse.DBProxyInstanceSize"));
		describeDBProxyResponse.setDBProxyInstanceStatus(_ctx.stringValue("DescribeDBProxyResponse.DBProxyInstanceStatus"));
		describeDBProxyResponse.setDBProxyInstanceType(_ctx.stringValue("DescribeDBProxyResponse.DBProxyInstanceType"));
		describeDBProxyResponse.setDBProxyKindCode(_ctx.stringValue("DescribeDBProxyResponse.DBProxyKindCode"));
		describeDBProxyResponse.setDBProxyPersistentConnectionStatus(_ctx.stringValue("DescribeDBProxyResponse.DBProxyPersistentConnectionStatus"));
		describeDBProxyResponse.setDBProxyServiceStatus(_ctx.stringValue("DescribeDBProxyResponse.DBProxyServiceStatus"));
		describeDBProxyResponse.setResourceGroupId(_ctx.stringValue("DescribeDBProxyResponse.ResourceGroupId"));

		List<String> dBProxyAVZones = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDBProxyResponse.DBProxyAVZones.Length"); i++) {
			dBProxyAVZones.add(_ctx.stringValue("DescribeDBProxyResponse.DBProxyAVZones["+ i +"]"));
		}
		describeDBProxyResponse.setDBProxyAVZones(dBProxyAVZones);

		List<DBProxyConnectStringItemsItem> dBProxyConnectStringItems = new ArrayList<DBProxyConnectStringItemsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDBProxyResponse.DBProxyConnectStringItems.Length"); i++) {
			DBProxyConnectStringItemsItem dBProxyConnectStringItemsItem = new DBProxyConnectStringItemsItem();
			dBProxyConnectStringItemsItem.setDBProxyConnectString(_ctx.stringValue("DescribeDBProxyResponse.DBProxyConnectStringItems["+ i +"].DBProxyConnectString"));
			dBProxyConnectStringItemsItem.setDBProxyConnectStringNetType(_ctx.stringValue("DescribeDBProxyResponse.DBProxyConnectStringItems["+ i +"].DBProxyConnectStringNetType"));
			dBProxyConnectStringItemsItem.setDBProxyConnectStringNetWorkType(_ctx.stringValue("DescribeDBProxyResponse.DBProxyConnectStringItems["+ i +"].DBProxyConnectStringNetWorkType"));
			dBProxyConnectStringItemsItem.setDBProxyConnectStringPort(_ctx.stringValue("DescribeDBProxyResponse.DBProxyConnectStringItems["+ i +"].DBProxyConnectStringPort"));
			dBProxyConnectStringItemsItem.setDBProxyEndpointId(_ctx.stringValue("DescribeDBProxyResponse.DBProxyConnectStringItems["+ i +"].DBProxyEndpointId"));
			dBProxyConnectStringItemsItem.setDBProxyEndpointName(_ctx.stringValue("DescribeDBProxyResponse.DBProxyConnectStringItems["+ i +"].DBProxyEndpointName"));
			dBProxyConnectStringItemsItem.setDBProxyVpcId(_ctx.stringValue("DescribeDBProxyResponse.DBProxyConnectStringItems["+ i +"].DBProxyVpcId"));
			dBProxyConnectStringItemsItem.setDBProxyVpcInstanceId(_ctx.stringValue("DescribeDBProxyResponse.DBProxyConnectStringItems["+ i +"].DBProxyVpcInstanceId"));
			dBProxyConnectStringItemsItem.setDBProxyVswitchId(_ctx.stringValue("DescribeDBProxyResponse.DBProxyConnectStringItems["+ i +"].DBProxyVswitchId"));

			dBProxyConnectStringItems.add(dBProxyConnectStringItemsItem);
		}
		describeDBProxyResponse.setDBProxyConnectStringItems(dBProxyConnectStringItems);

		List<DBProxyNodesItem> dBProxyNodes = new ArrayList<DBProxyNodesItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDBProxyResponse.DBProxyNodes.Length"); i++) {
			DBProxyNodesItem dBProxyNodesItem = new DBProxyNodesItem();
			dBProxyNodesItem.setCpuCores(_ctx.stringValue("DescribeDBProxyResponse.DBProxyNodes["+ i +"].cpuCores"));
			dBProxyNodesItem.setNodeId(_ctx.stringValue("DescribeDBProxyResponse.DBProxyNodes["+ i +"].nodeId"));
			dBProxyNodesItem.setZoneId(_ctx.stringValue("DescribeDBProxyResponse.DBProxyNodes["+ i +"].zoneId"));

			dBProxyNodes.add(dBProxyNodesItem);
		}
		describeDBProxyResponse.setDBProxyNodes(dBProxyNodes);

		List<DbProxyEndpointItemsItem> dbProxyEndpointItems = new ArrayList<DbProxyEndpointItemsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDBProxyResponse.DbProxyEndpointItems.Length"); i++) {
			DbProxyEndpointItemsItem dbProxyEndpointItemsItem = new DbProxyEndpointItemsItem();
			dbProxyEndpointItemsItem.setDbProxyEndpointAliases(_ctx.stringValue("DescribeDBProxyResponse.DbProxyEndpointItems["+ i +"].DbProxyEndpointAliases"));
			dbProxyEndpointItemsItem.setDbProxyEndpointName(_ctx.stringValue("DescribeDBProxyResponse.DbProxyEndpointItems["+ i +"].DbProxyEndpointName"));
			dbProxyEndpointItemsItem.setDbProxyEndpointType(_ctx.stringValue("DescribeDBProxyResponse.DbProxyEndpointItems["+ i +"].DbProxyEndpointType"));
			dbProxyEndpointItemsItem.setDbProxyReadWriteMode(_ctx.stringValue("DescribeDBProxyResponse.DbProxyEndpointItems["+ i +"].DbProxyReadWriteMode"));

			dbProxyEndpointItems.add(dbProxyEndpointItemsItem);
		}
		describeDBProxyResponse.setDbProxyEndpointItems(dbProxyEndpointItems);
	 
	 	return describeDBProxyResponse;
	}
}