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

package com.aliyuncs.cloudesl.transform.v20190801;

import com.aliyuncs.cloudesl.model.v20190801.AssignUserResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AssignUserResponseUnmarshaller {

	public static AssignUserResponse unmarshall(AssignUserResponse assignUserResponse, UnmarshallerContext _ctx) {
		
		assignUserResponse.setRequestId(_ctx.stringValue("AssignUserResponse.RequestId"));
		assignUserResponse.setErrorMessage(_ctx.stringValue("AssignUserResponse.ErrorMessage"));
		assignUserResponse.setErrorCode(_ctx.stringValue("AssignUserResponse.ErrorCode"));
		assignUserResponse.setMessage(_ctx.stringValue("AssignUserResponse.Message"));
		assignUserResponse.setDynamicCode(_ctx.stringValue("AssignUserResponse.DynamicCode"));
		assignUserResponse.setCode(_ctx.stringValue("AssignUserResponse.Code"));
		assignUserResponse.setDynamicMessage(_ctx.stringValue("AssignUserResponse.DynamicMessage"));
		assignUserResponse.setSuccess(_ctx.booleanValue("AssignUserResponse.Success"));
	 
	 	return assignUserResponse;
	}
}