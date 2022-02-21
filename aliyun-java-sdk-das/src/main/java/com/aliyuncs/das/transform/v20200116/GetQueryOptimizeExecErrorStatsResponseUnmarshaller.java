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

import com.aliyuncs.das.model.v20200116.GetQueryOptimizeExecErrorStatsResponse;
import com.aliyuncs.das.model.v20200116.GetQueryOptimizeExecErrorStatsResponse.Data;
import com.aliyuncs.das.model.v20200116.GetQueryOptimizeExecErrorStatsResponse.Data.QueryOptimizeExecErrorStats;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetQueryOptimizeExecErrorStatsResponseUnmarshaller {

	public static GetQueryOptimizeExecErrorStatsResponse unmarshall(GetQueryOptimizeExecErrorStatsResponse getQueryOptimizeExecErrorStatsResponse, UnmarshallerContext _ctx) {
		
		getQueryOptimizeExecErrorStatsResponse.setRequestId(_ctx.stringValue("GetQueryOptimizeExecErrorStatsResponse.RequestId"));
		getQueryOptimizeExecErrorStatsResponse.setCode(_ctx.stringValue("GetQueryOptimizeExecErrorStatsResponse.Code"));
		getQueryOptimizeExecErrorStatsResponse.setMessage(_ctx.stringValue("GetQueryOptimizeExecErrorStatsResponse.Message"));
		getQueryOptimizeExecErrorStatsResponse.setSuccess(_ctx.stringValue("GetQueryOptimizeExecErrorStatsResponse.Success"));

		Data data = new Data();
		data.setTotal(_ctx.longValue("GetQueryOptimizeExecErrorStatsResponse.Data.Total"));
		data.setPageNo(_ctx.integerValue("GetQueryOptimizeExecErrorStatsResponse.Data.PageNo"));
		data.setPageSize(_ctx.integerValue("GetQueryOptimizeExecErrorStatsResponse.Data.PageSize"));
		data.setExtra(_ctx.stringValue("GetQueryOptimizeExecErrorStatsResponse.Data.Extra"));

		List<QueryOptimizeExecErrorStats> list = new ArrayList<QueryOptimizeExecErrorStats>();
		for (int i = 0; i < _ctx.lengthValue("GetQueryOptimizeExecErrorStatsResponse.Data.List.Length"); i++) {
			QueryOptimizeExecErrorStats queryOptimizeExecErrorStats = new QueryOptimizeExecErrorStats();
			queryOptimizeExecErrorStats.setInstanceId(_ctx.stringValue("GetQueryOptimizeExecErrorStatsResponse.Data.List["+ i +"].InstanceId"));
			queryOptimizeExecErrorStats.setInstanceName(_ctx.stringValue("GetQueryOptimizeExecErrorStatsResponse.Data.List["+ i +"].InstanceName"));
			queryOptimizeExecErrorStats.setDbname(_ctx.stringValue("GetQueryOptimizeExecErrorStatsResponse.Data.List["+ i +"].Dbname"));
			queryOptimizeExecErrorStats.setSqlId(_ctx.stringValue("GetQueryOptimizeExecErrorStatsResponse.Data.List["+ i +"].SqlId"));
			queryOptimizeExecErrorStats.setSqlText(_ctx.stringValue("GetQueryOptimizeExecErrorStatsResponse.Data.List["+ i +"].SqlText"));
			queryOptimizeExecErrorStats.setErrorCode(_ctx.stringValue("GetQueryOptimizeExecErrorStatsResponse.Data.List["+ i +"].ErrorCode"));
			queryOptimizeExecErrorStats.setErrorCount(_ctx.longValue("GetQueryOptimizeExecErrorStatsResponse.Data.List["+ i +"].ErrorCount"));

			list.add(queryOptimizeExecErrorStats);
		}
		data.setList(list);
		getQueryOptimizeExecErrorStatsResponse.setData(data);
	 
	 	return getQueryOptimizeExecErrorStatsResponse;
	}
}