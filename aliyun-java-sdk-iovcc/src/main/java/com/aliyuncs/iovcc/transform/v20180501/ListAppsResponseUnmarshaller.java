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

package com.aliyuncs.iovcc.transform.v20180501;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iovcc.model.v20180501.ListAppsResponse;
import com.aliyuncs.iovcc.model.v20180501.ListAppsResponse.AppsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAppsResponseUnmarshaller {

	public static ListAppsResponse unmarshall(ListAppsResponse listAppsResponse, UnmarshallerContext _ctx) {
		
		listAppsResponse.setRequestId(_ctx.stringValue("ListAppsResponse.RequestId"));

		List<AppsItem> apps = new ArrayList<AppsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListAppsResponse.Apps.Length"); i++) {
			AppsItem appsItem = new AppsItem();
			appsItem.setAppKey(_ctx.stringValue("ListAppsResponse.Apps["+ i +"].AppKey"));
			appsItem.setAppName(_ctx.stringValue("ListAppsResponse.Apps["+ i +"].AppName"));
			appsItem.setAppPackage(_ctx.stringValue("ListAppsResponse.Apps["+ i +"].AppPackage"));
			appsItem.setOsType(_ctx.integerValue("ListAppsResponse.Apps["+ i +"].OsType"));

			apps.add(appsItem);
		}
		listAppsResponse.setApps(apps);
	 
	 	return listAppsResponse;
	}
}