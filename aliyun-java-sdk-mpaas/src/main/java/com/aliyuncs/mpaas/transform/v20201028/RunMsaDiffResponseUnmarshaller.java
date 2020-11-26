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

import com.aliyuncs.mpaas.model.v20201028.RunMsaDiffResponse;
import com.aliyuncs.mpaas.model.v20201028.RunMsaDiffResponse.ResultContent;
import com.aliyuncs.transform.UnmarshallerContext;


public class RunMsaDiffResponseUnmarshaller {

	public static RunMsaDiffResponse unmarshall(RunMsaDiffResponse runMsaDiffResponse, UnmarshallerContext _ctx) {
		
		runMsaDiffResponse.setRequestId(_ctx.stringValue("RunMsaDiffResponse.RequestId"));
		runMsaDiffResponse.setResultCode(_ctx.stringValue("RunMsaDiffResponse.ResultCode"));
		runMsaDiffResponse.setResultMessage(_ctx.stringValue("RunMsaDiffResponse.ResultMessage"));

		ResultContent resultContent = new ResultContent();
		resultContent.setCode(_ctx.stringValue("RunMsaDiffResponse.ResultContent.Code"));
		resultContent.setData(_ctx.stringValue("RunMsaDiffResponse.ResultContent.Data"));
		resultContent.setMessage(_ctx.stringValue("RunMsaDiffResponse.ResultContent.Message"));
		resultContent.setSuccess(_ctx.booleanValue("RunMsaDiffResponse.ResultContent.Success"));
		runMsaDiffResponse.setResultContent(resultContent);
	 
	 	return runMsaDiffResponse;
	}
}