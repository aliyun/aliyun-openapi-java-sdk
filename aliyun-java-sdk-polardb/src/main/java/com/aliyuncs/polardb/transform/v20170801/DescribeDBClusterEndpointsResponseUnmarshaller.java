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
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBClusterEndpointsResponseUnmarshaller {

	public static DescribeDBClusterEndpointsResponse unmarshall(DescribeDBClusterEndpointsResponse describeDBClusterEndpointsResponse, UnmarshallerContext context) {
		
		describeDBClusterEndpointsResponse.setRequestId(context.stringValue("DescribeDBClusterEndpointsResponse.RequestId"));

		List<DBEndpoint> items = new ArrayList<DBEndpoint>();
		for (int i = 0; i < context.lengthValue("DescribeDBClusterEndpointsResponse.Items.Length"); i++) {
			DBEndpoint dBEndpoint = new DBEndpoint();
			dBEndpoint.setDBEndpointId(context.stringValue("DescribeDBClusterEndpointsResponse.Items["+ i +"].DBEndpointId"));
			dBEndpoint.setEndpointType(context.stringValue("DescribeDBClusterEndpointsResponse.Items["+ i +"].EndpointType"));
			dBEndpoint.setNodes(context.stringValue("DescribeDBClusterEndpointsResponse.Items["+ i +"].Nodes"));
			dBEndpoint.setEndpointConfig(context.stringValue("DescribeDBClusterEndpointsResponse.Items["+ i +"].EndpointConfig"));

			List<Address> addressItems = new ArrayList<Address>();
			for (int j = 0; j < context.lengthValue("DescribeDBClusterEndpointsResponse.Items["+ i +"].AddressItems.Length"); j++) {
				Address address = new Address();
				address.setConnectionString(context.stringValue("DescribeDBClusterEndpointsResponse.Items["+ i +"].AddressItems["+ j +"].ConnectionString"));
				address.setIPAddress(context.stringValue("DescribeDBClusterEndpointsResponse.Items["+ i +"].AddressItems["+ j +"].IPAddress"));
				address.setNetType(context.stringValue("DescribeDBClusterEndpointsResponse.Items["+ i +"].AddressItems["+ j +"].NetType"));
				address.setPort(context.stringValue("DescribeDBClusterEndpointsResponse.Items["+ i +"].AddressItems["+ j +"].Port"));
				address.setVPCId(context.stringValue("DescribeDBClusterEndpointsResponse.Items["+ i +"].AddressItems["+ j +"].VPCId"));
				address.setVSwitchId(context.stringValue("DescribeDBClusterEndpointsResponse.Items["+ i +"].AddressItems["+ j +"].VSwitchId"));

				addressItems.add(address);
			}
			dBEndpoint.setAddressItems(addressItems);

			items.add(dBEndpoint);
		}
		describeDBClusterEndpointsResponse.setItems(items);
	 
	 	return describeDBClusterEndpointsResponse;
	}
}