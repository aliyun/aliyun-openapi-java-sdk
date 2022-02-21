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

import com.aliyuncs.mpaas.model.v20201028.SetMsacAppResponse;
import com.aliyuncs.mpaas.model.v20201028.SetMsacAppResponse.ResultContent;
import com.aliyuncs.transform.UnmarshallerContext;


public class SetMsacAppResponseUnmarshaller {

	public static SetMsacAppResponse unmarshall(SetMsacAppResponse setMsacAppResponse, UnmarshallerContext _ctx) {
		
		setMsacAppResponse.setRequestId(_ctx.stringValue("SetMsacAppResponse.RequestId"));
		setMsacAppResponse.setResultMessage(_ctx.stringValue("SetMsacAppResponse.ResultMessage"));
		setMsacAppResponse.setResultCode(_ctx.stringValue("SetMsacAppResponse.ResultCode"));

		ResultContent resultContent = new ResultContent();
		resultContent.setCode(_ctx.stringValue("SetMsacAppResponse.ResultContent.Code"));
		resultContent.setMessage(_ctx.stringValue("SetMsacAppResponse.ResultContent.Message"));
		resultContent.setData(_ctx.stringValue("SetMsacAppResponse.ResultContent.Data"));
		resultContent.setSuccess(_ctx.booleanValue("SetMsacAppResponse.ResultContent.Success"));
		setMsacAppResponse.setResultContent(resultContent);
	 
	 	return setMsacAppResponse;
	}
}