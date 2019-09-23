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

import com.aliyuncs.r_kvstore.model.v20150101.CreateInstanceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateInstanceResponseUnmarshaller {

	public static CreateInstanceResponse unmarshall(CreateInstanceResponse createInstanceResponse, UnmarshallerContext _ctx) {
		
		createInstanceResponse.setRequestId(_ctx.stringValue("CreateInstanceResponse.RequestId"));
		createInstanceResponse.setInstanceId(_ctx.stringValue("CreateInstanceResponse.InstanceId"));
		createInstanceResponse.setInstanceName(_ctx.stringValue("CreateInstanceResponse.InstanceName"));
		createInstanceResponse.setConnectionDomain(_ctx.stringValue("CreateInstanceResponse.ConnectionDomain"));
		createInstanceResponse.setPort(_ctx.integerValue("CreateInstanceResponse.Port"));
		createInstanceResponse.setUserName(_ctx.stringValue("CreateInstanceResponse.UserName"));
		createInstanceResponse.setInstanceStatus(_ctx.stringValue("CreateInstanceResponse.InstanceStatus"));
		createInstanceResponse.setRegionId(_ctx.stringValue("CreateInstanceResponse.RegionId"));
		createInstanceResponse.setCapacity(_ctx.longValue("CreateInstanceResponse.Capacity"));
		createInstanceResponse.setQPS(_ctx.longValue("CreateInstanceResponse.QPS"));
		createInstanceResponse.setBandwidth(_ctx.longValue("CreateInstanceResponse.Bandwidth"));
		createInstanceResponse.setConnections(_ctx.longValue("CreateInstanceResponse.Connections"));
		createInstanceResponse.setZoneId(_ctx.stringValue("CreateInstanceResponse.ZoneId"));
		createInstanceResponse.setConfig(_ctx.stringValue("CreateInstanceResponse.Config"));
		createInstanceResponse.setChargeType(_ctx.stringValue("CreateInstanceResponse.ChargeType"));
		createInstanceResponse.setEndTime(_ctx.stringValue("CreateInstanceResponse.EndTime"));
		createInstanceResponse.setNodeType(_ctx.stringValue("CreateInstanceResponse.NodeType"));
		createInstanceResponse.setNetworkType(_ctx.stringValue("CreateInstanceResponse.NetworkType"));
		createInstanceResponse.setVpcId(_ctx.stringValue("CreateInstanceResponse.VpcId"));
		createInstanceResponse.setVSwitchId(_ctx.stringValue("CreateInstanceResponse.VSwitchId"));
		createInstanceResponse.setPrivateIpAddr(_ctx.stringValue("CreateInstanceResponse.PrivateIpAddr"));
	 
	 	return createInstanceResponse;
	}
}