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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.webplus.model.v20190320.DescribePkgVersionsResponse;
import com.aliyuncs.webplus.model.v20190320.DescribePkgVersionsResponse.PkgVersion;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePkgVersionsResponseUnmarshaller {

	public static DescribePkgVersionsResponse unmarshall(DescribePkgVersionsResponse describePkgVersionsResponse, UnmarshallerContext _ctx) {
		
		describePkgVersionsResponse.setRequestId(_ctx.stringValue("DescribePkgVersionsResponse.RequestId"));
		describePkgVersionsResponse.setCode(_ctx.stringValue("DescribePkgVersionsResponse.Code"));
		describePkgVersionsResponse.setMessage(_ctx.stringValue("DescribePkgVersionsResponse.Message"));
		describePkgVersionsResponse.setPageNumber(_ctx.integerValue("DescribePkgVersionsResponse.PageNumber"));
		describePkgVersionsResponse.setPageSize(_ctx.integerValue("DescribePkgVersionsResponse.PageSize"));
		describePkgVersionsResponse.setTotalCount(_ctx.integerValue("DescribePkgVersionsResponse.TotalCount"));

		List<PkgVersion> pkgVersions = new ArrayList<PkgVersion>();
		for (int i = 0; i < _ctx.lengthValue("DescribePkgVersionsResponse.PkgVersions.Length"); i++) {
			PkgVersion pkgVersion = new PkgVersion();
			pkgVersion.setPkgVersionId(_ctx.stringValue("DescribePkgVersionsResponse.PkgVersions["+ i +"].PkgVersionId"));
			pkgVersion.setPkgVersionLabel(_ctx.stringValue("DescribePkgVersionsResponse.PkgVersions["+ i +"].PkgVersionLabel"));
			pkgVersion.setPkgVersionDescription(_ctx.stringValue("DescribePkgVersionsResponse.PkgVersions["+ i +"].PkgVersionDescription"));
			pkgVersion.setAppName(_ctx.stringValue("DescribePkgVersionsResponse.PkgVersions["+ i +"].AppName"));
			pkgVersion.setAppId(_ctx.stringValue("DescribePkgVersionsResponse.PkgVersions["+ i +"].AppId"));
			pkgVersion.setPackageSource(_ctx.stringValue("DescribePkgVersionsResponse.PkgVersions["+ i +"].PackageSource"));
			pkgVersion.setCreateTime(_ctx.longValue("DescribePkgVersionsResponse.PkgVersions["+ i +"].CreateTime"));
			pkgVersion.setUpdateTime(_ctx.longValue("DescribePkgVersionsResponse.PkgVersions["+ i +"].UpdateTime"));
			pkgVersion.setCreateUsername(_ctx.stringValue("DescribePkgVersionsResponse.PkgVersions["+ i +"].CreateUsername"));

			pkgVersions.add(pkgVersion);
		}
		describePkgVersionsResponse.setPkgVersions(pkgVersions);
	 
	 	return describePkgVersionsResponse;
	}
}