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

import com.aliyuncs.ecsops.model.v20160401.OpsCoreApiStatsQueryLatestResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsCoreApiStatsQueryLatestResponse.DataItem;
import com.aliyuncs.ecsops.model.v20160401.OpsCoreApiStatsQueryLatestResponse.DataItem.ApiStat;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsCoreApiStatsQueryLatestResponseUnmarshaller {

	public static OpsCoreApiStatsQueryLatestResponse unmarshall(OpsCoreApiStatsQueryLatestResponse opsCoreApiStatsQueryLatestResponse, UnmarshallerContext _ctx) {
		
		opsCoreApiStatsQueryLatestResponse.setRequestId(_ctx.stringValue("OpsCoreApiStatsQueryLatestResponse.RequestId"));
		opsCoreApiStatsQueryLatestResponse.setCode(_ctx.stringValue("OpsCoreApiStatsQueryLatestResponse.Code"));
		opsCoreApiStatsQueryLatestResponse.setMessage(_ctx.stringValue("OpsCoreApiStatsQueryLatestResponse.Message"));
		opsCoreApiStatsQueryLatestResponse.setSuccess(_ctx.stringValue("OpsCoreApiStatsQueryLatestResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("OpsCoreApiStatsQueryLatestResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setRegionId(_ctx.stringValue("OpsCoreApiStatsQueryLatestResponse.Data["+ i +"].RegionId"));
			dataItem.setTimestamp(_ctx.longValue("OpsCoreApiStatsQueryLatestResponse.Data["+ i +"].Timestamp"));

			List<ApiStat> apiStats = new ArrayList<ApiStat>();
			for (int j = 0; j < _ctx.lengthValue("OpsCoreApiStatsQueryLatestResponse.Data["+ i +"].ApiStats.Length"); j++) {
				ApiStat apiStat = new ApiStat();
				apiStat.setApiType(_ctx.stringValue("OpsCoreApiStatsQueryLatestResponse.Data["+ i +"].ApiStats["+ j +"].ApiType"));
				apiStat.setFailureCount(_ctx.longValue("OpsCoreApiStatsQueryLatestResponse.Data["+ i +"].ApiStats["+ j +"].FailureCount"));
				apiStat.setResponseTimeAvg(_ctx.floatValue("OpsCoreApiStatsQueryLatestResponse.Data["+ i +"].ApiStats["+ j +"].ResponseTimeAvg"));
				apiStat.setTotalCount(_ctx.longValue("OpsCoreApiStatsQueryLatestResponse.Data["+ i +"].ApiStats["+ j +"].TotalCount"));

				apiStats.add(apiStat);
			}
			dataItem.setApiStats(apiStats);

			data.add(dataItem);
		}
		opsCoreApiStatsQueryLatestResponse.setData(data);
	 
	 	return opsCoreApiStatsQueryLatestResponse;
	}
}