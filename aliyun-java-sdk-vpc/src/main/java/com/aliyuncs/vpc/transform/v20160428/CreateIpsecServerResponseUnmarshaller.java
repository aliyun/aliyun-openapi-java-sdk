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

import com.aliyuncs.vpc.model.v20160428.CreateIpsecServerResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateIpsecServerResponseUnmarshaller {

	public static CreateIpsecServerResponse unmarshall(CreateIpsecServerResponse createIpsecServerResponse, UnmarshallerContext _ctx) {
		
		createIpsecServerResponse.setRequestId(_ctx.stringValue("CreateIpsecServerResponse.RequestId"));
		createIpsecServerResponse.setRegionId(_ctx.stringValue("CreateIpsecServerResponse.RegionId"));
		createIpsecServerResponse.setIpsecServerId(_ctx.stringValue("CreateIpsecServerResponse.IpsecServerId"));
		createIpsecServerResponse.setIpsecServerName(_ctx.stringValue("CreateIpsecServerResponse.IpsecServerName"));
		createIpsecServerResponse.setVpnGatewayId(_ctx.stringValue("CreateIpsecServerResponse.VpnGatewayId"));
		createIpsecServerResponse.setCreationTime(_ctx.stringValue("CreateIpsecServerResponse.CreationTime"));
	 
	 	return createIpsecServerResponse;
	}
}