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

import com.aliyuncs.sddp.model.v20190103.DescribePrivilegesResponse;
import com.aliyuncs.sddp.model.v20190103.DescribePrivilegesResponse.Privilege;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePrivilegesResponseUnmarshaller {

	public static DescribePrivilegesResponse unmarshall(DescribePrivilegesResponse describePrivilegesResponse, UnmarshallerContext _ctx) {
		
		describePrivilegesResponse.setRequestId(_ctx.stringValue("DescribePrivilegesResponse.RequestId"));
		describePrivilegesResponse.setPageSize(_ctx.integerValue("DescribePrivilegesResponse.PageSize"));
		describePrivilegesResponse.setCurrentPage(_ctx.integerValue("DescribePrivilegesResponse.CurrentPage"));
		describePrivilegesResponse.setTotalCount(_ctx.integerValue("DescribePrivilegesResponse.TotalCount"));

		List<Privilege> items = new ArrayList<Privilege>();
		for (int i = 0; i < _ctx.lengthValue("DescribePrivilegesResponse.Items.Length"); i++) {
			Privilege privilege = new Privilege();
			privilege.setId(_ctx.longValue("DescribePrivilegesResponse.Items["+ i +"].Id"));
			privilege.setAccountId(_ctx.longValue("DescribePrivilegesResponse.Items["+ i +"].AccountId"));
			privilege.setAccountType(_ctx.integerValue("DescribePrivilegesResponse.Items["+ i +"].AccountType"));
			privilege.setUseAccountId(_ctx.longValue("DescribePrivilegesResponse.Items["+ i +"].UseAccountId"));
			privilege.setUseAccountType(_ctx.integerValue("DescribePrivilegesResponse.Items["+ i +"].UseAccountType"));
			privilege.setProductName(_ctx.stringValue("DescribePrivilegesResponse.Items["+ i +"].ProductName"));
			privilege.setProductCode(_ctx.stringValue("DescribePrivilegesResponse.Items["+ i +"].productCode"));
			privilege.setDataType(_ctx.stringValue("DescribePrivilegesResponse.Items["+ i +"].DataType"));
			privilege.setDataTypeId(_ctx.stringValue("DescribePrivilegesResponse.Items["+ i +"].DataTypeId"));
			privilege.setDataTypeName(_ctx.stringValue("DescribePrivilegesResponse.Items["+ i +"].DataTypeName"));
			privilege.setDataInstance(_ctx.stringValue("DescribePrivilegesResponse.Items["+ i +"].DataInstance"));
			privilege.setDataTable(_ctx.stringValue("DescribePrivilegesResponse.Items["+ i +"].DataTable"));
			privilege.setDataColumn(_ctx.stringValue("DescribePrivilegesResponse.Items["+ i +"].DataColumn"));
			privilege.setDataPackage(_ctx.stringValue("DescribePrivilegesResponse.Items["+ i +"].DataPackage"));
			privilege.setResourceName(_ctx.stringValue("DescribePrivilegesResponse.Items["+ i +"].ResourceName"));
			privilege.setResourcePath(_ctx.stringValue("DescribePrivilegesResponse.Items["+ i +"].ResourcePath"));
			privilege.setOperation(_ctx.stringValue("DescribePrivilegesResponse.Items["+ i +"].Operation"));
			privilege.setPolicyCondition(_ctx.stringValue("DescribePrivilegesResponse.Items["+ i +"].PolicyCondition"));
			privilege.setSensitive(_ctx.stringValue("DescribePrivilegesResponse.Items["+ i +"].Sensitive"));

			items.add(privilege);
		}
		describePrivilegesResponse.setItems(items);
	 
	 	return describePrivilegesResponse;
	}
}