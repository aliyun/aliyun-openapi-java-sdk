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

import com.aliyuncs.cloudcallcenter.model.v20170705.DialogueResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.DialogueResponse.Feedback;
import com.aliyuncs.transform.UnmarshallerContext;


public class DialogueResponseUnmarshaller {

	public static DialogueResponse unmarshall(DialogueResponse dialogueResponse, UnmarshallerContext context) {
		
		dialogueResponse.setRequestId(context.stringValue("DialogueResponse.RequestId"));
		dialogueResponse.setSuccess(context.booleanValue("DialogueResponse.Success"));
		dialogueResponse.setCode(context.stringValue("DialogueResponse.Code"));
		dialogueResponse.setMessage(context.stringValue("DialogueResponse.Message"));
		dialogueResponse.setHttpStatusCode(context.integerValue("DialogueResponse.HttpStatusCode"));

		Feedback feedback = new Feedback();
		feedback.setContent(context.stringValue("DialogueResponse.Feedback.Content"));
		feedback.setAction(context.stringValue("DialogueResponse.Feedback.Action"));
		feedback.setActionParams(context.stringValue("DialogueResponse.Feedback.ActionParams"));
		dialogueResponse.setFeedback(feedback);
	 
	 	return dialogueResponse;
	}
}