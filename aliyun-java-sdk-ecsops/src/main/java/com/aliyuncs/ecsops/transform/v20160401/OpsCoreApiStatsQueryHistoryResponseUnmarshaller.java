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

package com.aliyuncs.ecsops.transform.v20160401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsops.model.v20160401.OpsCoreApiStatsQueryHistoryResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsCoreApiStatsQueryHistoryResponse.DataItem;
import com.aliyuncs.ecsops.model.v20160401.OpsCoreApiStatsQueryHistoryResponse.DataItem.ApiStat;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsCoreApiStatsQueryHistoryResponseUnmarshaller {

	public static OpsCoreApiStatsQueryHistoryResponse unmarshall(OpsCoreApiStatsQueryHistoryResponse opsCoreApiStatsQueryHistoryResponse, UnmarshallerContext _ctx) {
		
		opsCoreApiStatsQueryHistoryResponse.setRequestId(_ctx.stringValue("OpsCoreApiStatsQueryHistoryResponse.RequestId"));
		opsCoreApiStatsQueryHistoryResponse.setCode(_ctx.stringValue("OpsCoreApiStatsQueryHistoryResponse.Code"));
		opsCoreApiStatsQueryHistoryResponse.setMessage(_ctx.stringValue("OpsCoreApiStatsQueryHistoryResponse.Message"));
		opsCoreApiStatsQueryHistoryResponse.setSuccess(_ctx.stringValue("OpsCoreApiStatsQueryHistoryResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("OpsCoreApiStatsQueryHistoryResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setApiType(_ctx.stringValue("OpsCoreApiStatsQueryHistoryResponse.Data["+ i +"].ApiType"));

			List<ApiStat> apiStats = new ArrayList<ApiStat>();
			for (int j = 0; j < _ctx.lengthValue("OpsCoreApiStatsQueryHistoryResponse.Data["+ i +"].ApiStats.Length"); j++) {
				ApiStat apiStat = new ApiStat();
				apiStat.setTimestamp(_ctx.longValue("OpsCoreApiStatsQueryHistoryResponse.Data["+ i +"].ApiStats["+ j +"].Timestamp"));
				apiStat.setFailureCount(_ctx.longValue("OpsCoreApiStatsQueryHistoryResponse.Data["+ i +"].ApiStats["+ j +"].FailureCount"));
				apiStat.setResponseTimeAvg(_ctx.floatValue("OpsCoreApiStatsQueryHistoryResponse.Data["+ i +"].ApiStats["+ j +"].ResponseTimeAvg"));
				apiStat.setTotalCount(_ctx.longValue("OpsCoreApiStatsQueryHistoryResponse.Data["+ i +"].ApiStats["+ j +"].TotalCount"));

				apiStats.add(apiStat);
			}
			dataItem.setApiStats(apiStats);

			data.add(dataItem);
		}
		opsCoreApiStatsQueryHistoryResponse.setData(data);
	 
	 	return opsCoreApiStatsQueryHistoryResponse;
	}
}