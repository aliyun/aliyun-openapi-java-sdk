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

import com.aliyuncs.mpaas.model.v20201028.QueryMcdpZoneResponse;
import com.aliyuncs.mpaas.model.v20201028.QueryMcdpZoneResponse.ResultContent;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryMcdpZoneResponseUnmarshaller {

	public static QueryMcdpZoneResponse unmarshall(QueryMcdpZoneResponse queryMcdpZoneResponse, UnmarshallerContext _ctx) {
		
		queryMcdpZoneResponse.setRequestId(_ctx.stringValue("QueryMcdpZoneResponse.RequestId"));
		queryMcdpZoneResponse.setResultCode(_ctx.stringValue("QueryMcdpZoneResponse.ResultCode"));
		queryMcdpZoneResponse.setResultMessage(_ctx.stringValue("QueryMcdpZoneResponse.ResultMessage"));

		ResultContent resultContent = new ResultContent();
		resultContent.setCode(_ctx.stringValue("QueryMcdpZoneResponse.ResultContent.Code"));
		resultContent.setData(_ctx.stringValue("QueryMcdpZoneResponse.ResultContent.Data"));
		resultContent.setMessage(_ctx.stringValue("QueryMcdpZoneResponse.ResultContent.Message"));
		resultContent.setSuccess(_ctx.booleanValue("QueryMcdpZoneResponse.ResultContent.Success"));
		queryMcdpZoneResponse.setResultContent(resultContent);
	 
	 	return queryMcdpZoneResponse;
	}
}