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

import com.aliyuncs.sofa.model.v20190815.PushSofamqOrderVerifyResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class PushSofamqOrderVerifyResponseUnmarshaller {

	public static PushSofamqOrderVerifyResponse unmarshall(PushSofamqOrderVerifyResponse pushSofamqOrderVerifyResponse, UnmarshallerContext _ctx) {
		
		pushSofamqOrderVerifyResponse.setRequestId(_ctx.stringValue("PushSofamqOrderVerifyResponse.requestId"));
		pushSofamqOrderVerifyResponse.setResultCode(_ctx.stringValue("PushSofamqOrderVerifyResponse.resultCode"));
		pushSofamqOrderVerifyResponse.setResultMessage(_ctx.stringValue("PushSofamqOrderVerifyResponse.resultMessage"));
		pushSofamqOrderVerifyResponse.setCode(_ctx.stringValue("PushSofamqOrderVerifyResponse.code"));
		pushSofamqOrderVerifyResponse.setData(_ctx.stringValue("PushSofamqOrderVerifyResponse.data"));
		pushSofamqOrderVerifyResponse.setMessage(_ctx.stringValue("PushSofamqOrderVerifyResponse.message"));
		pushSofamqOrderVerifyResponse.setSuccess(_ctx.booleanValue("PushSofamqOrderVerifyResponse.success"));
		pushSofamqOrderVerifyResponse.setSynchro(_ctx.stringValue("PushSofamqOrderVerifyResponse.synchro"));
	 
	 	return pushSofamqOrderVerifyResponse;
	}
}