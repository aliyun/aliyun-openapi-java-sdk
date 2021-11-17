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

import com.aliyuncs.mindlive_biz.model.v20210214.QueryPromptSwitchStateResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryPromptSwitchStateResponseUnmarshaller {

	public static QueryPromptSwitchStateResponse unmarshall(QueryPromptSwitchStateResponse queryPromptSwitchStateResponse, UnmarshallerContext _ctx) {
		
		queryPromptSwitchStateResponse.setRequestId(_ctx.stringValue("QueryPromptSwitchStateResponse.RequestId"));
		queryPromptSwitchStateResponse.setData(_ctx.booleanValue("QueryPromptSwitchStateResponse.Data"));
		queryPromptSwitchStateResponse.setErrorMessage(_ctx.stringValue("QueryPromptSwitchStateResponse.ErrorMessage"));
		queryPromptSwitchStateResponse.setErrorCode(_ctx.stringValue("QueryPromptSwitchStateResponse.ErrorCode"));
		queryPromptSwitchStateResponse.setSuccess(_ctx.booleanValue("QueryPromptSwitchStateResponse.Success"));
	 
	 	return queryPromptSwitchStateResponse;
	}
}