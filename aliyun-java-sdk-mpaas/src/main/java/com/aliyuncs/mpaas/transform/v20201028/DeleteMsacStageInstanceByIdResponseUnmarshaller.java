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

import com.aliyuncs.mpaas.model.v20201028.DeleteMsacStageInstanceByIdResponse;
import com.aliyuncs.mpaas.model.v20201028.DeleteMsacStageInstanceByIdResponse.ResultContent;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteMsacStageInstanceByIdResponseUnmarshaller {

	public static DeleteMsacStageInstanceByIdResponse unmarshall(DeleteMsacStageInstanceByIdResponse deleteMsacStageInstanceByIdResponse, UnmarshallerContext _ctx) {
		
		deleteMsacStageInstanceByIdResponse.setRequestId(_ctx.stringValue("DeleteMsacStageInstanceByIdResponse.RequestId"));
		deleteMsacStageInstanceByIdResponse.setResultMessage(_ctx.stringValue("DeleteMsacStageInstanceByIdResponse.ResultMessage"));
		deleteMsacStageInstanceByIdResponse.setResultCode(_ctx.stringValue("DeleteMsacStageInstanceByIdResponse.ResultCode"));

		ResultContent resultContent = new ResultContent();
		resultContent.setCode(_ctx.stringValue("DeleteMsacStageInstanceByIdResponse.ResultContent.Code"));
		resultContent.setMessage(_ctx.stringValue("DeleteMsacStageInstanceByIdResponse.ResultContent.Message"));
		resultContent.setData(_ctx.stringValue("DeleteMsacStageInstanceByIdResponse.ResultContent.Data"));
		resultContent.setSuccess(_ctx.booleanValue("DeleteMsacStageInstanceByIdResponse.ResultContent.Success"));
		deleteMsacStageInstanceByIdResponse.setResultContent(resultContent);
	 
	 	return deleteMsacStageInstanceByIdResponse;
	}
}