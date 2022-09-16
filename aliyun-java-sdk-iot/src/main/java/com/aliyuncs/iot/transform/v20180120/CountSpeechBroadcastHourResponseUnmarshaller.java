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

import com.aliyuncs.iot.model.v20180120.CountSpeechBroadcastHourResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CountSpeechBroadcastHourResponseUnmarshaller {

	public static CountSpeechBroadcastHourResponse unmarshall(CountSpeechBroadcastHourResponse countSpeechBroadcastHourResponse, UnmarshallerContext _ctx) {
		
		countSpeechBroadcastHourResponse.setRequestId(_ctx.stringValue("CountSpeechBroadcastHourResponse.RequestId"));
		countSpeechBroadcastHourResponse.setSuccess(_ctx.booleanValue("CountSpeechBroadcastHourResponse.Success"));
		countSpeechBroadcastHourResponse.setCode(_ctx.stringValue("CountSpeechBroadcastHourResponse.Code"));
		countSpeechBroadcastHourResponse.setErrorMessage(_ctx.stringValue("CountSpeechBroadcastHourResponse.ErrorMessage"));
		countSpeechBroadcastHourResponse.setData(_ctx.integerValue("CountSpeechBroadcastHourResponse.Data"));
	 
	 	return countSpeechBroadcastHourResponse;
	}
}