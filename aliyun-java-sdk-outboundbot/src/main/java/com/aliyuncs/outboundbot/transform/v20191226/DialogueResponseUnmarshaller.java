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

import com.aliyuncs.outboundbot.model.v20191226.DialogueResponse;
import com.aliyuncs.outboundbot.model.v20191226.DialogueResponse.Feedback;
import com.aliyuncs.transform.UnmarshallerContext;


public class DialogueResponseUnmarshaller {

	public static DialogueResponse unmarshall(DialogueResponse dialogueResponse, UnmarshallerContext _ctx) {
		
		dialogueResponse.setRequestId(_ctx.stringValue("DialogueResponse.RequestId"));
		dialogueResponse.setSuccess(_ctx.booleanValue("DialogueResponse.Success"));
		dialogueResponse.setCode(_ctx.stringValue("DialogueResponse.Code"));
		dialogueResponse.setMessage(_ctx.stringValue("DialogueResponse.Message"));
		dialogueResponse.setHttpStatusCode(_ctx.integerValue("DialogueResponse.HttpStatusCode"));

		Feedback feedback = new Feedback();
		feedback.setContent(_ctx.stringValue("DialogueResponse.Feedback.Content"));
		feedback.setAction(_ctx.stringValue("DialogueResponse.Feedback.Action"));
		feedback.setActionParams(_ctx.stringValue("DialogueResponse.Feedback.ActionParams"));
		feedback.setInterruptible(_ctx.booleanValue("DialogueResponse.Feedback.Interruptible"));
		dialogueResponse.setFeedback(feedback);
	 
	 	return dialogueResponse;
	}
}