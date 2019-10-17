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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dms_enterprise.model.v20181101.GetDatabaseResponse;
import com.aliyuncs.dms_enterprise.model.v20181101.GetDatabaseResponse.Database;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDatabaseResponseUnmarshaller {

	public static GetDatabaseResponse unmarshall(GetDatabaseResponse getDatabaseResponse, UnmarshallerContext _ctx) {
		
		getDatabaseResponse.setRequestId(_ctx.stringValue("GetDatabaseResponse.RequestId"));
		getDatabaseResponse.setSuccess(_ctx.booleanValue("GetDatabaseResponse.Success"));
		getDatabaseResponse.setErrorMessage(_ctx.stringValue("GetDatabaseResponse.ErrorMessage"));
		getDatabaseResponse.setErrorCode(_ctx.stringValue("GetDatabaseResponse.ErrorCode"));

		Database database = new Database();
		database.setInstanceId(_ctx.stringValue("GetDatabaseResponse.Database.InstanceId"));
		database.setDatabaseId(_ctx.stringValue("GetDatabaseResponse.Database.DatabaseId"));
		database.setEnvType(_ctx.stringValue("GetDatabaseResponse.Database.EnvType"));
		database.setSchemaName(_ctx.stringValue("GetDatabaseResponse.Database.SchemaName"));
		database.setCatalogName(_ctx.stringValue("GetDatabaseResponse.Database.CatalogName"));
		database.setEncoding(_ctx.stringValue("GetDatabaseResponse.Database.Encoding"));
		database.setSearchName(_ctx.stringValue("GetDatabaseResponse.Database.SearchName"));
		database.setState(_ctx.stringValue("GetDatabaseResponse.Database.State"));
		database.setDbType(_ctx.stringValue("GetDatabaseResponse.Database.DbType"));
		database.setHost(_ctx.stringValue("GetDatabaseResponse.Database.Host"));
		database.setPort(_ctx.integerValue("GetDatabaseResponse.Database.Port"));
		database.setSid(_ctx.stringValue("GetDatabaseResponse.Database.Sid"));
		database.setDbaName(_ctx.stringValue("GetDatabaseResponse.Database.DbaName"));
		database.setDbaId(_ctx.stringValue("GetDatabaseResponse.Database.DbaId"));

		List<String> ownerIdList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetDatabaseResponse.Database.OwnerIdList.Length"); i++) {
			ownerIdList.add(_ctx.stringValue("GetDatabaseResponse.Database.OwnerIdList["+ i +"]"));
		}
		database.setOwnerIdList(ownerIdList);

		List<String> ownerNameList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetDatabaseResponse.Database.OwnerNameList.Length"); i++) {
			ownerNameList.add(_ctx.stringValue("GetDatabaseResponse.Database.OwnerNameList["+ i +"]"));
		}
		database.setOwnerNameList(ownerNameList);
		getDatabaseResponse.setDatabase(database);
	 
	 	return getDatabaseResponse;
	}
}