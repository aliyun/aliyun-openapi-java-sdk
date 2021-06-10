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

import com.aliyuncs.dms_enterprise.model.v20181101.ListLogicTablesResponse;
import com.aliyuncs.dms_enterprise.model.v20181101.ListLogicTablesResponse.LogicTable;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListLogicTablesResponseUnmarshaller {

	public static ListLogicTablesResponse unmarshall(ListLogicTablesResponse listLogicTablesResponse, UnmarshallerContext _ctx) {
		
		listLogicTablesResponse.setRequestId(_ctx.stringValue("ListLogicTablesResponse.RequestId"));
		listLogicTablesResponse.setTotalCount(_ctx.longValue("ListLogicTablesResponse.TotalCount"));
		listLogicTablesResponse.setErrorCode(_ctx.stringValue("ListLogicTablesResponse.ErrorCode"));
		listLogicTablesResponse.setErrorMessage(_ctx.stringValue("ListLogicTablesResponse.ErrorMessage"));
		listLogicTablesResponse.setSuccess(_ctx.booleanValue("ListLogicTablesResponse.Success"));

		List<LogicTable> logicTableList = new ArrayList<LogicTable>();
		for (int i = 0; i < _ctx.lengthValue("ListLogicTablesResponse.LogicTableList.Length"); i++) {
			LogicTable logicTable = new LogicTable();
			logicTable.setDatabaseId(_ctx.stringValue("ListLogicTablesResponse.LogicTableList["+ i +"].DatabaseId"));
			logicTable.setTableName(_ctx.stringValue("ListLogicTablesResponse.LogicTableList["+ i +"].TableName"));
			logicTable.setTableCount(_ctx.stringValue("ListLogicTablesResponse.LogicTableList["+ i +"].TableCount"));
			logicTable.setSchemaName(_ctx.stringValue("ListLogicTablesResponse.LogicTableList["+ i +"].SchemaName"));
			logicTable.setLogic(_ctx.booleanValue("ListLogicTablesResponse.LogicTableList["+ i +"].Logic"));
			logicTable.setTableExpr(_ctx.stringValue("ListLogicTablesResponse.LogicTableList["+ i +"].TableExpr"));
			logicTable.setTableGuid(_ctx.stringValue("ListLogicTablesResponse.LogicTableList["+ i +"].TableGuid"));
			logicTable.setTableId(_ctx.stringValue("ListLogicTablesResponse.LogicTableList["+ i +"].TableId"));

			List<String> ownerIdList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListLogicTablesResponse.LogicTableList["+ i +"].OwnerIdList.Length"); j++) {
				ownerIdList.add(_ctx.stringValue("ListLogicTablesResponse.LogicTableList["+ i +"].OwnerIdList["+ j +"]"));
			}
			logicTable.setOwnerIdList(ownerIdList);

			List<String> ownerNameList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListLogicTablesResponse.LogicTableList["+ i +"].OwnerNameList.Length"); j++) {
				ownerNameList.add(_ctx.stringValue("ListLogicTablesResponse.LogicTableList["+ i +"].OwnerNameList["+ j +"]"));
			}
			logicTable.setOwnerNameList(ownerNameList);

			logicTableList.add(logicTable);
		}
		listLogicTablesResponse.setLogicTableList(logicTableList);
	 
	 	return listLogicTablesResponse;
	}
}