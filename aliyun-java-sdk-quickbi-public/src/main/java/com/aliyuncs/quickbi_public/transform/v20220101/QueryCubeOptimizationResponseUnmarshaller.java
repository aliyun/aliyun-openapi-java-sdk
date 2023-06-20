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

import com.aliyuncs.quickbi_public.model.v20220101.QueryCubeOptimizationResponse;
import com.aliyuncs.quickbi_public.model.v20220101.QueryCubeOptimizationResponse.Data;
import com.aliyuncs.quickbi_public.model.v20220101.QueryCubeOptimizationResponse.Data.CubePerformanceDiagnoseModel;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryCubeOptimizationResponseUnmarshaller {

	public static QueryCubeOptimizationResponse unmarshall(QueryCubeOptimizationResponse queryCubeOptimizationResponse, UnmarshallerContext _ctx) {
		
		queryCubeOptimizationResponse.setRequestId(_ctx.stringValue("QueryCubeOptimizationResponse.RequestId"));
		queryCubeOptimizationResponse.setSuccess(_ctx.booleanValue("QueryCubeOptimizationResponse.Success"));

		List<Data> result = new ArrayList<Data>();
		for (int i = 0; i < _ctx.lengthValue("QueryCubeOptimizationResponse.Result.Length"); i++) {
			Data data = new Data();
			data.setAdviceType(_ctx.stringValue("QueryCubeOptimizationResponse.Result["+ i +"].AdviceType"));

			CubePerformanceDiagnoseModel cubePerformanceDiagnoseModel = new CubePerformanceDiagnoseModel();
			cubePerformanceDiagnoseModel.setCubeId(_ctx.stringValue("QueryCubeOptimizationResponse.Result["+ i +"].CubePerformanceDiagnoseModel.CubeId"));
			cubePerformanceDiagnoseModel.setCubeName(_ctx.stringValue("QueryCubeOptimizationResponse.Result["+ i +"].CubePerformanceDiagnoseModel.CubeName"));
			cubePerformanceDiagnoseModel.setQueryTimeoutCount(_ctx.integerValue("QueryCubeOptimizationResponse.Result["+ i +"].CubePerformanceDiagnoseModel.QueryTimeoutCount"));
			cubePerformanceDiagnoseModel.setRepeatSqlQueryPercent(_ctx.stringValue("QueryCubeOptimizationResponse.Result["+ i +"].CubePerformanceDiagnoseModel.RepeatSqlQueryPercent"));
			cubePerformanceDiagnoseModel.setWorkspaceName(_ctx.stringValue("QueryCubeOptimizationResponse.Result["+ i +"].CubePerformanceDiagnoseModel.WorkspaceName"));
			cubePerformanceDiagnoseModel.setWorkspaceId(_ctx.stringValue("QueryCubeOptimizationResponse.Result["+ i +"].CubePerformanceDiagnoseModel.WorkspaceId"));
			cubePerformanceDiagnoseModel.setRepeatQueryPercentNum(_ctx.doubleValue("QueryCubeOptimizationResponse.Result["+ i +"].CubePerformanceDiagnoseModel.RepeatQueryPercentNum"));
			cubePerformanceDiagnoseModel.setRepeatQueryPercent(_ctx.stringValue("QueryCubeOptimizationResponse.Result["+ i +"].CubePerformanceDiagnoseModel.RepeatQueryPercent"));
			cubePerformanceDiagnoseModel.setQuickIndexCostTimeAvg(_ctx.doubleValue("QueryCubeOptimizationResponse.Result["+ i +"].CubePerformanceDiagnoseModel.QuickIndexCostTimeAvg"));
			cubePerformanceDiagnoseModel.setQuickIndexQueryCount(_ctx.integerValue("QueryCubeOptimizationResponse.Result["+ i +"].CubePerformanceDiagnoseModel.QuickIndexQueryCount"));
			cubePerformanceDiagnoseModel.setCacheCostTimeAvg(_ctx.doubleValue("QueryCubeOptimizationResponse.Result["+ i +"].CubePerformanceDiagnoseModel.CacheCostTimeAvg"));
			cubePerformanceDiagnoseModel.setCacheQueryCount(_ctx.integerValue("QueryCubeOptimizationResponse.Result["+ i +"].CubePerformanceDiagnoseModel.CacheQueryCount"));
			cubePerformanceDiagnoseModel.setRepeatSqlQueryCount(_ctx.integerValue("QueryCubeOptimizationResponse.Result["+ i +"].CubePerformanceDiagnoseModel.RepeatSqlQueryCount"));
			cubePerformanceDiagnoseModel.setCostTimeAvg(_ctx.doubleValue("QueryCubeOptimizationResponse.Result["+ i +"].CubePerformanceDiagnoseModel.CostTimeAvg"));
			cubePerformanceDiagnoseModel.setQueryCountAvg(_ctx.doubleValue("QueryCubeOptimizationResponse.Result["+ i +"].CubePerformanceDiagnoseModel.QueryCountAvg"));
			cubePerformanceDiagnoseModel.setQueryCount(_ctx.integerValue("QueryCubeOptimizationResponse.Result["+ i +"].CubePerformanceDiagnoseModel.QueryCount"));
			cubePerformanceDiagnoseModel.setQueryTimeoutCountPercent(_ctx.doubleValue("QueryCubeOptimizationResponse.Result["+ i +"].CubePerformanceDiagnoseModel.QueryTimeoutCountPercent"));
			cubePerformanceDiagnoseModel.setQueryOverTenSecPercentNum(_ctx.doubleValue("QueryCubeOptimizationResponse.Result["+ i +"].CubePerformanceDiagnoseModel.QueryOverTenSecPercentNum"));
			cubePerformanceDiagnoseModel.setQueryOverFivePercentNum(_ctx.doubleValue("QueryCubeOptimizationResponse.Result["+ i +"].CubePerformanceDiagnoseModel.QueryOverFivePercentNum"));
			cubePerformanceDiagnoseModel.setQueryOverTenSecPercent(_ctx.stringValue("QueryCubeOptimizationResponse.Result["+ i +"].CubePerformanceDiagnoseModel.QueryOverTenSecPercent"));
			cubePerformanceDiagnoseModel.setQueryOverFiveSecPercent(_ctx.stringValue("QueryCubeOptimizationResponse.Result["+ i +"].CubePerformanceDiagnoseModel.QueryOverFiveSecPercent"));
			data.setCubePerformanceDiagnoseModel(cubePerformanceDiagnoseModel);

			result.add(data);
		}
		queryCubeOptimizationResponse.setResult(result);
	 
	 	return queryCubeOptimizationResponse;
	}
}