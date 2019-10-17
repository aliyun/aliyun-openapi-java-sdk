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

import com.aliyuncs.dms_enterprise.model.v20181101.ListLogicDatabasesResponse;
import com.aliyuncs.dms_enterprise.model.v20181101.ListLogicDatabasesResponse.LogicDatabase;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListLogicDatabasesResponseUnmarshaller {

	public static ListLogicDatabasesResponse unmarshall(ListLogicDatabasesResponse listLogicDatabasesResponse, UnmarshallerContext _ctx) {
		
		listLogicDatabasesResponse.setRequestId(_ctx.stringValue("ListLogicDatabasesResponse.RequestId"));
		listLogicDatabasesResponse.setSuccess(_ctx.booleanValue("ListLogicDatabasesResponse.Success"));
		listLogicDatabasesResponse.setErrorMessage(_ctx.stringValue("ListLogicDatabasesResponse.ErrorMessage"));
		listLogicDatabasesResponse.setErrorCode(_ctx.stringValue("ListLogicDatabasesResponse.ErrorCode"));
		listLogicDatabasesResponse.setTotalCount(_ctx.longValue("ListLogicDatabasesResponse.TotalCount"));

		List<LogicDatabase> logicDatabaseList = new ArrayList<LogicDatabase>();
		for (int i = 0; i < _ctx.lengthValue("ListLogicDatabasesResponse.LogicDatabaseList.Length"); i++) {
			LogicDatabase logicDatabase = new LogicDatabase();
			logicDatabase.setLogic(_ctx.booleanValue("ListLogicDatabasesResponse.LogicDatabaseList["+ i +"].Logic"));
			logicDatabase.setDatabaseId(_ctx.stringValue("ListLogicDatabasesResponse.LogicDatabaseList["+ i +"].DatabaseId"));
			logicDatabase.setEnvType(_ctx.stringValue("ListLogicDatabasesResponse.LogicDatabaseList["+ i +"].EnvType"));
			logicDatabase.setSchemaName(_ctx.stringValue("ListLogicDatabasesResponse.LogicDatabaseList["+ i +"].SchemaName"));
			logicDatabase.setSearchName(_ctx.stringValue("ListLogicDatabasesResponse.LogicDatabaseList["+ i +"].SearchName"));
			logicDatabase.setDbType(_ctx.stringValue("ListLogicDatabasesResponse.LogicDatabaseList["+ i +"].DbType"));

			List<String> ownerIdList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListLogicDatabasesResponse.LogicDatabaseList["+ i +"].OwnerIdList.Length"); j++) {
				ownerIdList.add(_ctx.stringValue("ListLogicDatabasesResponse.LogicDatabaseList["+ i +"].OwnerIdList["+ j +"]"));
			}
			logicDatabase.setOwnerIdList(ownerIdList);

			List<String> ownerNameList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListLogicDatabasesResponse.LogicDatabaseList["+ i +"].OwnerNameList.Length"); j++) {
				ownerNameList.add(_ctx.stringValue("ListLogicDatabasesResponse.LogicDatabaseList["+ i +"].OwnerNameList["+ j +"]"));
			}
			logicDatabase.setOwnerNameList(ownerNameList);

			logicDatabaseList.add(logicDatabase);
		}
		listLogicDatabasesResponse.setLogicDatabaseList(logicDatabaseList);
	 
	 	return listLogicDatabasesResponse;
	}
}