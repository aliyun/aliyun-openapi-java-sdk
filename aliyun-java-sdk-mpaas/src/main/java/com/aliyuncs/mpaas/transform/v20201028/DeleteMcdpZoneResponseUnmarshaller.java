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

import com.aliyuncs.mpaas.model.v20201028.DeleteMcdpZoneResponse;
import com.aliyuncs.mpaas.model.v20201028.DeleteMcdpZoneResponse.ResultContent;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteMcdpZoneResponseUnmarshaller {

	public static DeleteMcdpZoneResponse unmarshall(DeleteMcdpZoneResponse deleteMcdpZoneResponse, UnmarshallerContext _ctx) {
		
		deleteMcdpZoneResponse.setRequestId(_ctx.stringValue("DeleteMcdpZoneResponse.RequestId"));
		deleteMcdpZoneResponse.setResultCode(_ctx.stringValue("DeleteMcdpZoneResponse.ResultCode"));
		deleteMcdpZoneResponse.setResultMessage(_ctx.stringValue("DeleteMcdpZoneResponse.ResultMessage"));

		ResultContent resultContent = new ResultContent();
		resultContent.setCode(_ctx.stringValue("DeleteMcdpZoneResponse.ResultContent.Code"));
		resultContent.setData(_ctx.stringValue("DeleteMcdpZoneResponse.ResultContent.Data"));
		resultContent.setMessage(_ctx.stringValue("DeleteMcdpZoneResponse.ResultContent.Message"));
		resultContent.setSuccess(_ctx.booleanValue("DeleteMcdpZoneResponse.ResultContent.Success"));
		deleteMcdpZoneResponse.setResultContent(resultContent);
	 
	 	return deleteMcdpZoneResponse;
	}
}