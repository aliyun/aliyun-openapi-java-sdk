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

import com.aliyuncs.sas.model.v20181203.DescribeImageBaselineCheckResultResponse;
import com.aliyuncs.sas.model.v20181203.DescribeImageBaselineCheckResultResponse.BaselineResultItem;
import com.aliyuncs.sas.model.v20181203.DescribeImageBaselineCheckResultResponse.PageInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeImageBaselineCheckResultResponseUnmarshaller {

	public static DescribeImageBaselineCheckResultResponse unmarshall(DescribeImageBaselineCheckResultResponse describeImageBaselineCheckResultResponse, UnmarshallerContext _ctx) {
		
		describeImageBaselineCheckResultResponse.setRequestId(_ctx.stringValue("DescribeImageBaselineCheckResultResponse.RequestId"));

		PageInfo pageInfo = new PageInfo();
		pageInfo.setCurrentPage(_ctx.integerValue("DescribeImageBaselineCheckResultResponse.PageInfo.CurrentPage"));
		pageInfo.setPageSize(_ctx.integerValue("DescribeImageBaselineCheckResultResponse.PageInfo.PageSize"));
		pageInfo.setTotalCount(_ctx.integerValue("DescribeImageBaselineCheckResultResponse.PageInfo.TotalCount"));
		pageInfo.setCount(_ctx.integerValue("DescribeImageBaselineCheckResultResponse.PageInfo.Count"));
		describeImageBaselineCheckResultResponse.setPageInfo(pageInfo);

		List<BaselineResultItem> baselineResult = new ArrayList<BaselineResultItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeImageBaselineCheckResultResponse.BaselineResult.Length"); i++) {
			BaselineResultItem baselineResultItem = new BaselineResultItem();
			baselineResultItem.setStatus(_ctx.integerValue("DescribeImageBaselineCheckResultResponse.BaselineResult["+ i +"].Status"));
			baselineResultItem.setLowRiskItemCount(_ctx.integerValue("DescribeImageBaselineCheckResultResponse.BaselineResult["+ i +"].LowRiskItemCount"));
			baselineResultItem.setBaselineNameLevel(_ctx.stringValue("DescribeImageBaselineCheckResultResponse.BaselineResult["+ i +"].BaselineNameLevel"));
			baselineResultItem.setLastScanTime(_ctx.longValue("DescribeImageBaselineCheckResultResponse.BaselineResult["+ i +"].LastScanTime"));
			baselineResultItem.setMiddleRiskItemCount(_ctx.integerValue("DescribeImageBaselineCheckResultResponse.BaselineResult["+ i +"].MiddleRiskItemCount"));
			baselineResultItem.setBaselineNameKey(_ctx.stringValue("DescribeImageBaselineCheckResultResponse.BaselineResult["+ i +"].BaselineNameKey"));
			baselineResultItem.setBaselineItemCount(_ctx.integerValue("DescribeImageBaselineCheckResultResponse.BaselineResult["+ i +"].BaselineItemCount"));
			baselineResultItem.setBaselineNameAlias(_ctx.stringValue("DescribeImageBaselineCheckResultResponse.BaselineResult["+ i +"].BaselineNameAlias"));
			baselineResultItem.setBaselineClassAlias(_ctx.stringValue("DescribeImageBaselineCheckResultResponse.BaselineResult["+ i +"].BaselineClassAlias"));
			baselineResultItem.setFirstScanTime(_ctx.longValue("DescribeImageBaselineCheckResultResponse.BaselineResult["+ i +"].FirstScanTime"));
			baselineResultItem.setHighRiskItemCount(_ctx.integerValue("DescribeImageBaselineCheckResultResponse.BaselineResult["+ i +"].HighRiskItemCount"));

			baselineResult.add(baselineResultItem);
		}
		describeImageBaselineCheckResultResponse.setBaselineResult(baselineResult);
	 
	 	return describeImageBaselineCheckResultResponse;
	}
}