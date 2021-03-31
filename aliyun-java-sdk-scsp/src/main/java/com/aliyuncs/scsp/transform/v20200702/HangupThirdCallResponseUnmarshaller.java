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

package com.aliyuncs.scsp.transform.v20200702;

import com.aliyuncs.scsp.model.v20200702.HangupThirdCallResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class HangupThirdCallResponseUnmarshaller {

	public static HangupThirdCallResponse unmarshall(HangupThirdCallResponse hangupThirdCallResponse, UnmarshallerContext _ctx) {
		
		hangupThirdCallResponse.setRequestId(_ctx.stringValue("HangupThirdCallResponse.RequestId"));
		hangupThirdCallResponse.setMessage(_ctx.stringValue("HangupThirdCallResponse.Message"));
		hangupThirdCallResponse.setCode(_ctx.stringValue("HangupThirdCallResponse.Code"));
		hangupThirdCallResponse.setSuccess(_ctx.booleanValue("HangupThirdCallResponse.Success"));
	 
	 	return hangupThirdCallResponse;
	}
}