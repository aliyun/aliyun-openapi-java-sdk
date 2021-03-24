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

import com.aliyuncs.mpaas.model.v20201028.CreateMcdpMaterialResponse;
import com.aliyuncs.mpaas.model.v20201028.CreateMcdpMaterialResponse.ResultContent;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateMcdpMaterialResponseUnmarshaller {

	public static CreateMcdpMaterialResponse unmarshall(CreateMcdpMaterialResponse createMcdpMaterialResponse, UnmarshallerContext _ctx) {
		
		createMcdpMaterialResponse.setRequestId(_ctx.stringValue("CreateMcdpMaterialResponse.RequestId"));
		createMcdpMaterialResponse.setResultCode(_ctx.stringValue("CreateMcdpMaterialResponse.ResultCode"));
		createMcdpMaterialResponse.setResultMessage(_ctx.stringValue("CreateMcdpMaterialResponse.ResultMessage"));

		ResultContent resultContent = new ResultContent();
		resultContent.setCode(_ctx.stringValue("CreateMcdpMaterialResponse.ResultContent.Code"));
		resultContent.setData(_ctx.stringValue("CreateMcdpMaterialResponse.ResultContent.Data"));
		resultContent.setMessage(_ctx.stringValue("CreateMcdpMaterialResponse.ResultContent.Message"));
		resultContent.setSuccess(_ctx.booleanValue("CreateMcdpMaterialResponse.ResultContent.Success"));
		createMcdpMaterialResponse.setResultContent(resultContent);
	 
	 	return createMcdpMaterialResponse;
	}
}