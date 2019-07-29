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

package com.aliyuncs.adb.transform.v20190315;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.adb.model.v20190315.DescribeDBClusterNetInfoResponse;
import com.aliyuncs.adb.model.v20190315.DescribeDBClusterNetInfoResponse.Address;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBClusterNetInfoResponseUnmarshaller {

	public static DescribeDBClusterNetInfoResponse unmarshall(DescribeDBClusterNetInfoResponse describeDBClusterNetInfoResponse, UnmarshallerContext _ctx) {
		
		describeDBClusterNetInfoResponse.setRequestId(_ctx.stringValue("DescribeDBClusterNetInfoResponse.RequestId"));
		describeDBClusterNetInfoResponse.setClusterNetworkType(_ctx.stringValue("DescribeDBClusterNetInfoResponse.ClusterNetworkType"));

		List<Address> items = new ArrayList<Address>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDBClusterNetInfoResponse.Items.Length"); i++) {
			Address address = new Address();
			address.setConnectionString(_ctx.stringValue("DescribeDBClusterNetInfoResponse.Items["+ i +"].ConnectionString"));
			address.setIPAddress(_ctx.stringValue("DescribeDBClusterNetInfoResponse.Items["+ i +"].IPAddress"));
			address.setNetType(_ctx.stringValue("DescribeDBClusterNetInfoResponse.Items["+ i +"].NetType"));
			address.setPort(_ctx.stringValue("DescribeDBClusterNetInfoResponse.Items["+ i +"].Port"));
			address.setVPCId(_ctx.stringValue("DescribeDBClusterNetInfoResponse.Items["+ i +"].VPCId"));
			address.setVSwitchId(_ctx.stringValue("DescribeDBClusterNetInfoResponse.Items["+ i +"].VSwitchId"));

			items.add(address);
		}
		describeDBClusterNetInfoResponse.setItems(items);
	 
	 	return describeDBClusterNetInfoResponse;
	}
}