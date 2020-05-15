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

package com.aliyuncs.cloudesl.transform.v20200201;

import com.aliyuncs.cloudesl.model.v20200201.UnassignUserResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UnassignUserResponseUnmarshaller {

	public static UnassignUserResponse unmarshall(UnassignUserResponse unassignUserResponse, UnmarshallerContext _ctx) {
		
		unassignUserResponse.setRequestId(_ctx.stringValue("UnassignUserResponse.RequestId"));
		unassignUserResponse.setErrorMessage(_ctx.stringValue("UnassignUserResponse.ErrorMessage"));
		unassignUserResponse.setErrorCode(_ctx.stringValue("UnassignUserResponse.ErrorCode"));
		unassignUserResponse.setMessage(_ctx.stringValue("UnassignUserResponse.Message"));
		unassignUserResponse.setDynamicCode(_ctx.stringValue("UnassignUserResponse.DynamicCode"));
		unassignUserResponse.setCode(_ctx.stringValue("UnassignUserResponse.Code"));
		unassignUserResponse.setDynamicMessage(_ctx.stringValue("UnassignUserResponse.DynamicMessage"));
		unassignUserResponse.setSuccess(_ctx.booleanValue("UnassignUserResponse.Success"));
	 
	 	return unassignUserResponse;
	}
}