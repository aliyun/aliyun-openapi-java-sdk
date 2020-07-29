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

package com.aliyuncs.mpaas.transform.v20190821;

import com.aliyuncs.mpaas.model.v20190821.QueryMPaaSMasTinyAppDailyPageViewResponse;
import com.aliyuncs.mpaas.model.v20190821.QueryMPaaSMasTinyAppDailyPageViewResponse.ResultContent;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryMPaaSMasTinyAppDailyPageViewResponseUnmarshaller {

	public static QueryMPaaSMasTinyAppDailyPageViewResponse unmarshall(QueryMPaaSMasTinyAppDailyPageViewResponse queryMPaaSMasTinyAppDailyPageViewResponse, UnmarshallerContext _ctx) {
		
		queryMPaaSMasTinyAppDailyPageViewResponse.setRequestId(_ctx.stringValue("QueryMPaaSMasTinyAppDailyPageViewResponse.RequestId"));
		queryMPaaSMasTinyAppDailyPageViewResponse.setResultCode(_ctx.stringValue("QueryMPaaSMasTinyAppDailyPageViewResponse.ResultCode"));
		queryMPaaSMasTinyAppDailyPageViewResponse.setResultMessage(_ctx.stringValue("QueryMPaaSMasTinyAppDailyPageViewResponse.ResultMessage"));

		ResultContent resultContent = new ResultContent();
		resultContent.setCode(_ctx.longValue("QueryMPaaSMasTinyAppDailyPageViewResponse.ResultContent.Code"));
		resultContent.setData(_ctx.stringValue("QueryMPaaSMasTinyAppDailyPageViewResponse.ResultContent.Data"));
		resultContent.setMsg(_ctx.stringValue("QueryMPaaSMasTinyAppDailyPageViewResponse.ResultContent.Msg"));
		queryMPaaSMasTinyAppDailyPageViewResponse.setResultContent(resultContent);
	 
	 	return queryMPaaSMasTinyAppDailyPageViewResponse;
	}
}