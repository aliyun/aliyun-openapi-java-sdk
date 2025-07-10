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

package com.aliyuncs.gpdb.transform.v20160503;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.gpdb.model.v20160503.ListRemoteADBDataSourcesResponse;
import com.aliyuncs.gpdb.model.v20160503.ListRemoteADBDataSourcesResponse.RemoteDataSources;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListRemoteADBDataSourcesResponseUnmarshaller {

	public static ListRemoteADBDataSourcesResponse unmarshall(ListRemoteADBDataSourcesResponse listRemoteADBDataSourcesResponse, UnmarshallerContext _ctx) {
		
		listRemoteADBDataSourcesResponse.setRequestId(_ctx.stringValue("ListRemoteADBDataSourcesResponse.RequestId"));
		listRemoteADBDataSourcesResponse.setTaskId(_ctx.integerValue("ListRemoteADBDataSourcesResponse.TaskId"));

		List<RemoteDataSources> dataSourceItems = new ArrayList<RemoteDataSources>();
		for (int i = 0; i < _ctx.lengthValue("ListRemoteADBDataSourcesResponse.DataSourceItems.Length"); i++) {
			RemoteDataSources remoteDataSources = new RemoteDataSources();
			remoteDataSources.setId(_ctx.longValue("ListRemoteADBDataSourcesResponse.DataSourceItems["+ i +"].Id"));
			remoteDataSources.setDataSourceName(_ctx.stringValue("ListRemoteADBDataSourcesResponse.DataSourceItems["+ i +"].DataSourceName"));
			remoteDataSources.setLocalInstanceName(_ctx.stringValue("ListRemoteADBDataSourcesResponse.DataSourceItems["+ i +"].LocalInstanceName"));
			remoteDataSources.setLocalDatabase(_ctx.stringValue("ListRemoteADBDataSourcesResponse.DataSourceItems["+ i +"].LocalDatabase"));
			remoteDataSources.setRemoteInstanceName(_ctx.stringValue("ListRemoteADBDataSourcesResponse.DataSourceItems["+ i +"].RemoteInstanceName"));
			remoteDataSources.setRemoteDatabase(_ctx.stringValue("ListRemoteADBDataSourcesResponse.DataSourceItems["+ i +"].RemoteDatabase"));
			remoteDataSources.setUserName(_ctx.stringValue("ListRemoteADBDataSourcesResponse.DataSourceItems["+ i +"].UserName"));
			remoteDataSources.setManagerUserName(_ctx.stringValue("ListRemoteADBDataSourcesResponse.DataSourceItems["+ i +"].ManagerUserName"));
			remoteDataSources.setStatus(_ctx.stringValue("ListRemoteADBDataSourcesResponse.DataSourceItems["+ i +"].Status"));
			remoteDataSources.setDescription(_ctx.stringValue("ListRemoteADBDataSourcesResponse.DataSourceItems["+ i +"].Description"));
			remoteDataSources.setRegionId(_ctx.stringValue("ListRemoteADBDataSourcesResponse.DataSourceItems["+ i +"].RegionId"));

			dataSourceItems.add(remoteDataSources);
		}
		listRemoteADBDataSourcesResponse.setDataSourceItems(dataSourceItems);
	 
	 	return listRemoteADBDataSourcesResponse;
	}
}