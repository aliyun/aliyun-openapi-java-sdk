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

package com.aliyuncs.dms_enterprise.transform.v20181101;

import com.aliyuncs.dms_enterprise.model.v20181101.InspectProxyAccessSecretResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class InspectProxyAccessSecretResponseUnmarshaller {

	public static InspectProxyAccessSecretResponse unmarshall(InspectProxyAccessSecretResponse inspectProxyAccessSecretResponse, UnmarshallerContext _ctx) {
		
		inspectProxyAccessSecretResponse.setRequestId(_ctx.stringValue("InspectProxyAccessSecretResponse.RequestId"));
		inspectProxyAccessSecretResponse.setSuccess(_ctx.booleanValue("InspectProxyAccessSecretResponse.Success"));
		inspectProxyAccessSecretResponse.setErrorMessage(_ctx.stringValue("InspectProxyAccessSecretResponse.ErrorMessage"));
		inspectProxyAccessSecretResponse.setErrorCode(_ctx.stringValue("InspectProxyAccessSecretResponse.ErrorCode"));
		inspectProxyAccessSecretResponse.setAccessSecret(_ctx.stringValue("InspectProxyAccessSecretResponse.AccessSecret"));
	 
	 	return inspectProxyAccessSecretResponse;
	}
}