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

package com.aliyuncs.mhub.transform.v20170825;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mhub.model.v20170825.ListAppsResponse;
import com.aliyuncs.mhub.model.v20170825.ListAppsResponse.AppInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAppsResponseUnmarshaller {

	public static ListAppsResponse unmarshall(ListAppsResponse listAppsResponse, UnmarshallerContext _ctx) {
		
		listAppsResponse.setRequestId(_ctx.stringValue("ListAppsResponse.RequestId"));
		listAppsResponse.setTotal(_ctx.integerValue("ListAppsResponse.Total"));
		listAppsResponse.setUbsmsStatus(_ctx.stringValue("ListAppsResponse.UbsmsStatus"));

		List<AppInfo> appInfos = new ArrayList<AppInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListAppsResponse.AppInfos.Length"); i++) {
			AppInfo appInfo = new AppInfo();
			appInfo.setAppKey(_ctx.stringValue("ListAppsResponse.AppInfos["+ i +"].AppKey"));
			appInfo.setName(_ctx.stringValue("ListAppsResponse.AppInfos["+ i +"].Name"));
			appInfo.setType(_ctx.integerValue("ListAppsResponse.AppInfos["+ i +"].Type"));
			appInfo.setReadonly(_ctx.booleanValue("ListAppsResponse.AppInfos["+ i +"].Readonly"));
			appInfo.setBundleId(_ctx.stringValue("ListAppsResponse.AppInfos["+ i +"].BundleId"));
			appInfo.setPackageName(_ctx.stringValue("ListAppsResponse.AppInfos["+ i +"].PackageName"));

			appInfos.add(appInfo);
		}
		listAppsResponse.setAppInfos(appInfos);
	 
	 	return listAppsResponse;
	}
}