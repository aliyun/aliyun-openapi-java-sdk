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

import com.aliyuncs.vpc.model.v20160428.GetIpv4GatewayAttributeResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetIpv4GatewayAttributeResponseUnmarshaller {

	public static GetIpv4GatewayAttributeResponse unmarshall(GetIpv4GatewayAttributeResponse getIpv4GatewayAttributeResponse, UnmarshallerContext _ctx) {
		
		getIpv4GatewayAttributeResponse.setRequestId(_ctx.stringValue("GetIpv4GatewayAttributeResponse.RequestId"));
		getIpv4GatewayAttributeResponse.setVpcId(_ctx.stringValue("GetIpv4GatewayAttributeResponse.VpcId"));
		getIpv4GatewayAttributeResponse.setStatus(_ctx.stringValue("GetIpv4GatewayAttributeResponse.Status"));
		getIpv4GatewayAttributeResponse.setIpv4GatewayId(_ctx.stringValue("GetIpv4GatewayAttributeResponse.Ipv4GatewayId"));
		getIpv4GatewayAttributeResponse.setIpv4GatewayDescription(_ctx.stringValue("GetIpv4GatewayAttributeResponse.Ipv4GatewayDescription"));
		getIpv4GatewayAttributeResponse.setEnabled(_ctx.booleanValue("GetIpv4GatewayAttributeResponse.Enabled"));
		getIpv4GatewayAttributeResponse.setIpv4GatewayRouteTableId(_ctx.stringValue("GetIpv4GatewayAttributeResponse.Ipv4GatewayRouteTableId"));
		getIpv4GatewayAttributeResponse.setIpv4GatewayName(_ctx.stringValue("GetIpv4GatewayAttributeResponse.Ipv4GatewayName"));
		getIpv4GatewayAttributeResponse.setCreateTime(_ctx.stringValue("GetIpv4GatewayAttributeResponse.CreateTime"));
	 
	 	return getIpv4GatewayAttributeResponse;
	}
}