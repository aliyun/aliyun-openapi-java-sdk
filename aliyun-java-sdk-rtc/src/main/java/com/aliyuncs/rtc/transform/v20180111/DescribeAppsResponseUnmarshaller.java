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

package com.aliyuncs.rtc.transform.v20180111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rtc.model.v20180111.DescribeAppsResponse;
import com.aliyuncs.rtc.model.v20180111.DescribeAppsResponse.App;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAppsResponseUnmarshaller {

	public static DescribeAppsResponse unmarshall(DescribeAppsResponse describeAppsResponse, UnmarshallerContext _ctx) {
		
		describeAppsResponse.setRequestId(_ctx.stringValue("DescribeAppsResponse.RequestId"));
		describeAppsResponse.setTotalNum(_ctx.integerValue("DescribeAppsResponse.TotalNum"));
		describeAppsResponse.setTotalPage(_ctx.integerValue("DescribeAppsResponse.TotalPage"));

		List<App> appList = new ArrayList<App>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAppsResponse.AppList.Length"); i++) {
			App app = new App();
			app.setStatus(_ctx.integerValue("DescribeAppsResponse.AppList["+ i +"].Status"));
			app.setAppId(_ctx.stringValue("DescribeAppsResponse.AppList["+ i +"].AppId"));
			app.setAppName(_ctx.stringValue("DescribeAppsResponse.AppList["+ i +"].AppName"));
			app.setCreateTime(_ctx.stringValue("DescribeAppsResponse.AppList["+ i +"].CreateTime"));
			app.setAppType(_ctx.stringValue("DescribeAppsResponse.AppList["+ i +"].AppType"));
			app.setBillType(_ctx.stringValue("DescribeAppsResponse.AppList["+ i +"].BillType"));

			List<String> serviceAreas = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeAppsResponse.AppList["+ i +"].ServiceAreas.Length"); j++) {
				serviceAreas.add(_ctx.stringValue("DescribeAppsResponse.AppList["+ i +"].ServiceAreas["+ j +"]"));
			}
			app.setServiceAreas(serviceAreas);

			appList.add(app);
		}
		describeAppsResponse.setAppList(appList);
	 
	 	return describeAppsResponse;
	}
}