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

package com.aliyuncs.green.transform.v20170823;

import com.aliyuncs.green.model.v20170823.DescribeUpdatePackageResultResponse;
import com.aliyuncs.green.model.v20170823.DescribeUpdatePackageResultResponse.AppInfo;
import com.aliyuncs.green.model.v20170823.DescribeUpdatePackageResultResponse.AppInfo.DebugPackageInfo;
import com.aliyuncs.green.model.v20170823.DescribeUpdatePackageResultResponse.AppInfo.PackageInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeUpdatePackageResultResponseUnmarshaller {

	public static DescribeUpdatePackageResultResponse unmarshall(DescribeUpdatePackageResultResponse describeUpdatePackageResultResponse, UnmarshallerContext context) {
		
		describeUpdatePackageResultResponse.setRequestId(context.stringValue("DescribeUpdatePackageResultResponse.RequestId"));

		AppInfo appInfo = new AppInfo();
		appInfo.setId(context.longValue("DescribeUpdatePackageResultResponse.AppInfo.Id"));
		appInfo.setName(context.stringValue("DescribeUpdatePackageResultResponse.AppInfo.Name"));
		appInfo.setPackageName(context.stringValue("DescribeUpdatePackageResultResponse.AppInfo.PackageName"));
		appInfo.setIcon(context.stringValue("DescribeUpdatePackageResultResponse.AppInfo.Icon"));
		appInfo.setStartDate(context.stringValue("DescribeUpdatePackageResultResponse.AppInfo.StartDate"));
		appInfo.setEndDate(context.stringValue("DescribeUpdatePackageResultResponse.AppInfo.EndDate"));
		appInfo.setType(context.integerValue("DescribeUpdatePackageResultResponse.AppInfo.Type"));

		PackageInfo packageInfo = new PackageInfo();
		packageInfo.setVersion(context.stringValue("DescribeUpdatePackageResultResponse.AppInfo.PackageInfo.Version"));
		appInfo.setPackageInfo(packageInfo);

		DebugPackageInfo debugPackageInfo = new DebugPackageInfo();
		debugPackageInfo.setVersion(context.stringValue("DescribeUpdatePackageResultResponse.AppInfo.DebugPackageInfo.Version"));
		appInfo.setDebugPackageInfo(debugPackageInfo);
		describeUpdatePackageResultResponse.setAppInfo(appInfo);
	 
	 	return describeUpdatePackageResultResponse;
	}
}