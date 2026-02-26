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

import com.aliyuncs.sddp.model.v20190103.DescribeDataObjectColumnDetailResponse;
import com.aliyuncs.sddp.model.v20190103.DescribeDataObjectColumnDetailResponse.Rule;
import com.aliyuncs.sddp.model.v20190103.DescribeDataObjectColumnDetailResponse.Rule.ModelTagsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDataObjectColumnDetailResponseUnmarshaller {

	public static DescribeDataObjectColumnDetailResponse unmarshall(DescribeDataObjectColumnDetailResponse describeDataObjectColumnDetailResponse, UnmarshallerContext _ctx) {
		
		describeDataObjectColumnDetailResponse.setRequestId(_ctx.stringValue("DescribeDataObjectColumnDetailResponse.RequestId"));
		describeDataObjectColumnDetailResponse.setCurrentPage(_ctx.integerValue("DescribeDataObjectColumnDetailResponse.CurrentPage"));
		describeDataObjectColumnDetailResponse.setPageSize(_ctx.integerValue("DescribeDataObjectColumnDetailResponse.PageSize"));
		describeDataObjectColumnDetailResponse.setTotalCount(_ctx.integerValue("DescribeDataObjectColumnDetailResponse.TotalCount"));

		List<Rule> items = new ArrayList<Rule>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDataObjectColumnDetailResponse.Items.Length"); i++) {
			Rule rule = new Rule();
			rule.setColumnName(_ctx.stringValue("DescribeDataObjectColumnDetailResponse.Items["+ i +"].ColumnName"));
			rule.setDataType(_ctx.stringValue("DescribeDataObjectColumnDetailResponse.Items["+ i +"].DataType"));
			rule.setColumnComment(_ctx.stringValue("DescribeDataObjectColumnDetailResponse.Items["+ i +"].ColumnComment"));
			rule.setPrimaryKey(_ctx.booleanValue("DescribeDataObjectColumnDetailResponse.Items["+ i +"].PrimaryKey"));
			rule.setId(_ctx.stringValue("DescribeDataObjectColumnDetailResponse.Items["+ i +"].Id"));
			rule.setRiskLevelId(_ctx.longValue("DescribeDataObjectColumnDetailResponse.Items["+ i +"].RiskLevelId"));
			rule.setRiskLevelName(_ctx.stringValue("DescribeDataObjectColumnDetailResponse.Items["+ i +"].RiskLevelName"));
			rule.setRuleId(_ctx.longValue("DescribeDataObjectColumnDetailResponse.Items["+ i +"].RuleId"));
			rule.setRuleName(_ctx.stringValue("DescribeDataObjectColumnDetailResponse.Items["+ i +"].RuleName"));

			List<String> categories = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDataObjectColumnDetailResponse.Items["+ i +"].Categories.Length"); j++) {
				categories.add(_ctx.stringValue("DescribeDataObjectColumnDetailResponse.Items["+ i +"].Categories["+ j +"]"));
			}
			rule.setCategories(categories);

			List<ModelTagsItem> modelTags = new ArrayList<ModelTagsItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDataObjectColumnDetailResponse.Items["+ i +"].ModelTags.Length"); j++) {
				ModelTagsItem modelTagsItem = new ModelTagsItem();
				modelTagsItem.setId(_ctx.longValue("DescribeDataObjectColumnDetailResponse.Items["+ i +"].ModelTags["+ j +"].Id"));
				modelTagsItem.setName(_ctx.stringValue("DescribeDataObjectColumnDetailResponse.Items["+ i +"].ModelTags["+ j +"].Name"));

				modelTags.add(modelTagsItem);
			}
			rule.setModelTags(modelTags);

			items.add(rule);
		}
		describeDataObjectColumnDetailResponse.setItems(items);
	 
	 	return describeDataObjectColumnDetailResponse;
	}
}