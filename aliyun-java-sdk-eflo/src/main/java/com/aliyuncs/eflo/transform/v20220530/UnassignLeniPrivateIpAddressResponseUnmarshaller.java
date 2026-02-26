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

import com.aliyuncs.eflo.model.v20220530.UnassignLeniPrivateIpAddressResponse;
import com.aliyuncs.eflo.model.v20220530.UnassignLeniPrivateIpAddressResponse.Content;
import com.aliyuncs.transform.UnmarshallerContext;


public class UnassignLeniPrivateIpAddressResponseUnmarshaller {

	public static UnassignLeniPrivateIpAddressResponse unmarshall(UnassignLeniPrivateIpAddressResponse unassignLeniPrivateIpAddressResponse, UnmarshallerContext _ctx) {
		
		unassignLeniPrivateIpAddressResponse.setRequestId(_ctx.stringValue("UnassignLeniPrivateIpAddressResponse.RequestId"));
		unassignLeniPrivateIpAddressResponse.setCode(_ctx.integerValue("UnassignLeniPrivateIpAddressResponse.Code"));
		unassignLeniPrivateIpAddressResponse.setMessage(_ctx.stringValue("UnassignLeniPrivateIpAddressResponse.Message"));

		Content content = new Content();
		content.setIpName(_ctx.stringValue("UnassignLeniPrivateIpAddressResponse.Content.IpName"));
		content.setElasticNetworkInterfaceId(_ctx.stringValue("UnassignLeniPrivateIpAddressResponse.Content.ElasticNetworkInterfaceId"));
		unassignLeniPrivateIpAddressResponse.setContent(content);
	 
	 	return unassignLeniPrivateIpAddressResponse;
	}
}