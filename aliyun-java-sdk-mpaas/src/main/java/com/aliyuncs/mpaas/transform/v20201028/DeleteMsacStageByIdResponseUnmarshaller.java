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

import com.aliyuncs.mpaas.model.v20201028.DeleteMsacStageByIdResponse;
import com.aliyuncs.mpaas.model.v20201028.DeleteMsacStageByIdResponse.ResultContent;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteMsacStageByIdResponseUnmarshaller {

	public static DeleteMsacStageByIdResponse unmarshall(DeleteMsacStageByIdResponse deleteMsacStageByIdResponse, UnmarshallerContext _ctx) {
		
		deleteMsacStageByIdResponse.setRequestId(_ctx.stringValue("DeleteMsacStageByIdResponse.RequestId"));
		deleteMsacStageByIdResponse.setResultMessage(_ctx.stringValue("DeleteMsacStageByIdResponse.ResultMessage"));
		deleteMsacStageByIdResponse.setResultCode(_ctx.stringValue("DeleteMsacStageByIdResponse.ResultCode"));

		ResultContent resultContent = new ResultContent();
		resultContent.setCode(_ctx.stringValue("DeleteMsacStageByIdResponse.ResultContent.Code"));
		resultContent.setMessage(_ctx.stringValue("DeleteMsacStageByIdResponse.ResultContent.Message"));
		resultContent.setData(_ctx.stringValue("DeleteMsacStageByIdResponse.ResultContent.Data"));
		resultContent.setSuccess(_ctx.booleanValue("DeleteMsacStageByIdResponse.ResultContent.Success"));
		deleteMsacStageByIdResponse.setResultContent(resultContent);
	 
	 	return deleteMsacStageByIdResponse;
	}
}