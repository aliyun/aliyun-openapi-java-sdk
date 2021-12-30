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

package com.aliyuncs.ccc.transform.v20170705;

import com.aliyuncs.ccc.model.v20170705.ResetUserStatusResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ResetUserStatusResponseUnmarshaller {

	public static ResetUserStatusResponse unmarshall(ResetUserStatusResponse resetUserStatusResponse, UnmarshallerContext _ctx) {
		
		resetUserStatusResponse.setRequestId(_ctx.stringValue("ResetUserStatusResponse.RequestId"));
		resetUserStatusResponse.setSuccess(_ctx.booleanValue("ResetUserStatusResponse.Success"));
		resetUserStatusResponse.setCode(_ctx.stringValue("ResetUserStatusResponse.Code"));
		resetUserStatusResponse.setMessage(_ctx.stringValue("ResetUserStatusResponse.Message"));
		resetUserStatusResponse.setHttpStatusCode(_ctx.integerValue("ResetUserStatusResponse.HttpStatusCode"));
	 
	 	return resetUserStatusResponse;
	}
}