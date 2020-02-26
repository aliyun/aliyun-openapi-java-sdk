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

package com.aliyuncs.r_kvstore.transform.v20150101;

import com.aliyuncs.r_kvstore.model.v20150101.CreateDedicatedInstanceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateDedicatedInstanceResponseUnmarshaller {

	public static CreateDedicatedInstanceResponse unmarshall(CreateDedicatedInstanceResponse createDedicatedInstanceResponse, UnmarshallerContext _ctx) {
		
		createDedicatedInstanceResponse.setRequestId(_ctx.stringValue("CreateDedicatedInstanceResponse.RequestId"));
		createDedicatedInstanceResponse.setInstanceId(_ctx.stringValue("CreateDedicatedInstanceResponse.InstanceId"));
		createDedicatedInstanceResponse.setInstanceName(_ctx.stringValue("CreateDedicatedInstanceResponse.InstanceName"));
		createDedicatedInstanceResponse.setConnectionDomain(_ctx.stringValue("CreateDedicatedInstanceResponse.ConnectionDomain"));
		createDedicatedInstanceResponse.setPort(_ctx.integerValue("CreateDedicatedInstanceResponse.Port"));
		createDedicatedInstanceResponse.setUserName(_ctx.stringValue("CreateDedicatedInstanceResponse.UserName"));
		createDedicatedInstanceResponse.setInstanceStatus(_ctx.stringValue("CreateDedicatedInstanceResponse.InstanceStatus"));
		createDedicatedInstanceResponse.setRegionId(_ctx.stringValue("CreateDedicatedInstanceResponse.RegionId"));
		createDedicatedInstanceResponse.setCapacity(_ctx.longValue("CreateDedicatedInstanceResponse.Capacity"));
		createDedicatedInstanceResponse.setQPS(_ctx.stringValue("CreateDedicatedInstanceResponse.QPS"));
		createDedicatedInstanceResponse.setBandwidth(_ctx.integerValue("CreateDedicatedInstanceResponse.Bandwidth"));
		createDedicatedInstanceResponse.setConnections(_ctx.integerValue("CreateDedicatedInstanceResponse.Connections"));
		createDedicatedInstanceResponse.setZoneId(_ctx.stringValue("CreateDedicatedInstanceResponse.ZoneId"));
		createDedicatedInstanceResponse.setConfig(_ctx.stringValue("CreateDedicatedInstanceResponse.Config"));
		createDedicatedInstanceResponse.setNodeType(_ctx.stringValue("CreateDedicatedInstanceResponse.NodeType"));
		createDedicatedInstanceResponse.setNetworkType(_ctx.stringValue("CreateDedicatedInstanceResponse.NetworkType"));
		createDedicatedInstanceResponse.setVpcId(_ctx.stringValue("CreateDedicatedInstanceResponse.VpcId"));
		createDedicatedInstanceResponse.setVSwitchId(_ctx.stringValue("CreateDedicatedInstanceResponse.VSwitchId"));
		createDedicatedInstanceResponse.setPrivateIpAddr(_ctx.stringValue("CreateDedicatedInstanceResponse.PrivateIpAddr"));
	 
	 	return createDedicatedInstanceResponse;
	}
}