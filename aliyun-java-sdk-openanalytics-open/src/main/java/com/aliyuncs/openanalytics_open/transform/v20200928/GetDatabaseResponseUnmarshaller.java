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

package com.aliyuncs.openanalytics_open.transform.v20200928;

import com.aliyuncs.openanalytics_open.model.v20200928.GetDatabaseResponse;
import com.aliyuncs.openanalytics_open.model.v20200928.GetDatabaseResponse.DatabaseModel;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDatabaseResponseUnmarshaller {

	public static GetDatabaseResponse unmarshall(GetDatabaseResponse getDatabaseResponse, UnmarshallerContext _ctx) {
		
		getDatabaseResponse.setRequestId(_ctx.stringValue("GetDatabaseResponse.RequestId"));
		getDatabaseResponse.setMessage(_ctx.stringValue("GetDatabaseResponse.Message"));
		getDatabaseResponse.setCode(_ctx.stringValue("GetDatabaseResponse.Code"));
		getDatabaseResponse.setSuccess(_ctx.booleanValue("GetDatabaseResponse.Success"));

		DatabaseModel databaseModel = new DatabaseModel();
		databaseModel.setTenantId(_ctx.stringValue("GetDatabaseResponse.DatabaseModel.TenantId"));
		databaseModel.setOwnerName(_ctx.stringValue("GetDatabaseResponse.DatabaseModel.OwnerName"));
		databaseModel.setLocationUri(_ctx.stringValue("GetDatabaseResponse.DatabaseModel.LocationUri"));
		databaseModel.setParameters(_ctx.mapValue("GetDatabaseResponse.DatabaseModel.Parameters"));
		databaseModel.setDescription(_ctx.stringValue("GetDatabaseResponse.DatabaseModel.Description"));
		databaseModel.setName(_ctx.stringValue("GetDatabaseResponse.DatabaseModel.Name"));
		getDatabaseResponse.setDatabaseModel(databaseModel);
	 
	 	return getDatabaseResponse;
	}
}