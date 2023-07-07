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

package com.aliyuncs.sddp.transform.v20190103;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sddp.model.v20190103.DescribeOssObjectDetailV2Response;
import com.aliyuncs.sddp.model.v20190103.DescribeOssObjectDetailV2Response.OssObjectDetail;
import com.aliyuncs.sddp.model.v20190103.DescribeOssObjectDetailV2Response.OssObjectDetail.Rule;
import com.aliyuncs.sddp.model.v20190103.DescribeOssObjectDetailV2Response.OssObjectDetail.Rule.ModelTagsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeOssObjectDetailV2ResponseUnmarshaller {

	public static DescribeOssObjectDetailV2Response unmarshall(DescribeOssObjectDetailV2Response describeOssObjectDetailV2Response, UnmarshallerContext _ctx) {
		
		describeOssObjectDetailV2Response.setRequestId(_ctx.stringValue("DescribeOssObjectDetailV2Response.RequestId"));

		OssObjectDetail ossObjectDetail = new OssObjectDetail();
		ossObjectDetail.setCategoryName(_ctx.stringValue("DescribeOssObjectDetailV2Response.OssObjectDetail.CategoryName"));
		ossObjectDetail.setName(_ctx.stringValue("DescribeOssObjectDetailV2Response.OssObjectDetail.Name"));
		ossObjectDetail.setBucketName(_ctx.stringValue("DescribeOssObjectDetailV2Response.OssObjectDetail.BucketName"));
		ossObjectDetail.setRiskLevelName(_ctx.stringValue("DescribeOssObjectDetailV2Response.OssObjectDetail.RiskLevelName"));
		ossObjectDetail.setRegionId(_ctx.stringValue("DescribeOssObjectDetailV2Response.OssObjectDetail.RegionId"));

		List<Rule> ruleList = new ArrayList<Rule>();
		for (int i = 0; i < _ctx.lengthValue("DescribeOssObjectDetailV2Response.OssObjectDetail.RuleList.Length"); i++) {
			Rule rule = new Rule();
			rule.setRiskLevelName(_ctx.stringValue("DescribeOssObjectDetailV2Response.OssObjectDetail.RuleList["+ i +"].RiskLevelName"));
			rule.setCategory(_ctx.integerValue("DescribeOssObjectDetailV2Response.OssObjectDetail.RuleList["+ i +"].Category"));
			rule.setCategoryName(_ctx.stringValue("DescribeOssObjectDetailV2Response.OssObjectDetail.RuleList["+ i +"].CategoryName"));
			rule.setRiskLevelId(_ctx.longValue("DescribeOssObjectDetailV2Response.OssObjectDetail.RuleList["+ i +"].RiskLevelId"));
			rule.setCount(_ctx.longValue("DescribeOssObjectDetailV2Response.OssObjectDetail.RuleList["+ i +"].Count"));
			rule.setRuleName(_ctx.stringValue("DescribeOssObjectDetailV2Response.OssObjectDetail.RuleList["+ i +"].RuleName"));

			List<String> sampleList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeOssObjectDetailV2Response.OssObjectDetail.RuleList["+ i +"].SampleList.Length"); j++) {
				sampleList.add(_ctx.stringValue("DescribeOssObjectDetailV2Response.OssObjectDetail.RuleList["+ i +"].SampleList["+ j +"]"));
			}
			rule.setSampleList(sampleList);

			List<ModelTagsItem> modelTags = new ArrayList<ModelTagsItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeOssObjectDetailV2Response.OssObjectDetail.RuleList["+ i +"].ModelTags.Length"); j++) {
				ModelTagsItem modelTagsItem = new ModelTagsItem();
				modelTagsItem.setId(_ctx.longValue("DescribeOssObjectDetailV2Response.OssObjectDetail.RuleList["+ i +"].ModelTags["+ j +"].Id"));
				modelTagsItem.setName(_ctx.stringValue("DescribeOssObjectDetailV2Response.OssObjectDetail.RuleList["+ i +"].ModelTags["+ j +"].Name"));

				modelTags.add(modelTagsItem);
			}
			rule.setModelTags(modelTags);

			ruleList.add(rule);
		}
		ossObjectDetail.setRuleList(ruleList);
		describeOssObjectDetailV2Response.setOssObjectDetail(ossObjectDetail);
	 
	 	return describeOssObjectDetailV2Response;
	}
}