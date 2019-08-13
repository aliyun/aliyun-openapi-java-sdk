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

package com.aliyuncs.emr.transform.v20160408;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.emr.model.v20160408.MetastoreListDatabasesResponse;
import com.aliyuncs.emr.model.v20160408.MetastoreListDatabasesResponse.Database;
import com.aliyuncs.transform.UnmarshallerContext;


public class MetastoreListDatabasesResponseUnmarshaller {

	public static MetastoreListDatabasesResponse unmarshall(MetastoreListDatabasesResponse metastoreListDatabasesResponse, UnmarshallerContext _ctx) {
		
		metastoreListDatabasesResponse.setRequestId(_ctx.stringValue("MetastoreListDatabasesResponse.RequestId"));
		metastoreListDatabasesResponse.setDescription(_ctx.stringValue("MetastoreListDatabasesResponse.Description"));
		metastoreListDatabasesResponse.setTotalCount(_ctx.integerValue("MetastoreListDatabasesResponse.TotalCount"));
		metastoreListDatabasesResponse.setPageNumber(_ctx.integerValue("MetastoreListDatabasesResponse.PageNumber"));
		metastoreListDatabasesResponse.setPageSize(_ctx.integerValue("MetastoreListDatabasesResponse.PageSize"));

		List<String> dbNames = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("MetastoreListDatabasesResponse.DbNames.Length"); i++) {
			dbNames.add(_ctx.stringValue("MetastoreListDatabasesResponse.DbNames["+ i +"]"));
		}
		metastoreListDatabasesResponse.setDbNames(dbNames);

		List<Database> databaseList = new ArrayList<Database>();
		for (int i = 0; i < _ctx.lengthValue("MetastoreListDatabasesResponse.DatabaseList.Length"); i++) {
			Database database = new Database();
			database.setId(_ctx.stringValue("MetastoreListDatabasesResponse.DatabaseList["+ i +"].Id"));
			database.setClusterBizId(_ctx.stringValue("MetastoreListDatabasesResponse.DatabaseList["+ i +"].ClusterBizId"));
			database.setClusterName(_ctx.stringValue("MetastoreListDatabasesResponse.DatabaseList["+ i +"].ClusterName"));
			database.setDatabaseName(_ctx.stringValue("MetastoreListDatabasesResponse.DatabaseList["+ i +"].DatabaseName"));
			database.setDatabaseType(_ctx.stringValue("MetastoreListDatabasesResponse.DatabaseList["+ i +"].DatabaseType"));
			database.setOwner(_ctx.stringValue("MetastoreListDatabasesResponse.DatabaseList["+ i +"].Owner"));
			database.setOwnerType(_ctx.stringValue("MetastoreListDatabasesResponse.DatabaseList["+ i +"].OwnerType"));
			database.setLocation(_ctx.stringValue("MetastoreListDatabasesResponse.DatabaseList["+ i +"].Location"));
			database.setStatus(_ctx.stringValue("MetastoreListDatabasesResponse.DatabaseList["+ i +"].Status"));
			database.setDatabaseParameters(_ctx.stringValue("MetastoreListDatabasesResponse.DatabaseList["+ i +"].DatabaseParameters"));
			database.setGmtCreate(_ctx.longValue("MetastoreListDatabasesResponse.DatabaseList["+ i +"].GmtCreate"));
			database.setGmtModified(_ctx.longValue("MetastoreListDatabasesResponse.DatabaseList["+ i +"].GmtModified"));
			database.setLocationType(_ctx.stringValue("MetastoreListDatabasesResponse.DatabaseList["+ i +"].LocationType"));
			database.setDatabaseComment(_ctx.stringValue("MetastoreListDatabasesResponse.DatabaseList["+ i +"].DatabaseComment"));

			databaseList.add(database);
		}
		metastoreListDatabasesResponse.setDatabaseList(databaseList);
	 
	 	return metastoreListDatabasesResponse;
	}
}