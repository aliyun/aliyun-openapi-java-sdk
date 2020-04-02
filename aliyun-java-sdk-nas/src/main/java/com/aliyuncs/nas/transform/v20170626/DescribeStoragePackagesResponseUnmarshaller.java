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

package com.aliyuncs.nas.transform.v20170626;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.nas.model.v20170626.DescribeStoragePackagesResponse;
import com.aliyuncs.nas.model.v20170626.DescribeStoragePackagesResponse._Package;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeStoragePackagesResponseUnmarshaller {

	public static DescribeStoragePackagesResponse unmarshall(DescribeStoragePackagesResponse describeStoragePackagesResponse, UnmarshallerContext _ctx) {
		
		describeStoragePackagesResponse.setRequestId(_ctx.stringValue("DescribeStoragePackagesResponse.RequestId"));
		describeStoragePackagesResponse.setTotalCount(_ctx.integerValue("DescribeStoragePackagesResponse.TotalCount"));
		describeStoragePackagesResponse.setPageSize(_ctx.integerValue("DescribeStoragePackagesResponse.PageSize"));
		describeStoragePackagesResponse.setPageNumber(_ctx.integerValue("DescribeStoragePackagesResponse.PageNumber"));

		List<_Package> packages = new ArrayList<_Package>();
		for (int i = 0; i < _ctx.lengthValue("DescribeStoragePackagesResponse.Packages.Length"); i++) {
			_Package _package = new _Package();
			_package.setStartTime(_ctx.stringValue("DescribeStoragePackagesResponse.Packages["+ i +"].StartTime"));
			_package.setStorageType(_ctx.stringValue("DescribeStoragePackagesResponse.Packages["+ i +"].StorageType"));
			_package.setStatus(_ctx.stringValue("DescribeStoragePackagesResponse.Packages["+ i +"].Status"));
			_package.setFileSystemId(_ctx.stringValue("DescribeStoragePackagesResponse.Packages["+ i +"].FileSystemId"));
			_package.setPackageId(_ctx.stringValue("DescribeStoragePackagesResponse.Packages["+ i +"].PackageId"));
			_package.setExpiredTime(_ctx.stringValue("DescribeStoragePackagesResponse.Packages["+ i +"].ExpiredTime"));
			_package.setSize(_ctx.longValue("DescribeStoragePackagesResponse.Packages["+ i +"].Size"));

			packages.add(_package);
		}
		describeStoragePackagesResponse.setPackages(packages);
	 
	 	return describeStoragePackagesResponse;
	}
}