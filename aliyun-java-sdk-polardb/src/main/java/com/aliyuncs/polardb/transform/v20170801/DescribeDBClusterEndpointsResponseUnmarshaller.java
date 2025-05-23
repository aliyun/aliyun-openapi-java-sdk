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

package com.aliyuncs.polardb.transform.v20170801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.polardb.model.v20170801.DescribeDBClusterEndpointsResponse;
import com.aliyuncs.polardb.model.v20170801.DescribeDBClusterEndpointsResponse.DBEndpoint;
import com.aliyuncs.polardb.model.v20170801.DescribeDBClusterEndpointsResponse.DBEndpoint.Address;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBClusterEndpointsResponseUnmarshaller {

	public static DescribeDBClusterEndpointsResponse unmarshall(DescribeDBClusterEndpointsResponse describeDBClusterEndpointsResponse, UnmarshallerContext _ctx) {
		
		describeDBClusterEndpointsResponse.setRequestId(_ctx.stringValue("DescribeDBClusterEndpointsResponse.RequestId"));

		List<DBEndpoint> items = new ArrayList<DBEndpoint>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDBClusterEndpointsResponse.Items.Length"); i++) {
			DBEndpoint dBEndpoint = new DBEndpoint();
			dBEndpoint.setNodes(_ctx.stringValue("DescribeDBClusterEndpointsResponse.Items["+ i +"].Nodes"));
			dBEndpoint.setReadWriteMode(_ctx.stringValue("DescribeDBClusterEndpointsResponse.Items["+ i +"].ReadWriteMode"));
			dBEndpoint.setDBEndpointId(_ctx.stringValue("DescribeDBClusterEndpointsResponse.Items["+ i +"].DBEndpointId"));
			dBEndpoint.setEndpointConfig(_ctx.stringValue("DescribeDBClusterEndpointsResponse.Items["+ i +"].EndpointConfig"));
			dBEndpoint.setDBEndpointDescription(_ctx.stringValue("DescribeDBClusterEndpointsResponse.Items["+ i +"].DBEndpointDescription"));
			dBEndpoint.setEndpointType(_ctx.stringValue("DescribeDBClusterEndpointsResponse.Items["+ i +"].EndpointType"));
			dBEndpoint.setAutoAddNewNodes(_ctx.stringValue("DescribeDBClusterEndpointsResponse.Items["+ i +"].AutoAddNewNodes"));
			dBEndpoint.setDBClusterId(_ctx.stringValue("DescribeDBClusterEndpointsResponse.Items["+ i +"].DBClusterId"));
			dBEndpoint.setSccMode(_ctx.stringValue("DescribeDBClusterEndpointsResponse.Items["+ i +"].SccMode"));
			dBEndpoint.setPolarSccTimeoutAction(_ctx.stringValue("DescribeDBClusterEndpointsResponse.Items["+ i +"].PolarSccTimeoutAction"));
			dBEndpoint.setPolarSccWaitTimeout(_ctx.stringValue("DescribeDBClusterEndpointsResponse.Items["+ i +"].PolarSccWaitTimeout"));
			dBEndpoint.setNodeWithRoles(_ctx.stringValue("DescribeDBClusterEndpointsResponse.Items["+ i +"].NodeWithRoles"));
			dBEndpoint.setConsistLevelControlVersion(_ctx.stringValue("DescribeDBClusterEndpointsResponse.Items["+ i +"].ConsistLevelControlVersion"));

			List<Address> addressItems = new ArrayList<Address>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDBClusterEndpointsResponse.Items["+ i +"].AddressItems.Length"); j++) {
				Address address = new Address();
				address.setVSwitchId(_ctx.stringValue("DescribeDBClusterEndpointsResponse.Items["+ i +"].AddressItems["+ j +"].VSwitchId"));
				address.setPrivateZoneConnectionString(_ctx.stringValue("DescribeDBClusterEndpointsResponse.Items["+ i +"].AddressItems["+ j +"].PrivateZoneConnectionString"));
				address.setConnectionString(_ctx.stringValue("DescribeDBClusterEndpointsResponse.Items["+ i +"].AddressItems["+ j +"].ConnectionString"));
				address.setNetType(_ctx.stringValue("DescribeDBClusterEndpointsResponse.Items["+ i +"].AddressItems["+ j +"].NetType"));
				address.setPort(_ctx.stringValue("DescribeDBClusterEndpointsResponse.Items["+ i +"].AddressItems["+ j +"].Port"));
				address.setVpcInstanceId(_ctx.stringValue("DescribeDBClusterEndpointsResponse.Items["+ i +"].AddressItems["+ j +"].VpcInstanceId"));
				address.setVPCId(_ctx.stringValue("DescribeDBClusterEndpointsResponse.Items["+ i +"].AddressItems["+ j +"].VPCId"));
				address.setIPAddress(_ctx.stringValue("DescribeDBClusterEndpointsResponse.Items["+ i +"].AddressItems["+ j +"].IPAddress"));
				address.setDashboardUsed(_ctx.booleanValue("DescribeDBClusterEndpointsResponse.Items["+ i +"].AddressItems["+ j +"].DashboardUsed"));

				addressItems.add(address);
			}
			dBEndpoint.setAddressItems(addressItems);

			items.add(dBEndpoint);
		}
		describeDBClusterEndpointsResponse.setItems(items);
	 
	 	return describeDBClusterEndpointsResponse;
	}
}