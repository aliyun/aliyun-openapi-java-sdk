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

import com.aliyuncs.mpaas.model.v20201028.ListMcdpAimResponse;
import com.aliyuncs.mpaas.model.v20201028.ListMcdpAimResponse.ResultContent;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListMcdpAimResponseUnmarshaller {

	public static ListMcdpAimResponse unmarshall(ListMcdpAimResponse listMcdpAimResponse, UnmarshallerContext _ctx) {
		
		listMcdpAimResponse.setRequestId(_ctx.stringValue("ListMcdpAimResponse.RequestId"));
		listMcdpAimResponse.setResultCode(_ctx.stringValue("ListMcdpAimResponse.ResultCode"));
		listMcdpAimResponse.setResultMessage(_ctx.stringValue("ListMcdpAimResponse.ResultMessage"));

		ResultContent resultContent = new ResultContent();
		resultContent.setCode(_ctx.stringValue("ListMcdpAimResponse.ResultContent.Code"));
		resultContent.setData(_ctx.stringValue("ListMcdpAimResponse.ResultContent.Data"));
		resultContent.setMessage(_ctx.stringValue("ListMcdpAimResponse.ResultContent.Message"));
		resultContent.setSuccess(_ctx.booleanValue("ListMcdpAimResponse.ResultContent.Success"));
		listMcdpAimResponse.setResultContent(resultContent);
	 
	 	return listMcdpAimResponse;
	}
}