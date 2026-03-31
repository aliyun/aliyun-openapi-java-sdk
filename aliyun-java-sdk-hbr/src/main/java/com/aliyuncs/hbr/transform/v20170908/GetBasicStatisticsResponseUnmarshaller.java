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

package com.aliyuncs.hbr.transform.v20170908;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.hbr.model.v20170908.GetBasicStatisticsResponse;
import com.aliyuncs.hbr.model.v20170908.GetBasicStatisticsResponse.GlobalStatistics;
import com.aliyuncs.hbr.model.v20170908.GetBasicStatisticsResponse.RegionStatistic;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetBasicStatisticsResponseUnmarshaller {

	public static GetBasicStatisticsResponse unmarshall(GetBasicStatisticsResponse getBasicStatisticsResponse, UnmarshallerContext _ctx) {
		
		getBasicStatisticsResponse.setRequestId(_ctx.stringValue("GetBasicStatisticsResponse.RequestId"));
		getBasicStatisticsResponse.setCode(_ctx.stringValue("GetBasicStatisticsResponse.Code"));
		getBasicStatisticsResponse.setMessage(_ctx.stringValue("GetBasicStatisticsResponse.Message"));
		getBasicStatisticsResponse.setSuccess(_ctx.booleanValue("GetBasicStatisticsResponse.Success"));
		getBasicStatisticsResponse.setSourceType(_ctx.stringValue("GetBasicStatisticsResponse.SourceType"));

		GlobalStatistics globalStatistics = new GlobalStatistics();
		globalStatistics.setProtectedDataSize(_ctx.longValue("GetBasicStatisticsResponse.GlobalStatistics.ProtectedDataSize"));
		globalStatistics.setProtectedResourceCount(_ctx.integerValue("GetBasicStatisticsResponse.GlobalStatistics.ProtectedResourceCount"));
		getBasicStatisticsResponse.setGlobalStatistics(globalStatistics);

		List<RegionStatistic> regionStatistics = new ArrayList<RegionStatistic>();
		for (int i = 0; i < _ctx.lengthValue("GetBasicStatisticsResponse.RegionStatistics.Length"); i++) {
			RegionStatistic regionStatistic = new RegionStatistic();
			regionStatistic.setProtectedDataSize(_ctx.longValue("GetBasicStatisticsResponse.RegionStatistics["+ i +"].ProtectedDataSize"));
			regionStatistic.setProtectedResourceCount(_ctx.integerValue("GetBasicStatisticsResponse.RegionStatistics["+ i +"].ProtectedResourceCount"));
			regionStatistic.setRegionId(_ctx.stringValue("GetBasicStatisticsResponse.RegionStatistics["+ i +"].RegionId"));

			regionStatistics.add(regionStatistic);
		}
		getBasicStatisticsResponse.setRegionStatistics(regionStatistics);
	 
	 	return getBasicStatisticsResponse;
	}
}