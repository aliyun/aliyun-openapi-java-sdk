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

package com.aliyuncs.dms_lab.transform.v20200915;

import com.aliyuncs.dms_lab.model.v20200915.GetDatabaseResponse;
import com.aliyuncs.dms_lab.model.v20200915.GetDatabaseResponse.LabDatabase;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDatabaseResponseUnmarshaller {

	public static GetDatabaseResponse unmarshall(GetDatabaseResponse getDatabaseResponse, UnmarshallerContext _ctx) {
		
		getDatabaseResponse.setRequestId(_ctx.stringValue("GetDatabaseResponse.RequestId"));
		getDatabaseResponse.setSuccess(_ctx.booleanValue("GetDatabaseResponse.Success"));
		getDatabaseResponse.setErrorMessage(_ctx.stringValue("GetDatabaseResponse.ErrorMessage"));
		getDatabaseResponse.setErrorCode(_ctx.stringValue("GetDatabaseResponse.ErrorCode"));

		LabDatabase labDatabase = new LabDatabase();
		labDatabase.setSchemaName(_ctx.stringValue("GetDatabaseResponse.LabDatabase.SchemaName"));
		labDatabase.setStatus(_ctx.stringValue("GetDatabaseResponse.LabDatabase.Status"));
		labDatabase.setDbType(_ctx.stringValue("GetDatabaseResponse.LabDatabase.DbType"));
		labDatabase.setHost(_ctx.stringValue("GetDatabaseResponse.LabDatabase.Host"));
		labDatabase.setPort(_ctx.stringValue("GetDatabaseResponse.LabDatabase.Port"));
		labDatabase.setAccount(_ctx.stringValue("GetDatabaseResponse.LabDatabase.Account"));
		labDatabase.setPassword(_ctx.stringValue("GetDatabaseResponse.LabDatabase.Password"));
		labDatabase.setSid(_ctx.stringValue("GetDatabaseResponse.LabDatabase.Sid"));
		getDatabaseResponse.setLabDatabase(labDatabase);
	 
	 	return getDatabaseResponse;
	}
}