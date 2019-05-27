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

import com.aliyuncs.sddp.model.v20190103.DescribeColumnsResponse;
import com.aliyuncs.sddp.model.v20190103.DescribeColumnsResponse.Column;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeColumnsResponseUnmarshaller {

	public static DescribeColumnsResponse unmarshall(DescribeColumnsResponse describeColumnsResponse, UnmarshallerContext context) {
		
		describeColumnsResponse.setRequestId(context.stringValue("DescribeColumnsResponse.RequestId"));
		describeColumnsResponse.setPageSize(context.integerValue("DescribeColumnsResponse.PageSize"));
		describeColumnsResponse.setCurrentPage(context.integerValue("DescribeColumnsResponse.CurrentPage"));
		describeColumnsResponse.setTotalCount(context.integerValue("DescribeColumnsResponse.TotalCount"));

		List<Column> items = new ArrayList<Column>();
		for (int i = 0; i < context.lengthValue("DescribeColumnsResponse.Items.Length"); i++) {
			Column column = new Column();
			column.setId(context.longValue("DescribeColumnsResponse.Items["+ i +"].Id"));
			column.setName(context.stringValue("DescribeColumnsResponse.Items["+ i +"].Name"));
			column.setInstanceId(context.longValue("DescribeColumnsResponse.Items["+ i +"].InstanceId"));
			column.setTableId(context.longValue("DescribeColumnsResponse.Items["+ i +"].TableId"));
			column.setCreationTime(context.longValue("DescribeColumnsResponse.Items["+ i +"].CreationTime"));
			column.setSensitive(context.booleanValue("DescribeColumnsResponse.Items["+ i +"].Sensitive"));
			column.setProductCode(context.stringValue("DescribeColumnsResponse.Items["+ i +"].ProductCode"));
			column.setDataType(context.stringValue("DescribeColumnsResponse.Items["+ i +"].DataType"));
			column.setOdpsRiskLevelValue(context.integerValue("DescribeColumnsResponse.Items["+ i +"].OdpsRiskLevelValue"));
			column.setOdpsRiskLevelName(context.stringValue("DescribeColumnsResponse.Items["+ i +"].OdpsRiskLevelName"));
			column.setRiskLevelId(context.longValue("DescribeColumnsResponse.Items["+ i +"].RiskLevelId"));
			column.setRiskLevelName(context.stringValue("DescribeColumnsResponse.Items["+ i +"].RiskLevelName"));
			column.setRuleId(context.longValue("DescribeColumnsResponse.Items["+ i +"].RuleId"));
			column.setRuleName(context.stringValue("DescribeColumnsResponse.Items["+ i +"].RuleName"));
			column.setDepartName(context.stringValue("DescribeColumnsResponse.Items["+ i +"].DepartName"));

			items.add(column);
		}
		describeColumnsResponse.setItems(items);
	 
	 	return describeColumnsResponse;
	}
}