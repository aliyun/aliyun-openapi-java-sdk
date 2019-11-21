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

package com.aliyuncs.reid.transform.v20190928;

import com.aliyuncs.reid.model.v20190928.GetOverviewResponse;
import com.aliyuncs.reid.model.v20190928.GetOverviewResponse.OverviewDetail;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetOverviewResponseUnmarshaller {

	public static GetOverviewResponse unmarshall(GetOverviewResponse getOverviewResponse, UnmarshallerContext _ctx) {
		
		getOverviewResponse.setRequestId(_ctx.stringValue("GetOverviewResponse.RequestId"));
		getOverviewResponse.setErrorCode(_ctx.stringValue("GetOverviewResponse.ErrorCode"));
		getOverviewResponse.setErrorMessage(_ctx.stringValue("GetOverviewResponse.ErrorMessage"));
		getOverviewResponse.setMessage(_ctx.stringValue("GetOverviewResponse.Message"));
		getOverviewResponse.setCode(_ctx.stringValue("GetOverviewResponse.Code"));
		getOverviewResponse.setDynamicCode(_ctx.stringValue("GetOverviewResponse.DynamicCode"));
		getOverviewResponse.setSuccess(_ctx.booleanValue("GetOverviewResponse.Success"));
		getOverviewResponse.setDynamicMessage(_ctx.stringValue("GetOverviewResponse.DynamicMessage"));

		OverviewDetail overviewDetail = new OverviewDetail();
		overviewDetail.setUvAvgWOWPercent(_ctx.floatValue("GetOverviewResponse.OverviewDetail.UvAvgWOWPercent"));
		overviewDetail.setStayAvgPeriodWOWPercent(_ctx.floatValue("GetOverviewResponse.OverviewDetail.StayAvgPeriodWOWPercent"));
		overviewDetail.setStayDeepAvgWOWPercent(_ctx.floatValue("GetOverviewResponse.OverviewDetail.StayDeepAvgWOWPercent"));
		overviewDetail.setStayDeepAvg(_ctx.floatValue("GetOverviewResponse.OverviewDetail.StayDeepAvg"));
		overviewDetail.setUvAvg(_ctx.floatValue("GetOverviewResponse.OverviewDetail.UvAvg"));
		overviewDetail.setStayAvgPeriod(_ctx.floatValue("GetOverviewResponse.OverviewDetail.StayAvgPeriod"));
		overviewDetail.setUvWOWPercent(_ctx.floatValue("GetOverviewResponse.OverviewDetail.UvWOWPercent"));
		overviewDetail.setUvEverySqmGrowthWOWPercent(_ctx.floatValue("GetOverviewResponse.OverviewDetail.UvEverySqmGrowthWOWPercent"));
		overviewDetail.setUv(_ctx.longValue("GetOverviewResponse.OverviewDetail.Uv"));
		overviewDetail.setUvEverySqm(_ctx.floatValue("GetOverviewResponse.OverviewDetail.UvEverySqm"));
		getOverviewResponse.setOverviewDetail(overviewDetail);
	 
	 	return getOverviewResponse;
	}
}