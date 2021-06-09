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

import com.aliyuncs.arms.model.v20190808.ListDashboardsResponse;
import com.aliyuncs.arms.model.v20190808.ListDashboardsResponse.DashboardVosItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDashboardsResponseUnmarshaller {

	public static ListDashboardsResponse unmarshall(ListDashboardsResponse listDashboardsResponse, UnmarshallerContext _ctx) {
		
		listDashboardsResponse.setRequestId(_ctx.stringValue("ListDashboardsResponse.RequestId"));

		List<DashboardVosItem> dashboardVos = new ArrayList<DashboardVosItem>();
		for (int i = 0; i < _ctx.lengthValue("ListDashboardsResponse.DashboardVos.Length"); i++) {
			DashboardVosItem dashboardVosItem = new DashboardVosItem();
			dashboardVosItem.setId(_ctx.stringValue("ListDashboardsResponse.DashboardVos["+ i +"].Id"));
			dashboardVosItem.setUid(_ctx.stringValue("ListDashboardsResponse.DashboardVos["+ i +"].Uid"));
			dashboardVosItem.setTitle(_ctx.stringValue("ListDashboardsResponse.DashboardVos["+ i +"].Title"));
			dashboardVosItem.setTime(_ctx.stringValue("ListDashboardsResponse.DashboardVos["+ i +"].Time"));
			dashboardVosItem.setUrl(_ctx.stringValue("ListDashboardsResponse.DashboardVos["+ i +"].Url"));
			dashboardVosItem.setType(_ctx.stringValue("ListDashboardsResponse.DashboardVos["+ i +"].Type"));
			dashboardVosItem.setExporter(_ctx.stringValue("ListDashboardsResponse.DashboardVos["+ i +"].Exporter"));
			dashboardVosItem.setIsArmsExporter(_ctx.booleanValue("ListDashboardsResponse.DashboardVos["+ i +"].IsArmsExporter"));
			dashboardVosItem.setName(_ctx.stringValue("ListDashboardsResponse.DashboardVos["+ i +"].Name"));
			dashboardVosItem.setVersion(_ctx.stringValue("ListDashboardsResponse.DashboardVos["+ i +"].Version"));
			dashboardVosItem.setDashboardType(_ctx.stringValue("ListDashboardsResponse.DashboardVos["+ i +"].DashboardType"));
			dashboardVosItem.setKind(_ctx.stringValue("ListDashboardsResponse.DashboardVos["+ i +"].Kind"));
			dashboardVosItem.setNeedUpdate(_ctx.booleanValue("ListDashboardsResponse.DashboardVos["+ i +"].NeedUpdate"));
			dashboardVosItem.setHttpUrl(_ctx.stringValue("ListDashboardsResponse.DashboardVos["+ i +"].HttpUrl"));
			dashboardVosItem.setHttpsUrl(_ctx.stringValue("ListDashboardsResponse.DashboardVos["+ i +"].HttpsUrl"));

			List<String> tags = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListDashboardsResponse.DashboardVos["+ i +"].Tags.Length"); j++) {
				tags.add(_ctx.stringValue("ListDashboardsResponse.DashboardVos["+ i +"].Tags["+ j +"]"));
			}
			dashboardVosItem.setTags(tags);

			dashboardVos.add(dashboardVosItem);
		}
		listDashboardsResponse.setDashboardVos(dashboardVos);
	 
	 	return listDashboardsResponse;
	}
}