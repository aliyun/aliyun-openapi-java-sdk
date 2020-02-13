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

package com.aliyuncs.cspro.transform.v20180315;

import com.aliyuncs.cspro.model.v20180315.AddFeedbackResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddFeedbackResponseUnmarshaller {

	public static AddFeedbackResponse unmarshall(AddFeedbackResponse addFeedbackResponse, UnmarshallerContext _ctx) {
		
		addFeedbackResponse.setRequestId(_ctx.stringValue("AddFeedbackResponse.RequestId"));
		addFeedbackResponse.setSuccess(_ctx.booleanValue("AddFeedbackResponse.Success"));
		addFeedbackResponse.setData(_ctx.longValue("AddFeedbackResponse.Data"));
		addFeedbackResponse.setCode(_ctx.stringValue("AddFeedbackResponse.Code"));
		addFeedbackResponse.setMessage(_ctx.stringValue("AddFeedbackResponse.Message"));
	 
	 	return addFeedbackResponse;
	}
}