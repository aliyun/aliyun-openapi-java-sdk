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

import com.aliyuncs.das.model.v20200116.GetQueryOptimizeDataStatsResponse;
import com.aliyuncs.das.model.v20200116.GetQueryOptimizeDataStatsResponse.Data;
import com.aliyuncs.das.model.v20200116.GetQueryOptimizeDataStatsResponse.Data.QueryOptimizeDataStats;
import com.aliyuncs.das.model.v20200116.GetQueryOptimizeDataStatsResponse.Data.QueryOptimizeDataStats.Rules;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetQueryOptimizeDataStatsResponseUnmarshaller {

	public static GetQueryOptimizeDataStatsResponse unmarshall(GetQueryOptimizeDataStatsResponse getQueryOptimizeDataStatsResponse, UnmarshallerContext _ctx) {
		
		getQueryOptimizeDataStatsResponse.setRequestId(_ctx.stringValue("GetQueryOptimizeDataStatsResponse.RequestId"));
		getQueryOptimizeDataStatsResponse.setCode(_ctx.stringValue("GetQueryOptimizeDataStatsResponse.Code"));
		getQueryOptimizeDataStatsResponse.setMessage(_ctx.stringValue("GetQueryOptimizeDataStatsResponse.Message"));
		getQueryOptimizeDataStatsResponse.setSuccess(_ctx.stringValue("GetQueryOptimizeDataStatsResponse.Success"));

		Data data = new Data();
		data.setTotal(_ctx.longValue("GetQueryOptimizeDataStatsResponse.Data.Total"));
		data.setPageNo(_ctx.integerValue("GetQueryOptimizeDataStatsResponse.Data.PageNo"));
		data.setPageSize(_ctx.integerValue("GetQueryOptimizeDataStatsResponse.Data.PageSize"));
		data.setExtra(_ctx.stringValue("GetQueryOptimizeDataStatsResponse.Data.Extra"));

		List<QueryOptimizeDataStats> list = new ArrayList<QueryOptimizeDataStats>();
		for (int i = 0; i < _ctx.lengthValue("GetQueryOptimizeDataStatsResponse.Data.List.Length"); i++) {
			QueryOptimizeDataStats queryOptimizeDataStats = new QueryOptimizeDataStats();
			queryOptimizeDataStats.setInstanceId(_ctx.stringValue("GetQueryOptimizeDataStatsResponse.Data.List["+ i +"].InstanceId"));
			queryOptimizeDataStats.setDbname(_ctx.stringValue("GetQueryOptimizeDataStatsResponse.Data.List["+ i +"].Dbname"));
			queryOptimizeDataStats.setSqlId(_ctx.stringValue("GetQueryOptimizeDataStatsResponse.Data.List["+ i +"].SqlId"));
			queryOptimizeDataStats.setSqlType(_ctx.stringValue("GetQueryOptimizeDataStatsResponse.Data.List["+ i +"].SqlType"));
			queryOptimizeDataStats.setPsql(_ctx.stringValue("GetQueryOptimizeDataStatsResponse.Data.List["+ i +"].Psql"));
			queryOptimizeDataStats.setSqlSample(_ctx.stringValue("GetQueryOptimizeDataStatsResponse.Data.List["+ i +"].SqlSample"));
			queryOptimizeDataStats.setCount(_ctx.integerValue("GetQueryOptimizeDataStatsResponse.Data.List["+ i +"].Count"));
			queryOptimizeDataStats.setMaxQueryTime(_ctx.doubleValue("GetQueryOptimizeDataStatsResponse.Data.List["+ i +"].MaxQueryTime"));
			queryOptimizeDataStats.setAvgQueryTime(_ctx.doubleValue("GetQueryOptimizeDataStatsResponse.Data.List["+ i +"].AvgQueryTime"));
			queryOptimizeDataStats.setMaxLockTime(_ctx.doubleValue("GetQueryOptimizeDataStatsResponse.Data.List["+ i +"].MaxLockTime"));
			queryOptimizeDataStats.setAvgLockTime(_ctx.doubleValue("GetQueryOptimizeDataStatsResponse.Data.List["+ i +"].AvgLockTime"));
			queryOptimizeDataStats.setMaxRowsExamined(_ctx.longValue("GetQueryOptimizeDataStatsResponse.Data.List["+ i +"].MaxRowsExamined"));
			queryOptimizeDataStats.setAvgRowsExamined(_ctx.doubleValue("GetQueryOptimizeDataStatsResponse.Data.List["+ i +"].AvgRowsExamined"));
			queryOptimizeDataStats.setMaxRowsSent(_ctx.longValue("GetQueryOptimizeDataStatsResponse.Data.List["+ i +"].MaxRowsSent"));
			queryOptimizeDataStats.setAvgRowsSent(_ctx.doubleValue("GetQueryOptimizeDataStatsResponse.Data.List["+ i +"].AvgRowsSent"));
			queryOptimizeDataStats.setMaxRowsAffected(_ctx.longValue("GetQueryOptimizeDataStatsResponse.Data.List["+ i +"].MaxRowsAffected"));
			queryOptimizeDataStats.setAvgRowsAffected(_ctx.doubleValue("GetQueryOptimizeDataStatsResponse.Data.List["+ i +"].AvgRowsAffected"));

			List<Rules> ruleList = new ArrayList<Rules>();
			for (int j = 0; j < _ctx.lengthValue("GetQueryOptimizeDataStatsResponse.Data.List["+ i +"].RuleList.Length"); j++) {
				Rules rules = new Rules();
				rules.setName(_ctx.stringValue("GetQueryOptimizeDataStatsResponse.Data.List["+ i +"].RuleList["+ j +"].Name"));
				rules.setType(_ctx.stringValue("GetQueryOptimizeDataStatsResponse.Data.List["+ i +"].RuleList["+ j +"].Type"));

				ruleList.add(rules);
			}
			queryOptimizeDataStats.setRuleList(ruleList);

			list.add(queryOptimizeDataStats);
		}
		data.setList(list);
		getQueryOptimizeDataStatsResponse.setData(data);
	 
	 	return getQueryOptimizeDataStatsResponse;
	}
}