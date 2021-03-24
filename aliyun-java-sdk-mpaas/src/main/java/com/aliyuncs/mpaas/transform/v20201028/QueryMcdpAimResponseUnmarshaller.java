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

import com.aliyuncs.mpaas.model.v20201028.QueryMcdpAimResponse;
import com.aliyuncs.mpaas.model.v20201028.QueryMcdpAimResponse.ResultContent;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryMcdpAimResponseUnmarshaller {

	public static QueryMcdpAimResponse unmarshall(QueryMcdpAimResponse queryMcdpAimResponse, UnmarshallerContext _ctx) {
		
		queryMcdpAimResponse.setRequestId(_ctx.stringValue("QueryMcdpAimResponse.RequestId"));
		queryMcdpAimResponse.setResultCode(_ctx.stringValue("QueryMcdpAimResponse.ResultCode"));
		queryMcdpAimResponse.setResultMessage(_ctx.stringValue("QueryMcdpAimResponse.ResultMessage"));

		ResultContent resultContent = new ResultContent();
		resultContent.setCode(_ctx.stringValue("QueryMcdpAimResponse.ResultContent.Code"));
		resultContent.setData(_ctx.stringValue("QueryMcdpAimResponse.ResultContent.Data"));
		resultContent.setMessage(_ctx.stringValue("QueryMcdpAimResponse.ResultContent.Message"));
		resultContent.setSuccess(_ctx.booleanValue("QueryMcdpAimResponse.ResultContent.Success"));
		queryMcdpAimResponse.setResultContent(resultContent);
	 
	 	return queryMcdpAimResponse;
	}
}