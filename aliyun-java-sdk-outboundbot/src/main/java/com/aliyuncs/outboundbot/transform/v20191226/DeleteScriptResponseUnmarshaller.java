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

package com.aliyuncs.outboundbot.transform.v20191226;

import com.aliyuncs.outboundbot.model.v20191226.DeleteScriptResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteScriptResponseUnmarshaller {

	public static DeleteScriptResponse unmarshall(DeleteScriptResponse deleteScriptResponse, UnmarshallerContext _ctx) {
		
		deleteScriptResponse.setRequestId(_ctx.stringValue("DeleteScriptResponse.RequestId"));
		deleteScriptResponse.setSuccess(_ctx.booleanValue("DeleteScriptResponse.Success"));
		deleteScriptResponse.setCode(_ctx.stringValue("DeleteScriptResponse.Code"));
		deleteScriptResponse.setMessage(_ctx.stringValue("DeleteScriptResponse.Message"));
		deleteScriptResponse.setHttpStatusCode(_ctx.integerValue("DeleteScriptResponse.HttpStatusCode"));
	 
	 	return deleteScriptResponse;
	}
}