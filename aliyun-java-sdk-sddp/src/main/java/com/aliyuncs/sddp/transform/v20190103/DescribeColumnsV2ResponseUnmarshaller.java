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

import com.aliyuncs.sddp.model.v20190103.DescribeColumnsV2Response;
import com.aliyuncs.sddp.model.v20190103.DescribeColumnsV2Response.Column;
import com.aliyuncs.sddp.model.v20190103.DescribeColumnsV2Response.Column.ModelTagsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeColumnsV2ResponseUnmarshaller {

	public static DescribeColumnsV2Response unmarshall(DescribeColumnsV2Response describeColumnsV2Response, UnmarshallerContext _ctx) {
		
		describeColumnsV2Response.setRequestId(_ctx.stringValue("DescribeColumnsV2Response.RequestId"));
		describeColumnsV2Response.setCurrentPage(_ctx.integerValue("DescribeColumnsV2Response.CurrentPage"));
		describeColumnsV2Response.setPageSize(_ctx.integerValue("DescribeColumnsV2Response.PageSize"));
		describeColumnsV2Response.setTotalCount(_ctx.integerValue("DescribeColumnsV2Response.TotalCount"));

		List<Column> items = new ArrayList<Column>();
		for (int i = 0; i < _ctx.lengthValue("DescribeColumnsV2Response.Items.Length"); i++) {
			Column column = new Column();
			column.setCreationTime(_ctx.longValue("DescribeColumnsV2Response.Items["+ i +"].CreationTime"));
			column.setTableName(_ctx.stringValue("DescribeColumnsV2Response.Items["+ i +"].TableName"));
			column.setDataType(_ctx.stringValue("DescribeColumnsV2Response.Items["+ i +"].DataType"));
			column.setOdpsRiskLevelValue(_ctx.integerValue("DescribeColumnsV2Response.Items["+ i +"].OdpsRiskLevelValue"));
			column.setDepartName(_ctx.stringValue("DescribeColumnsV2Response.Items["+ i +"].DepartName"));
			column.setInstanceId(_ctx.longValue("DescribeColumnsV2Response.Items["+ i +"].InstanceId"));
			column.setRiskLevelId(_ctx.longValue("DescribeColumnsV2Response.Items["+ i +"].RiskLevelId"));
			column.setRuleName(_ctx.stringValue("DescribeColumnsV2Response.Items["+ i +"].RuleName"));
			column.setRuleId(_ctx.longValue("DescribeColumnsV2Response.Items["+ i +"].RuleId"));
			column.setSensitive(_ctx.booleanValue("DescribeColumnsV2Response.Items["+ i +"].Sensitive"));
			column.setSensLevelName(_ctx.stringValue("DescribeColumnsV2Response.Items["+ i +"].SensLevelName"));
			column.setInstanceName(_ctx.stringValue("DescribeColumnsV2Response.Items["+ i +"].InstanceName"));
			column.setRiskLevelName(_ctx.stringValue("DescribeColumnsV2Response.Items["+ i +"].RiskLevelName"));
			column.setOdpsRiskLevelName(_ctx.stringValue("DescribeColumnsV2Response.Items["+ i +"].OdpsRiskLevelName"));
			column.setName(_ctx.stringValue("DescribeColumnsV2Response.Items["+ i +"].Name"));
			column.setTableId(_ctx.longValue("DescribeColumnsV2Response.Items["+ i +"].TableId"));
			column.setId(_ctx.stringValue("DescribeColumnsV2Response.Items["+ i +"].Id"));
			column.setProductCode(_ctx.stringValue("DescribeColumnsV2Response.Items["+ i +"].ProductCode"));
			column.setRevisionStatus(_ctx.longValue("DescribeColumnsV2Response.Items["+ i +"].RevisionStatus"));
			column.setRevisionId(_ctx.longValue("DescribeColumnsV2Response.Items["+ i +"].RevisionId"));

			List<String> sampleList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeColumnsV2Response.Items["+ i +"].SampleList.Length"); j++) {
				sampleList.add(_ctx.stringValue("DescribeColumnsV2Response.Items["+ i +"].SampleList["+ j +"]"));
			}
			column.setSampleList(sampleList);

			List<ModelTagsItem> modelTags = new ArrayList<ModelTagsItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeColumnsV2Response.Items["+ i +"].ModelTags.Length"); j++) {
				ModelTagsItem modelTagsItem = new ModelTagsItem();
				modelTagsItem.setId(_ctx.longValue("DescribeColumnsV2Response.Items["+ i +"].ModelTags["+ j +"].Id"));
				modelTagsItem.setName(_ctx.stringValue("DescribeColumnsV2Response.Items["+ i +"].ModelTags["+ j +"].Name"));

				modelTags.add(modelTagsItem);
			}
			column.setModelTags(modelTags);

			items.add(column);
		}
		describeColumnsV2Response.setItems(items);
	 
	 	return describeColumnsV2Response;
	}
}