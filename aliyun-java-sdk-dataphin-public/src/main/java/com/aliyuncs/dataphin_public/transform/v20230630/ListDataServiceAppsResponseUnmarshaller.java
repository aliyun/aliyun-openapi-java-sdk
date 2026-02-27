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

package com.aliyuncs.dataphin_public.transform.v20230630;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataphin_public.model.v20230630.ListDataServiceAppsResponse;
import com.aliyuncs.dataphin_public.model.v20230630.ListDataServiceAppsResponse.Data;
import com.aliyuncs.dataphin_public.model.v20230630.ListDataServiceAppsResponse.Data.App;
import com.aliyuncs.dataphin_public.model.v20230630.ListDataServiceAppsResponse.Data.App.Owner;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDataServiceAppsResponseUnmarshaller {

	public static ListDataServiceAppsResponse unmarshall(ListDataServiceAppsResponse listDataServiceAppsResponse, UnmarshallerContext _ctx) {
		
		listDataServiceAppsResponse.setRequestId(_ctx.stringValue("ListDataServiceAppsResponse.RequestId"));
		listDataServiceAppsResponse.setMessage(_ctx.stringValue("ListDataServiceAppsResponse.Message"));
		listDataServiceAppsResponse.setHttpStatusCode(_ctx.integerValue("ListDataServiceAppsResponse.HttpStatusCode"));
		listDataServiceAppsResponse.setCode(_ctx.stringValue("ListDataServiceAppsResponse.Code"));
		listDataServiceAppsResponse.setSuccess(_ctx.booleanValue("ListDataServiceAppsResponse.Success"));

		Data data = new Data();
		data.setTotalCount(_ctx.longValue("ListDataServiceAppsResponse.Data.TotalCount"));

		List<App> appList = new ArrayList<App>();
		for (int i = 0; i < _ctx.lengthValue("ListDataServiceAppsResponse.Data.AppList.Length"); i++) {
			App app = new App();
			app.setAppId(_ctx.integerValue("ListDataServiceAppsResponse.Data.AppList["+ i +"].AppId"));
			app.setAppGroup(_ctx.stringValue("ListDataServiceAppsResponse.Data.AppList["+ i +"].AppGroup"));
			app.setIsMember(_ctx.booleanValue("ListDataServiceAppsResponse.Data.AppList["+ i +"].IsMember"));
			app.setAppName(_ctx.stringValue("ListDataServiceAppsResponse.Data.AppList["+ i +"].AppName"));

			List<Owner> ownerList = new ArrayList<Owner>();
			for (int j = 0; j < _ctx.lengthValue("ListDataServiceAppsResponse.Data.AppList["+ i +"].OwnerList.Length"); j++) {
				Owner owner = new Owner();
				owner.setId(_ctx.stringValue("ListDataServiceAppsResponse.Data.AppList["+ i +"].OwnerList["+ j +"].Id"));
				owner.setName(_ctx.stringValue("ListDataServiceAppsResponse.Data.AppList["+ i +"].OwnerList["+ j +"].Name"));

				ownerList.add(owner);
			}
			app.setOwnerList(ownerList);

			appList.add(app);
		}
		data.setAppList(appList);
		listDataServiceAppsResponse.setData(data);
	 
	 	return listDataServiceAppsResponse;
	}
}