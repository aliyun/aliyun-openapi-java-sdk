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

import com.aliyuncs.sofa.model.v20190815.RemoveLinkeLinktStatusResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class RemoveLinkeLinktStatusResponseUnmarshaller {

	public static RemoveLinkeLinktStatusResponse unmarshall(RemoveLinkeLinktStatusResponse removeLinkeLinktStatusResponse, UnmarshallerContext _ctx) {
		
		removeLinkeLinktStatusResponse.setRequestId(_ctx.stringValue("RemoveLinkeLinktStatusResponse.RequestId"));
		removeLinkeLinktStatusResponse.setResultCode(_ctx.stringValue("RemoveLinkeLinktStatusResponse.ResultCode"));
		removeLinkeLinktStatusResponse.setResultMessage(_ctx.stringValue("RemoveLinkeLinktStatusResponse.ResultMessage"));
		removeLinkeLinktStatusResponse.setData(_ctx.booleanValue("RemoveLinkeLinktStatusResponse.Data"));
		removeLinkeLinktStatusResponse.setErrorCode(_ctx.longValue("RemoveLinkeLinktStatusResponse.ErrorCode"));
		removeLinkeLinktStatusResponse.setErrorMessage(_ctx.stringValue("RemoveLinkeLinktStatusResponse.ErrorMessage"));
		removeLinkeLinktStatusResponse.setSuccess(_ctx.booleanValue("RemoveLinkeLinktStatusResponse.Success"));
	 
	 	return removeLinkeLinktStatusResponse;
	}
}