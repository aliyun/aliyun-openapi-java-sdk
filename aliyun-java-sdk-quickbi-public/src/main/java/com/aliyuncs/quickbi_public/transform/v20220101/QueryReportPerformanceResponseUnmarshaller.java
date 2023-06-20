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

import com.aliyuncs.quickbi_public.model.v20220101.QueryReportPerformanceResponse;
import com.aliyuncs.quickbi_public.model.v20220101.QueryReportPerformanceResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryReportPerformanceResponseUnmarshaller {

	public static QueryReportPerformanceResponse unmarshall(QueryReportPerformanceResponse queryReportPerformanceResponse, UnmarshallerContext _ctx) {
		
		queryReportPerformanceResponse.setRequestId(_ctx.stringValue("QueryReportPerformanceResponse.RequestId"));
		queryReportPerformanceResponse.setSuccess(_ctx.booleanValue("QueryReportPerformanceResponse.Success"));

		List<Data> result = new ArrayList<Data>();
		for (int i = 0; i < _ctx.lengthValue("QueryReportPerformanceResponse.Result.Length"); i++) {
			Data data = new Data();
			data.setReportId(_ctx.stringValue("QueryReportPerformanceResponse.Result["+ i +"].ReportId"));
			data.setReportName(_ctx.stringValue("QueryReportPerformanceResponse.Result["+ i +"].ReportName"));
			data.setComponentQueryCount(_ctx.integerValue("QueryReportPerformanceResponse.Result["+ i +"].ComponentQueryCount"));
			data.setComponentQueryCountAvg(_ctx.doubleValue("QueryReportPerformanceResponse.Result["+ i +"].ComponentQueryCountAvg"));
			data.setReportType(_ctx.stringValue("QueryReportPerformanceResponse.Result["+ i +"].ReportType"));
			data.setQueryTimeoutCount(_ctx.integerValue("QueryReportPerformanceResponse.Result["+ i +"].QueryTimeoutCount"));
			data.setRepeatSqlQueryPercent(_ctx.stringValue("QueryReportPerformanceResponse.Result["+ i +"].RepeatSqlQueryPercent"));
			data.setWorkspaceName(_ctx.stringValue("QueryReportPerformanceResponse.Result["+ i +"].WorkspaceName"));
			data.setWorkspaceId(_ctx.stringValue("QueryReportPerformanceResponse.Result["+ i +"].WorkspaceId"));
			data.setRepeatQueryPercentNum(_ctx.doubleValue("QueryReportPerformanceResponse.Result["+ i +"].RepeatQueryPercentNum"));
			data.setRepeatQueryPercent(_ctx.stringValue("QueryReportPerformanceResponse.Result["+ i +"].RepeatQueryPercent"));
			data.setQuickIndexCostTimeAvg(_ctx.doubleValue("QueryReportPerformanceResponse.Result["+ i +"].QuickIndexCostTimeAvg"));
			data.setQuickIndexQueryCount(_ctx.integerValue("QueryReportPerformanceResponse.Result["+ i +"].QuickIndexQueryCount"));
			data.setCacheCostTimeAvg(_ctx.doubleValue("QueryReportPerformanceResponse.Result["+ i +"].CacheCostTimeAvg"));
			data.setCacheQueryCount(_ctx.integerValue("QueryReportPerformanceResponse.Result["+ i +"].CacheQueryCount"));
			data.setRepeatSqlQueryCount(_ctx.integerValue("QueryReportPerformanceResponse.Result["+ i +"].RepeatSqlQueryCount"));
			data.setCostTimeAvg(_ctx.doubleValue("QueryReportPerformanceResponse.Result["+ i +"].CostTimeAvg"));
			data.setQueryCountAvg(_ctx.doubleValue("QueryReportPerformanceResponse.Result["+ i +"].QueryCountAvg"));
			data.setQueryCount(_ctx.integerValue("QueryReportPerformanceResponse.Result["+ i +"].QueryCount"));
			data.setQueryTimeoutCountPercent(_ctx.doubleValue("QueryReportPerformanceResponse.Result["+ i +"].QueryTimeoutCountPercent"));
			data.setQueryOverTenSecPercentNum(_ctx.doubleValue("QueryReportPerformanceResponse.Result["+ i +"].QueryOverTenSecPercentNum"));
			data.setQueryOverFivePercentNum(_ctx.doubleValue("QueryReportPerformanceResponse.Result["+ i +"].QueryOverFivePercentNum"));
			data.setQueryOverTenSecPercent(_ctx.stringValue("QueryReportPerformanceResponse.Result["+ i +"].QueryOverTenSecPercent"));
			data.setQueryOverFiveSecPercent(_ctx.stringValue("QueryReportPerformanceResponse.Result["+ i +"].QueryOverFiveSecPercent"));

			result.add(data);
		}
		queryReportPerformanceResponse.setResult(result);
	 
	 	return queryReportPerformanceResponse;
	}
}