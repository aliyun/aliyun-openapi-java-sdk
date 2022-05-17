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

package com.aliyuncs.retailbot.transform.v20210224;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.retailbot.model.v20210224.ListPackageVersionsResponse;
import com.aliyuncs.retailbot.model.v20210224.ListPackageVersionsResponse._Package;
import com.aliyuncs.retailbot.model.v20210224.ListPackageVersionsResponse._Package.PackageDetail;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPackageVersionsResponseUnmarshaller {

	public static ListPackageVersionsResponse unmarshall(ListPackageVersionsResponse listPackageVersionsResponse, UnmarshallerContext _ctx) {
		
		listPackageVersionsResponse.setRequestId(_ctx.stringValue("ListPackageVersionsResponse.RequestId"));
		listPackageVersionsResponse.setSuccess(_ctx.booleanValue("ListPackageVersionsResponse.Success"));
		listPackageVersionsResponse.setCode(_ctx.stringValue("ListPackageVersionsResponse.Code"));
		listPackageVersionsResponse.setMessage(_ctx.stringValue("ListPackageVersionsResponse.Message"));

		List<_Package> packages = new ArrayList<_Package>();
		for (int i = 0; i < _ctx.lengthValue("ListPackageVersionsResponse.Packages.Length"); i++) {
			_Package _package = new _Package();
			_package.setPackageName(_ctx.stringValue("ListPackageVersionsResponse.Packages["+ i +"].PackageName"));
			_package.setPackageCode(_ctx.stringValue("ListPackageVersionsResponse.Packages["+ i +"].PackageCode"));

			List<PackageDetail> packageDetails = new ArrayList<PackageDetail>();
			for (int j = 0; j < _ctx.lengthValue("ListPackageVersionsResponse.Packages["+ i +"].PackageDetails.Length"); j++) {
				PackageDetail packageDetail = new PackageDetail();
				packageDetail.setPackageVersion(_ctx.stringValue("ListPackageVersionsResponse.Packages["+ i +"].PackageDetails["+ j +"].PackageVersion"));
				packageDetail.setPackageDetailDescription(_ctx.stringValue("ListPackageVersionsResponse.Packages["+ i +"].PackageDetails["+ j +"].PackageDetailDescription"));
				packageDetail.setCreateTime(_ctx.stringValue("ListPackageVersionsResponse.Packages["+ i +"].PackageDetails["+ j +"].CreateTime"));
				packageDetail.setModifyTime(_ctx.stringValue("ListPackageVersionsResponse.Packages["+ i +"].PackageDetails["+ j +"].ModifyTime"));
				packageDetail.setCreateUserId(_ctx.stringValue("ListPackageVersionsResponse.Packages["+ i +"].PackageDetails["+ j +"].CreateUserId"));
				packageDetail.setModifyUserId(_ctx.stringValue("ListPackageVersionsResponse.Packages["+ i +"].PackageDetails["+ j +"].ModifyUserId"));
				packageDetail.setPublishTime(_ctx.stringValue("ListPackageVersionsResponse.Packages["+ i +"].PackageDetails["+ j +"].PublishTime"));

				packageDetails.add(packageDetail);
			}
			_package.setPackageDetails(packageDetails);

			packages.add(_package);
		}
		listPackageVersionsResponse.setPackages(packages);
	 
	 	return listPackageVersionsResponse;
	}
}