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

import com.aliyuncs.vpc.model.v20160428.ModifySslVpnServerResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifySslVpnServerResponseUnmarshaller {

	public static ModifySslVpnServerResponse unmarshall(ModifySslVpnServerResponse modifySslVpnServerResponse, UnmarshallerContext _ctx) {
		
		modifySslVpnServerResponse.setRequestId(_ctx.stringValue("ModifySslVpnServerResponse.RequestId"));
		modifySslVpnServerResponse.setRegionId(_ctx.stringValue("ModifySslVpnServerResponse.RegionId"));
		modifySslVpnServerResponse.setSslVpnServerId(_ctx.stringValue("ModifySslVpnServerResponse.SslVpnServerId"));
		modifySslVpnServerResponse.setVpnGatewayId(_ctx.stringValue("ModifySslVpnServerResponse.VpnGatewayId"));
		modifySslVpnServerResponse.setName(_ctx.stringValue("ModifySslVpnServerResponse.Name"));
		modifySslVpnServerResponse.setLocalSubnet(_ctx.stringValue("ModifySslVpnServerResponse.LocalSubnet"));
		modifySslVpnServerResponse.setClientIpPool(_ctx.stringValue("ModifySslVpnServerResponse.ClientIpPool"));
		modifySslVpnServerResponse.setCreateTime(_ctx.longValue("ModifySslVpnServerResponse.CreateTime"));
		modifySslVpnServerResponse.setCipher(_ctx.stringValue("ModifySslVpnServerResponse.Cipher"));
		modifySslVpnServerResponse.setProto(_ctx.stringValue("ModifySslVpnServerResponse.Proto"));
		modifySslVpnServerResponse.setPort(_ctx.integerValue("ModifySslVpnServerResponse.Port"));
		modifySslVpnServerResponse.setCompress(_ctx.booleanValue("ModifySslVpnServerResponse.Compress"));
		modifySslVpnServerResponse.setConnections(_ctx.integerValue("ModifySslVpnServerResponse.Connections"));
		modifySslVpnServerResponse.setMaxConnections(_ctx.integerValue("ModifySslVpnServerResponse.MaxConnections"));
		modifySslVpnServerResponse.setInternetIp(_ctx.stringValue("ModifySslVpnServerResponse.InternetIp"));
		modifySslVpnServerResponse.setEnableMultiFactorAuth(_ctx.booleanValue("ModifySslVpnServerResponse.EnableMultiFactorAuth"));
		modifySslVpnServerResponse.setIDaaSInstanceId(_ctx.stringValue("ModifySslVpnServerResponse.IDaaSInstanceId"));
	 
	 	return modifySslVpnServerResponse;
	}
}