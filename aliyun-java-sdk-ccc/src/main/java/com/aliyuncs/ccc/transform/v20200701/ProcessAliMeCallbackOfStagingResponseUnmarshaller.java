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

package com.aliyuncs.ccc.transform.v20200701;

import com.aliyuncs.ccc.model.v20200701.ProcessAliMeCallbackOfStagingResponse;
import com.aliyuncs.ccc.model.v20200701.ProcessAliMeCallbackOfStagingResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class ProcessAliMeCallbackOfStagingResponseUnmarshaller {

	public static ProcessAliMeCallbackOfStagingResponse unmarshall(ProcessAliMeCallbackOfStagingResponse processAliMeCallbackOfStagingResponse, UnmarshallerContext _ctx) {
		
		processAliMeCallbackOfStagingResponse.setRequestId(_ctx.stringValue("ProcessAliMeCallbackOfStagingResponse.RequestId"));
		processAliMeCallbackOfStagingResponse.setCode(_ctx.stringValue("ProcessAliMeCallbackOfStagingResponse.Code"));
		processAliMeCallbackOfStagingResponse.setHttpStatusCode(_ctx.integerValue("ProcessAliMeCallbackOfStagingResponse.HttpStatusCode"));
		processAliMeCallbackOfStagingResponse.setMessage(_ctx.stringValue("ProcessAliMeCallbackOfStagingResponse.Message"));

		Data data = new Data();
		data.setResult(_ctx.stringValue("ProcessAliMeCallbackOfStagingResponse.Data.Result"));
		processAliMeCallbackOfStagingResponse.setData(data);
	 
	 	return processAliMeCallbackOfStagingResponse;
	}
}