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

package com.aliyuncs.safconsole.transform.v20210112;

import com.aliyuncs.safconsole.model.v20210112.SendFeedbackResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SendFeedbackResponseUnmarshaller {

	public static SendFeedbackResponse unmarshall(SendFeedbackResponse sendFeedbackResponse, UnmarshallerContext _ctx) {
		
		sendFeedbackResponse.setRequestId(_ctx.stringValue("SendFeedbackResponse.RequestId"));
		sendFeedbackResponse.setCode(_ctx.integerValue("SendFeedbackResponse.Code"));
		sendFeedbackResponse.setMessage(_ctx.stringValue("SendFeedbackResponse.Message"));
	 
	 	return sendFeedbackResponse;
	}
}