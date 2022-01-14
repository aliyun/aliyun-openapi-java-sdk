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

import com.aliyuncs.mpaas.model.v20201028.SetMsacAppInstanceResponse;
import com.aliyuncs.mpaas.model.v20201028.SetMsacAppInstanceResponse.ResultContent;
import com.aliyuncs.transform.UnmarshallerContext;


public class SetMsacAppInstanceResponseUnmarshaller {

	public static SetMsacAppInstanceResponse unmarshall(SetMsacAppInstanceResponse setMsacAppInstanceResponse, UnmarshallerContext _ctx) {
		
		setMsacAppInstanceResponse.setRequestId(_ctx.stringValue("SetMsacAppInstanceResponse.RequestId"));
		setMsacAppInstanceResponse.setResultMessage(_ctx.stringValue("SetMsacAppInstanceResponse.ResultMessage"));
		setMsacAppInstanceResponse.setResultCode(_ctx.stringValue("SetMsacAppInstanceResponse.ResultCode"));

		ResultContent resultContent = new ResultContent();
		resultContent.setCode(_ctx.stringValue("SetMsacAppInstanceResponse.ResultContent.Code"));
		resultContent.setMessage(_ctx.stringValue("SetMsacAppInstanceResponse.ResultContent.Message"));
		resultContent.setData(_ctx.stringValue("SetMsacAppInstanceResponse.ResultContent.Data"));
		resultContent.setSuccess(_ctx.booleanValue("SetMsacAppInstanceResponse.ResultContent.Success"));
		setMsacAppInstanceResponse.setResultContent(resultContent);
	 
	 	return setMsacAppInstanceResponse;
	}
}