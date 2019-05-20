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

package com.aliyuncs.cloudcallcenter.transform.v20170705;

import com.aliyuncs.cloudcallcenter.model.v20170705.DebugIntentResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.DebugIntentResponse.Feedback;
import com.aliyuncs.transform.UnmarshallerContext;


public class DebugIntentResponseUnmarshaller {

	public static DebugIntentResponse unmarshall(DebugIntentResponse debugIntentResponse, UnmarshallerContext context) {
		
		debugIntentResponse.setRequestId(context.stringValue("DebugIntentResponse.RequestId"));
		debugIntentResponse.setSuccess(context.booleanValue("DebugIntentResponse.Success"));
		debugIntentResponse.setCode(context.stringValue("DebugIntentResponse.Code"));
		debugIntentResponse.setMessage(context.stringValue("DebugIntentResponse.Message"));
		debugIntentResponse.setHttpStatusCode(context.integerValue("DebugIntentResponse.HttpStatusCode"));

		Feedback feedback = new Feedback();
		feedback.setContent(context.stringValue("DebugIntentResponse.Feedback.Content"));
		feedback.setAction(context.stringValue("DebugIntentResponse.Feedback.Action"));
		feedback.setActionParams(context.stringValue("DebugIntentResponse.Feedback.ActionParams"));
		debugIntentResponse.setFeedback(feedback);
	 
	 	return debugIntentResponse;
	}
}