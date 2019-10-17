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

import com.aliyuncs.dms_enterprise.model.v20181101.SearchDatabaseResponse;
import com.aliyuncs.dms_enterprise.model.v20181101.SearchDatabaseResponse.SearchDatabase;
import com.aliyuncs.transform.UnmarshallerContext;


public class SearchDatabaseResponseUnmarshaller {

	public static SearchDatabaseResponse unmarshall(SearchDatabaseResponse searchDatabaseResponse, UnmarshallerContext _ctx) {
		
		searchDatabaseResponse.setRequestId(_ctx.stringValue("SearchDatabaseResponse.RequestId"));
		searchDatabaseResponse.setSuccess(_ctx.booleanValue("SearchDatabaseResponse.Success"));
		searchDatabaseResponse.setErrorMessage(_ctx.stringValue("SearchDatabaseResponse.ErrorMessage"));
		searchDatabaseResponse.setErrorCode(_ctx.stringValue("SearchDatabaseResponse.ErrorCode"));
		searchDatabaseResponse.setTotalCount(_ctx.longValue("SearchDatabaseResponse.TotalCount"));

		List<SearchDatabase> searchDatabaseList = new ArrayList<SearchDatabase>();
		for (int i = 0; i < _ctx.lengthValue("SearchDatabaseResponse.SearchDatabaseList.Length"); i++) {
			SearchDatabase searchDatabase = new SearchDatabase();
			searchDatabase.setDatabaseId(_ctx.stringValue("SearchDatabaseResponse.SearchDatabaseList["+ i +"].DatabaseId"));
			searchDatabase.setLogic(_ctx.booleanValue("SearchDatabaseResponse.SearchDatabaseList["+ i +"].Logic"));
			searchDatabase.setEnvType(_ctx.stringValue("SearchDatabaseResponse.SearchDatabaseList["+ i +"].EnvType"));
			searchDatabase.setSchemaName(_ctx.stringValue("SearchDatabaseResponse.SearchDatabaseList["+ i +"].SchemaName"));
			searchDatabase.setSearchName(_ctx.stringValue("SearchDatabaseResponse.SearchDatabaseList["+ i +"].SearchName"));
			searchDatabase.setDbType(_ctx.stringValue("SearchDatabaseResponse.SearchDatabaseList["+ i +"].DbType"));
			searchDatabase.setHost(_ctx.stringValue("SearchDatabaseResponse.SearchDatabaseList["+ i +"].Host"));
			searchDatabase.setPort(_ctx.integerValue("SearchDatabaseResponse.SearchDatabaseList["+ i +"].Port"));
			searchDatabase.setSid(_ctx.stringValue("SearchDatabaseResponse.SearchDatabaseList["+ i +"].Sid"));
			searchDatabase.setDbaId(_ctx.stringValue("SearchDatabaseResponse.SearchDatabaseList["+ i +"].DbaId"));
			searchDatabase.setEncoding(_ctx.stringValue("SearchDatabaseResponse.SearchDatabaseList["+ i +"].Encoding"));
			searchDatabase.setAlias(_ctx.stringValue("SearchDatabaseResponse.SearchDatabaseList["+ i +"].Alias"));
			searchDatabase.setDatalinkName(_ctx.stringValue("SearchDatabaseResponse.SearchDatabaseList["+ i +"].DatalinkName"));

			List<String> ownerIdList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("SearchDatabaseResponse.SearchDatabaseList["+ i +"].OwnerIdList.Length"); j++) {
				ownerIdList.add(_ctx.stringValue("SearchDatabaseResponse.SearchDatabaseList["+ i +"].OwnerIdList["+ j +"]"));
			}
			searchDatabase.setOwnerIdList(ownerIdList);

			List<String> ownerNameList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("SearchDatabaseResponse.SearchDatabaseList["+ i +"].OwnerNameList.Length"); j++) {
				ownerNameList.add(_ctx.stringValue("SearchDatabaseResponse.SearchDatabaseList["+ i +"].OwnerNameList["+ j +"]"));
			}
			searchDatabase.setOwnerNameList(ownerNameList);

			searchDatabaseList.add(searchDatabase);
		}
		searchDatabaseResponse.setSearchDatabaseList(searchDatabaseList);
	 
	 	return searchDatabaseResponse;
	}
}