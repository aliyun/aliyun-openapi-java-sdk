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

import com.aliyuncs.mpaas.model.v20201028.DeleteMcdpEventByIdResponse;
import com.aliyuncs.mpaas.model.v20201028.DeleteMcdpEventByIdResponse.ResultContent;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteMcdpEventByIdResponseUnmarshaller {

	public static DeleteMcdpEventByIdResponse unmarshall(DeleteMcdpEventByIdResponse deleteMcdpEventByIdResponse, UnmarshallerContext _ctx) {
		
		deleteMcdpEventByIdResponse.setRequestId(_ctx.stringValue("DeleteMcdpEventByIdResponse.RequestId"));
		deleteMcdpEventByIdResponse.setResultMessage(_ctx.stringValue("DeleteMcdpEventByIdResponse.ResultMessage"));
		deleteMcdpEventByIdResponse.setResultCode(_ctx.stringValue("DeleteMcdpEventByIdResponse.ResultCode"));

		ResultContent resultContent = new ResultContent();
		resultContent.setCode(_ctx.stringValue("DeleteMcdpEventByIdResponse.ResultContent.Code"));
		resultContent.setMessage(_ctx.stringValue("DeleteMcdpEventByIdResponse.ResultContent.Message"));
		resultContent.setData(_ctx.stringValue("DeleteMcdpEventByIdResponse.ResultContent.Data"));
		resultContent.setSuccess(_ctx.booleanValue("DeleteMcdpEventByIdResponse.ResultContent.Success"));
		deleteMcdpEventByIdResponse.setResultContent(resultContent);
	 
	 	return deleteMcdpEventByIdResponse;
	}
}