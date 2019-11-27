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

import com.aliyuncs.slb.model.v20140515.DescribeHealthStatusResponse;
import com.aliyuncs.slb.model.v20140515.DescribeHealthStatusResponse.BackendServer;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeHealthStatusResponseUnmarshaller {

	public static DescribeHealthStatusResponse unmarshall(DescribeHealthStatusResponse describeHealthStatusResponse, UnmarshallerContext _ctx) {
		
		describeHealthStatusResponse.setRequestId(_ctx.stringValue("DescribeHealthStatusResponse.RequestId"));

		List<BackendServer> backendServers = new ArrayList<BackendServer>();
		for (int i = 0; i < _ctx.lengthValue("DescribeHealthStatusResponse.BackendServers.Length"); i++) {
			BackendServer backendServer = new BackendServer();
			backendServer.setListenerPort(_ctx.integerValue("DescribeHealthStatusResponse.BackendServers["+ i +"].ListenerPort"));
			backendServer.setServerId(_ctx.stringValue("DescribeHealthStatusResponse.BackendServers["+ i +"].ServerId"));
			backendServer.setPort(_ctx.integerValue("DescribeHealthStatusResponse.BackendServers["+ i +"].Port"));
			backendServer.setServerHealthStatus(_ctx.stringValue("DescribeHealthStatusResponse.BackendServers["+ i +"].ServerHealthStatus"));
			backendServer.setServerIp(_ctx.stringValue("DescribeHealthStatusResponse.BackendServers["+ i +"].ServerIp"));
			backendServer.setEniHost(_ctx.stringValue("DescribeHealthStatusResponse.BackendServers["+ i +"].EniHost"));
			backendServer.setBizProtocol(_ctx.stringValue("DescribeHealthStatusResponse.BackendServers["+ i +"].Protocol"));
			backendServer.setType(_ctx.stringValue("DescribeHealthStatusResponse.BackendServers["+ i +"].Type"));

			backendServers.add(backendServer);
		}
		describeHealthStatusResponse.setBackendServers(backendServers);
	 
	 	return describeHealthStatusResponse;
	}
}