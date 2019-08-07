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

package com.aliyuncs.webplus.transform.v20190320;

import com.aliyuncs.webplus.model.v20190320.CreatePkgVersionResponse;
import com.aliyuncs.webplus.model.v20190320.CreatePkgVersionResponse.PkgVersion;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreatePkgVersionResponseUnmarshaller {

	public static CreatePkgVersionResponse unmarshall(CreatePkgVersionResponse createPkgVersionResponse, UnmarshallerContext _ctx) {
		
		createPkgVersionResponse.setRequestId(_ctx.stringValue("CreatePkgVersionResponse.RequestId"));
		createPkgVersionResponse.setCode(_ctx.stringValue("CreatePkgVersionResponse.Code"));
		createPkgVersionResponse.setMessage(_ctx.stringValue("CreatePkgVersionResponse.Message"));

		PkgVersion pkgVersion = new PkgVersion();
		pkgVersion.setPkgVersionId(_ctx.stringValue("CreatePkgVersionResponse.PkgVersion.PkgVersionId"));
		pkgVersion.setPkgVersionLabel(_ctx.stringValue("CreatePkgVersionResponse.PkgVersion.PkgVersionLabel"));
		pkgVersion.setPkgVersionDescription(_ctx.stringValue("CreatePkgVersionResponse.PkgVersion.PkgVersionDescription"));
		pkgVersion.setAppName(_ctx.stringValue("CreatePkgVersionResponse.PkgVersion.AppName"));
		pkgVersion.setAppId(_ctx.stringValue("CreatePkgVersionResponse.PkgVersion.AppId"));
		pkgVersion.setPackageSource(_ctx.stringValue("CreatePkgVersionResponse.PkgVersion.PackageSource"));
		pkgVersion.setCreateTime(_ctx.longValue("CreatePkgVersionResponse.PkgVersion.CreateTime"));
		pkgVersion.setUpdateTime(_ctx.longValue("CreatePkgVersionResponse.PkgVersion.UpdateTime"));
		createPkgVersionResponse.setPkgVersion(pkgVersion);
	 
	 	return createPkgVersionResponse;
	}
}