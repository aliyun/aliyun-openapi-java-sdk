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

package com.aliyuncs.sofa.transform.v20190815;

import com.aliyuncs.sofa.model.v20190815.CallbackMsSpiOmsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CallbackMsSpiOmsResponseUnmarshaller {

	public static CallbackMsSpiOmsResponse unmarshall(CallbackMsSpiOmsResponse callbackMsSpiOmsResponse, UnmarshallerContext _ctx) {
		
		callbackMsSpiOmsResponse.setRequestId(_ctx.stringValue("CallbackMsSpiOmsResponse.requestId"));
		callbackMsSpiOmsResponse.setResultCode(_ctx.stringValue("CallbackMsSpiOmsResponse.resultCode"));
		callbackMsSpiOmsResponse.setResultMessage(_ctx.stringValue("CallbackMsSpiOmsResponse.resultMessage"));
		callbackMsSpiOmsResponse.setCode(_ctx.stringValue("CallbackMsSpiOmsResponse.code"));
		callbackMsSpiOmsResponse.setData(_ctx.stringValue("CallbackMsSpiOmsResponse.data"));
		callbackMsSpiOmsResponse.setMessage(_ctx.stringValue("CallbackMsSpiOmsResponse.message"));
		callbackMsSpiOmsResponse.setSuccess(_ctx.booleanValue("CallbackMsSpiOmsResponse.success"));
		callbackMsSpiOmsResponse.setSynchro(_ctx.stringValue("CallbackMsSpiOmsResponse.synchro"));
	 
	 	return callbackMsSpiOmsResponse;
	}
}