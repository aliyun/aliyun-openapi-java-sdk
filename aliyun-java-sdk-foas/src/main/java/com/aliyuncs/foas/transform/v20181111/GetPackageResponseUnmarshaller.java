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

	public static GetPackageResponse unmarshall(GetPackageResponse getPackageResponse, UnmarshallerContext _ctx) {
		
		getPackageResponse.setRequestId(_ctx.stringValue("GetPackageResponse.RequestId"));

		_Package _package = new _Package();
		_package.setProjectName(_ctx.stringValue("GetPackageResponse.Package.ProjectName"));
		_package.setPackageName(_ctx.stringValue("GetPackageResponse.Package.PackageName"));
		_package.setCreator(_ctx.stringValue("GetPackageResponse.Package.Creator"));
		_package.setModifier(_ctx.stringValue("GetPackageResponse.Package.Modifier"));
		_package.setCreateTime(_ctx.longValue("GetPackageResponse.Package.CreateTime"));
		_package.setModifyTime(_ctx.longValue("GetPackageResponse.Package.ModifyTime"));
		_package.setOriginName(_ctx.stringValue("GetPackageResponse.Package.OriginName"));
		_package.setType(_ctx.stringValue("GetPackageResponse.Package.Type"));
		_package.setMd5(_ctx.stringValue("GetPackageResponse.Package.Md5"));
		_package.setDescription(_ctx.stringValue("GetPackageResponse.Package.Description"));
		_package.setOssEndpoint(_ctx.stringValue("GetPackageResponse.Package.OssEndpoint"));
		_package.setOssBucket(_ctx.stringValue("GetPackageResponse.Package.OssBucket"));
		_package.setOssOwner(_ctx.stringValue("GetPackageResponse.Package.OssOwner"));
		_package.setOssPath(_ctx.stringValue("GetPackageResponse.Package.OssPath"));
		_package.setTag(_ctx.stringValue("GetPackageResponse.Package.Tag"));
		_package.setScanLink(_ctx.stringValue("GetPackageResponse.Package.ScanLink"));
		_package.setScanState(_ctx.stringValue("GetPackageResponse.Package.ScanState"));
		_package.setScanErrorMessage(_ctx.stringValue("GetPackageResponse.Package.ScanErrorMessage"));
		_package.setScanExtBizNo(_ctx.stringValue("GetPackageResponse.Package.ScanExtBizNo"));
		getPackageResponse.set_Package(_package);
	 
	 	return getPackageResponse;
	}
}