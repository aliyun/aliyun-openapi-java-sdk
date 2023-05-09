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

package com.aliyuncs.iot.transform.v20180120;

import com.aliyuncs.iot.model.v20180120.ShareSpeechByCombinationResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ShareSpeechByCombinationResponseUnmarshaller {

	public static ShareSpeechByCombinationResponse unmarshall(ShareSpeechByCombinationResponse shareSpeechByCombinationResponse, UnmarshallerContext _ctx) {
		
		shareSpeechByCombinationResponse.setRequestId(_ctx.stringValue("ShareSpeechByCombinationResponse.RequestId"));
		shareSpeechByCombinationResponse.setCode(_ctx.stringValue("ShareSpeechByCombinationResponse.Code"));
		shareSpeechByCombinationResponse.setErrorMessage(_ctx.stringValue("ShareSpeechByCombinationResponse.ErrorMessage"));
		shareSpeechByCombinationResponse.setSuccess(_ctx.booleanValue("ShareSpeechByCombinationResponse.Success"));
	 
	 	return shareSpeechByCombinationResponse;
	}
}