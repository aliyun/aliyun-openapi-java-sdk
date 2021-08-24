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

package com.aliyuncs.mpaas.transform.v20200710;

import com.aliyuncs.mpaas.model.v20200710.PushBroadcastResponse;
import com.aliyuncs.mpaas.model.v20200710.PushBroadcastResponse.PushResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class PushBroadcastResponseUnmarshaller {

	public static PushBroadcastResponse unmarshall(PushBroadcastResponse pushBroadcastResponse, UnmarshallerContext _ctx) {
		
		pushBroadcastResponse.setRequestId(_ctx.stringValue("PushBroadcastResponse.RequestId"));
		pushBroadcastResponse.setResultCode(_ctx.stringValue("PushBroadcastResponse.ResultCode"));
		pushBroadcastResponse.setResultMessage(_ctx.stringValue("PushBroadcastResponse.ResultMessage"));

		PushResult pushResult = new PushResult();
		pushResult.setSuccess(_ctx.booleanValue("PushBroadcastResponse.PushResult.Success"));
		pushResult.setResultMsg(_ctx.stringValue("PushBroadcastResponse.PushResult.ResultMsg"));
		pushResult.setData(_ctx.stringValue("PushBroadcastResponse.PushResult.Data"));
		pushBroadcastResponse.setPushResult(pushResult);
	 
	 	return pushBroadcastResponse;
	}
}