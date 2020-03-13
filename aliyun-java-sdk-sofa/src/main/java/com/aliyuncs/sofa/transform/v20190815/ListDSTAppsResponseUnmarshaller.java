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

package com.aliyuncs.sofa.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.ListDSTAppsResponse;
import com.aliyuncs.sofa.model.v20190815.ListDSTAppsResponse.AppsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDSTAppsResponseUnmarshaller {

	public static ListDSTAppsResponse unmarshall(ListDSTAppsResponse listDSTAppsResponse, UnmarshallerContext _ctx) {
		
		listDSTAppsResponse.setRequestId(_ctx.stringValue("ListDSTAppsResponse.RequestId"));
		listDSTAppsResponse.setResultCode(_ctx.stringValue("ListDSTAppsResponse.ResultCode"));
		listDSTAppsResponse.setResultMessage(_ctx.stringValue("ListDSTAppsResponse.ResultMessage"));
		listDSTAppsResponse.setPageNumber(_ctx.longValue("ListDSTAppsResponse.PageNumber"));
		listDSTAppsResponse.setPageSize(_ctx.longValue("ListDSTAppsResponse.PageSize"));
		listDSTAppsResponse.setTotalCount(_ctx.longValue("ListDSTAppsResponse.TotalCount"));

		List<AppsItem> apps = new ArrayList<AppsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListDSTAppsResponse.Apps.Length"); i++) {
			AppsItem appsItem = new AppsItem();
			appsItem.setBizLogAppCreator(_ctx.stringValue("ListDSTAppsResponse.Apps["+ i +"].BizLogAppCreator"));
			appsItem.setBizLogConfigCount(_ctx.longValue("ListDSTAppsResponse.Apps["+ i +"].BizLogConfigCount"));
			appsItem.setBizLogEnabled(_ctx.booleanValue("ListDSTAppsResponse.Apps["+ i +"].BizLogEnabled"));
			appsItem.setCollected(_ctx.booleanValue("ListDSTAppsResponse.Apps["+ i +"].Collected"));
			appsItem.setName(_ctx.stringValue("ListDSTAppsResponse.Apps["+ i +"].Name"));

			apps.add(appsItem);
		}
		listDSTAppsResponse.setApps(apps);
	 
	 	return listDSTAppsResponse;
	}
}