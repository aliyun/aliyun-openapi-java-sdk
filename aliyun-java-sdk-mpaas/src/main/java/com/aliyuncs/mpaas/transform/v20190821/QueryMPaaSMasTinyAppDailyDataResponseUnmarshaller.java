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

import com.aliyuncs.mpaas.model.v20190821.QueryMPaaSMasTinyAppDailyDataResponse;
import com.aliyuncs.mpaas.model.v20190821.QueryMPaaSMasTinyAppDailyDataResponse.ResultContent;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryMPaaSMasTinyAppDailyDataResponseUnmarshaller {

	public static QueryMPaaSMasTinyAppDailyDataResponse unmarshall(QueryMPaaSMasTinyAppDailyDataResponse queryMPaaSMasTinyAppDailyDataResponse, UnmarshallerContext _ctx) {
		
		queryMPaaSMasTinyAppDailyDataResponse.setRequestId(_ctx.stringValue("QueryMPaaSMasTinyAppDailyDataResponse.RequestId"));
		queryMPaaSMasTinyAppDailyDataResponse.setResultCode(_ctx.stringValue("QueryMPaaSMasTinyAppDailyDataResponse.ResultCode"));
		queryMPaaSMasTinyAppDailyDataResponse.setResultMessage(_ctx.stringValue("QueryMPaaSMasTinyAppDailyDataResponse.ResultMessage"));

		ResultContent resultContent = new ResultContent();
		resultContent.setCode(_ctx.longValue("QueryMPaaSMasTinyAppDailyDataResponse.ResultContent.Code"));
		resultContent.setData(_ctx.stringValue("QueryMPaaSMasTinyAppDailyDataResponse.ResultContent.Data"));
		resultContent.setMsg(_ctx.stringValue("QueryMPaaSMasTinyAppDailyDataResponse.ResultContent.Msg"));
		queryMPaaSMasTinyAppDailyDataResponse.setResultContent(resultContent);
	 
	 	return queryMPaaSMasTinyAppDailyDataResponse;
	}
}