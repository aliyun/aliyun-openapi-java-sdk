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
import com.aliyuncs.vod.model.v20170321.GetAppInfosResponse.AppInfo.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAppInfosResponseUnmarshaller {

	public static GetAppInfosResponse unmarshall(GetAppInfosResponse getAppInfosResponse, UnmarshallerContext _ctx) {
		
		getAppInfosResponse.setRequestId(_ctx.stringValue("GetAppInfosResponse.RequestId"));
		getAppInfosResponse.setCode(_ctx.stringValue("GetAppInfosResponse.Code"));

		List<String> nonExistAppIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetAppInfosResponse.NonExistAppIds.Length"); i++) {
			nonExistAppIds.add(_ctx.stringValue("GetAppInfosResponse.NonExistAppIds["+ i +"]"));
		}
		getAppInfosResponse.setNonExistAppIds(nonExistAppIds);

		List<AppInfo> appInfoList = new ArrayList<AppInfo>();
		for (int i = 0; i < _ctx.lengthValue("GetAppInfosResponse.AppInfoList.Length"); i++) {
			AppInfo appInfo = new AppInfo();
			appInfo.setType(_ctx.stringValue("GetAppInfosResponse.AppInfoList["+ i +"].Type"));
			appInfo.setStatus(_ctx.stringValue("GetAppInfosResponse.AppInfoList["+ i +"].Status"));
			appInfo.setCreationTime(_ctx.stringValue("GetAppInfosResponse.AppInfoList["+ i +"].CreationTime"));
			appInfo.setAppName(_ctx.stringValue("GetAppInfosResponse.AppInfoList["+ i +"].AppName"));
			appInfo.setDescription(_ctx.stringValue("GetAppInfosResponse.AppInfoList["+ i +"].Description"));
			appInfo.setAppId(_ctx.stringValue("GetAppInfosResponse.AppInfoList["+ i +"].AppId"));
			appInfo.setModificationTime(_ctx.stringValue("GetAppInfosResponse.AppInfoList["+ i +"].ModificationTime"));
			appInfo.setResourceGroupId(_ctx.stringValue("GetAppInfosResponse.AppInfoList["+ i +"].ResourceGroupId"));

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("GetAppInfosResponse.AppInfoList["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setTagKey(_ctx.stringValue("GetAppInfosResponse.AppInfoList["+ i +"].Tags["+ j +"].TagKey"));
				tag.setTagValue(_ctx.stringValue("GetAppInfosResponse.AppInfoList["+ i +"].Tags["+ j +"].TagValue"));

				tags.add(tag);
			}
			appInfo.setTags(tags);

			appInfoList.add(appInfo);
		}
		getAppInfosResponse.setAppInfoList(appInfoList);
	 
	 	return getAppInfosResponse;
	}
}