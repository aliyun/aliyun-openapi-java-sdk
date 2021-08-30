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

import com.aliyuncs.mpaas.model.v20201028.QueryPushAnalysisCoreIndexResponse;
import com.aliyuncs.mpaas.model.v20201028.QueryPushAnalysisCoreIndexResponse.ResultContent;
import com.aliyuncs.mpaas.model.v20201028.QueryPushAnalysisCoreIndexResponse.ResultContent.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryPushAnalysisCoreIndexResponseUnmarshaller {

	public static QueryPushAnalysisCoreIndexResponse unmarshall(QueryPushAnalysisCoreIndexResponse queryPushAnalysisCoreIndexResponse, UnmarshallerContext _ctx) {
		
		queryPushAnalysisCoreIndexResponse.setRequestId(_ctx.stringValue("QueryPushAnalysisCoreIndexResponse.RequestId"));
		queryPushAnalysisCoreIndexResponse.setResultCode(_ctx.stringValue("QueryPushAnalysisCoreIndexResponse.ResultCode"));
		queryPushAnalysisCoreIndexResponse.setResultMessage(_ctx.stringValue("QueryPushAnalysisCoreIndexResponse.ResultMessage"));

		ResultContent resultContent = new ResultContent();

		Data data = new Data();
		data.setArrivalNum(_ctx.floatValue("QueryPushAnalysisCoreIndexResponse.ResultContent.Data.ArrivalNum"));
		data.setArrivalRate(_ctx.floatValue("QueryPushAnalysisCoreIndexResponse.ResultContent.Data.ArrivalRate"));
		data.setIgnoreNum(_ctx.floatValue("QueryPushAnalysisCoreIndexResponse.ResultContent.Data.IgnoreNum"));
		data.setIgnoreRate(_ctx.floatValue("QueryPushAnalysisCoreIndexResponse.ResultContent.Data.IgnoreRate"));
		data.setOpenNum(_ctx.floatValue("QueryPushAnalysisCoreIndexResponse.ResultContent.Data.OpenNum"));
		data.setOpenRate(_ctx.floatValue("QueryPushAnalysisCoreIndexResponse.ResultContent.Data.OpenRate"));
		data.setPushNum(_ctx.floatValue("QueryPushAnalysisCoreIndexResponse.ResultContent.Data.PushNum"));
		data.setPushTotalNum(_ctx.floatValue("QueryPushAnalysisCoreIndexResponse.ResultContent.Data.PushTotalNum"));
		resultContent.setData(data);
		queryPushAnalysisCoreIndexResponse.setResultContent(resultContent);
	 
	 	return queryPushAnalysisCoreIndexResponse;
	}
}