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

	public static DescribeRulesResponse unmarshall(DescribeRulesResponse describeRulesResponse, UnmarshallerContext _ctx) {
		
		describeRulesResponse.setRequestId(_ctx.stringValue("DescribeRulesResponse.RequestId"));
		describeRulesResponse.setPageSize(_ctx.integerValue("DescribeRulesResponse.PageSize"));
		describeRulesResponse.setCurrentPage(_ctx.integerValue("DescribeRulesResponse.CurrentPage"));
		describeRulesResponse.setTotalCount(_ctx.integerValue("DescribeRulesResponse.TotalCount"));

		List<Rule> items = new ArrayList<Rule>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRulesResponse.Items.Length"); i++) {
			Rule rule = new Rule();
			rule.setId(_ctx.longValue("DescribeRulesResponse.Items["+ i +"].Id"));
			rule.setGmtCreate(_ctx.longValue("DescribeRulesResponse.Items["+ i +"].GmtCreate"));
			rule.setGmtModified(_ctx.longValue("DescribeRulesResponse.Items["+ i +"].GmtModified"));
			rule.setCustomType(_ctx.integerValue("DescribeRulesResponse.Items["+ i +"].CustomType"));
			rule.setName(_ctx.stringValue("DescribeRulesResponse.Items["+ i +"].Name"));
			rule.setDescription(_ctx.stringValue("DescribeRulesResponse.Items["+ i +"].Description"));
			rule.setUserId(_ctx.longValue("DescribeRulesResponse.Items["+ i +"].UserId"));
			rule.setLoginName(_ctx.stringValue("DescribeRulesResponse.Items["+ i +"].LoginName"));
			rule.setDisplayName(_ctx.stringValue("DescribeRulesResponse.Items["+ i +"].DisplayName"));
			rule.setCategory(_ctx.integerValue("DescribeRulesResponse.Items["+ i +"].Category"));
			rule.setCategoryName(_ctx.stringValue("DescribeRulesResponse.Items["+ i +"].CategoryName"));
			rule.setStatus(_ctx.integerValue("DescribeRulesResponse.Items["+ i +"].Status"));
			rule.setRiskLevelName(_ctx.stringValue("DescribeRulesResponse.Items["+ i +"].RiskLevelName"));
			rule.setRiskLevelId(_ctx.longValue("DescribeRulesResponse.Items["+ i +"].RiskLevelId"));
			rule.setContent(_ctx.stringValue("DescribeRulesResponse.Items["+ i +"].Content"));
			rule.setDepartName(_ctx.stringValue("DescribeRulesResponse.Items["+ i +"].DepartName"));
			rule.setStatExpress(_ctx.stringValue("DescribeRulesResponse.Items["+ i +"].StatExpress"));
			rule.setProductId(_ctx.longValue("DescribeRulesResponse.Items["+ i +"].ProductId"));
			rule.setHitTotalCount(_ctx.integerValue("DescribeRulesResponse.Items["+ i +"].HitTotalCount"));
			rule.setProductCode(_ctx.stringValue("DescribeRulesResponse.Items["+ i +"].ProductCode"));
			rule.setWarnLevel(_ctx.integerValue("DescribeRulesResponse.Items["+ i +"].WarnLevel"));

			items.add(rule);
		}
		describeRulesResponse.setItems(items);
	 
	 	return describeRulesResponse;
	}
}