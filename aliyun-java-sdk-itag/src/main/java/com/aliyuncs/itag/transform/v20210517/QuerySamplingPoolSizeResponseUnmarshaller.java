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

package com.aliyuncs.itag.transform.v20210517;

import com.aliyuncs.itag.model.v20210517.QuerySamplingPoolSizeResponse;
import com.aliyuncs.itag.model.v20210517.QuerySamplingPoolSizeResponse.Result;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class QuerySamplingPoolSizeResponseUnmarshaller {

	public static QuerySamplingPoolSizeResponse unmarshall(QuerySamplingPoolSizeResponse querySamplingPoolSizeResponse, UnmarshallerContext _ctx) {
		
		querySamplingPoolSizeResponse.setRequestId(_ctx.stringValue("QuerySamplingPoolSizeResponse.RequestId"));
		querySamplingPoolSizeResponse.setCode(_ctx.stringValue("QuerySamplingPoolSizeResponse.Code"));
		querySamplingPoolSizeResponse.setErrInfo(_ctx.stringValue("QuerySamplingPoolSizeResponse.ErrInfo"));
		querySamplingPoolSizeResponse.setMsg(_ctx.stringValue("QuerySamplingPoolSizeResponse.Msg"));
		querySamplingPoolSizeResponse.setSucc(_ctx.booleanValue("QuerySamplingPoolSizeResponse.Succ"));
		querySamplingPoolSizeResponse.setErrorCode(_ctx.stringValue("QuerySamplingPoolSizeResponse.ErrorCode"));

		Result result = new Result();
		result.setHasNonCompleteTask(_ctx.integerValue("QuerySamplingPoolSizeResponse.Result.HasNonCompleteTask"));
		result.setTotalSubTaskCount(_ctx.stringValue("QuerySamplingPoolSizeResponse.Result.TotalSubTaskCount"));
		result.setTotalMarkItemCount(_ctx.stringValue("QuerySamplingPoolSizeResponse.Result.TotalMarkItemCount"));
		result.setSubTaskAndMarkItemMap(_ctx.mapValue("QuerySamplingPoolSizeResponse.Result.SubTaskAndMarkItemMap"));
		querySamplingPoolSizeResponse.setResult(result);
	 
	 	return querySamplingPoolSizeResponse;
	}
}