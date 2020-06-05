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

import com.aliyuncs.sgw.model.v20180511.ValidateGatewayNameResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ValidateGatewayNameResponseUnmarshaller {

	public static ValidateGatewayNameResponse unmarshall(ValidateGatewayNameResponse validateGatewayNameResponse, UnmarshallerContext _ctx) {
		
		validateGatewayNameResponse.setRequestId(_ctx.stringValue("ValidateGatewayNameResponse.RequestId"));
		validateGatewayNameResponse.setSuccess(_ctx.booleanValue("ValidateGatewayNameResponse.Success"));
		validateGatewayNameResponse.setCode(_ctx.stringValue("ValidateGatewayNameResponse.Code"));
		validateGatewayNameResponse.setMessage(_ctx.stringValue("ValidateGatewayNameResponse.Message"));
		validateGatewayNameResponse.setIsValid(_ctx.booleanValue("ValidateGatewayNameResponse.IsValid"));
	 
	 	return validateGatewayNameResponse;
	}
}