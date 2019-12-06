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

import com.aliyuncs.reid.model.v20190928.DescribeOverviewResponse;
import com.aliyuncs.reid.model.v20190928.DescribeOverviewResponse.OverviewDetail;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeOverviewResponseUnmarshaller {

	public static DescribeOverviewResponse unmarshall(DescribeOverviewResponse describeOverviewResponse, UnmarshallerContext _ctx) {
		
		describeOverviewResponse.setRequestId(_ctx.stringValue("DescribeOverviewResponse.RequestId"));
		describeOverviewResponse.setErrorCode(_ctx.stringValue("DescribeOverviewResponse.ErrorCode"));
		describeOverviewResponse.setErrorMessage(_ctx.stringValue("DescribeOverviewResponse.ErrorMessage"));
		describeOverviewResponse.setMessage(_ctx.stringValue("DescribeOverviewResponse.Message"));
		describeOverviewResponse.setCode(_ctx.stringValue("DescribeOverviewResponse.Code"));
		describeOverviewResponse.setDynamicCode(_ctx.stringValue("DescribeOverviewResponse.DynamicCode"));
		describeOverviewResponse.setSuccess(_ctx.booleanValue("DescribeOverviewResponse.Success"));
		describeOverviewResponse.setDynamicMessage(_ctx.stringValue("DescribeOverviewResponse.DynamicMessage"));

		OverviewDetail overviewDetail = new OverviewDetail();
		overviewDetail.setStayAvgPeriod(_ctx.floatValue("DescribeOverviewResponse.OverviewDetail.StayAvgPeriod"));
		overviewDetail.setUvAvg(_ctx.floatValue("DescribeOverviewResponse.OverviewDetail.UvAvg"));
		overviewDetail.setUv(_ctx.longValue("DescribeOverviewResponse.OverviewDetail.Uv"));
		overviewDetail.setUvEverySqm(_ctx.floatValue("DescribeOverviewResponse.OverviewDetail.UvEverySqm"));
		overviewDetail.setUvEverySqmGrowthWOWPercent(_ctx.floatValue("DescribeOverviewResponse.OverviewDetail.UvEverySqmGrowthWOWPercent"));
		overviewDetail.setUvWOWPercent(_ctx.floatValue("DescribeOverviewResponse.OverviewDetail.UvWOWPercent"));
		overviewDetail.setStayAvgPeriodWOWPercent(_ctx.floatValue("DescribeOverviewResponse.OverviewDetail.StayAvgPeriodWOWPercent"));
		overviewDetail.setUvAvgWOWPercent(_ctx.floatValue("DescribeOverviewResponse.OverviewDetail.UvAvgWOWPercent"));
		overviewDetail.setStayDeepAvg(_ctx.floatValue("DescribeOverviewResponse.OverviewDetail.StayDeepAvg"));
		overviewDetail.setStayDeepAvgWOWPercent(_ctx.floatValue("DescribeOverviewResponse.OverviewDetail.StayDeepAvgWOWPercent"));
		describeOverviewResponse.setOverviewDetail(overviewDetail);
	 
	 	return describeOverviewResponse;
	}
}