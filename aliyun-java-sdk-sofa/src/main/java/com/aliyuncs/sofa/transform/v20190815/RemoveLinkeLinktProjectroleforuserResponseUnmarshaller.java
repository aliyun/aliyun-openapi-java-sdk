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

import com.aliyuncs.sofa.model.v20190815.RemoveLinkeLinktProjectroleforuserResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class RemoveLinkeLinktProjectroleforuserResponseUnmarshaller {

	public static RemoveLinkeLinktProjectroleforuserResponse unmarshall(RemoveLinkeLinktProjectroleforuserResponse removeLinkeLinktProjectroleforuserResponse, UnmarshallerContext _ctx) {
		
		removeLinkeLinktProjectroleforuserResponse.setRequestId(_ctx.stringValue("RemoveLinkeLinktProjectroleforuserResponse.RequestId"));
		removeLinkeLinktProjectroleforuserResponse.setResultCode(_ctx.stringValue("RemoveLinkeLinktProjectroleforuserResponse.ResultCode"));
		removeLinkeLinktProjectroleforuserResponse.setResultMessage(_ctx.stringValue("RemoveLinkeLinktProjectroleforuserResponse.ResultMessage"));
		removeLinkeLinktProjectroleforuserResponse.setData(_ctx.booleanValue("RemoveLinkeLinktProjectroleforuserResponse.Data"));
		removeLinkeLinktProjectroleforuserResponse.setErrorCode(_ctx.longValue("RemoveLinkeLinktProjectroleforuserResponse.ErrorCode"));
		removeLinkeLinktProjectroleforuserResponse.setErrorMessage(_ctx.stringValue("RemoveLinkeLinktProjectroleforuserResponse.ErrorMessage"));
		removeLinkeLinktProjectroleforuserResponse.setSuccess(_ctx.booleanValue("RemoveLinkeLinktProjectroleforuserResponse.Success"));
	 
	 	return removeLinkeLinktProjectroleforuserResponse;
	}
}