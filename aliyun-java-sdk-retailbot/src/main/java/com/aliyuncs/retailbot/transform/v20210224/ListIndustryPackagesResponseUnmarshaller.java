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

import com.aliyuncs.retailbot.model.v20210224.ListIndustryPackagesResponse;
import com.aliyuncs.retailbot.model.v20210224.ListIndustryPackagesResponse.PackagePage;
import com.aliyuncs.retailbot.model.v20210224.ListIndustryPackagesResponse.PackagePage._Package;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListIndustryPackagesResponseUnmarshaller {

	public static ListIndustryPackagesResponse unmarshall(ListIndustryPackagesResponse listIndustryPackagesResponse, UnmarshallerContext _ctx) {
		
		listIndustryPackagesResponse.setRequestId(_ctx.stringValue("ListIndustryPackagesResponse.RequestId"));
		listIndustryPackagesResponse.setSuccess(_ctx.booleanValue("ListIndustryPackagesResponse.Success"));
		listIndustryPackagesResponse.setCode(_ctx.stringValue("ListIndustryPackagesResponse.Code"));
		listIndustryPackagesResponse.setMessage(_ctx.stringValue("ListIndustryPackagesResponse.Message"));

		PackagePage packagePage = new PackagePage();
		packagePage.setNextToken(_ctx.integerValue("ListIndustryPackagesResponse.PackagePage.NextToken"));
		packagePage.setMaxResults(_ctx.integerValue("ListIndustryPackagesResponse.PackagePage.MaxResults"));
		packagePage.setTotalCount(_ctx.integerValue("ListIndustryPackagesResponse.PackagePage.TotalCount"));

		List<_Package> packages = new ArrayList<_Package>();
		for (int i = 0; i < _ctx.lengthValue("ListIndustryPackagesResponse.PackagePage.Packages.Length"); i++) {
			_Package _package = new _Package();
			_package.setPackageName(_ctx.stringValue("ListIndustryPackagesResponse.PackagePage.Packages["+ i +"].PackageName"));
			_package.setPackageCode(_ctx.stringValue("ListIndustryPackagesResponse.PackagePage.Packages["+ i +"].PackageCode"));
			_package.setPackageType(_ctx.stringValue("ListIndustryPackagesResponse.PackagePage.Packages["+ i +"].PackageType"));
			_package.setPackageDescription(_ctx.stringValue("ListIndustryPackagesResponse.PackagePage.Packages["+ i +"].PackageDescription"));
			_package.setCreateTime(_ctx.stringValue("ListIndustryPackagesResponse.PackagePage.Packages["+ i +"].CreateTime"));
			_package.setModifyTime(_ctx.stringValue("ListIndustryPackagesResponse.PackagePage.Packages["+ i +"].ModifyTime"));
			_package.setCreateUserId(_ctx.stringValue("ListIndustryPackagesResponse.PackagePage.Packages["+ i +"].CreateUserId"));
			_package.setModifyUserId(_ctx.stringValue("ListIndustryPackagesResponse.PackagePage.Packages["+ i +"].ModifyUserId"));

			packages.add(_package);
		}
		packagePage.setPackages(packages);
		listIndustryPackagesResponse.setPackagePage(packagePage);
	 
	 	return listIndustryPackagesResponse;
	}
}