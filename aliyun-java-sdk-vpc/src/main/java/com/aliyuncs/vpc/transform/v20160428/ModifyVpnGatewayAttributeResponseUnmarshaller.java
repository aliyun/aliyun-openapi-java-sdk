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

package com.aliyuncs.vpc.transform.v20160428;

import com.aliyuncs.vpc.model.v20160428.ModifyVpnGatewayAttributeResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyVpnGatewayAttributeResponseUnmarshaller {

	public static ModifyVpnGatewayAttributeResponse unmarshall(ModifyVpnGatewayAttributeResponse modifyVpnGatewayAttributeResponse, UnmarshallerContext _ctx) {
		
		modifyVpnGatewayAttributeResponse.setRequestId(_ctx.stringValue("ModifyVpnGatewayAttributeResponse.RequestId"));
		modifyVpnGatewayAttributeResponse.setVpnGatewayId(_ctx.stringValue("ModifyVpnGatewayAttributeResponse.VpnGatewayId"));
		modifyVpnGatewayAttributeResponse.setVpcId(_ctx.stringValue("ModifyVpnGatewayAttributeResponse.VpcId"));
		modifyVpnGatewayAttributeResponse.setVSwitchId(_ctx.stringValue("ModifyVpnGatewayAttributeResponse.VSwitchId"));
		modifyVpnGatewayAttributeResponse.setInternetIp(_ctx.stringValue("ModifyVpnGatewayAttributeResponse.InternetIp"));
		modifyVpnGatewayAttributeResponse.setIntranetIp(_ctx.stringValue("ModifyVpnGatewayAttributeResponse.IntranetIp"));
		modifyVpnGatewayAttributeResponse.setCreateTime(_ctx.longValue("ModifyVpnGatewayAttributeResponse.CreateTime"));
		modifyVpnGatewayAttributeResponse.setEndTime(_ctx.longValue("ModifyVpnGatewayAttributeResponse.EndTime"));
		modifyVpnGatewayAttributeResponse.setSpec(_ctx.stringValue("ModifyVpnGatewayAttributeResponse.Spec"));
		modifyVpnGatewayAttributeResponse.setName(_ctx.stringValue("ModifyVpnGatewayAttributeResponse.Name"));
		modifyVpnGatewayAttributeResponse.setDescription(_ctx.stringValue("ModifyVpnGatewayAttributeResponse.Description"));
		modifyVpnGatewayAttributeResponse.setStatus(_ctx.stringValue("ModifyVpnGatewayAttributeResponse.Status"));
		modifyVpnGatewayAttributeResponse.setBusinessStatus(_ctx.stringValue("ModifyVpnGatewayAttributeResponse.BusinessStatus"));
	 
	 	return modifyVpnGatewayAttributeResponse;
	}
}