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

package com.aliyuncs.emap.transform.v20200608;

import com.aliyuncs.emap.model.v20200608.CreateSubAccountResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateSubAccountResponseUnmarshaller {

	public static CreateSubAccountResponse unmarshall(CreateSubAccountResponse createSubAccountResponse, UnmarshallerContext _ctx) {
		
		createSubAccountResponse.setRequestId(_ctx.stringValue("CreateSubAccountResponse.RequestId"));
		createSubAccountResponse.setMessage(_ctx.stringValue("CreateSubAccountResponse.Message"));
		createSubAccountResponse.setErrorCode(_ctx.stringValue("CreateSubAccountResponse.ErrorCode"));
		createSubAccountResponse.setErrorMessage(_ctx.stringValue("CreateSubAccountResponse.ErrorMessage"));
		createSubAccountResponse.setDynamicMessage(_ctx.stringValue("CreateSubAccountResponse.DynamicMessage"));
		createSubAccountResponse.setSubAccountId(_ctx.longValue("CreateSubAccountResponse.SubAccountId"));
		createSubAccountResponse.setSuccess(_ctx.booleanValue("CreateSubAccountResponse.Success"));
		createSubAccountResponse.setDynamicCode(_ctx.stringValue("CreateSubAccountResponse.DynamicCode"));
		createSubAccountResponse.setCode(_ctx.stringValue("CreateSubAccountResponse.Code"));
	 
	 	return createSubAccountResponse;
	}
}