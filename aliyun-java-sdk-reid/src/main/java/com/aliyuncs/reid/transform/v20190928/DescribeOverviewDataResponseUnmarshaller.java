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

import com.aliyuncs.reid.model.v20190928.DescribeOverviewDataResponse;
import com.aliyuncs.reid.model.v20190928.DescribeOverviewDataResponse.OverviewDetail;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeOverviewDataResponseUnmarshaller {

	public static DescribeOverviewDataResponse unmarshall(DescribeOverviewDataResponse describeOverviewDataResponse, UnmarshallerContext _ctx) {
		
		describeOverviewDataResponse.setRequestId(_ctx.stringValue("DescribeOverviewDataResponse.RequestId"));
		describeOverviewDataResponse.setErrorCode(_ctx.stringValue("DescribeOverviewDataResponse.ErrorCode"));
		describeOverviewDataResponse.setErrorMessage(_ctx.stringValue("DescribeOverviewDataResponse.ErrorMessage"));
		describeOverviewDataResponse.setMessage(_ctx.stringValue("DescribeOverviewDataResponse.Message"));
		describeOverviewDataResponse.setCode(_ctx.stringValue("DescribeOverviewDataResponse.Code"));
		describeOverviewDataResponse.setDynamicCode(_ctx.stringValue("DescribeOverviewDataResponse.DynamicCode"));
		describeOverviewDataResponse.setSuccess(_ctx.booleanValue("DescribeOverviewDataResponse.Success"));
		describeOverviewDataResponse.setDynamicMessage(_ctx.stringValue("DescribeOverviewDataResponse.DynamicMessage"));

		OverviewDetail overviewDetail = new OverviewDetail();
		overviewDetail.setStayDeepAvgWOWPercent(_ctx.floatValue("DescribeOverviewDataResponse.OverviewDetail.StayDeepAvgWOWPercent"));
		overviewDetail.setStayDeepAvg(_ctx.floatValue("DescribeOverviewDataResponse.OverviewDetail.StayDeepAvg"));
		overviewDetail.setUvAvgWOWPercent(_ctx.floatValue("DescribeOverviewDataResponse.OverviewDetail.UvAvgWOWPercent"));
		overviewDetail.setStayAvgPeriodWOWPercent(_ctx.floatValue("DescribeOverviewDataResponse.OverviewDetail.StayAvgPeriodWOWPercent"));
		overviewDetail.setUvEverySqmGrowthWOWPercent(_ctx.floatValue("DescribeOverviewDataResponse.OverviewDetail.UvEverySqmGrowthWOWPercent"));
		overviewDetail.setUvWOWPercent(_ctx.floatValue("DescribeOverviewDataResponse.OverviewDetail.UvWOWPercent"));
		overviewDetail.setUv(_ctx.longValue("DescribeOverviewDataResponse.OverviewDetail.Uv"));
		overviewDetail.setUvEverySqm(_ctx.floatValue("DescribeOverviewDataResponse.OverviewDetail.UvEverySqm"));
		overviewDetail.setUvAvg(_ctx.floatValue("DescribeOverviewDataResponse.OverviewDetail.UvAvg"));
		overviewDetail.setStayAvgPeriod(_ctx.floatValue("DescribeOverviewDataResponse.OverviewDetail.StayAvgPeriod"));
		describeOverviewDataResponse.setOverviewDetail(overviewDetail);
	 
	 	return describeOverviewDataResponse;
	}
}