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

import com.aliyuncs.mindlive_biz.model.v20210214.UpdateScriptResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateScriptResponseUnmarshaller {

	public static UpdateScriptResponse unmarshall(UpdateScriptResponse updateScriptResponse, UnmarshallerContext _ctx) {
		
		updateScriptResponse.setRequestId(_ctx.stringValue("UpdateScriptResponse.RequestId"));
		updateScriptResponse.setErrorMessage(_ctx.stringValue("UpdateScriptResponse.ErrorMessage"));
		updateScriptResponse.setSuccess(_ctx.booleanValue("UpdateScriptResponse.Success"));
		updateScriptResponse.setErrorCode(_ctx.stringValue("UpdateScriptResponse.ErrorCode"));
	 
	 	return updateScriptResponse;
	}
}