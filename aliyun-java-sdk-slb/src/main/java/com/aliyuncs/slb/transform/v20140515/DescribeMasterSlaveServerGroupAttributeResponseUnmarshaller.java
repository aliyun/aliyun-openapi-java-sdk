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

	public static DescribeMasterSlaveServerGroupAttributeResponse unmarshall(DescribeMasterSlaveServerGroupAttributeResponse describeMasterSlaveServerGroupAttributeResponse, UnmarshallerContext _ctx) {
		
		describeMasterSlaveServerGroupAttributeResponse.setRequestId(_ctx.stringValue("DescribeMasterSlaveServerGroupAttributeResponse.RequestId"));
		describeMasterSlaveServerGroupAttributeResponse.setLoadBalancerId(_ctx.stringValue("DescribeMasterSlaveServerGroupAttributeResponse.LoadBalancerId"));
		describeMasterSlaveServerGroupAttributeResponse.setMasterSlaveServerGroupId(_ctx.stringValue("DescribeMasterSlaveServerGroupAttributeResponse.MasterSlaveServerGroupId"));
		describeMasterSlaveServerGroupAttributeResponse.setMasterSlaveServerGroupName(_ctx.stringValue("DescribeMasterSlaveServerGroupAttributeResponse.MasterSlaveServerGroupName"));

		List<MasterSlaveBackendServer> masterSlaveBackendServers = new ArrayList<MasterSlaveBackendServer>();
		for (int i = 0; i < _ctx.lengthValue("DescribeMasterSlaveServerGroupAttributeResponse.MasterSlaveBackendServers.Length"); i++) {
			MasterSlaveBackendServer masterSlaveBackendServer = new MasterSlaveBackendServer();
			masterSlaveBackendServer.setServerId(_ctx.stringValue("DescribeMasterSlaveServerGroupAttributeResponse.MasterSlaveBackendServers["+ i +"].ServerId"));
			masterSlaveBackendServer.setPort(_ctx.integerValue("DescribeMasterSlaveServerGroupAttributeResponse.MasterSlaveBackendServers["+ i +"].Port"));
			masterSlaveBackendServer.setWeight(_ctx.integerValue("DescribeMasterSlaveServerGroupAttributeResponse.MasterSlaveBackendServers["+ i +"].Weight"));
			masterSlaveBackendServer.setServerType(_ctx.stringValue("DescribeMasterSlaveServerGroupAttributeResponse.MasterSlaveBackendServers["+ i +"].ServerType"));
			masterSlaveBackendServer.setType(_ctx.stringValue("DescribeMasterSlaveServerGroupAttributeResponse.MasterSlaveBackendServers["+ i +"].Type"));
			masterSlaveBackendServer.setServerIp(_ctx.stringValue("DescribeMasterSlaveServerGroupAttributeResponse.MasterSlaveBackendServers["+ i +"].ServerIp"));
			masterSlaveBackendServer.setVpcId(_ctx.stringValue("DescribeMasterSlaveServerGroupAttributeResponse.MasterSlaveBackendServers["+ i +"].VpcId"));
			masterSlaveBackendServer.setDescription(_ctx.stringValue("DescribeMasterSlaveServerGroupAttributeResponse.MasterSlaveBackendServers["+ i +"].Description"));

			masterSlaveBackendServers.add(masterSlaveBackendServer);
		}
		describeMasterSlaveServerGroupAttributeResponse.setMasterSlaveBackendServers(masterSlaveBackendServers);
	 
	 	return describeMasterSlaveServerGroupAttributeResponse;
	}
}