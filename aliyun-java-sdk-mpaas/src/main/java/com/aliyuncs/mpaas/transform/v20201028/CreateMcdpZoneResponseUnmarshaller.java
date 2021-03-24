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

import com.aliyuncs.mpaas.model.v20201028.CreateMcdpZoneResponse;
import com.aliyuncs.mpaas.model.v20201028.CreateMcdpZoneResponse.ResultContent;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateMcdpZoneResponseUnmarshaller {

	public static CreateMcdpZoneResponse unmarshall(CreateMcdpZoneResponse createMcdpZoneResponse, UnmarshallerContext _ctx) {
		
		createMcdpZoneResponse.setRequestId(_ctx.stringValue("CreateMcdpZoneResponse.RequestId"));
		createMcdpZoneResponse.setResultCode(_ctx.stringValue("CreateMcdpZoneResponse.ResultCode"));
		createMcdpZoneResponse.setResultMessage(_ctx.stringValue("CreateMcdpZoneResponse.ResultMessage"));

		ResultContent resultContent = new ResultContent();
		resultContent.setCode(_ctx.stringValue("CreateMcdpZoneResponse.ResultContent.Code"));
		resultContent.setData(_ctx.stringValue("CreateMcdpZoneResponse.ResultContent.Data"));
		resultContent.setMessage(_ctx.stringValue("CreateMcdpZoneResponse.ResultContent.Message"));
		resultContent.setSuccess(_ctx.booleanValue("CreateMcdpZoneResponse.ResultContent.Success"));
		createMcdpZoneResponse.setResultContent(resultContent);
	 
	 	return createMcdpZoneResponse;
	}
}