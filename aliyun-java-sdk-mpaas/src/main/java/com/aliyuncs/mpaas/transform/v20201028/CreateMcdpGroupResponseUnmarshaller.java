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

import com.aliyuncs.mpaas.model.v20201028.CreateMcdpGroupResponse;
import com.aliyuncs.mpaas.model.v20201028.CreateMcdpGroupResponse.ResultContent;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateMcdpGroupResponseUnmarshaller {

	public static CreateMcdpGroupResponse unmarshall(CreateMcdpGroupResponse createMcdpGroupResponse, UnmarshallerContext _ctx) {
		
		createMcdpGroupResponse.setRequestId(_ctx.stringValue("CreateMcdpGroupResponse.RequestId"));
		createMcdpGroupResponse.setResultMessage(_ctx.stringValue("CreateMcdpGroupResponse.ResultMessage"));
		createMcdpGroupResponse.setResultCode(_ctx.stringValue("CreateMcdpGroupResponse.ResultCode"));

		ResultContent resultContent = new ResultContent();
		resultContent.setCode(_ctx.stringValue("CreateMcdpGroupResponse.ResultContent.Code"));
		resultContent.setMessage(_ctx.stringValue("CreateMcdpGroupResponse.ResultContent.Message"));
		resultContent.setData(_ctx.stringValue("CreateMcdpGroupResponse.ResultContent.Data"));
		resultContent.setSuccess(_ctx.booleanValue("CreateMcdpGroupResponse.ResultContent.Success"));
		createMcdpGroupResponse.setResultContent(resultContent);
	 
	 	return createMcdpGroupResponse;
	}
}