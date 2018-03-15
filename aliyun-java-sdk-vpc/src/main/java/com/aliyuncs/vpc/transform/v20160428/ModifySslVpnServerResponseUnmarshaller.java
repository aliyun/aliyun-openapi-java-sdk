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

	public static ModifySslVpnServerResponse unmarshall(ModifySslVpnServerResponse modifySslVpnServerResponse, UnmarshallerContext context) {
		
		modifySslVpnServerResponse.setRequestId(context.stringValue("ModifySslVpnServerResponse.RequestId"));
		modifySslVpnServerResponse.setRegionId(context.stringValue("ModifySslVpnServerResponse.RegionId"));
		modifySslVpnServerResponse.setSslVpnServerId(context.stringValue("ModifySslVpnServerResponse.SslVpnServerId"));
		modifySslVpnServerResponse.setVpnGatewayId(context.stringValue("ModifySslVpnServerResponse.VpnGatewayId"));
		modifySslVpnServerResponse.setName(context.stringValue("ModifySslVpnServerResponse.Name"));
		modifySslVpnServerResponse.setLocalSubnet(context.stringValue("ModifySslVpnServerResponse.LocalSubnet"));
		modifySslVpnServerResponse.setClientIpPool(context.stringValue("ModifySslVpnServerResponse.ClientIpPool"));
		modifySslVpnServerResponse.setCreateTime(context.longValue("ModifySslVpnServerResponse.CreateTime"));
		modifySslVpnServerResponse.setCipher(context.stringValue("ModifySslVpnServerResponse.Cipher"));
		modifySslVpnServerResponse.setProto(context.stringValue("ModifySslVpnServerResponse.Proto"));
		modifySslVpnServerResponse.setPort(context.integerValue("ModifySslVpnServerResponse.Port"));
		modifySslVpnServerResponse.setCompress(context.booleanValue("ModifySslVpnServerResponse.Compress"));
		modifySslVpnServerResponse.setConnections(context.integerValue("ModifySslVpnServerResponse.Connections"));
		modifySslVpnServerResponse.setMaxConnections(context.integerValue("ModifySslVpnServerResponse.MaxConnections"));
		modifySslVpnServerResponse.setInternetIp(context.stringValue("ModifySslVpnServerResponse.InternetIp"));
	 
	 	return modifySslVpnServerResponse;
	}
}