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

import com.aliyuncs.dms_enterprise.model.v20181101.GetPhysicalDatabaseResponse;
import com.aliyuncs.dms_enterprise.model.v20181101.GetPhysicalDatabaseResponse.Database;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetPhysicalDatabaseResponseUnmarshaller {

	public static GetPhysicalDatabaseResponse unmarshall(GetPhysicalDatabaseResponse getPhysicalDatabaseResponse, UnmarshallerContext _ctx) {
		
		getPhysicalDatabaseResponse.setRequestId(_ctx.stringValue("GetPhysicalDatabaseResponse.RequestId"));
		getPhysicalDatabaseResponse.setErrorCode(_ctx.stringValue("GetPhysicalDatabaseResponse.ErrorCode"));
		getPhysicalDatabaseResponse.setErrorMessage(_ctx.stringValue("GetPhysicalDatabaseResponse.ErrorMessage"));
		getPhysicalDatabaseResponse.setSuccess(_ctx.booleanValue("GetPhysicalDatabaseResponse.Success"));

		Database database = new Database();
		database.setDatabaseId(_ctx.stringValue("GetPhysicalDatabaseResponse.Database.DatabaseId"));
		database.setHost(_ctx.stringValue("GetPhysicalDatabaseResponse.Database.Host"));
		database.setCatalogName(_ctx.stringValue("GetPhysicalDatabaseResponse.Database.CatalogName"));
		database.setDbaName(_ctx.stringValue("GetPhysicalDatabaseResponse.Database.DbaName"));
		database.setState(_ctx.stringValue("GetPhysicalDatabaseResponse.Database.State"));
		database.setDbaId(_ctx.stringValue("GetPhysicalDatabaseResponse.Database.DbaId"));
		database.setSchemaName(_ctx.stringValue("GetPhysicalDatabaseResponse.Database.SchemaName"));
		database.setInstanceId(_ctx.stringValue("GetPhysicalDatabaseResponse.Database.InstanceId"));
		database.setPort(_ctx.integerValue("GetPhysicalDatabaseResponse.Database.Port"));
		database.setEnvType(_ctx.stringValue("GetPhysicalDatabaseResponse.Database.EnvType"));
		database.setSid(_ctx.stringValue("GetPhysicalDatabaseResponse.Database.Sid"));
		database.setEncoding(_ctx.stringValue("GetPhysicalDatabaseResponse.Database.Encoding"));
		database.setDbType(_ctx.stringValue("GetPhysicalDatabaseResponse.Database.DbType"));
		database.setSearchName(_ctx.stringValue("GetPhysicalDatabaseResponse.Database.SearchName"));

		List<String> ownerIdList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetPhysicalDatabaseResponse.Database.OwnerIdList.Length"); i++) {
			ownerIdList.add(_ctx.stringValue("GetPhysicalDatabaseResponse.Database.OwnerIdList["+ i +"]"));
		}
		database.setOwnerIdList(ownerIdList);

		List<String> ownerNameList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetPhysicalDatabaseResponse.Database.OwnerNameList.Length"); i++) {
			ownerNameList.add(_ctx.stringValue("GetPhysicalDatabaseResponse.Database.OwnerNameList["+ i +"]"));
		}
		database.setOwnerNameList(ownerNameList);
		getPhysicalDatabaseResponse.setDatabase(database);
	 
	 	return getPhysicalDatabaseResponse;
	}
}