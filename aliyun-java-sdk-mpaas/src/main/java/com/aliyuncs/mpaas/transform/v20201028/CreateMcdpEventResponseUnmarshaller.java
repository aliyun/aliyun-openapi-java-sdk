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

import com.aliyuncs.mpaas.model.v20201028.CreateMcdpEventResponse;
import com.aliyuncs.mpaas.model.v20201028.CreateMcdpEventResponse.ResultContent;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateMcdpEventResponseUnmarshaller {

	public static CreateMcdpEventResponse unmarshall(CreateMcdpEventResponse createMcdpEventResponse, UnmarshallerContext _ctx) {
		
		createMcdpEventResponse.setRequestId(_ctx.stringValue("CreateMcdpEventResponse.RequestId"));
		createMcdpEventResponse.setResultMessage(_ctx.stringValue("CreateMcdpEventResponse.ResultMessage"));
		createMcdpEventResponse.setResultCode(_ctx.stringValue("CreateMcdpEventResponse.ResultCode"));

		ResultContent resultContent = new ResultContent();
		resultContent.setCode(_ctx.stringValue("CreateMcdpEventResponse.ResultContent.Code"));
		resultContent.setMessage(_ctx.stringValue("CreateMcdpEventResponse.ResultContent.Message"));
		resultContent.setData(_ctx.stringValue("CreateMcdpEventResponse.ResultContent.Data"));
		resultContent.setSuccess(_ctx.booleanValue("CreateMcdpEventResponse.ResultContent.Success"));
		createMcdpEventResponse.setResultContent(resultContent);
	 
	 	return createMcdpEventResponse;
	}
}