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

package com.aliyuncs.miniapplcdp.transform.v20200113;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.miniapplcdp.model.v20200113.ListAppsResponse;
import com.aliyuncs.miniapplcdp.model.v20200113.ListAppsResponse.Data;
import com.aliyuncs.miniapplcdp.model.v20200113.ListAppsResponse.Data.AppItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAppsResponseUnmarshaller {

	public static ListAppsResponse unmarshall(ListAppsResponse listAppsResponse, UnmarshallerContext _ctx) {
		
		listAppsResponse.setRequestId(_ctx.stringValue("ListAppsResponse.RequestId"));

		Data data = new Data();
		data.setPageNumber(_ctx.integerValue("ListAppsResponse.Data.PageNumber"));
		data.setPageSize(_ctx.integerValue("ListAppsResponse.Data.PageSize"));
		data.setTotalCount(_ctx.integerValue("ListAppsResponse.Data.TotalCount"));

		List<AppItem> items = new ArrayList<AppItem>();
		for (int i = 0; i < _ctx.lengthValue("ListAppsResponse.Data.Items.Length"); i++) {
			AppItem appItem = new AppItem();
			appItem.setAppStatus(_ctx.stringValue("ListAppsResponse.Data.Items["+ i +"].AppStatus"));
			appItem.setAppName(_ctx.stringValue("ListAppsResponse.Data.Items["+ i +"].AppName"));
			appItem.setIsTemplate(_ctx.booleanValue("ListAppsResponse.Data.Items["+ i +"].IsTemplate"));
			appItem.setModifiedTime(_ctx.stringValue("ListAppsResponse.Data.Items["+ i +"].ModifiedTime"));
			appItem.setDescription(_ctx.stringValue("ListAppsResponse.Data.Items["+ i +"].Description"));
			appItem.setCreateTime(_ctx.stringValue("ListAppsResponse.Data.Items["+ i +"].CreateTime"));
			appItem.setAppId(_ctx.stringValue("ListAppsResponse.Data.Items["+ i +"].AppId"));
			appItem.setIcon(_ctx.stringValue("ListAppsResponse.Data.Items["+ i +"].Icon"));
			appItem.setAppType(_ctx.stringValue("ListAppsResponse.Data.Items["+ i +"].AppType"));
			appItem.setSource(_ctx.stringValue("ListAppsResponse.Data.Items["+ i +"].Source"));
			appItem.setLastEditTime(_ctx.stringValue("ListAppsResponse.Data.Items["+ i +"].LastEditTime"));

			items.add(appItem);
		}
		data.setItems(items);
		listAppsResponse.setData(data);
	 
	 	return listAppsResponse;
	}
}