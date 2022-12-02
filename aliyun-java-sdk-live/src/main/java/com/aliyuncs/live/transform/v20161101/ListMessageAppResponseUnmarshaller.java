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

import com.aliyuncs.live.model.v20161101.ListMessageAppResponse;
import com.aliyuncs.live.model.v20161101.ListMessageAppResponse.Result;
import com.aliyuncs.live.model.v20161101.ListMessageAppResponse.Result.AppListItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListMessageAppResponseUnmarshaller {

	public static ListMessageAppResponse unmarshall(ListMessageAppResponse listMessageAppResponse, UnmarshallerContext _ctx) {
		
		listMessageAppResponse.setRequestId(_ctx.stringValue("ListMessageAppResponse.RequestId"));

		Result result = new Result();
		result.setTotal(_ctx.integerValue("ListMessageAppResponse.Result.Total"));
		result.setHasMore(_ctx.booleanValue("ListMessageAppResponse.Result.HasMore"));

		List<AppListItem> appList = new ArrayList<AppListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListMessageAppResponse.Result.AppList.Length"); i++) {
			AppListItem appListItem = new AppListItem();
			appListItem.setAppId(_ctx.stringValue("ListMessageAppResponse.Result.AppList["+ i +"].AppId"));
			appListItem.setAppName(_ctx.stringValue("ListMessageAppResponse.Result.AppList["+ i +"].AppName"));
			appListItem.setCreateTime(_ctx.longValue("ListMessageAppResponse.Result.AppList["+ i +"].CreateTime"));
			appListItem.setStatus(_ctx.integerValue("ListMessageAppResponse.Result.AppList["+ i +"].Status"));
			appListItem.setAppConfig(_ctx.mapValue("ListMessageAppResponse.Result.AppList["+ i +"].AppConfig"));
			appListItem.setExtension(_ctx.mapValue("ListMessageAppResponse.Result.AppList["+ i +"].Extension"));

			appList.add(appListItem);
		}
		result.setAppList(appList);
		listMessageAppResponse.setResult(result);
	 
	 	return listMessageAppResponse;
	}
}