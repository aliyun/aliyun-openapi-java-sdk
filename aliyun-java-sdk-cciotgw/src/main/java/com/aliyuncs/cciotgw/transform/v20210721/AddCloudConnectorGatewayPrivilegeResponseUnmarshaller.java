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

package com.aliyuncs.cciotgw.transform.v20210721;

import com.aliyuncs.cciotgw.model.v20210721.AddCloudConnectorGatewayPrivilegeResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddCloudConnectorGatewayPrivilegeResponseUnmarshaller {

	public static AddCloudConnectorGatewayPrivilegeResponse unmarshall(AddCloudConnectorGatewayPrivilegeResponse addCloudConnectorGatewayPrivilegeResponse, UnmarshallerContext _ctx) {
		
		addCloudConnectorGatewayPrivilegeResponse.setRequestId(_ctx.stringValue("AddCloudConnectorGatewayPrivilegeResponse.RequestId"));
		addCloudConnectorGatewayPrivilegeResponse.setCode(_ctx.stringValue("AddCloudConnectorGatewayPrivilegeResponse.Code"));
		addCloudConnectorGatewayPrivilegeResponse.setMessage(_ctx.stringValue("AddCloudConnectorGatewayPrivilegeResponse.Message"));
		addCloudConnectorGatewayPrivilegeResponse.setSuccess(_ctx.stringValue("AddCloudConnectorGatewayPrivilegeResponse.Success"));
	 
	 	return addCloudConnectorGatewayPrivilegeResponse;
	}
}