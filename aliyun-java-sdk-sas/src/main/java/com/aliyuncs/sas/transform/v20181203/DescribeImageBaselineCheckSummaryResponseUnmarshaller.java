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

package com.aliyuncs.sas.transform.v20181203;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sas.model.v20181203.DescribeImageBaselineCheckSummaryResponse;
import com.aliyuncs.sas.model.v20181203.DescribeImageBaselineCheckSummaryResponse.BaselineResultSummaryItem;
import com.aliyuncs.sas.model.v20181203.DescribeImageBaselineCheckSummaryResponse.PageInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeImageBaselineCheckSummaryResponseUnmarshaller {

	public static DescribeImageBaselineCheckSummaryResponse unmarshall(DescribeImageBaselineCheckSummaryResponse describeImageBaselineCheckSummaryResponse, UnmarshallerContext _ctx) {
		
		describeImageBaselineCheckSummaryResponse.setRequestId(_ctx.stringValue("DescribeImageBaselineCheckSummaryResponse.RequestId"));

		PageInfo pageInfo = new PageInfo();
		pageInfo.setCurrentPage(_ctx.integerValue("DescribeImageBaselineCheckSummaryResponse.PageInfo.CurrentPage"));
		pageInfo.setPageSize(_ctx.integerValue("DescribeImageBaselineCheckSummaryResponse.PageInfo.PageSize"));
		pageInfo.setTotalCount(_ctx.integerValue("DescribeImageBaselineCheckSummaryResponse.PageInfo.TotalCount"));
		pageInfo.setCount(_ctx.integerValue("DescribeImageBaselineCheckSummaryResponse.PageInfo.Count"));
		describeImageBaselineCheckSummaryResponse.setPageInfo(pageInfo);

		List<BaselineResultSummaryItem> baselineResultSummary = new ArrayList<BaselineResultSummaryItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeImageBaselineCheckSummaryResponse.BaselineResultSummary.Length"); i++) {
			BaselineResultSummaryItem baselineResultSummaryItem = new BaselineResultSummaryItem();
			baselineResultSummaryItem.setStatus(_ctx.integerValue("DescribeImageBaselineCheckSummaryResponse.BaselineResultSummary["+ i +"].Status"));
			baselineResultSummaryItem.setMiddleRiskImage(_ctx.integerValue("DescribeImageBaselineCheckSummaryResponse.BaselineResultSummary["+ i +"].MiddleRiskImage"));
			baselineResultSummaryItem.setBaselineNameLevel(_ctx.stringValue("DescribeImageBaselineCheckSummaryResponse.BaselineResultSummary["+ i +"].BaselineNameLevel"));
			baselineResultSummaryItem.setLastScanTime(_ctx.longValue("DescribeImageBaselineCheckSummaryResponse.BaselineResultSummary["+ i +"].LastScanTime"));
			baselineResultSummaryItem.setHighRiskImage(_ctx.integerValue("DescribeImageBaselineCheckSummaryResponse.BaselineResultSummary["+ i +"].HighRiskImage"));
			baselineResultSummaryItem.setBaselineNameKey(_ctx.stringValue("DescribeImageBaselineCheckSummaryResponse.BaselineResultSummary["+ i +"].BaselineNameKey"));
			baselineResultSummaryItem.setBaselineClassKey(_ctx.stringValue("DescribeImageBaselineCheckSummaryResponse.BaselineResultSummary["+ i +"].BaselineClassKey"));
			baselineResultSummaryItem.setBaselineNameAlias(_ctx.stringValue("DescribeImageBaselineCheckSummaryResponse.BaselineResultSummary["+ i +"].BaselineNameAlias"));
			baselineResultSummaryItem.setBaselineClassAlias(_ctx.stringValue("DescribeImageBaselineCheckSummaryResponse.BaselineResultSummary["+ i +"].BaselineClassAlias"));
			baselineResultSummaryItem.setFirstScanTime(_ctx.longValue("DescribeImageBaselineCheckSummaryResponse.BaselineResultSummary["+ i +"].FirstScanTime"));
			baselineResultSummaryItem.setLowRiskImage(_ctx.integerValue("DescribeImageBaselineCheckSummaryResponse.BaselineResultSummary["+ i +"].LowRiskImage"));

			baselineResultSummary.add(baselineResultSummaryItem);
		}
		describeImageBaselineCheckSummaryResponse.setBaselineResultSummary(baselineResultSummary);
	 
	 	return describeImageBaselineCheckSummaryResponse;
	}
}