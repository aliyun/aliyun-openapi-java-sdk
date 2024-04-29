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

import com.aliyuncs.arms.model.v20190808.ListEnvironmentDashboardsResponse;
import com.aliyuncs.arms.model.v20190808.ListEnvironmentDashboardsResponse.Data;
import com.aliyuncs.arms.model.v20190808.ListEnvironmentDashboardsResponse.Data.DashboardsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListEnvironmentDashboardsResponseUnmarshaller {

	public static ListEnvironmentDashboardsResponse unmarshall(ListEnvironmentDashboardsResponse listEnvironmentDashboardsResponse, UnmarshallerContext _ctx) {
		
		listEnvironmentDashboardsResponse.setRequestId(_ctx.stringValue("ListEnvironmentDashboardsResponse.RequestId"));
		listEnvironmentDashboardsResponse.setCode(_ctx.integerValue("ListEnvironmentDashboardsResponse.Code"));
		listEnvironmentDashboardsResponse.setMessage(_ctx.stringValue("ListEnvironmentDashboardsResponse.Message"));
		listEnvironmentDashboardsResponse.setSuccess(_ctx.booleanValue("ListEnvironmentDashboardsResponse.Success"));

		Data data = new Data();
		data.setTotal(_ctx.longValue("ListEnvironmentDashboardsResponse.Data.Total"));

		List<DashboardsItem> dashboards = new ArrayList<DashboardsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListEnvironmentDashboardsResponse.Data.Dashboards.Length"); i++) {
			DashboardsItem dashboardsItem = new DashboardsItem();
			dashboardsItem.setFolderUid(_ctx.stringValue("ListEnvironmentDashboardsResponse.Data.Dashboards["+ i +"].FolderUid"));
			dashboardsItem.setRegion(_ctx.stringValue("ListEnvironmentDashboardsResponse.Data.Dashboards["+ i +"].Region"));
			dashboardsItem.setTitle(_ctx.stringValue("ListEnvironmentDashboardsResponse.Data.Dashboards["+ i +"].Title"));
			dashboardsItem.setUid(_ctx.stringValue("ListEnvironmentDashboardsResponse.Data.Dashboards["+ i +"].Uid"));
			dashboardsItem.setUrl(_ctx.stringValue("ListEnvironmentDashboardsResponse.Data.Dashboards["+ i +"].Url"));

			List<String> tags = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListEnvironmentDashboardsResponse.Data.Dashboards["+ i +"].Tags.Length"); j++) {
				tags.add(_ctx.stringValue("ListEnvironmentDashboardsResponse.Data.Dashboards["+ i +"].Tags["+ j +"]"));
			}
			dashboardsItem.setTags(tags);

			dashboards.add(dashboardsItem);
		}
		data.setDashboards(dashboards);
		listEnvironmentDashboardsResponse.setData(data);
	 
	 	return listEnvironmentDashboardsResponse;
	}
}