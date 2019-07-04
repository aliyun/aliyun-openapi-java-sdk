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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.green.model.v20170823.DescribeAppInfoResponse;
import com.aliyuncs.green.model.v20170823.DescribeAppInfoResponse.AppInfo;
import com.aliyuncs.green.model.v20170823.DescribeAppInfoResponse.AppInfo.DebugPackageInfo;
import com.aliyuncs.green.model.v20170823.DescribeAppInfoResponse.AppInfo.PackageInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAppInfoResponseUnmarshaller {

	public static DescribeAppInfoResponse unmarshall(DescribeAppInfoResponse describeAppInfoResponse, UnmarshallerContext _ctx) {
		
		describeAppInfoResponse.setRequestId(_ctx.stringValue("DescribeAppInfoResponse.RequestId"));
		describeAppInfoResponse.setPageSize(_ctx.integerValue("DescribeAppInfoResponse.PageSize"));
		describeAppInfoResponse.setCurrentPage(_ctx.integerValue("DescribeAppInfoResponse.CurrentPage"));
		describeAppInfoResponse.setTotalCount(_ctx.integerValue("DescribeAppInfoResponse.TotalCount"));

		List<AppInfo> appInfoList = new ArrayList<AppInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAppInfoResponse.AppInfoList.Length"); i++) {
			AppInfo appInfo = new AppInfo();
			appInfo.setId(_ctx.longValue("DescribeAppInfoResponse.AppInfoList["+ i +"].Id"));
			appInfo.setName(_ctx.stringValue("DescribeAppInfoResponse.AppInfoList["+ i +"].Name"));
			appInfo.setPackageName(_ctx.stringValue("DescribeAppInfoResponse.AppInfoList["+ i +"].PackageName"));
			appInfo.setIcon(_ctx.stringValue("DescribeAppInfoResponse.AppInfoList["+ i +"].Icon"));
			appInfo.setStartDate(_ctx.stringValue("DescribeAppInfoResponse.AppInfoList["+ i +"].StartDate"));
			appInfo.setEndDate(_ctx.stringValue("DescribeAppInfoResponse.AppInfoList["+ i +"].EndDate"));
			appInfo.setType(_ctx.integerValue("DescribeAppInfoResponse.AppInfoList["+ i +"].Type"));

			PackageInfo packageInfo = new PackageInfo();
			packageInfo.setVersion(_ctx.stringValue("DescribeAppInfoResponse.AppInfoList["+ i +"].PackageInfo.Version"));
			appInfo.setPackageInfo(packageInfo);

			DebugPackageInfo debugPackageInfo = new DebugPackageInfo();
			debugPackageInfo.setVersion(_ctx.stringValue("DescribeAppInfoResponse.AppInfoList["+ i +"].DebugPackageInfo.Version"));
			appInfo.setDebugPackageInfo(debugPackageInfo);

			appInfoList.add(appInfo);
		}
		describeAppInfoResponse.setAppInfoList(appInfoList);
	 
	 	return describeAppInfoResponse;
	}
}