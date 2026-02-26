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

import com.aliyuncs.eflo.model.v20220530.UpdateLeniPrivateIpAddressResponse;
import com.aliyuncs.eflo.model.v20220530.UpdateLeniPrivateIpAddressResponse.Content;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateLeniPrivateIpAddressResponseUnmarshaller {

	public static UpdateLeniPrivateIpAddressResponse unmarshall(UpdateLeniPrivateIpAddressResponse updateLeniPrivateIpAddressResponse, UnmarshallerContext _ctx) {
		
		updateLeniPrivateIpAddressResponse.setRequestId(_ctx.stringValue("UpdateLeniPrivateIpAddressResponse.RequestId"));
		updateLeniPrivateIpAddressResponse.setCode(_ctx.integerValue("UpdateLeniPrivateIpAddressResponse.Code"));
		updateLeniPrivateIpAddressResponse.setMessage(_ctx.stringValue("UpdateLeniPrivateIpAddressResponse.Message"));

		Content content = new Content();
		content.setElasticNetworkInterfaceId(_ctx.stringValue("UpdateLeniPrivateIpAddressResponse.Content.ElasticNetworkInterfaceId"));
		content.setIpName(_ctx.stringValue("UpdateLeniPrivateIpAddressResponse.Content.IpName"));
		updateLeniPrivateIpAddressResponse.setContent(content);
	 
	 	return updateLeniPrivateIpAddressResponse;
	}
}