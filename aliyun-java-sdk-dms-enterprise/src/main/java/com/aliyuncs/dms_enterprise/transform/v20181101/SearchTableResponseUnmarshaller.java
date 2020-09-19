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

import com.aliyuncs.dms_enterprise.model.v20181101.SearchTableResponse;
import com.aliyuncs.dms_enterprise.model.v20181101.SearchTableResponse.SearchTable;
import com.aliyuncs.transform.UnmarshallerContext;


public class SearchTableResponseUnmarshaller {

	public static SearchTableResponse unmarshall(SearchTableResponse searchTableResponse, UnmarshallerContext _ctx) {
		
		searchTableResponse.setRequestId(_ctx.stringValue("SearchTableResponse.RequestId"));
		searchTableResponse.setSuccess(_ctx.booleanValue("SearchTableResponse.Success"));
		searchTableResponse.setErrorMessage(_ctx.stringValue("SearchTableResponse.ErrorMessage"));
		searchTableResponse.setErrorCode(_ctx.stringValue("SearchTableResponse.ErrorCode"));
		searchTableResponse.setTotalCount(_ctx.longValue("SearchTableResponse.TotalCount"));

		List<SearchTable> searchTableList = new ArrayList<SearchTable>();
		for (int i = 0; i < _ctx.lengthValue("SearchTableResponse.SearchTableList.Length"); i++) {
			SearchTable searchTable = new SearchTable();
			searchTable.setTableId(_ctx.stringValue("SearchTableResponse.SearchTableList["+ i +"].TableId"));
			searchTable.setDatabaseId(_ctx.stringValue("SearchTableResponse.SearchTableList["+ i +"].DatabaseId"));
			searchTable.setTableName(_ctx.stringValue("SearchTableResponse.SearchTableList["+ i +"].TableName"));
			searchTable.setTableSchemaName(_ctx.stringValue("SearchTableResponse.SearchTableList["+ i +"].TableSchemaName"));
			searchTable.setEngine(_ctx.stringValue("SearchTableResponse.SearchTableList["+ i +"].Engine"));
			searchTable.setEncoding(_ctx.stringValue("SearchTableResponse.SearchTableList["+ i +"].Encoding"));
			searchTable.setLogic(_ctx.booleanValue("SearchTableResponse.SearchTableList["+ i +"].Logic"));
			searchTable.setEnvType(_ctx.stringValue("SearchTableResponse.SearchTableList["+ i +"].EnvType"));
			searchTable.setDBSearchName(_ctx.stringValue("SearchTableResponse.SearchTableList["+ i +"].DBSearchName"));
			searchTable.setDbType(_ctx.stringValue("SearchTableResponse.SearchTableList["+ i +"].DbType"));
			searchTable.setDescription(_ctx.stringValue("SearchTableResponse.SearchTableList["+ i +"].Description"));
			searchTable.setDbName(_ctx.stringValue("SearchTableResponse.SearchTableList["+ i +"].DbName"));
			searchTable.setTableGuid(_ctx.stringValue("SearchTableResponse.SearchTableList["+ i +"].TableGuid"));

			List<String> ownerIdList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("SearchTableResponse.SearchTableList["+ i +"].OwnerIdList.Length"); j++) {
				ownerIdList.add(_ctx.stringValue("SearchTableResponse.SearchTableList["+ i +"].OwnerIdList["+ j +"]"));
			}
			searchTable.setOwnerIdList(ownerIdList);

			List<String> ownerNameList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("SearchTableResponse.SearchTableList["+ i +"].OwnerNameList.Length"); j++) {
				ownerNameList.add(_ctx.stringValue("SearchTableResponse.SearchTableList["+ i +"].OwnerNameList["+ j +"]"));
			}
			searchTable.setOwnerNameList(ownerNameList);

			searchTableList.add(searchTable);
		}
		searchTableResponse.setSearchTableList(searchTableList);
	 
	 	return searchTableResponse;
	}
}