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

import com.aliyuncs.outboundbot.model.v20191226.ModifyGlobalQuestionResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyGlobalQuestionResponseUnmarshaller {

	public static ModifyGlobalQuestionResponse unmarshall(ModifyGlobalQuestionResponse modifyGlobalQuestionResponse, UnmarshallerContext _ctx) {
		
		modifyGlobalQuestionResponse.setRequestId(_ctx.stringValue("ModifyGlobalQuestionResponse.RequestId"));
		modifyGlobalQuestionResponse.setHttpStatusCode(_ctx.integerValue("ModifyGlobalQuestionResponse.HttpStatusCode"));
		modifyGlobalQuestionResponse.setSuccess(_ctx.booleanValue("ModifyGlobalQuestionResponse.Success"));
		modifyGlobalQuestionResponse.setCode(_ctx.stringValue("ModifyGlobalQuestionResponse.Code"));
		modifyGlobalQuestionResponse.setMessage(_ctx.stringValue("ModifyGlobalQuestionResponse.Message"));
		modifyGlobalQuestionResponse.setDialogueQuestionId(_ctx.stringValue("ModifyGlobalQuestionResponse.DialogueQuestionId"));
	 
	 	return modifyGlobalQuestionResponse;
	}
}