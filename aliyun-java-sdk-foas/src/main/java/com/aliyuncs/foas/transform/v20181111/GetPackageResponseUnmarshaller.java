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

import com.aliyuncs.foas.model.v20181111.GetPackageResponse;
import com.aliyuncs.foas.model.v20181111.GetPackageResponse._Package;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetPackageResponseUnmarshaller {

	public static GetPackageResponse unmarshall(GetPackageResponse getPackageResponse, UnmarshallerContext context) {
		
		getPackageResponse.setRequestId(context.stringValue("GetPackageResponse.RequestId"));

		_Package _package = new _Package();
		_package.setProjectName(context.stringValue("GetPackageResponse.Package.ProjectName"));
		_package.setPackageName(context.stringValue("GetPackageResponse.Package.PackageName"));
		_package.setCreator(context.stringValue("GetPackageResponse.Package.Creator"));
		_package.setModifier(context.stringValue("GetPackageResponse.Package.Modifier"));
		_package.setCreateTime(context.longValue("GetPackageResponse.Package.CreateTime"));
		_package.setModifyTime(context.longValue("GetPackageResponse.Package.ModifyTime"));
		_package.setOriginName(context.stringValue("GetPackageResponse.Package.OriginName"));
		_package.setType(context.stringValue("GetPackageResponse.Package.Type"));
		_package.setMd5(context.stringValue("GetPackageResponse.Package.Md5"));
		_package.setDescription(context.stringValue("GetPackageResponse.Package.Description"));
		_package.setOssEndpoint(context.stringValue("GetPackageResponse.Package.OssEndpoint"));
		_package.setOssBucket(context.stringValue("GetPackageResponse.Package.OssBucket"));
		_package.setOssOwner(context.stringValue("GetPackageResponse.Package.OssOwner"));
		_package.setOssPath(context.stringValue("GetPackageResponse.Package.OssPath"));
		_package.setTag(context.stringValue("GetPackageResponse.Package.Tag"));
		getPackageResponse.set_Package(_package);
	 
	 	return getPackageResponse;
	}
}