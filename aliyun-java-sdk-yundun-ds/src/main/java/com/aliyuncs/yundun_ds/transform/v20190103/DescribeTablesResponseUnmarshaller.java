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

package com.aliyuncs.yundun_ds.transform.v20190103;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.yundun_ds.model.v20190103.DescribeTablesResponse;
import com.aliyuncs.yundun_ds.model.v20190103.DescribeTablesResponse.Table;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeTablesResponseUnmarshaller {

	public static DescribeTablesResponse unmarshall(DescribeTablesResponse describeTablesResponse, UnmarshallerContext context) {
		
		describeTablesResponse.setRequestId(context.stringValue("DescribeTablesResponse.RequestId"));
		describeTablesResponse.setPageSize(context.integerValue("DescribeTablesResponse.PageSize"));
		describeTablesResponse.setCurrentPage(context.integerValue("DescribeTablesResponse.CurrentPage"));
		describeTablesResponse.setTotalCount(context.integerValue("DescribeTablesResponse.TotalCount"));

		List<Table> items = new ArrayList<Table>();
		for (int i = 0; i < context.lengthValue("DescribeTablesResponse.Items.Length"); i++) {
			Table table = new Table();
			table.setId(context.longValue("DescribeTablesResponse.Items["+ i +"].Id"));
			table.setName(context.stringValue("DescribeTablesResponse.Items["+ i +"].Name"));
			table.setOwner(context.stringValue("DescribeTablesResponse.Items["+ i +"].Owner"));
			table.setCreationTime(context.longValue("DescribeTablesResponse.Items["+ i +"].CreationTime"));
			table.setProductId(context.stringValue("DescribeTablesResponse.Items["+ i +"].ProductId"));
			table.setProductCode(context.stringValue("DescribeTablesResponse.Items["+ i +"].ProductCode"));
			table.setSensitive(context.booleanValue("DescribeTablesResponse.Items["+ i +"].Sensitive"));
			table.setRiskLevelId(context.longValue("DescribeTablesResponse.Items["+ i +"].RiskLevelId"));
			table.setRiskLevelName(context.stringValue("DescribeTablesResponse.Items["+ i +"].RiskLevelName"));
			table.setDepartName(context.stringValue("DescribeTablesResponse.Items["+ i +"].DepartName"));
			table.setTotalCount(context.integerValue("DescribeTablesResponse.Items["+ i +"].TotalCount"));
			table.setSensitiveCount(context.integerValue("DescribeTablesResponse.Items["+ i +"].SensitiveCount"));
			table.setSensitiveRatio(context.stringValue("DescribeTablesResponse.Items["+ i +"].SensitiveRatio"));
			table.setInstanceId(context.longValue("DescribeTablesResponse.Items["+ i +"].InstanceId"));

			items.add(table);
		}
		describeTablesResponse.setItems(items);
	 
	 	return describeTablesResponse;
	}
}