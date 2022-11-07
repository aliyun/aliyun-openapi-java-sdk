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

import com.aliyuncs.vod.model.v20170321.ListAppInfoResponse;
import com.aliyuncs.vod.model.v20170321.ListAppInfoResponse.AppInfo;
import com.aliyuncs.vod.model.v20170321.ListAppInfoResponse.AppInfo.TagsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAppInfoResponseUnmarshaller {

	public static ListAppInfoResponse unmarshall(ListAppInfoResponse listAppInfoResponse, UnmarshallerContext _ctx) {
		
		listAppInfoResponse.setRequestId(_ctx.stringValue("ListAppInfoResponse.RequestId"));
		listAppInfoResponse.setTotal(_ctx.integerValue("ListAppInfoResponse.Total"));

		List<AppInfo> appInfoList = new ArrayList<AppInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListAppInfoResponse.AppInfoList.Length"); i++) {
			AppInfo appInfo = new AppInfo();
			appInfo.setType(_ctx.stringValue("ListAppInfoResponse.AppInfoList["+ i +"].Type"));
			appInfo.setStatus(_ctx.stringValue("ListAppInfoResponse.AppInfoList["+ i +"].Status"));
			appInfo.setCreationTime(_ctx.stringValue("ListAppInfoResponse.AppInfoList["+ i +"].CreationTime"));
			appInfo.setAppName(_ctx.stringValue("ListAppInfoResponse.AppInfoList["+ i +"].AppName"));
			appInfo.setDescription(_ctx.stringValue("ListAppInfoResponse.AppInfoList["+ i +"].Description"));
			appInfo.setAppId(_ctx.stringValue("ListAppInfoResponse.AppInfoList["+ i +"].AppId"));
			appInfo.setModificationTime(_ctx.stringValue("ListAppInfoResponse.AppInfoList["+ i +"].ModificationTime"));

			List<TagsItem> tags = new ArrayList<TagsItem>();
			for (int j = 0; j < _ctx.lengthValue("ListAppInfoResponse.AppInfoList["+ i +"].Tags.Length"); j++) {
				TagsItem tagsItem = new TagsItem();
				tagsItem.setTagKey(_ctx.stringValue("ListAppInfoResponse.AppInfoList["+ i +"].Tags["+ j +"].TagKey"));
				tagsItem.setTagValue(_ctx.stringValue("ListAppInfoResponse.AppInfoList["+ i +"].Tags["+ j +"].TagValue"));

				tags.add(tagsItem);
			}
			appInfo.setTags(tags);

			appInfoList.add(appInfo);
		}
		listAppInfoResponse.setAppInfoList(appInfoList);
	 
	 	return listAppInfoResponse;
	}
}