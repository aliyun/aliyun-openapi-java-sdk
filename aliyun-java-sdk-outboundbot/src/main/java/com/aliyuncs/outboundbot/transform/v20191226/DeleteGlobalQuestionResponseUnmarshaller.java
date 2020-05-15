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

import com.aliyuncs.outboundbot.model.v20191226.DeleteGlobalQuestionResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteGlobalQuestionResponseUnmarshaller {

	public static DeleteGlobalQuestionResponse unmarshall(DeleteGlobalQuestionResponse deleteGlobalQuestionResponse, UnmarshallerContext _ctx) {
		
		deleteGlobalQuestionResponse.setRequestId(_ctx.stringValue("DeleteGlobalQuestionResponse.RequestId"));
		deleteGlobalQuestionResponse.setSuccess(_ctx.booleanValue("DeleteGlobalQuestionResponse.Success"));
		deleteGlobalQuestionResponse.setCode(_ctx.stringValue("DeleteGlobalQuestionResponse.Code"));
		deleteGlobalQuestionResponse.setMessage(_ctx.stringValue("DeleteGlobalQuestionResponse.Message"));
		deleteGlobalQuestionResponse.setHttpStatusCode(_ctx.integerValue("DeleteGlobalQuestionResponse.HttpStatusCode"));
	 
	 	return deleteGlobalQuestionResponse;
	}
}