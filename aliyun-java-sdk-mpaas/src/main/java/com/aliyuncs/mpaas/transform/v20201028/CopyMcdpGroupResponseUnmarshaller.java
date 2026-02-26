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

import com.aliyuncs.mpaas.model.v20201028.CopyMcdpGroupResponse;
import com.aliyuncs.mpaas.model.v20201028.CopyMcdpGroupResponse.ResultContent;
import com.aliyuncs.transform.UnmarshallerContext;


public class CopyMcdpGroupResponseUnmarshaller {

	public static CopyMcdpGroupResponse unmarshall(CopyMcdpGroupResponse copyMcdpGroupResponse, UnmarshallerContext _ctx) {
		
		copyMcdpGroupResponse.setRequestId(_ctx.stringValue("CopyMcdpGroupResponse.RequestId"));
		copyMcdpGroupResponse.setResultMessage(_ctx.stringValue("CopyMcdpGroupResponse.ResultMessage"));
		copyMcdpGroupResponse.setResultCode(_ctx.stringValue("CopyMcdpGroupResponse.ResultCode"));

		ResultContent resultContent = new ResultContent();
		resultContent.setCode(_ctx.stringValue("CopyMcdpGroupResponse.ResultContent.Code"));
		resultContent.setMessage(_ctx.stringValue("CopyMcdpGroupResponse.ResultContent.Message"));
		resultContent.setData(_ctx.stringValue("CopyMcdpGroupResponse.ResultContent.Data"));
		resultContent.setSuccess(_ctx.booleanValue("CopyMcdpGroupResponse.ResultContent.Success"));
		copyMcdpGroupResponse.setResultContent(resultContent);
	 
	 	return copyMcdpGroupResponse;
	}
}