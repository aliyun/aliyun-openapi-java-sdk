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

package com.aliyuncs.arms.transform.v20190808;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.arms.model.v20190808.ListRetcodeAppsResponse;
import com.aliyuncs.arms.model.v20190808.ListRetcodeAppsResponse.RetcodeApp;
import com.aliyuncs.arms.model.v20190808.ListRetcodeAppsResponse.RetcodeApp.TagsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListRetcodeAppsResponseUnmarshaller {

	public static ListRetcodeAppsResponse unmarshall(ListRetcodeAppsResponse listRetcodeAppsResponse, UnmarshallerContext _ctx) {
		
		listRetcodeAppsResponse.setRequestId(_ctx.stringValue("ListRetcodeAppsResponse.RequestId"));

		List<RetcodeApp> retcodeApps = new ArrayList<RetcodeApp>();
		for (int i = 0; i < _ctx.lengthValue("ListRetcodeAppsResponse.RetcodeApps.Length"); i++) {
			RetcodeApp retcodeApp = new RetcodeApp();
			retcodeApp.setAppName(_ctx.stringValue("ListRetcodeAppsResponse.RetcodeApps["+ i +"].AppName"));
			retcodeApp.setRetcodeAppType(_ctx.stringValue("ListRetcodeAppsResponse.RetcodeApps["+ i +"].RetcodeAppType"));
			retcodeApp.setAppId(_ctx.longValue("ListRetcodeAppsResponse.RetcodeApps["+ i +"].AppId"));
			retcodeApp.setPid(_ctx.stringValue("ListRetcodeAppsResponse.RetcodeApps["+ i +"].Pid"));
			retcodeApp.setNickName(_ctx.stringValue("ListRetcodeAppsResponse.RetcodeApps["+ i +"].NickName"));
			retcodeApp.setResourceGroupId(_ctx.stringValue("ListRetcodeAppsResponse.RetcodeApps["+ i +"].ResourceGroupId"));

			List<TagsItem> tags = new ArrayList<TagsItem>();
			for (int j = 0; j < _ctx.lengthValue("ListRetcodeAppsResponse.RetcodeApps["+ i +"].Tags.Length"); j++) {
				TagsItem tagsItem = new TagsItem();
				tagsItem.setKey(_ctx.stringValue("ListRetcodeAppsResponse.RetcodeApps["+ i +"].Tags["+ j +"].Key"));
				tagsItem.setValue(_ctx.stringValue("ListRetcodeAppsResponse.RetcodeApps["+ i +"].Tags["+ j +"].Value"));

				tags.add(tagsItem);
			}
			retcodeApp.setTags(tags);

			retcodeApps.add(retcodeApp);
		}
		listRetcodeAppsResponse.setRetcodeApps(retcodeApps);
	 
	 	return listRetcodeAppsResponse;
	}
}