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

package com.aliyuncs.dataworks_public.transform.v20180601;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataworks_public.model.v20180601.ListEmrHiveTablesResponse;
import com.aliyuncs.dataworks_public.model.v20180601.ListEmrHiveTablesResponse.Data;
import com.aliyuncs.dataworks_public.model.v20180601.ListEmrHiveTablesResponse.Data.HiveTables;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListEmrHiveTablesResponseUnmarshaller {

	public static ListEmrHiveTablesResponse unmarshall(ListEmrHiveTablesResponse listEmrHiveTablesResponse, UnmarshallerContext _ctx) {
		
		listEmrHiveTablesResponse.setRequestId(_ctx.stringValue("ListEmrHiveTablesResponse.RequestId"));
		listEmrHiveTablesResponse.setErrorCode(_ctx.stringValue("ListEmrHiveTablesResponse.ErrorCode"));
		listEmrHiveTablesResponse.setErrorMessage(_ctx.stringValue("ListEmrHiveTablesResponse.ErrorMessage"));

		Data data = new Data();
		data.setPageNumber(_ctx.integerValue("ListEmrHiveTablesResponse.Data.PageNumber"));
		data.setPageSize(_ctx.integerValue("ListEmrHiveTablesResponse.Data.PageSize"));
		data.setTotalCount(_ctx.integerValue("ListEmrHiveTablesResponse.Data.TotalCount"));

		List<HiveTables> pagedData = new ArrayList<HiveTables>();
		for (int i = 0; i < _ctx.lengthValue("ListEmrHiveTablesResponse.Data.PagedData.Length"); i++) {
			HiveTables hiveTables = new HiveTables();
			hiveTables.setClusterBizId(_ctx.stringValue("ListEmrHiveTablesResponse.Data.PagedData["+ i +"].ClusterBizId"));
			hiveTables.setTableName(_ctx.stringValue("ListEmrHiveTablesResponse.Data.PagedData["+ i +"].TableName"));
			hiveTables.setTableType(_ctx.stringValue("ListEmrHiveTablesResponse.Data.PagedData["+ i +"].TableType"));
			hiveTables.setOwner(_ctx.stringValue("ListEmrHiveTablesResponse.Data.PagedData["+ i +"].Owner"));
			hiveTables.setOwnerType(_ctx.stringValue("ListEmrHiveTablesResponse.Data.PagedData["+ i +"].OwnerType"));
			hiveTables.setIsTemporary(_ctx.booleanValue("ListEmrHiveTablesResponse.Data.PagedData["+ i +"].IsTemporary"));
			hiveTables.setSerializationLib(_ctx.stringValue("ListEmrHiveTablesResponse.Data.PagedData["+ i +"].SerializationLib"));
			hiveTables.setInputFormat(_ctx.stringValue("ListEmrHiveTablesResponse.Data.PagedData["+ i +"].InputFormat"));
			hiveTables.setOutputFormat(_ctx.stringValue("ListEmrHiveTablesResponse.Data.PagedData["+ i +"].OutputFormat"));
			hiveTables.setLocation(_ctx.stringValue("ListEmrHiveTablesResponse.Data.PagedData["+ i +"].Location"));
			hiveTables.setLastAccessTime(_ctx.stringValue("ListEmrHiveTablesResponse.Data.PagedData["+ i +"].LastAccessTime"));
			hiveTables.setGmtCreate(_ctx.stringValue("ListEmrHiveTablesResponse.Data.PagedData["+ i +"].GmtCreate"));
			hiveTables.setGmtModified(_ctx.stringValue("ListEmrHiveTablesResponse.Data.PagedData["+ i +"].GmtModified"));
			hiveTables.setTableComment(_ctx.stringValue("ListEmrHiveTablesResponse.Data.PagedData["+ i +"].TableComment"));
			hiveTables.setTableParameters(_ctx.stringValue("ListEmrHiveTablesResponse.Data.PagedData["+ i +"].TableParameters"));
			hiveTables.setPartitionKeys(_ctx.stringValue("ListEmrHiveTablesResponse.Data.PagedData["+ i +"].PartitionKeys"));
			hiveTables.setIsCompressed(_ctx.booleanValue("ListEmrHiveTablesResponse.Data.PagedData["+ i +"].IsCompressed"));
			hiveTables.setClusterBizName(_ctx.stringValue("ListEmrHiveTablesResponse.Data.PagedData["+ i +"].ClusterBizName"));
			hiveTables.setDatabaseName(_ctx.stringValue("ListEmrHiveTablesResponse.Data.PagedData["+ i +"].DatabaseName"));
			hiveTables.setOwnerId(_ctx.stringValue("ListEmrHiveTablesResponse.Data.PagedData["+ i +"].OwnerId"));
			hiveTables.setLastModifyTime(_ctx.stringValue("ListEmrHiveTablesResponse.Data.PagedData["+ i +"].LastModifyTime"));
			hiveTables.setTableDesc(_ctx.stringValue("ListEmrHiveTablesResponse.Data.PagedData["+ i +"].TableDesc"));

			pagedData.add(hiveTables);
		}
		data.setPagedData(pagedData);
		listEmrHiveTablesResponse.setData(data);
	 
	 	return listEmrHiveTablesResponse;
	}
}