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

import com.aliyuncs.gpdb.model.v20160503.ModifyRemoteADBDataSourceResponse;
import com.aliyuncs.gpdb.model.v20160503.ModifyRemoteADBDataSourceResponse.DataSourceItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyRemoteADBDataSourceResponseUnmarshaller {

	public static ModifyRemoteADBDataSourceResponse unmarshall(ModifyRemoteADBDataSourceResponse modifyRemoteADBDataSourceResponse, UnmarshallerContext _ctx) {
		
		modifyRemoteADBDataSourceResponse.setRequestId(_ctx.stringValue("ModifyRemoteADBDataSourceResponse.RequestId"));
		modifyRemoteADBDataSourceResponse.setTaskId(_ctx.integerValue("ModifyRemoteADBDataSourceResponse.TaskId"));

		DataSourceItem dataSourceItem = new DataSourceItem();
		dataSourceItem.setId(_ctx.longValue("ModifyRemoteADBDataSourceResponse.DataSourceItem.Id"));
		dataSourceItem.setDataSourceName(_ctx.stringValue("ModifyRemoteADBDataSourceResponse.DataSourceItem.DataSourceName"));
		dataSourceItem.setLocalInstanceName(_ctx.stringValue("ModifyRemoteADBDataSourceResponse.DataSourceItem.LocalInstanceName"));
		dataSourceItem.setLocalDatabase(_ctx.stringValue("ModifyRemoteADBDataSourceResponse.DataSourceItem.LocalDatabase"));
		dataSourceItem.setRemoteInstanceName(_ctx.stringValue("ModifyRemoteADBDataSourceResponse.DataSourceItem.RemoteInstanceName"));
		dataSourceItem.setRemoteDatabase(_ctx.stringValue("ModifyRemoteADBDataSourceResponse.DataSourceItem.RemoteDatabase"));
		dataSourceItem.setUserName(_ctx.stringValue("ModifyRemoteADBDataSourceResponse.DataSourceItem.UserName"));
		dataSourceItem.setManagerUserName(_ctx.stringValue("ModifyRemoteADBDataSourceResponse.DataSourceItem.ManagerUserName"));
		dataSourceItem.setStatus(_ctx.stringValue("ModifyRemoteADBDataSourceResponse.DataSourceItem.Status"));
		dataSourceItem.setDescription(_ctx.stringValue("ModifyRemoteADBDataSourceResponse.DataSourceItem.Description"));
		dataSourceItem.setRegionId(_ctx.stringValue("ModifyRemoteADBDataSourceResponse.DataSourceItem.RegionId"));
		modifyRemoteADBDataSourceResponse.setDataSourceItem(dataSourceItem);
	 
	 	return modifyRemoteADBDataSourceResponse;
	}
}