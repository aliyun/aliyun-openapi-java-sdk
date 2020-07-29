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

import com.aliyuncs.mpaas.model.v20190821.QueryMPaaSMasTinyAppHistoryDataResponse;
import com.aliyuncs.mpaas.model.v20190821.QueryMPaaSMasTinyAppHistoryDataResponse.ResultContent;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryMPaaSMasTinyAppHistoryDataResponseUnmarshaller {

	public static QueryMPaaSMasTinyAppHistoryDataResponse unmarshall(QueryMPaaSMasTinyAppHistoryDataResponse queryMPaaSMasTinyAppHistoryDataResponse, UnmarshallerContext _ctx) {
		
		queryMPaaSMasTinyAppHistoryDataResponse.setRequestId(_ctx.stringValue("QueryMPaaSMasTinyAppHistoryDataResponse.RequestId"));
		queryMPaaSMasTinyAppHistoryDataResponse.setResultCode(_ctx.stringValue("QueryMPaaSMasTinyAppHistoryDataResponse.ResultCode"));
		queryMPaaSMasTinyAppHistoryDataResponse.setResultMessage(_ctx.stringValue("QueryMPaaSMasTinyAppHistoryDataResponse.ResultMessage"));

		ResultContent resultContent = new ResultContent();
		resultContent.setCode(_ctx.longValue("QueryMPaaSMasTinyAppHistoryDataResponse.ResultContent.Code"));
		resultContent.setData(_ctx.stringValue("QueryMPaaSMasTinyAppHistoryDataResponse.ResultContent.Data"));
		resultContent.setMsg(_ctx.stringValue("QueryMPaaSMasTinyAppHistoryDataResponse.ResultContent.Msg"));
		queryMPaaSMasTinyAppHistoryDataResponse.setResultContent(resultContent);
	 
	 	return queryMPaaSMasTinyAppHistoryDataResponse;
	}
}