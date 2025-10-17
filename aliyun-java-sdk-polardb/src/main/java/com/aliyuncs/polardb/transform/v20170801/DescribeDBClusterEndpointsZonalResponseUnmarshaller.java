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

import com.aliyuncs.polardb.model.v20170801.DescribeDBClusterEndpointsZonalResponse;
import com.aliyuncs.polardb.model.v20170801.DescribeDBClusterEndpointsZonalResponse.DBEndpoint;
import com.aliyuncs.polardb.model.v20170801.DescribeDBClusterEndpointsZonalResponse.DBEndpoint.Address;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBClusterEndpointsZonalResponseUnmarshaller {

	public static DescribeDBClusterEndpointsZonalResponse unmarshall(DescribeDBClusterEndpointsZonalResponse describeDBClusterEndpointsZonalResponse, UnmarshallerContext _ctx) {
		
		describeDBClusterEndpointsZonalResponse.setRequestId(_ctx.stringValue("DescribeDBClusterEndpointsZonalResponse.RequestId"));

		List<DBEndpoint> items = new ArrayList<DBEndpoint>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDBClusterEndpointsZonalResponse.Items.Length"); i++) {
			DBEndpoint dBEndpoint = new DBEndpoint();
			dBEndpoint.setDBEndpointId(_ctx.stringValue("DescribeDBClusterEndpointsZonalResponse.Items["+ i +"].DBEndpointId"));
			dBEndpoint.setPolarSccTimeoutAction(_ctx.stringValue("DescribeDBClusterEndpointsZonalResponse.Items["+ i +"].PolarSccTimeoutAction"));
			dBEndpoint.setDBClusterId(_ctx.stringValue("DescribeDBClusterEndpointsZonalResponse.Items["+ i +"].DBClusterId"));
			dBEndpoint.setNodes(_ctx.stringValue("DescribeDBClusterEndpointsZonalResponse.Items["+ i +"].Nodes"));
			dBEndpoint.setReadWriteMode(_ctx.stringValue("DescribeDBClusterEndpointsZonalResponse.Items["+ i +"].ReadWriteMode"));
			dBEndpoint.setDBEndpointDescription(_ctx.stringValue("DescribeDBClusterEndpointsZonalResponse.Items["+ i +"].DBEndpointDescription"));
			dBEndpoint.setPolarSccWaitTimeout(_ctx.stringValue("DescribeDBClusterEndpointsZonalResponse.Items["+ i +"].PolarSccWaitTimeout"));
			dBEndpoint.setConsistLevelControlVersion(_ctx.stringValue("DescribeDBClusterEndpointsZonalResponse.Items["+ i +"].ConsistLevelControlVersion"));
			dBEndpoint.setNodeWithRoles(_ctx.stringValue("DescribeDBClusterEndpointsZonalResponse.Items["+ i +"].NodeWithRoles"));
			dBEndpoint.setAutoAddNewNodes(_ctx.stringValue("DescribeDBClusterEndpointsZonalResponse.Items["+ i +"].AutoAddNewNodes"));
			dBEndpoint.setEndpointType(_ctx.stringValue("DescribeDBClusterEndpointsZonalResponse.Items["+ i +"].EndpointType"));
			dBEndpoint.setSccMode(_ctx.stringValue("DescribeDBClusterEndpointsZonalResponse.Items["+ i +"].SccMode"));
			dBEndpoint.setEndpointConfig(_ctx.stringValue("DescribeDBClusterEndpointsZonalResponse.Items["+ i +"].EndpointConfig"));

			List<Address> addressItems = new ArrayList<Address>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDBClusterEndpointsZonalResponse.Items["+ i +"].AddressItems.Length"); j++) {
				Address address = new Address();
				address.setDashboardUsed(_ctx.booleanValue("DescribeDBClusterEndpointsZonalResponse.Items["+ i +"].AddressItems["+ j +"].DashboardUsed"));
				address.setPrivateZoneConnectionString(_ctx.stringValue("DescribeDBClusterEndpointsZonalResponse.Items["+ i +"].AddressItems["+ j +"].PrivateZoneConnectionString"));
				address.setVPCId(_ctx.stringValue("DescribeDBClusterEndpointsZonalResponse.Items["+ i +"].AddressItems["+ j +"].VPCId"));
				address.setVSwitchId(_ctx.stringValue("DescribeDBClusterEndpointsZonalResponse.Items["+ i +"].AddressItems["+ j +"].VSwitchId"));
				address.setPort(_ctx.stringValue("DescribeDBClusterEndpointsZonalResponse.Items["+ i +"].AddressItems["+ j +"].Port"));
				address.setVpcInstanceId(_ctx.stringValue("DescribeDBClusterEndpointsZonalResponse.Items["+ i +"].AddressItems["+ j +"].VpcInstanceId"));
				address.setConnectionString(_ctx.stringValue("DescribeDBClusterEndpointsZonalResponse.Items["+ i +"].AddressItems["+ j +"].ConnectionString"));
				address.setIPAddress(_ctx.stringValue("DescribeDBClusterEndpointsZonalResponse.Items["+ i +"].AddressItems["+ j +"].IPAddress"));
				address.setNetType(_ctx.stringValue("DescribeDBClusterEndpointsZonalResponse.Items["+ i +"].AddressItems["+ j +"].NetType"));

				addressItems.add(address);
			}
			dBEndpoint.setAddressItems(addressItems);

			items.add(dBEndpoint);
		}
		describeDBClusterEndpointsZonalResponse.setItems(items);
	 
	 	return describeDBClusterEndpointsZonalResponse;
	}
}