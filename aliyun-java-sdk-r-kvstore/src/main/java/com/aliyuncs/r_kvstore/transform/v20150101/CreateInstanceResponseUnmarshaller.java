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
		createInstanceResponse.setVpcId(_ctx.stringValue("CreateInstanceResponse.VpcId"));
		createInstanceResponse.setQPS(_ctx.longValue("CreateInstanceResponse.QPS"));
		createInstanceResponse.setCapacity(_ctx.longValue("CreateInstanceResponse.Capacity"));
		createInstanceResponse.setConnectionDomain(_ctx.stringValue("CreateInstanceResponse.ConnectionDomain"));
		createInstanceResponse.setChargeType(_ctx.stringValue("CreateInstanceResponse.ChargeType"));
		createInstanceResponse.setNetworkType(_ctx.stringValue("CreateInstanceResponse.NetworkType"));
		createInstanceResponse.setInstanceId(_ctx.stringValue("CreateInstanceResponse.InstanceId"));
		createInstanceResponse.setPort(_ctx.integerValue("CreateInstanceResponse.Port"));
		createInstanceResponse.setConfig(_ctx.stringValue("CreateInstanceResponse.Config"));
		createInstanceResponse.setRegionId(_ctx.stringValue("CreateInstanceResponse.RegionId"));
		createInstanceResponse.setEndTime(_ctx.stringValue("CreateInstanceResponse.EndTime"));
		createInstanceResponse.setVSwitchId(_ctx.stringValue("CreateInstanceResponse.VSwitchId"));
		createInstanceResponse.setNodeType(_ctx.stringValue("CreateInstanceResponse.NodeType"));
		createInstanceResponse.setConnections(_ctx.longValue("CreateInstanceResponse.Connections"));
		createInstanceResponse.setBandwidth(_ctx.longValue("CreateInstanceResponse.Bandwidth"));
		createInstanceResponse.setInstanceName(_ctx.stringValue("CreateInstanceResponse.InstanceName"));
		createInstanceResponse.setZoneId(_ctx.stringValue("CreateInstanceResponse.ZoneId"));
		createInstanceResponse.setInstanceStatus(_ctx.stringValue("CreateInstanceResponse.InstanceStatus"));
		createInstanceResponse.setPrivateIpAddr(_ctx.stringValue("CreateInstanceResponse.PrivateIpAddr"));
		createInstanceResponse.setUserName(_ctx.stringValue("CreateInstanceResponse.UserName"));
		createInstanceResponse.setOrderId(_ctx.longValue("CreateInstanceResponse.OrderId"));
	 
	 	return createInstanceResponse;
	}
}