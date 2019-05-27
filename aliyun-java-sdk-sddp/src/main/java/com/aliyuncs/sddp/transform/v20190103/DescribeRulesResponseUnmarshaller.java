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

import com.aliyuncs.sddp.model.v20190103.DescribeRulesResponse;
import com.aliyuncs.sddp.model.v20190103.DescribeRulesResponse.Rule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRulesResponseUnmarshaller {

	public static DescribeRulesResponse unmarshall(DescribeRulesResponse describeRulesResponse, UnmarshallerContext context) {
		
		describeRulesResponse.setRequestId(context.stringValue("DescribeRulesResponse.RequestId"));
		describeRulesResponse.setPageSize(context.integerValue("DescribeRulesResponse.PageSize"));
		describeRulesResponse.setCurrentPage(context.integerValue("DescribeRulesResponse.CurrentPage"));
		describeRulesResponse.setTotalCount(context.integerValue("DescribeRulesResponse.TotalCount"));

		List<Rule> items = new ArrayList<Rule>();
		for (int i = 0; i < context.lengthValue("DescribeRulesResponse.Items.Length"); i++) {
			Rule rule = new Rule();
			rule.setId(context.longValue("DescribeRulesResponse.Items["+ i +"].Id"));
			rule.setGmtCreate(context.longValue("DescribeRulesResponse.Items["+ i +"].GmtCreate"));
			rule.setGmtModified(context.longValue("DescribeRulesResponse.Items["+ i +"].GmtModified"));
			rule.setCustomType(context.integerValue("DescribeRulesResponse.Items["+ i +"].CustomType"));
			rule.setName(context.stringValue("DescribeRulesResponse.Items["+ i +"].Name"));
			rule.setDescription(context.stringValue("DescribeRulesResponse.Items["+ i +"].Description"));
			rule.setUserId(context.longValue("DescribeRulesResponse.Items["+ i +"].UserId"));
			rule.setLoginName(context.stringValue("DescribeRulesResponse.Items["+ i +"].LoginName"));
			rule.setDisplayName(context.stringValue("DescribeRulesResponse.Items["+ i +"].DisplayName"));
			rule.setCategory(context.integerValue("DescribeRulesResponse.Items["+ i +"].Category"));
			rule.setCategoryName(context.stringValue("DescribeRulesResponse.Items["+ i +"].CategoryName"));
			rule.setStatus(context.integerValue("DescribeRulesResponse.Items["+ i +"].Status"));
			rule.setRiskLevelName(context.stringValue("DescribeRulesResponse.Items["+ i +"].RiskLevelName"));
			rule.setRiskLevelId(context.longValue("DescribeRulesResponse.Items["+ i +"].RiskLevelId"));
			rule.setContent(context.stringValue("DescribeRulesResponse.Items["+ i +"].Content"));
			rule.setDepartName(context.stringValue("DescribeRulesResponse.Items["+ i +"].DepartName"));

			items.add(rule);
		}
		describeRulesResponse.setItems(items);
	 
	 	return describeRulesResponse;
	}
}