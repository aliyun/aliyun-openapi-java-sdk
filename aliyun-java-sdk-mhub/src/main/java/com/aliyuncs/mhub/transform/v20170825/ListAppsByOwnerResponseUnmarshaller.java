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

import com.aliyuncs.mhub.model.v20170825.ListAppsByOwnerResponse;
import com.aliyuncs.mhub.model.v20170825.ListAppsByOwnerResponse.AppInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAppsByOwnerResponseUnmarshaller {

	public static ListAppsByOwnerResponse unmarshall(ListAppsByOwnerResponse listAppsByOwnerResponse, UnmarshallerContext _ctx) {
		
		listAppsByOwnerResponse.setRequestId(_ctx.stringValue("ListAppsByOwnerResponse.RequestId"));
		listAppsByOwnerResponse.setTotal(_ctx.integerValue("ListAppsByOwnerResponse.Total"));
		listAppsByOwnerResponse.setUbsmsStatus(_ctx.stringValue("ListAppsByOwnerResponse.UbsmsStatus"));

		List<AppInfo> appInfos = new ArrayList<AppInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListAppsByOwnerResponse.AppInfos.Length"); i++) {
			AppInfo appInfo = new AppInfo();
			appInfo.setAppKey(_ctx.stringValue("ListAppsByOwnerResponse.AppInfos["+ i +"].AppKey"));
			appInfo.setName(_ctx.stringValue("ListAppsByOwnerResponse.AppInfos["+ i +"].Name"));
			appInfo.setType(_ctx.integerValue("ListAppsByOwnerResponse.AppInfos["+ i +"].Type"));
			appInfo.setReadonly(_ctx.booleanValue("ListAppsByOwnerResponse.AppInfos["+ i +"].Readonly"));
			appInfo.setBundleId(_ctx.stringValue("ListAppsByOwnerResponse.AppInfos["+ i +"].BundleId"));
			appInfo.setPackageName(_ctx.stringValue("ListAppsByOwnerResponse.AppInfos["+ i +"].PackageName"));

			appInfos.add(appInfo);
		}
		listAppsByOwnerResponse.setAppInfos(appInfos);
	 
	 	return listAppsByOwnerResponse;
	}
}