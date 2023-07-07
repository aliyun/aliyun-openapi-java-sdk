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

import com.aliyuncs.sddp.model.v20190103.DescribeDataObjectColumnDetailV2Response;
import com.aliyuncs.sddp.model.v20190103.DescribeDataObjectColumnDetailV2Response.Rule;
import com.aliyuncs.sddp.model.v20190103.DescribeDataObjectColumnDetailV2Response.Rule.ModelTagsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDataObjectColumnDetailV2ResponseUnmarshaller {

	public static DescribeDataObjectColumnDetailV2Response unmarshall(DescribeDataObjectColumnDetailV2Response describeDataObjectColumnDetailV2Response, UnmarshallerContext _ctx) {
		
		describeDataObjectColumnDetailV2Response.setRequestId(_ctx.stringValue("DescribeDataObjectColumnDetailV2Response.RequestId"));
		describeDataObjectColumnDetailV2Response.setCurrentPage(_ctx.integerValue("DescribeDataObjectColumnDetailV2Response.CurrentPage"));
		describeDataObjectColumnDetailV2Response.setPageSize(_ctx.integerValue("DescribeDataObjectColumnDetailV2Response.PageSize"));
		describeDataObjectColumnDetailV2Response.setTotalCount(_ctx.integerValue("DescribeDataObjectColumnDetailV2Response.TotalCount"));

		List<Rule> items = new ArrayList<Rule>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDataObjectColumnDetailV2Response.Items.Length"); i++) {
			Rule rule = new Rule();
			rule.setColumnName(_ctx.stringValue("DescribeDataObjectColumnDetailV2Response.Items["+ i +"].ColumnName"));
			rule.setDataType(_ctx.stringValue("DescribeDataObjectColumnDetailV2Response.Items["+ i +"].DataType"));
			rule.setColumnComment(_ctx.stringValue("DescribeDataObjectColumnDetailV2Response.Items["+ i +"].ColumnComment"));
			rule.setPrimaryKey(_ctx.booleanValue("DescribeDataObjectColumnDetailV2Response.Items["+ i +"].PrimaryKey"));
			rule.setId(_ctx.stringValue("DescribeDataObjectColumnDetailV2Response.Items["+ i +"].Id"));
			rule.setRiskLevelId(_ctx.longValue("DescribeDataObjectColumnDetailV2Response.Items["+ i +"].RiskLevelId"));
			rule.setRiskLevelName(_ctx.stringValue("DescribeDataObjectColumnDetailV2Response.Items["+ i +"].RiskLevelName"));
			rule.setRuleId(_ctx.longValue("DescribeDataObjectColumnDetailV2Response.Items["+ i +"].RuleId"));
			rule.setRuleName(_ctx.stringValue("DescribeDataObjectColumnDetailV2Response.Items["+ i +"].RuleName"));

			List<String> categories = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDataObjectColumnDetailV2Response.Items["+ i +"].Categories.Length"); j++) {
				categories.add(_ctx.stringValue("DescribeDataObjectColumnDetailV2Response.Items["+ i +"].Categories["+ j +"]"));
			}
			rule.setCategories(categories);

			List<ModelTagsItem> modelTags = new ArrayList<ModelTagsItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDataObjectColumnDetailV2Response.Items["+ i +"].ModelTags.Length"); j++) {
				ModelTagsItem modelTagsItem = new ModelTagsItem();
				modelTagsItem.setId(_ctx.longValue("DescribeDataObjectColumnDetailV2Response.Items["+ i +"].ModelTags["+ j +"].Id"));
				modelTagsItem.setName(_ctx.stringValue("DescribeDataObjectColumnDetailV2Response.Items["+ i +"].ModelTags["+ j +"].Name"));

				modelTags.add(modelTagsItem);
			}
			rule.setModelTags(modelTags);

			items.add(rule);
		}
		describeDataObjectColumnDetailV2Response.setItems(items);
	 
	 	return describeDataObjectColumnDetailV2Response;
	}
}