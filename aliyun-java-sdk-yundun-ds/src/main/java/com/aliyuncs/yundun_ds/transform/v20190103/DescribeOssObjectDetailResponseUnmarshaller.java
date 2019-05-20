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

package com.aliyuncs.yundun_ds.transform.v20190103;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.yundun_ds.model.v20190103.DescribeOssObjectDetailResponse;
import com.aliyuncs.yundun_ds.model.v20190103.DescribeOssObjectDetailResponse.OssObjectDetail;
import com.aliyuncs.yundun_ds.model.v20190103.DescribeOssObjectDetailResponse.OssObjectDetail.Rule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeOssObjectDetailResponseUnmarshaller {

	public static DescribeOssObjectDetailResponse unmarshall(DescribeOssObjectDetailResponse describeOssObjectDetailResponse, UnmarshallerContext context) {
		
		describeOssObjectDetailResponse.setRequestId(context.stringValue("DescribeOssObjectDetailResponse.RequestId"));

		OssObjectDetail ossObjectDetail = new OssObjectDetail();
		ossObjectDetail.setName(context.stringValue("DescribeOssObjectDetailResponse.OssObjectDetail.Name"));
		ossObjectDetail.setRegionId(context.stringValue("DescribeOssObjectDetailResponse.OssObjectDetail.RegionId"));
		ossObjectDetail.setRiskLevelName(context.stringValue("DescribeOssObjectDetailResponse.OssObjectDetail.RiskLevelName"));
		ossObjectDetail.setBucketName(context.stringValue("DescribeOssObjectDetailResponse.OssObjectDetail.BucketName"));
		ossObjectDetail.setCategoryName(context.stringValue("DescribeOssObjectDetailResponse.OssObjectDetail.CategoryName"));

		List<Rule> ruleList = new ArrayList<Rule>();
		for (int i = 0; i < context.lengthValue("DescribeOssObjectDetailResponse.OssObjectDetail.RuleList.Length"); i++) {
			Rule rule = new Rule();
			rule.setRuleName(context.stringValue("DescribeOssObjectDetailResponse.OssObjectDetail.RuleList["+ i +"].RuleName"));
			rule.setCount(context.longValue("DescribeOssObjectDetailResponse.OssObjectDetail.RuleList["+ i +"].Count"));

			ruleList.add(rule);
		}
		ossObjectDetail.setRuleList(ruleList);
		describeOssObjectDetailResponse.setOssObjectDetail(ossObjectDetail);
	 
	 	return describeOssObjectDetailResponse;
	}
}