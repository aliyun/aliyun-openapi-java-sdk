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

package com.aliyuncs.gts_smart_call.transform.v20201021;

import com.aliyuncs.gts_smart_call.model.v20201021.GetCallInVoiceRecordURLResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetCallInVoiceRecordURLResponseUnmarshaller {

	public static GetCallInVoiceRecordURLResponse unmarshall(GetCallInVoiceRecordURLResponse getCallInVoiceRecordURLResponse, UnmarshallerContext _ctx) {
		
		getCallInVoiceRecordURLResponse.setRequestId(_ctx.stringValue("GetCallInVoiceRecordURLResponse.RequestId"));
		getCallInVoiceRecordURLResponse.setCode(_ctx.integerValue("GetCallInVoiceRecordURLResponse.Code"));
		getCallInVoiceRecordURLResponse.setMessage(_ctx.stringValue("GetCallInVoiceRecordURLResponse.Message"));
		getCallInVoiceRecordURLResponse.setCallInVoiceRecordUrl(_ctx.stringValue("GetCallInVoiceRecordURLResponse.CallInVoiceRecordUrl"));
	 
	 	return getCallInVoiceRecordURLResponse;
	}
}