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

import com.aliyuncs.mpaas.model.v20201028.DeleteMsacAppByIdResponse;
import com.aliyuncs.mpaas.model.v20201028.DeleteMsacAppByIdResponse.ResultContent;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteMsacAppByIdResponseUnmarshaller {

	public static DeleteMsacAppByIdResponse unmarshall(DeleteMsacAppByIdResponse deleteMsacAppByIdResponse, UnmarshallerContext _ctx) {
		
		deleteMsacAppByIdResponse.setRequestId(_ctx.stringValue("DeleteMsacAppByIdResponse.RequestId"));
		deleteMsacAppByIdResponse.setResultMessage(_ctx.stringValue("DeleteMsacAppByIdResponse.ResultMessage"));
		deleteMsacAppByIdResponse.setResultCode(_ctx.stringValue("DeleteMsacAppByIdResponse.ResultCode"));

		ResultContent resultContent = new ResultContent();
		resultContent.setCode(_ctx.stringValue("DeleteMsacAppByIdResponse.ResultContent.Code"));
		resultContent.setMessage(_ctx.stringValue("DeleteMsacAppByIdResponse.ResultContent.Message"));
		resultContent.setData(_ctx.stringValue("DeleteMsacAppByIdResponse.ResultContent.Data"));
		resultContent.setSuccess(_ctx.booleanValue("DeleteMsacAppByIdResponse.ResultContent.Success"));
		deleteMsacAppByIdResponse.setResultContent(resultContent);
	 
	 	return deleteMsacAppByIdResponse;
	}
}