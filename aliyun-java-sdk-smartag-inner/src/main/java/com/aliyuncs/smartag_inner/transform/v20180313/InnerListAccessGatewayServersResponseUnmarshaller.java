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

package com.aliyuncs.smartag_inner.transform.v20180313;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.smartag_inner.model.v20180313.InnerListAccessGatewayServersResponse;
import com.aliyuncs.smartag_inner.model.v20180313.InnerListAccessGatewayServersResponse.AccessGatewayServer;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerListAccessGatewayServersResponseUnmarshaller {

	public static InnerListAccessGatewayServersResponse unmarshall(InnerListAccessGatewayServersResponse innerListAccessGatewayServersResponse, UnmarshallerContext context) {
		
		innerListAccessGatewayServersResponse.setRequestId(context.stringValue("InnerListAccessGatewayServersResponse.RequestId"));
		innerListAccessGatewayServersResponse.setTotal(context.integerValue("InnerListAccessGatewayServersResponse.Total"));
		innerListAccessGatewayServersResponse.setPageNumber(context.integerValue("InnerListAccessGatewayServersResponse.PageNumber"));
		innerListAccessGatewayServersResponse.setPageSize(context.integerValue("InnerListAccessGatewayServersResponse.PageSize"));

		List<AccessGatewayServer> accessGatewayServers = new ArrayList<AccessGatewayServer>();
		for (int i = 0; i < context.lengthValue("InnerListAccessGatewayServersResponse.AccessGatewayServers.Length"); i++) {
			AccessGatewayServer accessGatewayServer = new AccessGatewayServer();
			accessGatewayServer.setInstanceId(context.stringValue("InnerListAccessGatewayServersResponse.AccessGatewayServers["+ i +"].InstanceId"));
			accessGatewayServer.setLocationId(context.stringValue("InnerListAccessGatewayServersResponse.AccessGatewayServers["+ i +"].LocationId"));
			accessGatewayServer.setIntranetIpPri(context.stringValue("InnerListAccessGatewayServersResponse.AccessGatewayServers["+ i +"].IntranetIpPri"));
			accessGatewayServer.setIntranetIpSec(context.stringValue("InnerListAccessGatewayServersResponse.AccessGatewayServers["+ i +"].IntranetIpSec"));
			accessGatewayServer.setInternetIpPri(context.stringValue("InnerListAccessGatewayServersResponse.AccessGatewayServers["+ i +"].InternetIpPri"));
			accessGatewayServer.setInternetIpSec(context.stringValue("InnerListAccessGatewayServersResponse.AccessGatewayServers["+ i +"].InternetIpSec"));
			accessGatewayServer.setLoopbackInternalIp(context.stringValue("InnerListAccessGatewayServersResponse.AccessGatewayServers["+ i +"].LoopbackInternalIp"));
			accessGatewayServer.setLoopbackExternalIp(context.stringValue("InnerListAccessGatewayServersResponse.AccessGatewayServers["+ i +"].LoopbackExternalIp"));
			accessGatewayServer.setManagementIp(context.stringValue("InnerListAccessGatewayServersResponse.AccessGatewayServers["+ i +"].ManagementIp"));
			accessGatewayServer.setBusinessState(context.stringValue("InnerListAccessGatewayServersResponse.AccessGatewayServers["+ i +"].BusinessState"));
			accessGatewayServer.setState(context.stringValue("InnerListAccessGatewayServersResponse.AccessGatewayServers["+ i +"].State"));

			List<String> staticIps = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("InnerListAccessGatewayServersResponse.AccessGatewayServers["+ i +"].StaticIps.Length"); j++) {
				staticIps.add(context.stringValue("InnerListAccessGatewayServersResponse.AccessGatewayServers["+ i +"].StaticIps["+ j +"]"));
			}
			accessGatewayServer.setStaticIps(staticIps);

			accessGatewayServers.add(accessGatewayServer);
		}
		innerListAccessGatewayServersResponse.setAccessGatewayServers(accessGatewayServers);
	 
	 	return innerListAccessGatewayServersResponse;
	}
}