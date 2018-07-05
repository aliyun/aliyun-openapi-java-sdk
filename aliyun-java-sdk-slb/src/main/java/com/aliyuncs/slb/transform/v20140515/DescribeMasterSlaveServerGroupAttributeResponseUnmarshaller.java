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

import com.aliyuncs.slb.model.v20140515.DescribeMasterSlaveServerGroupAttributeResponse;
import com.aliyuncs.slb.model.v20140515.DescribeMasterSlaveServerGroupAttributeResponse.MasterSlaveBackendServer;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeMasterSlaveServerGroupAttributeResponseUnmarshaller {

	public static DescribeMasterSlaveServerGroupAttributeResponse unmarshall(DescribeMasterSlaveServerGroupAttributeResponse describeMasterSlaveServerGroupAttributeResponse, UnmarshallerContext context) {
		
		describeMasterSlaveServerGroupAttributeResponse.setRequestId(context.stringValue("DescribeMasterSlaveServerGroupAttributeResponse.RequestId"));
		describeMasterSlaveServerGroupAttributeResponse.setMasterSlaveServerGroupId(context.stringValue("DescribeMasterSlaveServerGroupAttributeResponse.MasterSlaveServerGroupId"));
		describeMasterSlaveServerGroupAttributeResponse.setMasterSlaveServerGroupName(context.stringValue("DescribeMasterSlaveServerGroupAttributeResponse.MasterSlaveServerGroupName"));

		List<MasterSlaveBackendServer> masterSlaveBackendServers = new ArrayList<MasterSlaveBackendServer>();
		for (int i = 0; i < context.lengthValue("DescribeMasterSlaveServerGroupAttributeResponse.MasterSlaveBackendServers.Length"); i++) {
			MasterSlaveBackendServer masterSlaveBackendServer = new MasterSlaveBackendServer();
			masterSlaveBackendServer.setServerId(context.stringValue("DescribeMasterSlaveServerGroupAttributeResponse.MasterSlaveBackendServers["+ i +"].ServerId"));
			masterSlaveBackendServer.setPort(context.integerValue("DescribeMasterSlaveServerGroupAttributeResponse.MasterSlaveBackendServers["+ i +"].Port"));
			masterSlaveBackendServer.setWeight(context.integerValue("DescribeMasterSlaveServerGroupAttributeResponse.MasterSlaveBackendServers["+ i +"].Weight"));
			masterSlaveBackendServer.setServerType(context.stringValue("DescribeMasterSlaveServerGroupAttributeResponse.MasterSlaveBackendServers["+ i +"].ServerType"));
			masterSlaveBackendServer.setType(context.stringValue("DescribeMasterSlaveServerGroupAttributeResponse.MasterSlaveBackendServers["+ i +"].Type"));
			masterSlaveBackendServer.setServerIp(context.stringValue("DescribeMasterSlaveServerGroupAttributeResponse.MasterSlaveBackendServers["+ i +"].ServerIp"));
			masterSlaveBackendServer.setEniHost(context.stringValue("DescribeMasterSlaveServerGroupAttributeResponse.MasterSlaveBackendServers["+ i +"].EniHost"));
			masterSlaveBackendServer.setVpcId(context.stringValue("DescribeMasterSlaveServerGroupAttributeResponse.MasterSlaveBackendServers["+ i +"].VpcId"));

			masterSlaveBackendServers.add(masterSlaveBackendServer);
		}
		describeMasterSlaveServerGroupAttributeResponse.setMasterSlaveBackendServers(masterSlaveBackendServers);
	 
	 	return describeMasterSlaveServerGroupAttributeResponse;
	}
}