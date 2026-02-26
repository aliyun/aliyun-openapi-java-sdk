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

package com.aliyuncs.adb.transform.v20190315;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.adb.model.v20190315.DescribeAppliedAdvicesResponse;
import com.aliyuncs.adb.model.v20190315.DescribeAppliedAdvicesResponse.ItemsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAppliedAdvicesResponseUnmarshaller {

	public static DescribeAppliedAdvicesResponse unmarshall(DescribeAppliedAdvicesResponse describeAppliedAdvicesResponse, UnmarshallerContext _ctx) {
		
		describeAppliedAdvicesResponse.setRequestId(_ctx.stringValue("DescribeAppliedAdvicesResponse.RequestId"));
		describeAppliedAdvicesResponse.setPageNumber(_ctx.longValue("DescribeAppliedAdvicesResponse.PageNumber"));
		describeAppliedAdvicesResponse.setPageSize(_ctx.longValue("DescribeAppliedAdvicesResponse.PageSize"));
		describeAppliedAdvicesResponse.setTotalCount(_ctx.longValue("DescribeAppliedAdvicesResponse.TotalCount"));

		List<String> schemaTableNames = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAppliedAdvicesResponse.SchemaTableNames.Length"); i++) {
			schemaTableNames.add(_ctx.stringValue("DescribeAppliedAdvicesResponse.SchemaTableNames["+ i +"]"));
		}
		describeAppliedAdvicesResponse.setSchemaTableNames(schemaTableNames);

		List<ItemsItem> items = new ArrayList<ItemsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAppliedAdvicesResponse.Items.Length"); i++) {
			ItemsItem itemsItem = new ItemsItem();
			itemsItem.setAdviceId(_ctx.stringValue("DescribeAppliedAdvicesResponse.Items["+ i +"].AdviceId"));
			itemsItem.setSubmitTime(_ctx.stringValue("DescribeAppliedAdvicesResponse.Items["+ i +"].SubmitTime"));
			itemsItem.setSubmitStatus(_ctx.stringValue("DescribeAppliedAdvicesResponse.Items["+ i +"].SubmitStatus"));
			itemsItem.setSQL(_ctx.stringValue("DescribeAppliedAdvicesResponse.Items["+ i +"].SQL"));
			itemsItem.setRollbackSQL(_ctx.stringValue("DescribeAppliedAdvicesResponse.Items["+ i +"].RollbackSQL"));
			itemsItem.setJobStatus(_ctx.stringValue("DescribeAppliedAdvicesResponse.Items["+ i +"].JobStatus"));
			itemsItem.setBenefit(_ctx.stringValue("DescribeAppliedAdvicesResponse.Items["+ i +"].Benefit"));
			itemsItem.setBuildSQL(_ctx.stringValue("DescribeAppliedAdvicesResponse.Items["+ i +"].BuildSQL"));
			itemsItem.setTotalCount(_ctx.longValue("DescribeAppliedAdvicesResponse.Items["+ i +"].TotalCount"));
			itemsItem.setPageSize(_ctx.longValue("DescribeAppliedAdvicesResponse.Items["+ i +"].PageSize"));
			itemsItem.setPageNumber(_ctx.longValue("DescribeAppliedAdvicesResponse.Items["+ i +"].PageNumber"));
			itemsItem.setSchemaName(_ctx.stringValue("DescribeAppliedAdvicesResponse.Items["+ i +"].SchemaName"));
			itemsItem.setTableName(_ctx.stringValue("DescribeAppliedAdvicesResponse.Items["+ i +"].TableName"));

			items.add(itemsItem);
		}
		describeAppliedAdvicesResponse.setItems(items);
	 
	 	return describeAppliedAdvicesResponse;
	}
}