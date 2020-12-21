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

import com.aliyuncs.mpaas.model.v20201028.DeleteMcdpAimResponse;
import com.aliyuncs.mpaas.model.v20201028.DeleteMcdpAimResponse.ResultContent;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteMcdpAimResponseUnmarshaller {

	public static DeleteMcdpAimResponse unmarshall(DeleteMcdpAimResponse deleteMcdpAimResponse, UnmarshallerContext _ctx) {
		
		deleteMcdpAimResponse.setRequestId(_ctx.stringValue("DeleteMcdpAimResponse.RequestId"));
		deleteMcdpAimResponse.setResultCode(_ctx.stringValue("DeleteMcdpAimResponse.ResultCode"));
		deleteMcdpAimResponse.setResultMessage(_ctx.stringValue("DeleteMcdpAimResponse.ResultMessage"));

		ResultContent resultContent = new ResultContent();
		resultContent.setCode(_ctx.stringValue("DeleteMcdpAimResponse.ResultContent.Code"));
		resultContent.setData(_ctx.stringValue("DeleteMcdpAimResponse.ResultContent.Data"));
		resultContent.setMessage(_ctx.stringValue("DeleteMcdpAimResponse.ResultContent.Message"));
		resultContent.setSuccess(_ctx.booleanValue("DeleteMcdpAimResponse.ResultContent.Success"));
		deleteMcdpAimResponse.setResultContent(resultContent);
	 
	 	return deleteMcdpAimResponse;
	}
}