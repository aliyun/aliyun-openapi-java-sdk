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

import com.aliyuncs.dms_enterprise.model.v20181101.CreateAbacAuthorizationResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateAbacAuthorizationResponseUnmarshaller {

	public static CreateAbacAuthorizationResponse unmarshall(CreateAbacAuthorizationResponse createAbacAuthorizationResponse, UnmarshallerContext _ctx) {
		
		createAbacAuthorizationResponse.setRequestId(_ctx.stringValue("CreateAbacAuthorizationResponse.RequestId"));
		createAbacAuthorizationResponse.setSuccess(_ctx.booleanValue("CreateAbacAuthorizationResponse.Success"));
		createAbacAuthorizationResponse.setErrorCode(_ctx.stringValue("CreateAbacAuthorizationResponse.ErrorCode"));
		createAbacAuthorizationResponse.setErrorMessage(_ctx.stringValue("CreateAbacAuthorizationResponse.ErrorMessage"));
		createAbacAuthorizationResponse.setResult(_ctx.stringValue("CreateAbacAuthorizationResponse.Result"));
	 
	 	return createAbacAuthorizationResponse;
	}
}