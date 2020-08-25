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

import com.aliyuncs.sofa.model.v20190815.RemoveLinkeLinktWorkitemrelationResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class RemoveLinkeLinktWorkitemrelationResponseUnmarshaller {

	public static RemoveLinkeLinktWorkitemrelationResponse unmarshall(RemoveLinkeLinktWorkitemrelationResponse removeLinkeLinktWorkitemrelationResponse, UnmarshallerContext _ctx) {
		
		removeLinkeLinktWorkitemrelationResponse.setRequestId(_ctx.stringValue("RemoveLinkeLinktWorkitemrelationResponse.RequestId"));
		removeLinkeLinktWorkitemrelationResponse.setResultCode(_ctx.stringValue("RemoveLinkeLinktWorkitemrelationResponse.ResultCode"));
		removeLinkeLinktWorkitemrelationResponse.setResultMessage(_ctx.stringValue("RemoveLinkeLinktWorkitemrelationResponse.ResultMessage"));
		removeLinkeLinktWorkitemrelationResponse.setData(_ctx.booleanValue("RemoveLinkeLinktWorkitemrelationResponse.Data"));
		removeLinkeLinktWorkitemrelationResponse.setErrorCode(_ctx.longValue("RemoveLinkeLinktWorkitemrelationResponse.ErrorCode"));
		removeLinkeLinktWorkitemrelationResponse.setErrorMessage(_ctx.stringValue("RemoveLinkeLinktWorkitemrelationResponse.ErrorMessage"));
		removeLinkeLinktWorkitemrelationResponse.setResponseStatusCode(_ctx.longValue("RemoveLinkeLinktWorkitemrelationResponse.ResponseStatusCode"));
		removeLinkeLinktWorkitemrelationResponse.setSuccess(_ctx.booleanValue("RemoveLinkeLinktWorkitemrelationResponse.Success"));
	 
	 	return removeLinkeLinktWorkitemrelationResponse;
	}
}