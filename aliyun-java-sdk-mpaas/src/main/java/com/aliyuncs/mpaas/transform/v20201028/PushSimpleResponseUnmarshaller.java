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

import com.aliyuncs.mpaas.model.v20201028.PushSimpleResponse;
import com.aliyuncs.mpaas.model.v20201028.PushSimpleResponse.PushResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class PushSimpleResponseUnmarshaller {

	public static PushSimpleResponse unmarshall(PushSimpleResponse pushSimpleResponse, UnmarshallerContext _ctx) {
		
		pushSimpleResponse.setRequestId(_ctx.stringValue("PushSimpleResponse.RequestId"));
		pushSimpleResponse.setResultMessage(_ctx.stringValue("PushSimpleResponse.ResultMessage"));
		pushSimpleResponse.setResultCode(_ctx.stringValue("PushSimpleResponse.ResultCode"));

		PushResult pushResult = new PushResult();
		pushResult.setData(_ctx.stringValue("PushSimpleResponse.PushResult.Data"));
		pushResult.setSuccess(_ctx.booleanValue("PushSimpleResponse.PushResult.Success"));
		pushResult.setResultMsg(_ctx.stringValue("PushSimpleResponse.PushResult.ResultMsg"));
		pushSimpleResponse.setPushResult(pushResult);
	 
	 	return pushSimpleResponse;
	}
}