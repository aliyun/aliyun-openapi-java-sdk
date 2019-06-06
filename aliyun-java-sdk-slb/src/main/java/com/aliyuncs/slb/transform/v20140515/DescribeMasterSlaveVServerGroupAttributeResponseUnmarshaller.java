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

import com.aliyuncs.slb.model.v20140515.DescribeMasterSlaveVServerGroupAttributeResponse;
import com.aliyuncs.slb.model.v20140515.DescribeMasterSlaveVServerGroupAttributeResponse.MasterSlaveBackendServer;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeMasterSlaveVServerGroupAttributeResponseUnmarshaller {

	public static DescribeMasterSlaveVServerGroupAttributeResponse unmarshall(DescribeMasterSlaveVServerGroupAttributeResponse describeMasterSlaveVServerGroupAttributeResponse, UnmarshallerContext context) {
		
		describeMasterSlaveVServerGroupAttributeResponse.setRequestId(context.stringValue("DescribeMasterSlaveVServerGroupAttributeResponse.RequestId"));
		describeMasterSlaveVServerGroupAttributeResponse.setMasterSlaveVServerGroupId(context.stringValue("DescribeMasterSlaveVServerGroupAttributeResponse.MasterSlaveVServerGroupId"));
		describeMasterSlaveVServerGroupAttributeResponse.setMasterSlaveVServerGroupName(context.stringValue("DescribeMasterSlaveVServerGroupAttributeResponse.MasterSlaveVServerGroupName"));

		List<MasterSlaveBackendServer> masterSlaveBackendServers = new ArrayList<MasterSlaveBackendServer>();
		for (int i = 0; i < context.lengthValue("DescribeMasterSlaveVServerGroupAttributeResponse.MasterSlaveBackendServers.Length"); i++) {
			MasterSlaveBackendServer masterSlaveBackendServer = new MasterSlaveBackendServer();
			masterSlaveBackendServer.setServerId(context.stringValue("DescribeMasterSlaveVServerGroupAttributeResponse.MasterSlaveBackendServers["+ i +"].ServerId"));
			masterSlaveBackendServer.setPort(context.integerValue("DescribeMasterSlaveVServerGroupAttributeResponse.MasterSlaveBackendServers["+ i +"].Port"));
			masterSlaveBackendServer.setWeight(context.integerValue("DescribeMasterSlaveVServerGroupAttributeResponse.MasterSlaveBackendServers["+ i +"].Weight"));
			masterSlaveBackendServer.setIsBackup(context.integerValue("DescribeMasterSlaveVServerGroupAttributeResponse.MasterSlaveBackendServers["+ i +"].IsBackup"));
			masterSlaveBackendServer.setType(context.stringValue("DescribeMasterSlaveVServerGroupAttributeResponse.MasterSlaveBackendServers["+ i +"].Type"));
			masterSlaveBackendServer.setServerIp(context.stringValue("DescribeMasterSlaveVServerGroupAttributeResponse.MasterSlaveBackendServers["+ i +"].ServerIp"));
			masterSlaveBackendServer.setEniHost(context.stringValue("DescribeMasterSlaveVServerGroupAttributeResponse.MasterSlaveBackendServers["+ i +"].EniHost"));
			masterSlaveBackendServer.setVpcId(context.stringValue("DescribeMasterSlaveVServerGroupAttributeResponse.MasterSlaveBackendServers["+ i +"].VpcId"));
			masterSlaveBackendServer.setDescription(context.stringValue("DescribeMasterSlaveVServerGroupAttributeResponse.MasterSlaveBackendServers["+ i +"].Description"));

			masterSlaveBackendServers.add(masterSlaveBackendServer);
		}
		describeMasterSlaveVServerGroupAttributeResponse.setMasterSlaveBackendServers(masterSlaveBackendServers);
	 
	 	return describeMasterSlaveVServerGroupAttributeResponse;
	}
}