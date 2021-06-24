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

package com.aliyuncs.ecsops.transform.v20160401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsops.model.v20160401.OpsDescribeCommandSupplierResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeCommandSupplierResponse.Supplier;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribeCommandSupplierResponseUnmarshaller {

	public static OpsDescribeCommandSupplierResponse unmarshall(OpsDescribeCommandSupplierResponse opsDescribeCommandSupplierResponse, UnmarshallerContext _ctx) {
		
		opsDescribeCommandSupplierResponse.setRequestId(_ctx.stringValue("OpsDescribeCommandSupplierResponse.RequestId"));
		opsDescribeCommandSupplierResponse.setPageSize(_ctx.integerValue("OpsDescribeCommandSupplierResponse.PageSize"));
		opsDescribeCommandSupplierResponse.setTotal(_ctx.integerValue("OpsDescribeCommandSupplierResponse.Total"));
		opsDescribeCommandSupplierResponse.setPageNo(_ctx.integerValue("OpsDescribeCommandSupplierResponse.PageNo"));

		List<Supplier> supplierList = new ArrayList<Supplier>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeCommandSupplierResponse.SupplierList.Length"); i++) {
			Supplier supplier = new Supplier();
			supplier.setDisplayName(_ctx.stringValue("OpsDescribeCommandSupplierResponse.SupplierList["+ i +"].DisplayName"));
			supplier.setDescription(_ctx.stringValue("OpsDescribeCommandSupplierResponse.SupplierList["+ i +"].Description"));
			supplier.setEmployeeId(_ctx.stringValue("OpsDescribeCommandSupplierResponse.SupplierList["+ i +"].EmployeeId"));
			supplier.setAliyunUid(_ctx.longValue("OpsDescribeCommandSupplierResponse.SupplierList["+ i +"].AliyunUid"));
			supplier.setSupplierId(_ctx.stringValue("OpsDescribeCommandSupplierResponse.SupplierList["+ i +"].SupplierId"));
			supplier.setActiveStatus(_ctx.stringValue("OpsDescribeCommandSupplierResponse.SupplierList["+ i +"].ActiveStatus"));

			supplierList.add(supplier);
		}
		opsDescribeCommandSupplierResponse.setSupplierList(supplierList);
	 
	 	return opsDescribeCommandSupplierResponse;
	}
}