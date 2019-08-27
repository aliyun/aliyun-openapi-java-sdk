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

package com.aliyuncs.cusanalytic_sc_online.transform.v20190524;

import com.aliyuncs.cusanalytic_sc_online.model.v20190524.GetOverviewDataResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetOverviewDataResponseUnmarshaller {

	public static GetOverviewDataResponse unmarshall(GetOverviewDataResponse getOverviewDataResponse, UnmarshallerContext _ctx) {
		
		getOverviewDataResponse.setStayDeepAvg(_ctx.floatValue("GetOverviewDataResponse.StayDeepAvg"));
		getOverviewDataResponse.setUvWeekGrowthPercent(_ctx.floatValue("GetOverviewDataResponse.UvWeekGrowthPercent"));
		getOverviewDataResponse.setStayDeepAvgWeekGrowthPercent(_ctx.floatValue("GetOverviewDataResponse.StayDeepAvgWeekGrowthPercent"));
		getOverviewDataResponse.setUv(_ctx.longValue("GetOverviewDataResponse.Uv"));
		getOverviewDataResponse.setStayAvgPeriodWeekGrowthPercent(_ctx.floatValue("GetOverviewDataResponse.StayAvgPeriodWeekGrowthPercent"));
		getOverviewDataResponse.setUvEverySqm(_ctx.floatValue("GetOverviewDataResponse.UvEverySqm"));
		getOverviewDataResponse.setUvAvgWeekGrowthPercent(_ctx.floatValue("GetOverviewDataResponse.UvAvgWeekGrowthPercent"));
		getOverviewDataResponse.setStayAvgPeriod(_ctx.floatValue("GetOverviewDataResponse.StayAvgPeriod"));
		getOverviewDataResponse.setUvAvg(_ctx.floatValue("GetOverviewDataResponse.UvAvg"));
		getOverviewDataResponse.setUvEverySqmGrowthWeekPercent(_ctx.floatValue("GetOverviewDataResponse.UvEverySqmGrowthWeekPercent"));
	 
	 	return getOverviewDataResponse;
	}
}