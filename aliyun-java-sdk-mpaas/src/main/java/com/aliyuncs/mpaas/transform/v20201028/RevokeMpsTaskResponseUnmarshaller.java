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

import com.aliyuncs.mpaas.model.v20201028.RevokeMpsTaskResponse;
import com.aliyuncs.mpaas.model.v20201028.RevokeMpsTaskResponse.PushResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class RevokeMpsTaskResponseUnmarshaller {

	public static RevokeMpsTaskResponse unmarshall(RevokeMpsTaskResponse revokeMpsTaskResponse, UnmarshallerContext _ctx) {
		
		revokeMpsTaskResponse.setRequestId(_ctx.stringValue("RevokeMpsTaskResponse.RequestId"));
		revokeMpsTaskResponse.setResultMessage(_ctx.stringValue("RevokeMpsTaskResponse.ResultMessage"));
		revokeMpsTaskResponse.setResultCode(_ctx.stringValue("RevokeMpsTaskResponse.ResultCode"));

		PushResult pushResult = new PushResult();
		pushResult.setData(_ctx.stringValue("RevokeMpsTaskResponse.PushResult.Data"));
		pushResult.setSuccess(_ctx.booleanValue("RevokeMpsTaskResponse.PushResult.Success"));
		pushResult.setResultMsg(_ctx.stringValue("RevokeMpsTaskResponse.PushResult.ResultMsg"));
		revokeMpsTaskResponse.setPushResult(pushResult);
	 
	 	return revokeMpsTaskResponse;
	}
}