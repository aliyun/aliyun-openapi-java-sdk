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

import com.aliyuncs.outboundbot.model.v20191226.CreateGlobalQuestionResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateGlobalQuestionResponseUnmarshaller {

	public static CreateGlobalQuestionResponse unmarshall(CreateGlobalQuestionResponse createGlobalQuestionResponse, UnmarshallerContext _ctx) {
		
		createGlobalQuestionResponse.setRequestId(_ctx.stringValue("CreateGlobalQuestionResponse.RequestId"));
		createGlobalQuestionResponse.setSuccess(_ctx.booleanValue("CreateGlobalQuestionResponse.Success"));
		createGlobalQuestionResponse.setCode(_ctx.stringValue("CreateGlobalQuestionResponse.Code"));
		createGlobalQuestionResponse.setMessage(_ctx.stringValue("CreateGlobalQuestionResponse.Message"));
		createGlobalQuestionResponse.setHttpStatusCode(_ctx.integerValue("CreateGlobalQuestionResponse.HttpStatusCode"));
		createGlobalQuestionResponse.setGlobalQuestionId(_ctx.stringValue("CreateGlobalQuestionResponse.GlobalQuestionId"));
	 
	 	return createGlobalQuestionResponse;
	}
}