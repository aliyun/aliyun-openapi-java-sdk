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

package com.aliyuncs.mpserverless.transform.v20190615;

import com.aliyuncs.mpserverless.model.v20190615.UpdateServicePolicyResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateServicePolicyResponseUnmarshaller {

	public static UpdateServicePolicyResponse unmarshall(UpdateServicePolicyResponse updateServicePolicyResponse, UnmarshallerContext _ctx) {
		
		updateServicePolicyResponse.setRequestId(_ctx.stringValue("UpdateServicePolicyResponse.RequestId"));
		updateServicePolicyResponse.setHttpStatusCode(_ctx.stringValue("UpdateServicePolicyResponse.HttpStatusCode"));
		updateServicePolicyResponse.setSuccess(_ctx.booleanValue("UpdateServicePolicyResponse.Success"));
		updateServicePolicyResponse.setCode(_ctx.stringValue("UpdateServicePolicyResponse.Code"));
		updateServicePolicyResponse.setMessage(_ctx.stringValue("UpdateServicePolicyResponse.Message"));
		updateServicePolicyResponse.setId(_ctx.stringValue("UpdateServicePolicyResponse.Id"));
		updateServicePolicyResponse.setSpaceId(_ctx.stringValue("UpdateServicePolicyResponse.SpaceId"));
		updateServicePolicyResponse.setServiceName(_ctx.stringValue("UpdateServicePolicyResponse.ServiceName"));
		updateServicePolicyResponse.setPolicy(_ctx.stringValue("UpdateServicePolicyResponse.Policy"));
	 
	 	return updateServicePolicyResponse;
	}
}