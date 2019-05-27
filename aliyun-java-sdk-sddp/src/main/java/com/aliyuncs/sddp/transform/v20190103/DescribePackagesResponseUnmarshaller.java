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

import com.aliyuncs.sddp.model.v20190103.DescribePackagesResponse;
import com.aliyuncs.sddp.model.v20190103.DescribePackagesResponse._Package;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePackagesResponseUnmarshaller {

	public static DescribePackagesResponse unmarshall(DescribePackagesResponse describePackagesResponse, UnmarshallerContext context) {
		
		describePackagesResponse.setRequestId(context.stringValue("DescribePackagesResponse.RequestId"));
		describePackagesResponse.setPageSize(context.integerValue("DescribePackagesResponse.PageSize"));
		describePackagesResponse.setCurrentPage(context.integerValue("DescribePackagesResponse.CurrentPage"));
		describePackagesResponse.setTotalCount(context.integerValue("DescribePackagesResponse.TotalCount"));

		List<_Package> items = new ArrayList<_Package>();
		for (int i = 0; i < context.lengthValue("DescribePackagesResponse.Items.Length"); i++) {
			_Package _package = new _Package();
			_package.setId(context.longValue("DescribePackagesResponse.Items["+ i +"].Id"));
			_package.setName(context.stringValue("DescribePackagesResponse.Items["+ i +"].Name"));
			_package.setOwner(context.stringValue("DescribePackagesResponse.Items["+ i +"].Owner"));
			_package.setCreationTime(context.longValue("DescribePackagesResponse.Items["+ i +"].CreationTime"));
			_package.setSensitive(context.booleanValue("DescribePackagesResponse.Items["+ i +"].Sensitive"));
			_package.setRiskLevelId(context.longValue("DescribePackagesResponse.Items["+ i +"].RiskLevelId"));
			_package.setRiskLevelName(context.stringValue("DescribePackagesResponse.Items["+ i +"].RiskLevelName"));
			_package.setDepartName(context.stringValue("DescribePackagesResponse.Items["+ i +"].DepartName"));
			_package.setTotalCount(context.integerValue("DescribePackagesResponse.Items["+ i +"].TotalCount"));
			_package.setSensitiveCount(context.integerValue("DescribePackagesResponse.Items["+ i +"].SensitiveCount"));
			_package.setInstanceId(context.longValue("DescribePackagesResponse.Items["+ i +"].InstanceId"));

			items.add(_package);
		}
		describePackagesResponse.setItems(items);
	 
	 	return describePackagesResponse;
	}
}