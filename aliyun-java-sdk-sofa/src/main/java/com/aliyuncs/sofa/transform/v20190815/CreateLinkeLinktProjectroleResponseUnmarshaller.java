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

package com.aliyuncs.sofa.transform.v20190815;

import com.aliyuncs.sofa.model.v20190815.CreateLinkeLinktProjectroleResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateLinkeLinktProjectroleResponseUnmarshaller {

	public static CreateLinkeLinktProjectroleResponse unmarshall(CreateLinkeLinktProjectroleResponse createLinkeLinktProjectroleResponse, UnmarshallerContext _ctx) {
		
		createLinkeLinktProjectroleResponse.setRequestId(_ctx.stringValue("CreateLinkeLinktProjectroleResponse.RequestId"));
		createLinkeLinktProjectroleResponse.setResultCode(_ctx.stringValue("CreateLinkeLinktProjectroleResponse.ResultCode"));
		createLinkeLinktProjectroleResponse.setResultMessage(_ctx.stringValue("CreateLinkeLinktProjectroleResponse.ResultMessage"));
		createLinkeLinktProjectroleResponse.setData(_ctx.booleanValue("CreateLinkeLinktProjectroleResponse.Data"));
		createLinkeLinktProjectroleResponse.setErrorCode(_ctx.longValue("CreateLinkeLinktProjectroleResponse.ErrorCode"));
		createLinkeLinktProjectroleResponse.setErrorMessage(_ctx.stringValue("CreateLinkeLinktProjectroleResponse.ErrorMessage"));
		createLinkeLinktProjectroleResponse.setSuccess(_ctx.booleanValue("CreateLinkeLinktProjectroleResponse.Success"));
	 
	 	return createLinkeLinktProjectroleResponse;
	}
}