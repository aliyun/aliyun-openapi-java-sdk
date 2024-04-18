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

import com.aliyuncs.eflo.model.v20220530.AssignLeniPrivateIpAddressResponse;
import com.aliyuncs.eflo.model.v20220530.AssignLeniPrivateIpAddressResponse.Content;
import com.aliyuncs.transform.UnmarshallerContext;


public class AssignLeniPrivateIpAddressResponseUnmarshaller {

	public static AssignLeniPrivateIpAddressResponse unmarshall(AssignLeniPrivateIpAddressResponse assignLeniPrivateIpAddressResponse, UnmarshallerContext _ctx) {
		
		assignLeniPrivateIpAddressResponse.setRequestId(_ctx.stringValue("AssignLeniPrivateIpAddressResponse.RequestId"));
		assignLeniPrivateIpAddressResponse.setCode(_ctx.integerValue("AssignLeniPrivateIpAddressResponse.Code"));
		assignLeniPrivateIpAddressResponse.setMessage(_ctx.stringValue("AssignLeniPrivateIpAddressResponse.Message"));

		Content content = new Content();
		content.setIpName(_ctx.stringValue("AssignLeniPrivateIpAddressResponse.Content.IpName"));
		content.setElasticNetworkInterfaceId(_ctx.stringValue("AssignLeniPrivateIpAddressResponse.Content.ElasticNetworkInterfaceId"));
		assignLeniPrivateIpAddressResponse.setContent(content);
	 
	 	return assignLeniPrivateIpAddressResponse;
	}
}