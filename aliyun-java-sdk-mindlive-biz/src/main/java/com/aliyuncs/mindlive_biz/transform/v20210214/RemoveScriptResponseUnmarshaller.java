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

package com.aliyuncs.mindlive_biz.transform.v20210214;

import com.aliyuncs.mindlive_biz.model.v20210214.RemoveScriptResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class RemoveScriptResponseUnmarshaller {

	public static RemoveScriptResponse unmarshall(RemoveScriptResponse removeScriptResponse, UnmarshallerContext _ctx) {
		
		removeScriptResponse.setRequestId(_ctx.stringValue("RemoveScriptResponse.RequestId"));
		removeScriptResponse.setData(_ctx.integerValue("RemoveScriptResponse.Data"));
		removeScriptResponse.setErrorMessage(_ctx.stringValue("RemoveScriptResponse.ErrorMessage"));
		removeScriptResponse.setSuccess(_ctx.booleanValue("RemoveScriptResponse.Success"));
		removeScriptResponse.setErrorCode(_ctx.stringValue("RemoveScriptResponse.ErrorCode"));
	 
	 	return removeScriptResponse;
	}
}