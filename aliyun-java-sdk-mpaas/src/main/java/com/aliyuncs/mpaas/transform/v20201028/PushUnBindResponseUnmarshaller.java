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

package com.aliyuncs.mpaas.transform.v20201028;

import com.aliyuncs.mpaas.model.v20201028.PushUnBindResponse;
import com.aliyuncs.mpaas.model.v20201028.PushUnBindResponse.PushResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class PushUnBindResponseUnmarshaller {

	public static PushUnBindResponse unmarshall(PushUnBindResponse pushUnBindResponse, UnmarshallerContext _ctx) {
		
		pushUnBindResponse.setRequestId(_ctx.stringValue("PushUnBindResponse.RequestId"));
		pushUnBindResponse.setResultCode(_ctx.stringValue("PushUnBindResponse.ResultCode"));
		pushUnBindResponse.setResultMessage(_ctx.stringValue("PushUnBindResponse.ResultMessage"));

		PushResult pushResult = new PushResult();
		pushResult.setSuccess(_ctx.booleanValue("PushUnBindResponse.PushResult.Success"));
		pushResult.setResultMsg(_ctx.stringValue("PushUnBindResponse.PushResult.ResultMsg"));
		pushResult.setData(_ctx.stringValue("PushUnBindResponse.PushResult.Data"));
		pushUnBindResponse.setPushResult(pushResult);
	 
	 	return pushUnBindResponse;
	}
}