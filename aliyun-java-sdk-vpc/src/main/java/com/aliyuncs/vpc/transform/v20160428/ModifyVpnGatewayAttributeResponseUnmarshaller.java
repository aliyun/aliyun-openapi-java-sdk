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
		modifyVpnGatewayAttributeResponse.setVpcId(_ctx.stringValue("ModifyVpnGatewayAttributeResponse.VpcId"));
		modifyVpnGatewayAttributeResponse.setStatus(_ctx.stringValue("ModifyVpnGatewayAttributeResponse.Status"));
		modifyVpnGatewayAttributeResponse.setInternetIp(_ctx.stringValue("ModifyVpnGatewayAttributeResponse.InternetIp"));
		modifyVpnGatewayAttributeResponse.setSpec(_ctx.stringValue("ModifyVpnGatewayAttributeResponse.Spec"));
		modifyVpnGatewayAttributeResponse.setCreateTime(_ctx.longValue("ModifyVpnGatewayAttributeResponse.CreateTime"));
		modifyVpnGatewayAttributeResponse.setAutoPropagate(_ctx.booleanValue("ModifyVpnGatewayAttributeResponse.AutoPropagate"));
		modifyVpnGatewayAttributeResponse.setVpnGatewayId(_ctx.stringValue("ModifyVpnGatewayAttributeResponse.VpnGatewayId"));
		modifyVpnGatewayAttributeResponse.setIntranetIp(_ctx.stringValue("ModifyVpnGatewayAttributeResponse.IntranetIp"));
		modifyVpnGatewayAttributeResponse.setEndTime(_ctx.longValue("ModifyVpnGatewayAttributeResponse.EndTime"));
		modifyVpnGatewayAttributeResponse.setVSwitchId(_ctx.stringValue("ModifyVpnGatewayAttributeResponse.VSwitchId"));
		modifyVpnGatewayAttributeResponse.setDescription(_ctx.stringValue("ModifyVpnGatewayAttributeResponse.Description"));
		modifyVpnGatewayAttributeResponse.setEnableBgp(_ctx.booleanValue("ModifyVpnGatewayAttributeResponse.EnableBgp"));
		modifyVpnGatewayAttributeResponse.setBusinessStatus(_ctx.stringValue("ModifyVpnGatewayAttributeResponse.BusinessStatus"));
		modifyVpnGatewayAttributeResponse.setName(_ctx.stringValue("ModifyVpnGatewayAttributeResponse.Name"));
	 
	 	return modifyVpnGatewayAttributeResponse;
	}
}