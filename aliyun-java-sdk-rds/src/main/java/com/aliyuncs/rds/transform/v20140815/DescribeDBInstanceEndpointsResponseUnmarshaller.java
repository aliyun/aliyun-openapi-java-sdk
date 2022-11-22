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

import com.aliyuncs.rds.model.v20140815.DescribeDBInstanceEndpointsResponse;
import com.aliyuncs.rds.model.v20140815.DescribeDBInstanceEndpointsResponse.Data;
import com.aliyuncs.rds.model.v20140815.DescribeDBInstanceEndpointsResponse.Data.DBInstanceEndpoint;
import com.aliyuncs.rds.model.v20140815.DescribeDBInstanceEndpointsResponse.Data.DBInstanceEndpoint.AddressItem;
import com.aliyuncs.rds.model.v20140815.DescribeDBInstanceEndpointsResponse.Data.DBInstanceEndpoint.NodeItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBInstanceEndpointsResponseUnmarshaller {

	public static DescribeDBInstanceEndpointsResponse unmarshall(DescribeDBInstanceEndpointsResponse describeDBInstanceEndpointsResponse, UnmarshallerContext _ctx) {
		
		describeDBInstanceEndpointsResponse.setRequestId(_ctx.stringValue("DescribeDBInstanceEndpointsResponse.RequestId"));

		Data data = new Data();
		data.setDBInstanceName(_ctx.stringValue("DescribeDBInstanceEndpointsResponse.Data.DBInstanceName"));
		data.setIpVersion(_ctx.stringValue("DescribeDBInstanceEndpointsResponse.Data.IpVersion"));

		List<DBInstanceEndpoint> dBInstanceEndpoints = new ArrayList<DBInstanceEndpoint>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDBInstanceEndpointsResponse.Data.DBInstanceEndpoints.Length"); i++) {
			DBInstanceEndpoint dBInstanceEndpoint = new DBInstanceEndpoint();
			dBInstanceEndpoint.setEndpointId(_ctx.stringValue("DescribeDBInstanceEndpointsResponse.Data.DBInstanceEndpoints["+ i +"].EndpointId"));
			dBInstanceEndpoint.setEndpointType(_ctx.stringValue("DescribeDBInstanceEndpointsResponse.Data.DBInstanceEndpoints["+ i +"].EndpointType"));
			dBInstanceEndpoint.setEndpointDescription(_ctx.stringValue("DescribeDBInstanceEndpointsResponse.Data.DBInstanceEndpoints["+ i +"].EndpointDescription"));

			List<NodeItem> nodeItems = new ArrayList<NodeItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDBInstanceEndpointsResponse.Data.DBInstanceEndpoints["+ i +"].NodeItems.Length"); j++) {
				NodeItem nodeItem = new NodeItem();
				nodeItem.setNodeId(_ctx.stringValue("DescribeDBInstanceEndpointsResponse.Data.DBInstanceEndpoints["+ i +"].NodeItems["+ j +"].NodeId"));
				nodeItem.setDBInstanceId(_ctx.stringValue("DescribeDBInstanceEndpointsResponse.Data.DBInstanceEndpoints["+ i +"].NodeItems["+ j +"].DBInstanceId"));
				nodeItem.setWeight(_ctx.integerValue("DescribeDBInstanceEndpointsResponse.Data.DBInstanceEndpoints["+ i +"].NodeItems["+ j +"].Weight"));

				nodeItems.add(nodeItem);
			}
			dBInstanceEndpoint.setNodeItems(nodeItems);

			List<AddressItem> addressItems = new ArrayList<AddressItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDBInstanceEndpointsResponse.Data.DBInstanceEndpoints["+ i +"].AddressItems.Length"); j++) {
				AddressItem addressItem = new AddressItem();
				addressItem.setVpcId(_ctx.stringValue("DescribeDBInstanceEndpointsResponse.Data.DBInstanceEndpoints["+ i +"].AddressItems["+ j +"].VpcId"));
				addressItem.setVSwitchId(_ctx.stringValue("DescribeDBInstanceEndpointsResponse.Data.DBInstanceEndpoints["+ i +"].AddressItems["+ j +"].VSwitchId"));
				addressItem.setIpType(_ctx.stringValue("DescribeDBInstanceEndpointsResponse.Data.DBInstanceEndpoints["+ i +"].AddressItems["+ j +"].IpType"));
				addressItem.setPort(_ctx.stringValue("DescribeDBInstanceEndpointsResponse.Data.DBInstanceEndpoints["+ i +"].AddressItems["+ j +"].Port"));
				addressItem.setConnectionString(_ctx.stringValue("DescribeDBInstanceEndpointsResponse.Data.DBInstanceEndpoints["+ i +"].AddressItems["+ j +"].ConnectionString"));
				addressItem.setIpAddress(_ctx.stringValue("DescribeDBInstanceEndpointsResponse.Data.DBInstanceEndpoints["+ i +"].AddressItems["+ j +"].IpAddress"));

				addressItems.add(addressItem);
			}
			dBInstanceEndpoint.setAddressItems(addressItems);

			dBInstanceEndpoints.add(dBInstanceEndpoint);
		}
		data.setDBInstanceEndpoints(dBInstanceEndpoints);
		describeDBInstanceEndpointsResponse.setData(data);
	 
	 	return describeDBInstanceEndpointsResponse;
	}
}