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

import com.aliyuncs.sddp.model.v20190103.DescribeTablesResponse;
import com.aliyuncs.sddp.model.v20190103.DescribeTablesResponse.Table;
import com.aliyuncs.sddp.model.v20190103.DescribeTablesResponse.Table.Rule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeTablesResponseUnmarshaller {

	public static DescribeTablesResponse unmarshall(DescribeTablesResponse describeTablesResponse, UnmarshallerContext _ctx) {
		
		describeTablesResponse.setRequestId(_ctx.stringValue("DescribeTablesResponse.RequestId"));
		describeTablesResponse.setPageSize(_ctx.integerValue("DescribeTablesResponse.PageSize"));
		describeTablesResponse.setCurrentPage(_ctx.integerValue("DescribeTablesResponse.CurrentPage"));
		describeTablesResponse.setTotalCount(_ctx.integerValue("DescribeTablesResponse.TotalCount"));

		List<Table> items = new ArrayList<Table>();
		for (int i = 0; i < _ctx.lengthValue("DescribeTablesResponse.Items.Length"); i++) {
			Table table = new Table();
			table.setId(_ctx.longValue("DescribeTablesResponse.Items["+ i +"].Id"));
			table.setName(_ctx.stringValue("DescribeTablesResponse.Items["+ i +"].Name"));
			table.setOwner(_ctx.stringValue("DescribeTablesResponse.Items["+ i +"].Owner"));
			table.setCreationTime(_ctx.longValue("DescribeTablesResponse.Items["+ i +"].CreationTime"));
			table.setProductId(_ctx.stringValue("DescribeTablesResponse.Items["+ i +"].ProductId"));
			table.setProductCode(_ctx.stringValue("DescribeTablesResponse.Items["+ i +"].ProductCode"));
			table.setSensitive(_ctx.booleanValue("DescribeTablesResponse.Items["+ i +"].Sensitive"));
			table.setRiskLevelId(_ctx.longValue("DescribeTablesResponse.Items["+ i +"].RiskLevelId"));
			table.setRiskLevelName(_ctx.stringValue("DescribeTablesResponse.Items["+ i +"].RiskLevelName"));
			table.setDepartName(_ctx.stringValue("DescribeTablesResponse.Items["+ i +"].DepartName"));
			table.setTotalCount(_ctx.integerValue("DescribeTablesResponse.Items["+ i +"].TotalCount"));
			table.setSensitiveCount(_ctx.integerValue("DescribeTablesResponse.Items["+ i +"].SensitiveCount"));
			table.setSensitiveRatio(_ctx.stringValue("DescribeTablesResponse.Items["+ i +"].SensitiveRatio"));
			table.setInstanceId(_ctx.longValue("DescribeTablesResponse.Items["+ i +"].InstanceId"));
			table.setS2Count(_ctx.integerValue("DescribeTablesResponse.Items["+ i +"].S2Count"));
			table.setS3Count(_ctx.integerValue("DescribeTablesResponse.Items["+ i +"].S3Count"));
			table.setS1Count(_ctx.integerValue("DescribeTablesResponse.Items["+ i +"].S1Count"));
			table.setCountDetails(_ctx.stringValue("DescribeTablesResponse.Items["+ i +"].CountDetails"));
			table.setTotalRows(_ctx.integerValue("DescribeTablesResponse.Items["+ i +"].TotalRows"));
			table.setLastScanTime(_ctx.longValue("DescribeTablesResponse.Items["+ i +"].LastScanTime"));
			table.setRegionName(_ctx.stringValue("DescribeTablesResponse.Items["+ i +"].RegionName"));
			table.setInstanceName(_ctx.stringValue("DescribeTablesResponse.Items["+ i +"].InstanceName"));
			table.setSensLevelName(_ctx.stringValue("DescribeTablesResponse.Items["+ i +"].SensLevelName"));
			table.setInstanceDescription(_ctx.stringValue("DescribeTablesResponse.Items["+ i +"].InstanceDescription"));
			table.setTenantName(_ctx.stringValue("DescribeTablesResponse.Items["+ i +"].TenantName"));

			List<Rule> ruleList = new ArrayList<Rule>();
			for (int j = 0; j < _ctx.lengthValue("DescribeTablesResponse.Items["+ i +"].RuleList.Length"); j++) {
				Rule rule = new Rule();
				rule.setName(_ctx.stringValue("DescribeTablesResponse.Items["+ i +"].RuleList["+ j +"].Name"));
				rule.setDisplayName(_ctx.stringValue("DescribeTablesResponse.Items["+ i +"].RuleList["+ j +"].DisplayName"));
				rule.setCount(_ctx.longValue("DescribeTablesResponse.Items["+ i +"].RuleList["+ j +"].Count"));
				rule.setRiskLevelId(_ctx.longValue("DescribeTablesResponse.Items["+ i +"].RuleList["+ j +"].RiskLevelId"));

				ruleList.add(rule);
			}
			table.setRuleList(ruleList);

			items.add(table);
		}
		describeTablesResponse.setItems(items);
	 
	 	return describeTablesResponse;
	}
}