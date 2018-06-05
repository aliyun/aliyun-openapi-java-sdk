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

import com.aliyuncs.ccc.model.v20170705.StartBack2BackCallResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class StartBack2BackCallResponseUnmarshaller {

	public static StartBack2BackCallResponse unmarshall(StartBack2BackCallResponse startBack2BackCallResponse, UnmarshallerContext context) {
		
		startBack2BackCallResponse.setRequestId(context.stringValue("StartBack2BackCallResponse.RequestId"));
		startBack2BackCallResponse.setSuccess(context.booleanValue("StartBack2BackCallResponse.Success"));
		startBack2BackCallResponse.setCode(context.stringValue("StartBack2BackCallResponse.Code"));
		startBack2BackCallResponse.setMessage(context.stringValue("StartBack2BackCallResponse.Message"));
		startBack2BackCallResponse.setHttpStatusCode(context.integerValue("StartBack2BackCallResponse.HttpStatusCode"));
		startBack2BackCallResponse.setStatusCode(context.stringValue("StartBack2BackCallResponse.StatusCode"));
		startBack2BackCallResponse.setStatusDesc(context.stringValue("StartBack2BackCallResponse.StatusDesc"));
		startBack2BackCallResponse.setTaskId(context.stringValue("StartBack2BackCallResponse.TaskId"));
		startBack2BackCallResponse.setTimeStamp(context.stringValue("StartBack2BackCallResponse.TimeStamp"));
	 
	 	return startBack2BackCallResponse;
	}
}