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

import com.aliyuncs.dms_enterprise.model.v20181101.ListTablesResponse;
import com.aliyuncs.dms_enterprise.model.v20181101.ListTablesResponse.Table;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTablesResponseUnmarshaller {

	public static ListTablesResponse unmarshall(ListTablesResponse listTablesResponse, UnmarshallerContext _ctx) {
		
		listTablesResponse.setRequestId(_ctx.stringValue("ListTablesResponse.RequestId"));
		listTablesResponse.setTotalCount(_ctx.longValue("ListTablesResponse.TotalCount"));
		listTablesResponse.setErrorCode(_ctx.stringValue("ListTablesResponse.ErrorCode"));
		listTablesResponse.setErrorMessage(_ctx.stringValue("ListTablesResponse.ErrorMessage"));
		listTablesResponse.setSuccess(_ctx.booleanValue("ListTablesResponse.Success"));

		List<Table> tableList = new ArrayList<Table>();
		for (int i = 0; i < _ctx.lengthValue("ListTablesResponse.TableList.Length"); i++) {
			Table table = new Table();
			table.setTableId(_ctx.stringValue("ListTablesResponse.TableList["+ i +"].TableId"));
			table.setTableName(_ctx.stringValue("ListTablesResponse.TableList["+ i +"].TableName"));
			table.setTableGuid(_ctx.stringValue("ListTablesResponse.TableList["+ i +"].TableGuid"));
			table.setTableType(_ctx.stringValue("ListTablesResponse.TableList["+ i +"].TableType"));
			table.setDescription(_ctx.stringValue("ListTablesResponse.TableList["+ i +"].Description"));
			table.setTableSchemaName(_ctx.stringValue("ListTablesResponse.TableList["+ i +"].TableSchemaName"));
			table.setEncoding(_ctx.stringValue("ListTablesResponse.TableList["+ i +"].Encoding"));
			table.setDatabaseId(_ctx.stringValue("ListTablesResponse.TableList["+ i +"].DatabaseId"));
			table.setNumRows(_ctx.longValue("ListTablesResponse.TableList["+ i +"].NumRows"));
			table.setStoreCapacity(_ctx.longValue("ListTablesResponse.TableList["+ i +"].StoreCapacity"));
			table.setEngine(_ctx.stringValue("ListTablesResponse.TableList["+ i +"].Engine"));

			List<String> ownerNameList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListTablesResponse.TableList["+ i +"].OwnerNameList.Length"); j++) {
				ownerNameList.add(_ctx.stringValue("ListTablesResponse.TableList["+ i +"].OwnerNameList["+ j +"]"));
			}
			table.setOwnerNameList(ownerNameList);

			List<String> ownerIdList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListTablesResponse.TableList["+ i +"].OwnerIdList.Length"); j++) {
				ownerIdList.add(_ctx.stringValue("ListTablesResponse.TableList["+ i +"].OwnerIdList["+ j +"]"));
			}
			table.setOwnerIdList(ownerIdList);

			tableList.add(table);
		}
		listTablesResponse.setTableList(tableList);
	 
	 	return listTablesResponse;
	}
}