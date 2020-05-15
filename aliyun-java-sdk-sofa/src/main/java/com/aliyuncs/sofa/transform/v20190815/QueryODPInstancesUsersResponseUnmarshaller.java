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

import com.aliyuncs.sofa.model.v20190815.QueryODPInstancesUsersResponse;
import com.aliyuncs.sofa.model.v20190815.QueryODPInstancesUsersResponse.DataItem;
import com.aliyuncs.sofa.model.v20190815.QueryODPInstancesUsersResponse.DataItem.PrivilegedSchemasItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryODPInstancesUsersResponseUnmarshaller {

	public static QueryODPInstancesUsersResponse unmarshall(QueryODPInstancesUsersResponse queryODPInstancesUsersResponse, UnmarshallerContext _ctx) {
		
		queryODPInstancesUsersResponse.setRequestId(_ctx.stringValue("QueryODPInstancesUsersResponse.RequestId"));
		queryODPInstancesUsersResponse.setResultCode(_ctx.stringValue("QueryODPInstancesUsersResponse.ResultCode"));
		queryODPInstancesUsersResponse.setResultMessage(_ctx.stringValue("QueryODPInstancesUsersResponse.ResultMessage"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryODPInstancesUsersResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setDescription(_ctx.stringValue("QueryODPInstancesUsersResponse.Data["+ i +"].Description"));
			dataItem.setInstanceId(_ctx.stringValue("QueryODPInstancesUsersResponse.Data["+ i +"].InstanceId"));
			dataItem.setPassword(_ctx.stringValue("QueryODPInstancesUsersResponse.Data["+ i +"].Password"));
			dataItem.setUsername(_ctx.stringValue("QueryODPInstancesUsersResponse.Data["+ i +"].Username"));
			dataItem.setUserType(_ctx.stringValue("QueryODPInstancesUsersResponse.Data["+ i +"].UserType"));

			List<PrivilegedSchemasItem> privilegedSchemas = new ArrayList<PrivilegedSchemasItem>();
			for (int j = 0; j < _ctx.lengthValue("QueryODPInstancesUsersResponse.Data["+ i +"].PrivilegedSchemas.Length"); j++) {
				PrivilegedSchemasItem privilegedSchemasItem = new PrivilegedSchemasItem();
				privilegedSchemasItem.setInstanceId(_ctx.stringValue("QueryODPInstancesUsersResponse.Data["+ i +"].PrivilegedSchemas["+ j +"].InstanceId"));
				privilegedSchemasItem.setPassword(_ctx.stringValue("QueryODPInstancesUsersResponse.Data["+ i +"].PrivilegedSchemas["+ j +"].Password"));
				privilegedSchemasItem.setPrivilege(_ctx.stringValue("QueryODPInstancesUsersResponse.Data["+ i +"].PrivilegedSchemas["+ j +"].Privilege"));
				privilegedSchemasItem.setSchemaName(_ctx.stringValue("QueryODPInstancesUsersResponse.Data["+ i +"].PrivilegedSchemas["+ j +"].SchemaName"));
				privilegedSchemasItem.setUsername(_ctx.stringValue("QueryODPInstancesUsersResponse.Data["+ i +"].PrivilegedSchemas["+ j +"].Username"));

				privilegedSchemas.add(privilegedSchemasItem);
			}
			dataItem.setPrivilegedSchemas(privilegedSchemas);

			data.add(dataItem);
		}
		queryODPInstancesUsersResponse.setData(data);
	 
	 	return queryODPInstancesUsersResponse;
	}
}