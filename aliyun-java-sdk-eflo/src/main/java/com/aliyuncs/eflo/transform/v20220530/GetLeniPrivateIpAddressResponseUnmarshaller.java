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

import com.aliyuncs.eflo.model.v20220530.GetLeniPrivateIpAddressResponse;
import com.aliyuncs.eflo.model.v20220530.GetLeniPrivateIpAddressResponse.Content;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLeniPrivateIpAddressResponseUnmarshaller {

	public static GetLeniPrivateIpAddressResponse unmarshall(GetLeniPrivateIpAddressResponse getLeniPrivateIpAddressResponse, UnmarshallerContext _ctx) {
		
		getLeniPrivateIpAddressResponse.setRequestId(_ctx.stringValue("GetLeniPrivateIpAddressResponse.RequestId"));
		getLeniPrivateIpAddressResponse.setCode(_ctx.integerValue("GetLeniPrivateIpAddressResponse.Code"));
		getLeniPrivateIpAddressResponse.setMessage(_ctx.stringValue("GetLeniPrivateIpAddressResponse.Message"));

		Content content = new Content();
		content.setElasticNetworkInterfaceId(_ctx.stringValue("GetLeniPrivateIpAddressResponse.Content.ElasticNetworkInterfaceId"));
		content.setRegionId(_ctx.stringValue("GetLeniPrivateIpAddressResponse.Content.RegionId"));
		content.setGmtCreate(_ctx.stringValue("GetLeniPrivateIpAddressResponse.Content.GmtCreate"));
		content.setGmtModified(_ctx.stringValue("GetLeniPrivateIpAddressResponse.Content.GmtModified"));
		content.setIpName(_ctx.stringValue("GetLeniPrivateIpAddressResponse.Content.IpName"));
		content.setPrivateIpAddress(_ctx.stringValue("GetLeniPrivateIpAddressResponse.Content.PrivateIpAddress"));
		content.setStatus(_ctx.stringValue("GetLeniPrivateIpAddressResponse.Content.Status"));
		content.setDescription(_ctx.stringValue("GetLeniPrivateIpAddressResponse.Content.Description"));
		content.setMessage(_ctx.stringValue("GetLeniPrivateIpAddressResponse.Content.Message"));
		getLeniPrivateIpAddressResponse.setContent(content);
	 
	 	return getLeniPrivateIpAddressResponse;
	}
}