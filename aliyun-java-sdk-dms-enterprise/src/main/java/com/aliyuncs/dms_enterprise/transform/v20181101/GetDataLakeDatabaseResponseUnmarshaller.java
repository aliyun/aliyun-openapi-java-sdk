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

package com.aliyuncs.dms_enterprise.transform.v20181101;

import com.aliyuncs.dms_enterprise.model.v20181101.GetDataLakeDatabaseResponse;
import com.aliyuncs.dms_enterprise.model.v20181101.GetDataLakeDatabaseResponse.Database;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDataLakeDatabaseResponseUnmarshaller {

	public static GetDataLakeDatabaseResponse unmarshall(GetDataLakeDatabaseResponse getDataLakeDatabaseResponse, UnmarshallerContext _ctx) {
		
		getDataLakeDatabaseResponse.setRequestId(_ctx.stringValue("GetDataLakeDatabaseResponse.RequestId"));
		getDataLakeDatabaseResponse.setSuccess(_ctx.booleanValue("GetDataLakeDatabaseResponse.Success"));
		getDataLakeDatabaseResponse.setErrorCode(_ctx.stringValue("GetDataLakeDatabaseResponse.ErrorCode"));
		getDataLakeDatabaseResponse.setErrorMessage(_ctx.stringValue("GetDataLakeDatabaseResponse.ErrorMessage"));

		Database database = new Database();
		database.setDescription(_ctx.stringValue("GetDataLakeDatabaseResponse.Database.Description"));
		database.setParameters(_ctx.mapValue("GetDataLakeDatabaseResponse.Database.Parameters"));
		database.setDbId(_ctx.longValue("GetDataLakeDatabaseResponse.Database.DbId"));
		database.setCatalogName(_ctx.stringValue("GetDataLakeDatabaseResponse.Database.CatalogName"));
		database.setName(_ctx.stringValue("GetDataLakeDatabaseResponse.Database.Name"));
		database.setLocation(_ctx.stringValue("GetDataLakeDatabaseResponse.Database.Location"));
		getDataLakeDatabaseResponse.setDatabase(database);
	 
	 	return getDataLakeDatabaseResponse;
	}
}