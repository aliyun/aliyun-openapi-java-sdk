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

import com.aliyuncs.sofa.model.v20190815.PushSofamqOpenCallbackResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class PushSofamqOpenCallbackResponseUnmarshaller {

	public static PushSofamqOpenCallbackResponse unmarshall(PushSofamqOpenCallbackResponse pushSofamqOpenCallbackResponse, UnmarshallerContext _ctx) {
		
		pushSofamqOpenCallbackResponse.setRequestId(_ctx.stringValue("PushSofamqOpenCallbackResponse.requestId"));
		pushSofamqOpenCallbackResponse.setResultCode(_ctx.stringValue("PushSofamqOpenCallbackResponse.resultCode"));
		pushSofamqOpenCallbackResponse.setResultMessage(_ctx.stringValue("PushSofamqOpenCallbackResponse.resultMessage"));
		pushSofamqOpenCallbackResponse.setCode(_ctx.stringValue("PushSofamqOpenCallbackResponse.code"));
		pushSofamqOpenCallbackResponse.setData(_ctx.stringValue("PushSofamqOpenCallbackResponse.data"));
		pushSofamqOpenCallbackResponse.setMessage(_ctx.stringValue("PushSofamqOpenCallbackResponse.message"));
		pushSofamqOpenCallbackResponse.setSuccess(_ctx.booleanValue("PushSofamqOpenCallbackResponse.success"));
		pushSofamqOpenCallbackResponse.setSynchro(_ctx.stringValue("PushSofamqOpenCallbackResponse.synchro"));
	 
	 	return pushSofamqOpenCallbackResponse;
	}
}