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

import com.aliyuncs.mpaas.model.v20200710.PushTemplateResponse;
import com.aliyuncs.mpaas.model.v20200710.PushTemplateResponse.PushResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class PushTemplateResponseUnmarshaller {

	public static PushTemplateResponse unmarshall(PushTemplateResponse pushTemplateResponse, UnmarshallerContext _ctx) {
		
		pushTemplateResponse.setRequestId(_ctx.stringValue("PushTemplateResponse.RequestId"));
		pushTemplateResponse.setResultMessage(_ctx.stringValue("PushTemplateResponse.ResultMessage"));
		pushTemplateResponse.setResultCode(_ctx.stringValue("PushTemplateResponse.ResultCode"));

		PushResult pushResult = new PushResult();
		pushResult.setData(_ctx.stringValue("PushTemplateResponse.PushResult.Data"));
		pushResult.setSuccess(_ctx.booleanValue("PushTemplateResponse.PushResult.Success"));
		pushResult.setResultMsg(_ctx.stringValue("PushTemplateResponse.PushResult.ResultMsg"));
		pushTemplateResponse.setPushResult(pushResult);
	 
	 	return pushTemplateResponse;
	}
}