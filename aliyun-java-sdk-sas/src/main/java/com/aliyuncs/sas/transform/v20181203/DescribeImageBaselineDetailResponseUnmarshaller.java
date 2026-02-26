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

import com.aliyuncs.sas.model.v20181203.DescribeImageBaselineDetailResponse;
import com.aliyuncs.sas.model.v20181203.DescribeImageBaselineDetailResponse.BaselineDetail;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeImageBaselineDetailResponseUnmarshaller {

	public static DescribeImageBaselineDetailResponse unmarshall(DescribeImageBaselineDetailResponse describeImageBaselineDetailResponse, UnmarshallerContext _ctx) {
		
		describeImageBaselineDetailResponse.setRequestId(_ctx.stringValue("DescribeImageBaselineDetailResponse.RequestId"));

		BaselineDetail baselineDetail = new BaselineDetail();
		baselineDetail.setAdvice(_ctx.stringValue("DescribeImageBaselineDetailResponse.BaselineDetail.Advice"));
		baselineDetail.setResultId(_ctx.stringValue("DescribeImageBaselineDetailResponse.BaselineDetail.ResultId"));
		baselineDetail.setDescription(_ctx.stringValue("DescribeImageBaselineDetailResponse.BaselineDetail.Description"));
		baselineDetail.setBaselineItemAlias(_ctx.stringValue("DescribeImageBaselineDetailResponse.BaselineDetail.BaselineItemAlias"));
		baselineDetail.setBaselineNameAlias(_ctx.stringValue("DescribeImageBaselineDetailResponse.BaselineDetail.BaselineNameAlias"));
		baselineDetail.setBaselineClassAlias(_ctx.stringValue("DescribeImageBaselineDetailResponse.BaselineDetail.BaselineClassAlias"));
		baselineDetail.setBaselineItemKey(_ctx.stringValue("DescribeImageBaselineDetailResponse.BaselineDetail.BaselineItemKey"));
		baselineDetail.setPrompt(_ctx.stringValue("DescribeImageBaselineDetailResponse.BaselineDetail.Prompt"));
		baselineDetail.setLevel(_ctx.stringValue("DescribeImageBaselineDetailResponse.BaselineDetail.Level"));
		describeImageBaselineDetailResponse.setBaselineDetail(baselineDetail);
	 
	 	return describeImageBaselineDetailResponse;
	}
}