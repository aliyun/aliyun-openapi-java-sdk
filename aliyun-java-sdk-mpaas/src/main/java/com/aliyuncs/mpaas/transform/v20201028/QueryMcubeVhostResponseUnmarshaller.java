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

import com.aliyuncs.mpaas.model.v20201028.QueryMcubeVhostResponse;
import com.aliyuncs.mpaas.model.v20201028.QueryMcubeVhostResponse.QueryVhostResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryMcubeVhostResponseUnmarshaller {

	public static QueryMcubeVhostResponse unmarshall(QueryMcubeVhostResponse queryMcubeVhostResponse, UnmarshallerContext _ctx) {
		
		queryMcubeVhostResponse.setRequestId(_ctx.stringValue("QueryMcubeVhostResponse.RequestId"));
		queryMcubeVhostResponse.setResultMessage(_ctx.stringValue("QueryMcubeVhostResponse.ResultMessage"));
		queryMcubeVhostResponse.setResultCode(_ctx.stringValue("QueryMcubeVhostResponse.ResultCode"));

		QueryVhostResult queryVhostResult = new QueryVhostResult();
		queryVhostResult.setData(_ctx.stringValue("QueryMcubeVhostResponse.QueryVhostResult.Data"));
		queryVhostResult.setSuccess(_ctx.booleanValue("QueryMcubeVhostResponse.QueryVhostResult.Success"));
		queryVhostResult.setResultMsg(_ctx.stringValue("QueryMcubeVhostResponse.QueryVhostResult.ResultMsg"));
		queryMcubeVhostResponse.setQueryVhostResult(queryVhostResult);
	 
	 	return queryMcubeVhostResponse;
	}
}