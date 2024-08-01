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

package com.aliyuncs.live.transform.v20161101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.live.model.v20161101.ListLiveMessageAppsResponse;
import com.aliyuncs.live.model.v20161101.ListLiveMessageAppsResponse.Apps;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListLiveMessageAppsResponseUnmarshaller {

	public static ListLiveMessageAppsResponse unmarshall(ListLiveMessageAppsResponse listLiveMessageAppsResponse, UnmarshallerContext _ctx) {
		
		listLiveMessageAppsResponse.setRequestId(_ctx.stringValue("ListLiveMessageAppsResponse.RequestId"));
		listLiveMessageAppsResponse.setHasMore(_ctx.booleanValue("ListLiveMessageAppsResponse.HasMore"));
		listLiveMessageAppsResponse.setNextPageToken(_ctx.longValue("ListLiveMessageAppsResponse.NextPageToken"));

		List<Apps> appList = new ArrayList<Apps>();
		for (int i = 0; i < _ctx.lengthValue("ListLiveMessageAppsResponse.AppList.Length"); i++) {
			Apps apps = new Apps();
			apps.setAppId(_ctx.stringValue("ListLiveMessageAppsResponse.AppList["+ i +"].AppId"));
			apps.setAppKey(_ctx.stringValue("ListLiveMessageAppsResponse.AppList["+ i +"].AppKey"));
			apps.setAppName(_ctx.stringValue("ListLiveMessageAppsResponse.AppList["+ i +"].AppName"));
			apps.setAppSign(_ctx.stringValue("ListLiveMessageAppsResponse.AppList["+ i +"].AppSign"));
			apps.setCreateTime(_ctx.longValue("ListLiveMessageAppsResponse.AppList["+ i +"].CreateTime"));
			apps.setDataCenter(_ctx.stringValue("ListLiveMessageAppsResponse.AppList["+ i +"].DataCenter"));
			apps.setDisable(_ctx.stringValue("ListLiveMessageAppsResponse.AppList["+ i +"].Disable"));
			apps.setModifyTime(_ctx.longValue("ListLiveMessageAppsResponse.AppList["+ i +"].ModifyTime"));
			apps.setMsgLifeCycle(_ctx.integerValue("ListLiveMessageAppsResponse.AppList["+ i +"].MsgLifeCycle"));

			appList.add(apps);
		}
		listLiveMessageAppsResponse.setAppList(appList);
	 
	 	return listLiveMessageAppsResponse;
	}
}