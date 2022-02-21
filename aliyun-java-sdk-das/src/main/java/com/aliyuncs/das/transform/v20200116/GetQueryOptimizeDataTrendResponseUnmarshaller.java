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

import com.aliyuncs.das.model.v20200116.GetQueryOptimizeDataTrendResponse;
import com.aliyuncs.das.model.v20200116.GetQueryOptimizeDataTrendResponse.Data;
import com.aliyuncs.das.model.v20200116.GetQueryOptimizeDataTrendResponse.Data.QueryOptimizeDataTrends;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetQueryOptimizeDataTrendResponseUnmarshaller {

	public static GetQueryOptimizeDataTrendResponse unmarshall(GetQueryOptimizeDataTrendResponse getQueryOptimizeDataTrendResponse, UnmarshallerContext _ctx) {
		
		getQueryOptimizeDataTrendResponse.setRequestId(_ctx.stringValue("GetQueryOptimizeDataTrendResponse.RequestId"));
		getQueryOptimizeDataTrendResponse.setCode(_ctx.stringValue("GetQueryOptimizeDataTrendResponse.Code"));
		getQueryOptimizeDataTrendResponse.setMessage(_ctx.stringValue("GetQueryOptimizeDataTrendResponse.Message"));
		getQueryOptimizeDataTrendResponse.setSuccess(_ctx.stringValue("GetQueryOptimizeDataTrendResponse.Success"));

		Data data = new Data();
		data.setTotal(_ctx.longValue("GetQueryOptimizeDataTrendResponse.Data.Total"));
		data.setPageNo(_ctx.integerValue("GetQueryOptimizeDataTrendResponse.Data.PageNo"));
		data.setPageSize(_ctx.integerValue("GetQueryOptimizeDataTrendResponse.Data.PageSize"));
		data.setExtra(_ctx.stringValue("GetQueryOptimizeDataTrendResponse.Data.Extra"));

		List<QueryOptimizeDataTrends> list = new ArrayList<QueryOptimizeDataTrends>();
		for (int i = 0; i < _ctx.lengthValue("GetQueryOptimizeDataTrendResponse.Data.List.Length"); i++) {
			QueryOptimizeDataTrends queryOptimizeDataTrends = new QueryOptimizeDataTrends();
			queryOptimizeDataTrends.setKpi(_ctx.stringValue("GetQueryOptimizeDataTrendResponse.Data.List["+ i +"].Kpi"));
			queryOptimizeDataTrends.setTimestamp(_ctx.longValue("GetQueryOptimizeDataTrendResponse.Data.List["+ i +"].Timestamp"));
			queryOptimizeDataTrends.setValue(_ctx.doubleValue("GetQueryOptimizeDataTrendResponse.Data.List["+ i +"].Value"));

			list.add(queryOptimizeDataTrends);
		}
		data.setList(list);
		getQueryOptimizeDataTrendResponse.setData(data);
	 
	 	return getQueryOptimizeDataTrendResponse;
	}
}