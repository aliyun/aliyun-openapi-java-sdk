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

import com.aliyuncs.sddp.model.v20190103.DescribeDataObjectsResponse;
import com.aliyuncs.sddp.model.v20190103.DescribeDataObjectsResponse.Rule;
import com.aliyuncs.sddp.model.v20190103.DescribeDataObjectsResponse.Rule.ModelTagsItem;
import com.aliyuncs.sddp.model.v20190103.DescribeDataObjectsResponse.Rule.RuleListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDataObjectsResponseUnmarshaller {

	public static DescribeDataObjectsResponse unmarshall(DescribeDataObjectsResponse describeDataObjectsResponse, UnmarshallerContext _ctx) {
		
		describeDataObjectsResponse.setRequestId(_ctx.stringValue("DescribeDataObjectsResponse.RequestId"));
		describeDataObjectsResponse.setCurrentPage(_ctx.integerValue("DescribeDataObjectsResponse.CurrentPage"));
		describeDataObjectsResponse.setPageSize(_ctx.integerValue("DescribeDataObjectsResponse.PageSize"));
		describeDataObjectsResponse.setTotalCount(_ctx.integerValue("DescribeDataObjectsResponse.TotalCount"));

		List<Rule> items = new ArrayList<Rule>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDataObjectsResponse.Items.Length"); i++) {
			Rule rule = new Rule();
			rule.setName(_ctx.stringValue("DescribeDataObjectsResponse.Items["+ i +"].Name"));
			rule.setId(_ctx.stringValue("DescribeDataObjectsResponse.Items["+ i +"].Id"));
			rule.setTemplateId(_ctx.longValue("DescribeDataObjectsResponse.Items["+ i +"].TemplateId"));
			rule.setProductId(_ctx.longValue("DescribeDataObjectsResponse.Items["+ i +"].ProductId"));
			rule.setInstanceDescription(_ctx.stringValue("DescribeDataObjectsResponse.Items["+ i +"].InstanceDescription"));
			rule.setProductCode(_ctx.stringValue("DescribeDataObjectsResponse.Items["+ i +"].ProductCode"));
			rule.setInstanceId(_ctx.stringValue("DescribeDataObjectsResponse.Items["+ i +"].InstanceId"));
			rule.setLastScanTime(_ctx.longValue("DescribeDataObjectsResponse.Items["+ i +"].LastScanTime"));
			rule.setSensitiveCount(_ctx.integerValue("DescribeDataObjectsResponse.Items["+ i +"].SensitiveCount"));
			rule.setObjectType(_ctx.stringValue("DescribeDataObjectsResponse.Items["+ i +"].ObjectType"));
			rule.setPath(_ctx.stringValue("DescribeDataObjectsResponse.Items["+ i +"].Path"));
			rule.setRegionName(_ctx.stringValue("DescribeDataObjectsResponse.Items["+ i +"].RegionName"));

			List<String> categories = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDataObjectsResponse.Items["+ i +"].Categories.Length"); j++) {
				categories.add(_ctx.stringValue("DescribeDataObjectsResponse.Items["+ i +"].Categories["+ j +"]"));
			}
			rule.setCategories(categories);

			List<ModelTagsItem> modelTags = new ArrayList<ModelTagsItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDataObjectsResponse.Items["+ i +"].ModelTags.Length"); j++) {
				ModelTagsItem modelTagsItem = new ModelTagsItem();
				modelTagsItem.setId(_ctx.longValue("DescribeDataObjectsResponse.Items["+ i +"].ModelTags["+ j +"].Id"));
				modelTagsItem.setName(_ctx.stringValue("DescribeDataObjectsResponse.Items["+ i +"].ModelTags["+ j +"].Name"));

				modelTags.add(modelTagsItem);
			}
			rule.setModelTags(modelTags);

			List<RuleListItem> ruleList = new ArrayList<RuleListItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDataObjectsResponse.Items["+ i +"].RuleList.Length"); j++) {
				RuleListItem ruleListItem = new RuleListItem();
				ruleListItem.setRuleId(_ctx.longValue("DescribeDataObjectsResponse.Items["+ i +"].RuleList["+ j +"].RuleId"));
				ruleListItem.setRuleName(_ctx.stringValue("DescribeDataObjectsResponse.Items["+ i +"].RuleList["+ j +"].RuleName"));
				ruleListItem.setRiskLevelId(_ctx.longValue("DescribeDataObjectsResponse.Items["+ i +"].RuleList["+ j +"].RiskLevelId"));
				ruleListItem.setRiskLevelName(_ctx.stringValue("DescribeDataObjectsResponse.Items["+ i +"].RuleList["+ j +"].RiskLevelName"));
				ruleListItem.setRuleCount(_ctx.integerValue("DescribeDataObjectsResponse.Items["+ i +"].RuleList["+ j +"].RuleCount"));

				ruleList.add(ruleListItem);
			}
			rule.setRuleList(ruleList);

			items.add(rule);
		}
		describeDataObjectsResponse.setItems(items);
	 
	 	return describeDataObjectsResponse;
	}
}