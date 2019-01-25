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

package com.aliyuncs.foas.transform.v20181111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.foas.model.v20181111.ListPackageResponse;
import com.aliyuncs.foas.model.v20181111.ListPackageResponse._Package;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPackageResponseUnmarshaller {

	public static ListPackageResponse unmarshall(ListPackageResponse listPackageResponse, UnmarshallerContext context) {
		
		listPackageResponse.setRequestId(context.stringValue("ListPackageResponse.RequestId"));
		listPackageResponse.setPageIndex(context.integerValue("ListPackageResponse.PageIndex"));
		listPackageResponse.setPageSize(context.integerValue("ListPackageResponse.PageSize"));
		listPackageResponse.setTotalPage(context.integerValue("ListPackageResponse.TotalPage"));
		listPackageResponse.setTotalCount(context.longValue("ListPackageResponse.TotalCount"));

		List<_Package> packages = new ArrayList<_Package>();
		for (int i = 0; i < context.lengthValue("ListPackageResponse.Packages.Length"); i++) {
			_Package _package = new _Package();
			_package.setProjectName(context.stringValue("ListPackageResponse.Packages["+ i +"].ProjectName"));
			_package.setPackageName(context.stringValue("ListPackageResponse.Packages["+ i +"].PackageName"));
			_package.setCreator(context.stringValue("ListPackageResponse.Packages["+ i +"].Creator"));
			_package.setModifier(context.stringValue("ListPackageResponse.Packages["+ i +"].Modifier"));
			_package.setCreateTime(context.longValue("ListPackageResponse.Packages["+ i +"].CreateTime"));
			_package.setModifyTime(context.longValue("ListPackageResponse.Packages["+ i +"].ModifyTime"));
			_package.setOriginName(context.stringValue("ListPackageResponse.Packages["+ i +"].OriginName"));
			_package.setType(context.stringValue("ListPackageResponse.Packages["+ i +"].Type"));
			_package.setMd5(context.stringValue("ListPackageResponse.Packages["+ i +"].Md5"));
			_package.setDescription(context.stringValue("ListPackageResponse.Packages["+ i +"].Description"));
			_package.setOssEndpoint(context.stringValue("ListPackageResponse.Packages["+ i +"].OssEndpoint"));
			_package.setOssBucket(context.stringValue("ListPackageResponse.Packages["+ i +"].OssBucket"));
			_package.setOssOwner(context.stringValue("ListPackageResponse.Packages["+ i +"].OssOwner"));
			_package.setOssPath(context.stringValue("ListPackageResponse.Packages["+ i +"].OssPath"));

			packages.add(_package);
		}
		listPackageResponse.setPackages(packages);
	 
	 	return listPackageResponse;
	}
}