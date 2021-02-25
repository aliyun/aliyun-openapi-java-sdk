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

package com.aliyuncs.unimkt.transform.v20181212;

import com.aliyuncs.unimkt.model.v20181212.GetUnionTaskStatusResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetUnionTaskStatusResponseUnmarshaller {

	public static GetUnionTaskStatusResponse unmarshall(GetUnionTaskStatusResponse getUnionTaskStatusResponse, UnmarshallerContext _ctx) {
		
		getUnionTaskStatusResponse.setRequestId(_ctx.stringValue("GetUnionTaskStatusResponse.RequestId"));
		getUnionTaskStatusResponse.setSuccess(_ctx.booleanValue("GetUnionTaskStatusResponse.Success"));
		getUnionTaskStatusResponse.setErrorCode(_ctx.integerValue("GetUnionTaskStatusResponse.ErrorCode"));
		getUnionTaskStatusResponse.setErrorMessage(_ctx.stringValue("GetUnionTaskStatusResponse.ErrorMessage"));
		getUnionTaskStatusResponse.setResult(_ctx.booleanValue("GetUnionTaskStatusResponse.Result"));
	 
	 	return getUnionTaskStatusResponse;
	}
}