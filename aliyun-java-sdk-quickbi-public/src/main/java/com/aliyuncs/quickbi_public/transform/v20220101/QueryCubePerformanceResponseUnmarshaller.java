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

package com.aliyuncs.quickbi_public.transform.v20220101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.quickbi_public.model.v20220101.QueryCubePerformanceResponse;
import com.aliyuncs.quickbi_public.model.v20220101.QueryCubePerformanceResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryCubePerformanceResponseUnmarshaller {

	public static QueryCubePerformanceResponse unmarshall(QueryCubePerformanceResponse queryCubePerformanceResponse, UnmarshallerContext _ctx) {
		
		queryCubePerformanceResponse.setRequestId(_ctx.stringValue("QueryCubePerformanceResponse.RequestId"));
		queryCubePerformanceResponse.setSuccess(_ctx.booleanValue("QueryCubePerformanceResponse.Success"));

		List<Data> result = new ArrayList<Data>();
		for (int i = 0; i < _ctx.lengthValue("QueryCubePerformanceResponse.Result.Length"); i++) {
			Data data = new Data();
			data.setCacheCostTimeAvg(_ctx.doubleValue("QueryCubePerformanceResponse.Result["+ i +"].CacheCostTimeAvg"));
			data.setCacheQueryCount(_ctx.integerValue("QueryCubePerformanceResponse.Result["+ i +"].CacheQueryCount"));
			data.setCostTimeAvg(_ctx.doubleValue("QueryCubePerformanceResponse.Result["+ i +"].CostTimeAvg"));
			data.setCubeId(_ctx.stringValue("QueryCubePerformanceResponse.Result["+ i +"].CubeId"));
			data.setCubeName(_ctx.stringValue("QueryCubePerformanceResponse.Result["+ i +"].CubeName"));
			data.setQueryCount(_ctx.integerValue("QueryCubePerformanceResponse.Result["+ i +"].QueryCount"));
			data.setQueryCountAvg(_ctx.doubleValue("QueryCubePerformanceResponse.Result["+ i +"].QueryCountAvg"));
			data.setQueryOverFivePercentNum(_ctx.doubleValue("QueryCubePerformanceResponse.Result["+ i +"].QueryOverFivePercentNum"));
			data.setQueryOverFiveSecPercent(_ctx.stringValue("QueryCubePerformanceResponse.Result["+ i +"].QueryOverFiveSecPercent"));
			data.setQueryOverTenSecPercent(_ctx.stringValue("QueryCubePerformanceResponse.Result["+ i +"].QueryOverTenSecPercent"));
			data.setQueryOverTenSecPercentNum(_ctx.doubleValue("QueryCubePerformanceResponse.Result["+ i +"].QueryOverTenSecPercentNum"));
			data.setQueryTimeoutCount(_ctx.integerValue("QueryCubePerformanceResponse.Result["+ i +"].QueryTimeoutCount"));
			data.setQueryTimeoutCountPercent(_ctx.doubleValue("QueryCubePerformanceResponse.Result["+ i +"].QueryTimeoutCountPercent"));
			data.setQuickIndexCostTimeAvg(_ctx.doubleValue("QueryCubePerformanceResponse.Result["+ i +"].QuickIndexCostTimeAvg"));
			data.setQuickIndexQueryCount(_ctx.integerValue("QueryCubePerformanceResponse.Result["+ i +"].QuickIndexQueryCount"));
			data.setRepeatQueryPercent(_ctx.stringValue("QueryCubePerformanceResponse.Result["+ i +"].RepeatQueryPercent"));
			data.setRepeatQueryPercentNum(_ctx.doubleValue("QueryCubePerformanceResponse.Result["+ i +"].RepeatQueryPercentNum"));
			data.setRepeatSqlQueryCount(_ctx.integerValue("QueryCubePerformanceResponse.Result["+ i +"].RepeatSqlQueryCount"));
			data.setRepeatSqlQueryPercent(_ctx.stringValue("QueryCubePerformanceResponse.Result["+ i +"].RepeatSqlQueryPercent"));
			data.setWorkspaceId(_ctx.stringValue("QueryCubePerformanceResponse.Result["+ i +"].WorkspaceId"));
			data.setWorkspaceName(_ctx.stringValue("QueryCubePerformanceResponse.Result["+ i +"].WorkspaceName"));

			result.add(data);
		}
		queryCubePerformanceResponse.setResult(result);
	 
	 	return queryCubePerformanceResponse;
	}
}