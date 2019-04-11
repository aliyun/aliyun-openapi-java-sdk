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

package com.aliyuncs.vod.transform.v20170321;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vod.model.v20170321.GetAppInfosResponse;
import com.aliyuncs.vod.model.v20170321.GetAppInfosResponse.AppInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAppInfosResponseUnmarshaller {

	public static GetAppInfosResponse unmarshall(GetAppInfosResponse getAppInfosResponse, UnmarshallerContext context) {
		
		getAppInfosResponse.setRequestId(context.stringValue("GetAppInfosResponse.RequestId"));

		List<String> nonExistAppIds = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("GetAppInfosResponse.NonExistAppIds.Length"); i++) {
			nonExistAppIds.add(context.stringValue("GetAppInfosResponse.NonExistAppIds["+ i +"]"));
		}
		getAppInfosResponse.setNonExistAppIds(nonExistAppIds);

		List<AppInfo> appInfoList = new ArrayList<AppInfo>();
		for (int i = 0; i < context.lengthValue("GetAppInfosResponse.AppInfoList.Length"); i++) {
			AppInfo appInfo = new AppInfo();
			appInfo.setAppId(context.stringValue("GetAppInfosResponse.AppInfoList["+ i +"].AppId"));
			appInfo.setAppName(context.stringValue("GetAppInfosResponse.AppInfoList["+ i +"].AppName"));
			appInfo.setType(context.stringValue("GetAppInfosResponse.AppInfoList["+ i +"].Type"));
			appInfo.setDescription(context.stringValue("GetAppInfosResponse.AppInfoList["+ i +"].Description"));
			appInfo.setStatus(context.stringValue("GetAppInfosResponse.AppInfoList["+ i +"].Status"));
			appInfo.setCreationTime(context.stringValue("GetAppInfosResponse.AppInfoList["+ i +"].CreationTime"));
			appInfo.setModificationTime(context.stringValue("GetAppInfosResponse.AppInfoList["+ i +"].ModificationTime"));

			appInfoList.add(appInfo);
		}
		getAppInfosResponse.setAppInfoList(appInfoList);
	 
	 	return getAppInfosResponse;
	}
}