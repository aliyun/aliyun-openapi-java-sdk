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

import com.aliyuncs.cloudesl.model.v20200201.CopyLayoutResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CopyLayoutResponseUnmarshaller {

	public static CopyLayoutResponse unmarshall(CopyLayoutResponse copyLayoutResponse, UnmarshallerContext _ctx) {
		
		copyLayoutResponse.setRequestId(_ctx.stringValue("CopyLayoutResponse.RequestId"));
		copyLayoutResponse.setSuccess(_ctx.booleanValue("CopyLayoutResponse.Success"));
		copyLayoutResponse.setMessage(_ctx.stringValue("CopyLayoutResponse.Message"));
		copyLayoutResponse.setErrorCode(_ctx.stringValue("CopyLayoutResponse.ErrorCode"));
		copyLayoutResponse.setErrorMessage(_ctx.stringValue("CopyLayoutResponse.ErrorMessage"));
		copyLayoutResponse.setCode(_ctx.stringValue("CopyLayoutResponse.Code"));
		copyLayoutResponse.setDynamicCode(_ctx.stringValue("CopyLayoutResponse.DynamicCode"));
		copyLayoutResponse.setDynamicMessage(_ctx.stringValue("CopyLayoutResponse.DynamicMessage"));
	 
	 	return copyLayoutResponse;
	}
}