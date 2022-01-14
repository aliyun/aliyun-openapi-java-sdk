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

import com.aliyuncs.mpaas.model.v20201028.DeleteMsacAppInstanceByIdResponse;
import com.aliyuncs.mpaas.model.v20201028.DeleteMsacAppInstanceByIdResponse.ResultContent;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteMsacAppInstanceByIdResponseUnmarshaller {

	public static DeleteMsacAppInstanceByIdResponse unmarshall(DeleteMsacAppInstanceByIdResponse deleteMsacAppInstanceByIdResponse, UnmarshallerContext _ctx) {
		
		deleteMsacAppInstanceByIdResponse.setRequestId(_ctx.stringValue("DeleteMsacAppInstanceByIdResponse.RequestId"));
		deleteMsacAppInstanceByIdResponse.setResultMessage(_ctx.stringValue("DeleteMsacAppInstanceByIdResponse.ResultMessage"));
		deleteMsacAppInstanceByIdResponse.setResultCode(_ctx.stringValue("DeleteMsacAppInstanceByIdResponse.ResultCode"));

		ResultContent resultContent = new ResultContent();
		resultContent.setCode(_ctx.stringValue("DeleteMsacAppInstanceByIdResponse.ResultContent.Code"));
		resultContent.setMessage(_ctx.stringValue("DeleteMsacAppInstanceByIdResponse.ResultContent.Message"));
		resultContent.setData(_ctx.stringValue("DeleteMsacAppInstanceByIdResponse.ResultContent.Data"));
		resultContent.setSuccess(_ctx.booleanValue("DeleteMsacAppInstanceByIdResponse.ResultContent.Success"));
		deleteMsacAppInstanceByIdResponse.setResultContent(resultContent);
	 
	 	return deleteMsacAppInstanceByIdResponse;
	}
}