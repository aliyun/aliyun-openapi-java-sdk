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

	public static DescribeColumnsResponse unmarshall(DescribeColumnsResponse describeColumnsResponse, UnmarshallerContext _ctx) {
		
		describeColumnsResponse.setRequestId(_ctx.stringValue("DescribeColumnsResponse.RequestId"));
		describeColumnsResponse.setCurrentPage(_ctx.integerValue("DescribeColumnsResponse.CurrentPage"));
		describeColumnsResponse.setPageSize(_ctx.integerValue("DescribeColumnsResponse.PageSize"));
		describeColumnsResponse.setTotalCount(_ctx.integerValue("DescribeColumnsResponse.TotalCount"));

		List<Column> items = new ArrayList<Column>();
		for (int i = 0; i < _ctx.lengthValue("DescribeColumnsResponse.Items.Length"); i++) {
			Column column = new Column();
			column.setCreationTime(_ctx.longValue("DescribeColumnsResponse.Items["+ i +"].CreationTime"));
			column.setTableName(_ctx.stringValue("DescribeColumnsResponse.Items["+ i +"].TableName"));
			column.setDataType(_ctx.stringValue("DescribeColumnsResponse.Items["+ i +"].DataType"));
			column.setOdpsRiskLevelValue(_ctx.integerValue("DescribeColumnsResponse.Items["+ i +"].OdpsRiskLevelValue"));
			column.setDepartName(_ctx.stringValue("DescribeColumnsResponse.Items["+ i +"].DepartName"));
			column.setInstanceId(_ctx.longValue("DescribeColumnsResponse.Items["+ i +"].InstanceId"));
			column.setRiskLevelId(_ctx.longValue("DescribeColumnsResponse.Items["+ i +"].RiskLevelId"));
			column.setRuleName(_ctx.stringValue("DescribeColumnsResponse.Items["+ i +"].RuleName"));
			column.setRuleId(_ctx.longValue("DescribeColumnsResponse.Items["+ i +"].RuleId"));
			column.setSensitive(_ctx.booleanValue("DescribeColumnsResponse.Items["+ i +"].Sensitive"));
			column.setSensLevelName(_ctx.stringValue("DescribeColumnsResponse.Items["+ i +"].SensLevelName"));
			column.setInstanceName(_ctx.stringValue("DescribeColumnsResponse.Items["+ i +"].InstanceName"));
			column.setRiskLevelName(_ctx.stringValue("DescribeColumnsResponse.Items["+ i +"].RiskLevelName"));
			column.setOdpsRiskLevelName(_ctx.stringValue("DescribeColumnsResponse.Items["+ i +"].OdpsRiskLevelName"));
			column.setName(_ctx.stringValue("DescribeColumnsResponse.Items["+ i +"].Name"));
			column.setTableId(_ctx.longValue("DescribeColumnsResponse.Items["+ i +"].TableId"));
			column.setId(_ctx.stringValue("DescribeColumnsResponse.Items["+ i +"].Id"));
			column.setProductCode(_ctx.stringValue("DescribeColumnsResponse.Items["+ i +"].ProductCode"));
			column.setRevisionStatus(_ctx.longValue("DescribeColumnsResponse.Items["+ i +"].RevisionStatus"));
			column.setRevisionId(_ctx.longValue("DescribeColumnsResponse.Items["+ i +"].RevisionId"));

			List<String> sampleList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeColumnsResponse.Items["+ i +"].SampleList.Length"); j++) {
				sampleList.add(_ctx.stringValue("DescribeColumnsResponse.Items["+ i +"].SampleList["+ j +"]"));
			}
			column.setSampleList(sampleList);

			items.add(column);
		}
		describeColumnsResponse.setItems(items);
	 
	 	return describeColumnsResponse;
	}
}