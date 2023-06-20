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

import com.aliyuncs.quickbi_public.model.v20220101.QueryComponentPerformanceResponse;
import com.aliyuncs.quickbi_public.model.v20220101.QueryComponentPerformanceResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryComponentPerformanceResponseUnmarshaller {

	public static QueryComponentPerformanceResponse unmarshall(QueryComponentPerformanceResponse queryComponentPerformanceResponse, UnmarshallerContext _ctx) {
		
		queryComponentPerformanceResponse.setRequestId(_ctx.stringValue("QueryComponentPerformanceResponse.RequestId"));
		queryComponentPerformanceResponse.setSuccess(_ctx.booleanValue("QueryComponentPerformanceResponse.Success"));

		List<Data> result = new ArrayList<Data>();
		for (int i = 0; i < _ctx.lengthValue("QueryComponentPerformanceResponse.Result.Length"); i++) {
			Data data = new Data();
			data.setComponentId(_ctx.stringValue("QueryComponentPerformanceResponse.Result["+ i +"].ComponentId"));
			data.setComponentName(_ctx.stringValue("QueryComponentPerformanceResponse.Result["+ i +"].ComponentName"));
			data.setReportId(_ctx.stringValue("QueryComponentPerformanceResponse.Result["+ i +"].ReportId"));
			data.setReportName(_ctx.stringValue("QueryComponentPerformanceResponse.Result["+ i +"].ReportName"));
			data.setReportType(_ctx.stringValue("QueryComponentPerformanceResponse.Result["+ i +"].ReportType"));
			data.setQueryTimeoutCount(_ctx.integerValue("QueryComponentPerformanceResponse.Result["+ i +"].QueryTimeoutCount"));
			data.setRepeatSqlQueryPercent(_ctx.stringValue("QueryComponentPerformanceResponse.Result["+ i +"].RepeatSqlQueryPercent"));
			data.setWorkspaceName(_ctx.stringValue("QueryComponentPerformanceResponse.Result["+ i +"].WorkspaceName"));
			data.setWorkspaceId(_ctx.stringValue("QueryComponentPerformanceResponse.Result["+ i +"].WorkspaceId"));
			data.setRepeatQueryPercentNum(_ctx.doubleValue("QueryComponentPerformanceResponse.Result["+ i +"].RepeatQueryPercentNum"));
			data.setRepeatQueryPercent(_ctx.stringValue("QueryComponentPerformanceResponse.Result["+ i +"].RepeatQueryPercent"));
			data.setQuickIndexCostTimeAvg(_ctx.doubleValue("QueryComponentPerformanceResponse.Result["+ i +"].QuickIndexCostTimeAvg"));
			data.setQuickIndexQueryCount(_ctx.integerValue("QueryComponentPerformanceResponse.Result["+ i +"].QuickIndexQueryCount"));
			data.setCacheCostTimeAvg(_ctx.doubleValue("QueryComponentPerformanceResponse.Result["+ i +"].CacheCostTimeAvg"));
			data.setCacheQueryCount(_ctx.integerValue("QueryComponentPerformanceResponse.Result["+ i +"].CacheQueryCount"));
			data.setRepeatSqlQueryCount(_ctx.integerValue("QueryComponentPerformanceResponse.Result["+ i +"].RepeatSqlQueryCount"));
			data.setCostTimeAvg(_ctx.doubleValue("QueryComponentPerformanceResponse.Result["+ i +"].CostTimeAvg"));
			data.setQueryCountAvg(_ctx.doubleValue("QueryComponentPerformanceResponse.Result["+ i +"].QueryCountAvg"));
			data.setQueryCount(_ctx.integerValue("QueryComponentPerformanceResponse.Result["+ i +"].QueryCount"));
			data.setQueryTimeoutCountPercent(_ctx.doubleValue("QueryComponentPerformanceResponse.Result["+ i +"].QueryTimeoutCountPercent"));
			data.setQueryOverTenSecPercentNum(_ctx.doubleValue("QueryComponentPerformanceResponse.Result["+ i +"].QueryOverTenSecPercentNum"));
			data.setQueryOverFivePercentNum(_ctx.doubleValue("QueryComponentPerformanceResponse.Result["+ i +"].QueryOverFivePercentNum"));
			data.setQueryOverTenSecPercent(_ctx.stringValue("QueryComponentPerformanceResponse.Result["+ i +"].QueryOverTenSecPercent"));
			data.setQueryOverFiveSecPercent(_ctx.stringValue("QueryComponentPerformanceResponse.Result["+ i +"].QueryOverFiveSecPercent"));

			result.add(data);
		}
		queryComponentPerformanceResponse.setResult(result);
	 
	 	return queryComponentPerformanceResponse;
	}
}