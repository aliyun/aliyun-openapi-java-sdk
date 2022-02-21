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

package com.aliyuncs.sae.transform.v20190506;

import com.aliyuncs.sae.model.v20190506.QueryResourceStaticsResponse;
import com.aliyuncs.sae.model.v20190506.QueryResourceStaticsResponse.Data;
import com.aliyuncs.sae.model.v20190506.QueryResourceStaticsResponse.Data.RealTimeRes;
import com.aliyuncs.sae.model.v20190506.QueryResourceStaticsResponse.Data.Summary;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryResourceStaticsResponseUnmarshaller {

	public static QueryResourceStaticsResponse unmarshall(QueryResourceStaticsResponse queryResourceStaticsResponse, UnmarshallerContext _ctx) {
		
		queryResourceStaticsResponse.setRequestId(_ctx.stringValue("QueryResourceStaticsResponse.RequestId"));
		queryResourceStaticsResponse.setMessage(_ctx.stringValue("QueryResourceStaticsResponse.Message"));
		queryResourceStaticsResponse.setTraceId(_ctx.stringValue("QueryResourceStaticsResponse.TraceId"));
		queryResourceStaticsResponse.setErrorCode(_ctx.stringValue("QueryResourceStaticsResponse.ErrorCode"));
		queryResourceStaticsResponse.setCode(_ctx.stringValue("QueryResourceStaticsResponse.Code"));
		queryResourceStaticsResponse.setSuccess(_ctx.booleanValue("QueryResourceStaticsResponse.Success"));

		Data data = new Data();
		data.setWorkload(_ctx.stringValue("QueryResourceStaticsResponse.Data.Workload"));

		Summary summary = new Summary();
		summary.setCpu(_ctx.floatValue("QueryResourceStaticsResponse.Data.Summary.Cpu"));
		summary.setMemory(_ctx.floatValue("QueryResourceStaticsResponse.Data.Summary.Memory"));
		data.setSummary(summary);

		RealTimeRes realTimeRes = new RealTimeRes();
		realTimeRes.setCpu(_ctx.floatValue("QueryResourceStaticsResponse.Data.RealTimeRes.Cpu"));
		realTimeRes.setMemory(_ctx.floatValue("QueryResourceStaticsResponse.Data.RealTimeRes.Memory"));
		data.setRealTimeRes(realTimeRes);
		queryResourceStaticsResponse.setData(data);
	 
	 	return queryResourceStaticsResponse;
	}
}