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

package com.aliyuncs.sgw.transform.v20180511;

import com.aliyuncs.sgw.model.v20180511.SwitchGatewayExpirationPolicyResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SwitchGatewayExpirationPolicyResponseUnmarshaller {

	public static SwitchGatewayExpirationPolicyResponse unmarshall(SwitchGatewayExpirationPolicyResponse switchGatewayExpirationPolicyResponse, UnmarshallerContext _ctx) {
		
		switchGatewayExpirationPolicyResponse.setRequestId(_ctx.stringValue("SwitchGatewayExpirationPolicyResponse.RequestId"));
		switchGatewayExpirationPolicyResponse.setSuccess(_ctx.booleanValue("SwitchGatewayExpirationPolicyResponse.Success"));
		switchGatewayExpirationPolicyResponse.setCode(_ctx.stringValue("SwitchGatewayExpirationPolicyResponse.Code"));
		switchGatewayExpirationPolicyResponse.setMessage(_ctx.stringValue("SwitchGatewayExpirationPolicyResponse.Message"));
	 
	 	return switchGatewayExpirationPolicyResponse;
	}
}