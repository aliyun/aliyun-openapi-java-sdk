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

import com.aliyuncs.cloudesl.model.v20200201.SaveLayoutResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SaveLayoutResponseUnmarshaller {

	public static SaveLayoutResponse unmarshall(SaveLayoutResponse saveLayoutResponse, UnmarshallerContext _ctx) {
		
		saveLayoutResponse.setRequestId(_ctx.stringValue("SaveLayoutResponse.RequestId"));
		saveLayoutResponse.setSuccess(_ctx.booleanValue("SaveLayoutResponse.Success"));
		saveLayoutResponse.setMessage(_ctx.stringValue("SaveLayoutResponse.Message"));
		saveLayoutResponse.setErrorCode(_ctx.stringValue("SaveLayoutResponse.ErrorCode"));
		saveLayoutResponse.setErrorMessage(_ctx.stringValue("SaveLayoutResponse.ErrorMessage"));
		saveLayoutResponse.setCode(_ctx.stringValue("SaveLayoutResponse.Code"));
		saveLayoutResponse.setDynamicCode(_ctx.stringValue("SaveLayoutResponse.DynamicCode"));
		saveLayoutResponse.setDynamicMessage(_ctx.stringValue("SaveLayoutResponse.DynamicMessage"));
	 
	 	return saveLayoutResponse;
	}
}