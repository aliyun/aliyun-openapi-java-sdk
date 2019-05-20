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

import com.aliyuncs.cloudcallcenter.model.v20170705.DebugDialogueResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.DebugDialogueResponse.Feedback;
import com.aliyuncs.transform.UnmarshallerContext;


public class DebugDialogueResponseUnmarshaller {

	public static DebugDialogueResponse unmarshall(DebugDialogueResponse debugDialogueResponse, UnmarshallerContext context) {
		
		debugDialogueResponse.setRequestId(context.stringValue("DebugDialogueResponse.RequestId"));
		debugDialogueResponse.setSuccess(context.booleanValue("DebugDialogueResponse.Success"));
		debugDialogueResponse.setCode(context.stringValue("DebugDialogueResponse.Code"));
		debugDialogueResponse.setMessage(context.stringValue("DebugDialogueResponse.Message"));
		debugDialogueResponse.setHttpStatusCode(context.integerValue("DebugDialogueResponse.HttpStatusCode"));

		Feedback feedback = new Feedback();
		feedback.setContent(context.stringValue("DebugDialogueResponse.Feedback.Content"));
		feedback.setAction(context.stringValue("DebugDialogueResponse.Feedback.Action"));
		feedback.setActionParams(context.stringValue("DebugDialogueResponse.Feedback.ActionParams"));
		debugDialogueResponse.setFeedback(feedback);
	 
	 	return debugDialogueResponse;
	}
}