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

import com.aliyuncs.cloudesl.model.v20200201.DeleteLayoutResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteLayoutResponseUnmarshaller {

	public static DeleteLayoutResponse unmarshall(DeleteLayoutResponse deleteLayoutResponse, UnmarshallerContext _ctx) {
		
		deleteLayoutResponse.setRequestId(_ctx.stringValue("DeleteLayoutResponse.RequestId"));
		deleteLayoutResponse.setSuccess(_ctx.booleanValue("DeleteLayoutResponse.Success"));
		deleteLayoutResponse.setMessage(_ctx.stringValue("DeleteLayoutResponse.Message"));
		deleteLayoutResponse.setErrorCode(_ctx.stringValue("DeleteLayoutResponse.ErrorCode"));
		deleteLayoutResponse.setErrorMessage(_ctx.stringValue("DeleteLayoutResponse.ErrorMessage"));
		deleteLayoutResponse.setCode(_ctx.stringValue("DeleteLayoutResponse.Code"));
		deleteLayoutResponse.setDynamicCode(_ctx.stringValue("DeleteLayoutResponse.DynamicCode"));
		deleteLayoutResponse.setDynamicMessage(_ctx.stringValue("DeleteLayoutResponse.DynamicMessage"));
	 
	 	return deleteLayoutResponse;
	}
}