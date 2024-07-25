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

package com.aliyuncs.cams.transform.v20200606;

import com.aliyuncs.cams.model.v20200606.UpdateConversationalAutomationResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateConversationalAutomationResponseUnmarshaller {

	public static UpdateConversationalAutomationResponse unmarshall(UpdateConversationalAutomationResponse updateConversationalAutomationResponse, UnmarshallerContext _ctx) {
		
		updateConversationalAutomationResponse.setRequestId(_ctx.stringValue("UpdateConversationalAutomationResponse.RequestId"));
		updateConversationalAutomationResponse.setAccessDeniedDetail(_ctx.stringValue("UpdateConversationalAutomationResponse.AccessDeniedDetail"));
		updateConversationalAutomationResponse.setMessage(_ctx.stringValue("UpdateConversationalAutomationResponse.Message"));
		updateConversationalAutomationResponse.setCode(_ctx.stringValue("UpdateConversationalAutomationResponse.Code"));
		updateConversationalAutomationResponse.setSuccess(_ctx.booleanValue("UpdateConversationalAutomationResponse.Success"));
	 
	 	return updateConversationalAutomationResponse;
	}
}