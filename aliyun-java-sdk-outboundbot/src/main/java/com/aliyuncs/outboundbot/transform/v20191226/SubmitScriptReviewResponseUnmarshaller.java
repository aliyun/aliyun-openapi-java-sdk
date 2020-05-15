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

import com.aliyuncs.outboundbot.model.v20191226.SubmitScriptReviewResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SubmitScriptReviewResponseUnmarshaller {

	public static SubmitScriptReviewResponse unmarshall(SubmitScriptReviewResponse submitScriptReviewResponse, UnmarshallerContext _ctx) {
		
		submitScriptReviewResponse.setRequestId(_ctx.stringValue("SubmitScriptReviewResponse.RequestId"));
		submitScriptReviewResponse.setSuccess(_ctx.booleanValue("SubmitScriptReviewResponse.Success"));
		submitScriptReviewResponse.setCode(_ctx.stringValue("SubmitScriptReviewResponse.Code"));
		submitScriptReviewResponse.setMessage(_ctx.stringValue("SubmitScriptReviewResponse.Message"));
		submitScriptReviewResponse.setHttpStatusCode(_ctx.integerValue("SubmitScriptReviewResponse.HttpStatusCode"));
	 
	 	return submitScriptReviewResponse;
	}
}