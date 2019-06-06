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

package com.aliyuncs.slb.transform.v20140515;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.slb.model.v20140515.DescribeVServerGroupAttributeResponse;
import com.aliyuncs.slb.model.v20140515.DescribeVServerGroupAttributeResponse.BackendServer;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVServerGroupAttributeResponseUnmarshaller {

	public static DescribeVServerGroupAttributeResponse unmarshall(DescribeVServerGroupAttributeResponse describeVServerGroupAttributeResponse, UnmarshallerContext context) {
		
		describeVServerGroupAttributeResponse.setRequestId(context.stringValue("DescribeVServerGroupAttributeResponse.RequestId"));
		describeVServerGroupAttributeResponse.setVServerGroupId(context.stringValue("DescribeVServerGroupAttributeResponse.VServerGroupId"));
		describeVServerGroupAttributeResponse.setVServerGroupName(context.stringValue("DescribeVServerGroupAttributeResponse.VServerGroupName"));
		describeVServerGroupAttributeResponse.setLoadBalancerId(context.stringValue("DescribeVServerGroupAttributeResponse.LoadBalancerId"));

		List<BackendServer> backendServers = new ArrayList<BackendServer>();
		for (int i = 0; i < context.lengthValue("DescribeVServerGroupAttributeResponse.BackendServers.Length"); i++) {
			BackendServer backendServer = new BackendServer();
			backendServer.setServerId(context.stringValue("DescribeVServerGroupAttributeResponse.BackendServers["+ i +"].ServerId"));
			backendServer.setPort(context.integerValue("DescribeVServerGroupAttributeResponse.BackendServers["+ i +"].Port"));
			backendServer.setWeight(context.integerValue("DescribeVServerGroupAttributeResponse.BackendServers["+ i +"].Weight"));
			backendServer.setType(context.stringValue("DescribeVServerGroupAttributeResponse.BackendServers["+ i +"].Type"));
			backendServer.setServerIp(context.stringValue("DescribeVServerGroupAttributeResponse.BackendServers["+ i +"].ServerIp"));
			backendServer.setVpcId(context.stringValue("DescribeVServerGroupAttributeResponse.BackendServers["+ i +"].VpcId"));
			backendServer.setDescription(context.stringValue("DescribeVServerGroupAttributeResponse.BackendServers["+ i +"].Description"));

			backendServers.add(backendServer);
		}
		describeVServerGroupAttributeResponse.setBackendServers(backendServers);
	 
	 	return describeVServerGroupAttributeResponse;
	}
}