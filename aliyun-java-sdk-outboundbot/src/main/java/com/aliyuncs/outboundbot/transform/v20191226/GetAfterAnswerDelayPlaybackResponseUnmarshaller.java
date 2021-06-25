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

import com.aliyuncs.outboundbot.model.v20191226.GetAfterAnswerDelayPlaybackResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAfterAnswerDelayPlaybackResponseUnmarshaller {

	public static GetAfterAnswerDelayPlaybackResponse unmarshall(GetAfterAnswerDelayPlaybackResponse getAfterAnswerDelayPlaybackResponse, UnmarshallerContext _ctx) {
		
		getAfterAnswerDelayPlaybackResponse.setRequestId(_ctx.stringValue("GetAfterAnswerDelayPlaybackResponse.RequestId"));
		getAfterAnswerDelayPlaybackResponse.setSuccess(_ctx.booleanValue("GetAfterAnswerDelayPlaybackResponse.Success"));
		getAfterAnswerDelayPlaybackResponse.setCode(_ctx.stringValue("GetAfterAnswerDelayPlaybackResponse.Code"));
		getAfterAnswerDelayPlaybackResponse.setMessage(_ctx.stringValue("GetAfterAnswerDelayPlaybackResponse.Message"));
		getAfterAnswerDelayPlaybackResponse.setHttpStatusCode(_ctx.integerValue("GetAfterAnswerDelayPlaybackResponse.HttpStatusCode"));
		getAfterAnswerDelayPlaybackResponse.setAfterAnswerDelayPlayback(_ctx.integerValue("GetAfterAnswerDelayPlaybackResponse.AfterAnswerDelayPlayback"));
	 
	 	return getAfterAnswerDelayPlaybackResponse;
	}
}