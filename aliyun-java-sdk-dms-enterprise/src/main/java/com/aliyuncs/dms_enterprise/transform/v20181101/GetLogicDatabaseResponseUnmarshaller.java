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

import com.aliyuncs.dms_enterprise.model.v20181101.GetLogicDatabaseResponse;
import com.aliyuncs.dms_enterprise.model.v20181101.GetLogicDatabaseResponse.LogicDatabase;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLogicDatabaseResponseUnmarshaller {

	public static GetLogicDatabaseResponse unmarshall(GetLogicDatabaseResponse getLogicDatabaseResponse, UnmarshallerContext _ctx) {
		
		getLogicDatabaseResponse.setRequestId(_ctx.stringValue("GetLogicDatabaseResponse.RequestId"));
		getLogicDatabaseResponse.setSuccess(_ctx.booleanValue("GetLogicDatabaseResponse.Success"));
		getLogicDatabaseResponse.setErrorMessage(_ctx.stringValue("GetLogicDatabaseResponse.ErrorMessage"));
		getLogicDatabaseResponse.setErrorCode(_ctx.stringValue("GetLogicDatabaseResponse.ErrorCode"));

		LogicDatabase logicDatabase = new LogicDatabase();
		logicDatabase.setLogic(_ctx.booleanValue("GetLogicDatabaseResponse.LogicDatabase.Logic"));
		logicDatabase.setEnvType(_ctx.stringValue("GetLogicDatabaseResponse.LogicDatabase.EnvType"));
		logicDatabase.setSchemaName(_ctx.stringValue("GetLogicDatabaseResponse.LogicDatabase.SchemaName"));
		logicDatabase.setSearchName(_ctx.stringValue("GetLogicDatabaseResponse.LogicDatabase.SearchName"));
		logicDatabase.setDbType(_ctx.stringValue("GetLogicDatabaseResponse.LogicDatabase.DbType"));
		logicDatabase.setDatabaseId(_ctx.stringValue("GetLogicDatabaseResponse.LogicDatabase.DatabaseId"));

		List<String> ownerIdList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLogicDatabaseResponse.LogicDatabase.OwnerIdList.Length"); i++) {
			ownerIdList.add(_ctx.stringValue("GetLogicDatabaseResponse.LogicDatabase.OwnerIdList["+ i +"]"));
		}
		logicDatabase.setOwnerIdList(ownerIdList);

		List<String> ownerNameList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLogicDatabaseResponse.LogicDatabase.OwnerNameList.Length"); i++) {
			ownerNameList.add(_ctx.stringValue("GetLogicDatabaseResponse.LogicDatabase.OwnerNameList["+ i +"]"));
		}
		logicDatabase.setOwnerNameList(ownerNameList);
		getLogicDatabaseResponse.setLogicDatabase(logicDatabase);
	 
	 	return getLogicDatabaseResponse;
	}
}