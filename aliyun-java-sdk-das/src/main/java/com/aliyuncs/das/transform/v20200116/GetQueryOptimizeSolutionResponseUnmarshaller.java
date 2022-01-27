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

package com.aliyuncs.das.transform.v20200116;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.das.model.v20200116.GetQueryOptimizeSolutionResponse;
import com.aliyuncs.das.model.v20200116.GetQueryOptimizeSolutionResponse.Data;
import com.aliyuncs.das.model.v20200116.GetQueryOptimizeSolutionResponse.Data.QueryOptimizeSolutions;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetQueryOptimizeSolutionResponseUnmarshaller {

	public static GetQueryOptimizeSolutionResponse unmarshall(GetQueryOptimizeSolutionResponse getQueryOptimizeSolutionResponse, UnmarshallerContext _ctx) {
		
		getQueryOptimizeSolutionResponse.setRequestId(_ctx.stringValue("GetQueryOptimizeSolutionResponse.RequestId"));
		getQueryOptimizeSolutionResponse.setCode(_ctx.stringValue("GetQueryOptimizeSolutionResponse.Code"));
		getQueryOptimizeSolutionResponse.setMessage(_ctx.stringValue("GetQueryOptimizeSolutionResponse.Message"));
		getQueryOptimizeSolutionResponse.setSuccess(_ctx.stringValue("GetQueryOptimizeSolutionResponse.Success"));

		Data data = new Data();
		data.setTotal(_ctx.longValue("GetQueryOptimizeSolutionResponse.Data.Total"));
		data.setPageNo(_ctx.integerValue("GetQueryOptimizeSolutionResponse.Data.PageNo"));
		data.setPageSize(_ctx.integerValue("GetQueryOptimizeSolutionResponse.Data.PageSize"));
		data.setExtra(_ctx.stringValue("GetQueryOptimizeSolutionResponse.Data.Extra"));

		List<QueryOptimizeSolutions> list = new ArrayList<QueryOptimizeSolutions>();
		for (int i = 0; i < _ctx.lengthValue("GetQueryOptimizeSolutionResponse.Data.List.Length"); i++) {
			QueryOptimizeSolutions queryOptimizeSolutions = new QueryOptimizeSolutions();
			queryOptimizeSolutions.setLevel(_ctx.stringValue("GetQueryOptimizeSolutionResponse.Data.List["+ i +"].Level"));
			queryOptimizeSolutions.setRuleId(_ctx.stringValue("GetQueryOptimizeSolutionResponse.Data.List["+ i +"].RuleId"));
			queryOptimizeSolutions.setSolution(_ctx.stringValue("GetQueryOptimizeSolutionResponse.Data.List["+ i +"].Solution"));
			queryOptimizeSolutions.setSolutionExt(_ctx.stringValue("GetQueryOptimizeSolutionResponse.Data.List["+ i +"].SolutionExt"));

			list.add(queryOptimizeSolutions);
		}
		data.setList(list);
		getQueryOptimizeSolutionResponse.setData(data);
	 
	 	return getQueryOptimizeSolutionResponse;
	}
}