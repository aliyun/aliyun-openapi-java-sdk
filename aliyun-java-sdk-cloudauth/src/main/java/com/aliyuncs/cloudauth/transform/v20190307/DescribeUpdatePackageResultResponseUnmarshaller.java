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

package com.aliyuncs.cloudauth.transform.v20190307;

import com.aliyuncs.cloudauth.model.v20190307.DescribeUpdatePackageResultResponse;
import com.aliyuncs.cloudauth.model.v20190307.DescribeUpdatePackageResultResponse.AppInfo;
import com.aliyuncs.cloudauth.model.v20190307.DescribeUpdatePackageResultResponse.AppInfo.DebugPackageInfo;
import com.aliyuncs.cloudauth.model.v20190307.DescribeUpdatePackageResultResponse.AppInfo.PackageInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeUpdatePackageResultResponseUnmarshaller {

	public static DescribeUpdatePackageResultResponse unmarshall(DescribeUpdatePackageResultResponse describeUpdatePackageResultResponse, UnmarshallerContext _ctx) {
		
		describeUpdatePackageResultResponse.setRequestId(_ctx.stringValue("DescribeUpdatePackageResultResponse.RequestId"));

		AppInfo appInfo = new AppInfo();
		appInfo.setId(_ctx.longValue("DescribeUpdatePackageResultResponse.AppInfo.Id"));
		appInfo.setName(_ctx.stringValue("DescribeUpdatePackageResultResponse.AppInfo.Name"));
		appInfo.setPackageName(_ctx.stringValue("DescribeUpdatePackageResultResponse.AppInfo.PackageName"));
		appInfo.setIcon(_ctx.stringValue("DescribeUpdatePackageResultResponse.AppInfo.Icon"));
		appInfo.setStartDate(_ctx.stringValue("DescribeUpdatePackageResultResponse.AppInfo.StartDate"));
		appInfo.setEndDate(_ctx.stringValue("DescribeUpdatePackageResultResponse.AppInfo.EndDate"));
		appInfo.setType(_ctx.integerValue("DescribeUpdatePackageResultResponse.AppInfo.Type"));

		PackageInfo packageInfo = new PackageInfo();
		packageInfo.setVersion(_ctx.stringValue("DescribeUpdatePackageResultResponse.AppInfo.PackageInfo.Version"));
		appInfo.setPackageInfo(packageInfo);

		DebugPackageInfo debugPackageInfo = new DebugPackageInfo();
		debugPackageInfo.setVersion(_ctx.stringValue("DescribeUpdatePackageResultResponse.AppInfo.DebugPackageInfo.Version"));
		appInfo.setDebugPackageInfo(debugPackageInfo);
		describeUpdatePackageResultResponse.setAppInfo(appInfo);
	 
	 	return describeUpdatePackageResultResponse;
	}
}