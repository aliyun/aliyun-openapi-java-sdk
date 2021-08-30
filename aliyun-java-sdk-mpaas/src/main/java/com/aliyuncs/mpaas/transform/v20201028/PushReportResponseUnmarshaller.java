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

import com.aliyuncs.mpaas.model.v20201028.PushReportResponse;
import com.aliyuncs.mpaas.model.v20201028.PushReportResponse.PushResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class PushReportResponseUnmarshaller {

	public static PushReportResponse unmarshall(PushReportResponse pushReportResponse, UnmarshallerContext _ctx) {
		
		pushReportResponse.setRequestId(_ctx.stringValue("PushReportResponse.RequestId"));
		pushReportResponse.setResultCode(_ctx.stringValue("PushReportResponse.ResultCode"));
		pushReportResponse.setResultMessage(_ctx.stringValue("PushReportResponse.ResultMessage"));

		PushResult pushResult = new PushResult();
		pushResult.setSuccess(_ctx.booleanValue("PushReportResponse.PushResult.Success"));
		pushResult.setResultMsg(_ctx.stringValue("PushReportResponse.PushResult.ResultMsg"));
		pushResult.setData(_ctx.stringValue("PushReportResponse.PushResult.Data"));
		pushReportResponse.setPushResult(pushResult);
	 
	 	return pushReportResponse;
	}
}