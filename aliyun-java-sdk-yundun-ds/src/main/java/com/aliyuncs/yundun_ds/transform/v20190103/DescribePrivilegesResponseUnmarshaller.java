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

import com.aliyuncs.yundun_ds.model.v20190103.DescribePrivilegesResponse;
import com.aliyuncs.yundun_ds.model.v20190103.DescribePrivilegesResponse.Privilege;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePrivilegesResponseUnmarshaller {

	public static DescribePrivilegesResponse unmarshall(DescribePrivilegesResponse describePrivilegesResponse, UnmarshallerContext context) {
		
		describePrivilegesResponse.setRequestId(context.stringValue("DescribePrivilegesResponse.RequestId"));
		describePrivilegesResponse.setPageSize(context.integerValue("DescribePrivilegesResponse.PageSize"));
		describePrivilegesResponse.setCurrentPage(context.integerValue("DescribePrivilegesResponse.CurrentPage"));
		describePrivilegesResponse.setTotalCount(context.integerValue("DescribePrivilegesResponse.TotalCount"));

		List<Privilege> items = new ArrayList<Privilege>();
		for (int i = 0; i < context.lengthValue("DescribePrivilegesResponse.Items.Length"); i++) {
			Privilege privilege = new Privilege();
			privilege.setId(context.longValue("DescribePrivilegesResponse.Items["+ i +"].Id"));
			privilege.setAccountId(context.longValue("DescribePrivilegesResponse.Items["+ i +"].AccountId"));
			privilege.setAccountType(context.integerValue("DescribePrivilegesResponse.Items["+ i +"].AccountType"));
			privilege.setUseAccountId(context.longValue("DescribePrivilegesResponse.Items["+ i +"].UseAccountId"));
			privilege.setUseAccountType(context.integerValue("DescribePrivilegesResponse.Items["+ i +"].UseAccountType"));
			privilege.setProductName(context.stringValue("DescribePrivilegesResponse.Items["+ i +"].ProductName"));
			privilege.setProductCode(context.stringValue("DescribePrivilegesResponse.Items["+ i +"].productCode"));
			privilege.setDataType(context.stringValue("DescribePrivilegesResponse.Items["+ i +"].DataType"));
			privilege.setDataTypeId(context.stringValue("DescribePrivilegesResponse.Items["+ i +"].DataTypeId"));
			privilege.setDataTypeName(context.stringValue("DescribePrivilegesResponse.Items["+ i +"].DataTypeName"));
			privilege.setDataInstance(context.stringValue("DescribePrivilegesResponse.Items["+ i +"].DataInstance"));
			privilege.setDataTable(context.stringValue("DescribePrivilegesResponse.Items["+ i +"].DataTable"));
			privilege.setDataColumn(context.stringValue("DescribePrivilegesResponse.Items["+ i +"].DataColumn"));
			privilege.setDataPackage(context.stringValue("DescribePrivilegesResponse.Items["+ i +"].DataPackage"));
			privilege.setResourceName(context.stringValue("DescribePrivilegesResponse.Items["+ i +"].ResourceName"));
			privilege.setResourcePath(context.stringValue("DescribePrivilegesResponse.Items["+ i +"].ResourcePath"));
			privilege.setOperation(context.stringValue("DescribePrivilegesResponse.Items["+ i +"].Operation"));
			privilege.setPolicyCondition(context.stringValue("DescribePrivilegesResponse.Items["+ i +"].PolicyCondition"));
			privilege.setSensitive(context.stringValue("DescribePrivilegesResponse.Items["+ i +"].Sensitive"));

			items.add(privilege);
		}
		describePrivilegesResponse.setItems(items);
	 
	 	return describePrivilegesResponse;
	}
}