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

package com.aliyuncs.cloudapi.transform.v20160714;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudapi.model.v20160714.DescribeAppsResponse;
import com.aliyuncs.cloudapi.model.v20160714.DescribeAppsResponse.AppItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAppsResponseUnmarshaller {

	public static DescribeAppsResponse unmarshall(DescribeAppsResponse describeAppsResponse, UnmarshallerContext _ctx) {
		
		describeAppsResponse.setRequestId(_ctx.stringValue("DescribeAppsResponse.RequestId"));
		describeAppsResponse.setTotalCount(_ctx.integerValue("DescribeAppsResponse.TotalCount"));
		describeAppsResponse.setPageSize(_ctx.integerValue("DescribeAppsResponse.PageSize"));
		describeAppsResponse.setPageNumber(_ctx.integerValue("DescribeAppsResponse.PageNumber"));

		List<AppItem> apps = new ArrayList<AppItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAppsResponse.Apps.Length"); i++) {
			AppItem appItem = new AppItem();
			appItem.setAppId(_ctx.longValue("DescribeAppsResponse.Apps["+ i +"].AppId"));
			appItem.setAppName(_ctx.stringValue("DescribeAppsResponse.Apps["+ i +"].AppName"));
			appItem.setDescription(_ctx.stringValue("DescribeAppsResponse.Apps["+ i +"].Description"));

			apps.add(appItem);
		}
		describeAppsResponse.setApps(apps);
	 
	 	return describeAppsResponse;
	}
}