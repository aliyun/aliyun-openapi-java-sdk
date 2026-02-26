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

package com.aliyuncs.eflo.transform.v20220530;

import com.aliyuncs.eflo.model.v20220530.GetLniPrivateIpAddressResponse;
import com.aliyuncs.eflo.model.v20220530.GetLniPrivateIpAddressResponse.Content;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLniPrivateIpAddressResponseUnmarshaller {

	public static GetLniPrivateIpAddressResponse unmarshall(GetLniPrivateIpAddressResponse getLniPrivateIpAddressResponse, UnmarshallerContext _ctx) {
		
		getLniPrivateIpAddressResponse.setRequestId(_ctx.stringValue("GetLniPrivateIpAddressResponse.RequestId"));
		getLniPrivateIpAddressResponse.setCode(_ctx.integerValue("GetLniPrivateIpAddressResponse.Code"));
		getLniPrivateIpAddressResponse.setMessage(_ctx.stringValue("GetLniPrivateIpAddressResponse.Message"));

		Content content = new Content();
		content.setRegionId(_ctx.stringValue("GetLniPrivateIpAddressResponse.Content.RegionId"));
		content.setGmtCreate(_ctx.stringValue("GetLniPrivateIpAddressResponse.Content.GmtCreate"));
		content.setNetworkInterfaceId(_ctx.stringValue("GetLniPrivateIpAddressResponse.Content.NetworkInterfaceId"));
		content.setIpName(_ctx.stringValue("GetLniPrivateIpAddressResponse.Content.IpName"));
		content.setPrivateIpAddress(_ctx.stringValue("GetLniPrivateIpAddressResponse.Content.PrivateIpAddress"));
		content.setIpAddressMac(_ctx.stringValue("GetLniPrivateIpAddressResponse.Content.IpAddressMac"));
		content.setStatus(_ctx.stringValue("GetLniPrivateIpAddressResponse.Content.Status"));
		content.setDescription(_ctx.stringValue("GetLniPrivateIpAddressResponse.Content.Description"));
		content.setMessage(_ctx.stringValue("GetLniPrivateIpAddressResponse.Content.Message"));
		getLniPrivateIpAddressResponse.setContent(content);
	 
	 	return getLniPrivateIpAddressResponse;
	}
}