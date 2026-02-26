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

import com.aliyuncs.gpdb.model.v20160503.CreateRemoteADBDataSourceResponse;
import com.aliyuncs.gpdb.model.v20160503.CreateRemoteADBDataSourceResponse.DataSourceItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateRemoteADBDataSourceResponseUnmarshaller {

	public static CreateRemoteADBDataSourceResponse unmarshall(CreateRemoteADBDataSourceResponse createRemoteADBDataSourceResponse, UnmarshallerContext _ctx) {
		
		createRemoteADBDataSourceResponse.setRequestId(_ctx.stringValue("CreateRemoteADBDataSourceResponse.RequestId"));
		createRemoteADBDataSourceResponse.setTaskId(_ctx.integerValue("CreateRemoteADBDataSourceResponse.TaskId"));

		DataSourceItem dataSourceItem = new DataSourceItem();
		dataSourceItem.setDataSourceName(_ctx.stringValue("CreateRemoteADBDataSourceResponse.DataSourceItem.DataSourceName"));
		dataSourceItem.setDescription(_ctx.stringValue("CreateRemoteADBDataSourceResponse.DataSourceItem.Description"));
		dataSourceItem.setId(_ctx.longValue("CreateRemoteADBDataSourceResponse.DataSourceItem.Id"));
		dataSourceItem.setLocalDatabase(_ctx.stringValue("CreateRemoteADBDataSourceResponse.DataSourceItem.LocalDatabase"));
		dataSourceItem.setLocalInstanceName(_ctx.stringValue("CreateRemoteADBDataSourceResponse.DataSourceItem.LocalInstanceName"));
		dataSourceItem.setManagerUserName(_ctx.stringValue("CreateRemoteADBDataSourceResponse.DataSourceItem.ManagerUserName"));
		dataSourceItem.setRegionId(_ctx.stringValue("CreateRemoteADBDataSourceResponse.DataSourceItem.RegionId"));
		dataSourceItem.setRemoteDatabase(_ctx.stringValue("CreateRemoteADBDataSourceResponse.DataSourceItem.RemoteDatabase"));
		dataSourceItem.setRemoteInstanceName(_ctx.stringValue("CreateRemoteADBDataSourceResponse.DataSourceItem.RemoteInstanceName"));
		dataSourceItem.setStatus(_ctx.stringValue("CreateRemoteADBDataSourceResponse.DataSourceItem.Status"));
		dataSourceItem.setUserName(_ctx.stringValue("CreateRemoteADBDataSourceResponse.DataSourceItem.UserName"));
		createRemoteADBDataSourceResponse.setDataSourceItem(dataSourceItem);
	 
	 	return createRemoteADBDataSourceResponse;
	}
}