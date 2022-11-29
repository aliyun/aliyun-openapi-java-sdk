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

import com.aliyuncs.mpaas.model.v20201028.DeleteMcdpEventAttributeByIdResponse;
import com.aliyuncs.mpaas.model.v20201028.DeleteMcdpEventAttributeByIdResponse.ResultContent;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteMcdpEventAttributeByIdResponseUnmarshaller {

	public static DeleteMcdpEventAttributeByIdResponse unmarshall(DeleteMcdpEventAttributeByIdResponse deleteMcdpEventAttributeByIdResponse, UnmarshallerContext _ctx) {
		
		deleteMcdpEventAttributeByIdResponse.setRequestId(_ctx.stringValue("DeleteMcdpEventAttributeByIdResponse.RequestId"));
		deleteMcdpEventAttributeByIdResponse.setResultMessage(_ctx.stringValue("DeleteMcdpEventAttributeByIdResponse.ResultMessage"));
		deleteMcdpEventAttributeByIdResponse.setResultCode(_ctx.stringValue("DeleteMcdpEventAttributeByIdResponse.ResultCode"));

		ResultContent resultContent = new ResultContent();
		resultContent.setCode(_ctx.stringValue("DeleteMcdpEventAttributeByIdResponse.ResultContent.Code"));
		resultContent.setMessage(_ctx.stringValue("DeleteMcdpEventAttributeByIdResponse.ResultContent.Message"));
		resultContent.setData(_ctx.stringValue("DeleteMcdpEventAttributeByIdResponse.ResultContent.Data"));
		resultContent.setSuccess(_ctx.booleanValue("DeleteMcdpEventAttributeByIdResponse.ResultContent.Success"));
		deleteMcdpEventAttributeByIdResponse.setResultContent(resultContent);
	 
	 	return deleteMcdpEventAttributeByIdResponse;
	}
}