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

import com.aliyuncs.emr.model.v20160408.MetastoreListTablesResponse;
import com.aliyuncs.emr.model.v20160408.MetastoreListTablesResponse.Table;
import com.aliyuncs.transform.UnmarshallerContext;


public class MetastoreListTablesResponseUnmarshaller {

	public static MetastoreListTablesResponse unmarshall(MetastoreListTablesResponse metastoreListTablesResponse, UnmarshallerContext _ctx) {
		
		metastoreListTablesResponse.setRequestId(_ctx.stringValue("MetastoreListTablesResponse.RequestId"));
		metastoreListTablesResponse.setTotalCount(_ctx.integerValue("MetastoreListTablesResponse.TotalCount"));
		metastoreListTablesResponse.setPageNumber(_ctx.integerValue("MetastoreListTablesResponse.PageNumber"));
		metastoreListTablesResponse.setPageSize(_ctx.integerValue("MetastoreListTablesResponse.PageSize"));

		List<String> tableNames = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("MetastoreListTablesResponse.TableNames.Length"); i++) {
			tableNames.add(_ctx.stringValue("MetastoreListTablesResponse.TableNames["+ i +"]"));
		}
		metastoreListTablesResponse.setTableNames(tableNames);

		List<Table> tableList = new ArrayList<Table>();
		for (int i = 0; i < _ctx.lengthValue("MetastoreListTablesResponse.TableList.Length"); i++) {
			Table table = new Table();
			table.setId(_ctx.stringValue("MetastoreListTablesResponse.TableList["+ i +"].Id"));
			table.setDatabaseId(_ctx.stringValue("MetastoreListTablesResponse.TableList["+ i +"].DatabaseId"));
			table.setDatabaseName(_ctx.stringValue("MetastoreListTablesResponse.TableList["+ i +"].DatabaseName"));
			table.setClusterBizId(_ctx.stringValue("MetastoreListTablesResponse.TableList["+ i +"].ClusterBizId"));
			table.setClusterName(_ctx.stringValue("MetastoreListTablesResponse.TableList["+ i +"].ClusterName"));
			table.setTableName(_ctx.stringValue("MetastoreListTablesResponse.TableList["+ i +"].TableName"));
			table.setTableComment(_ctx.stringValue("MetastoreListTablesResponse.TableList["+ i +"].TableComment"));
			table.setTableType(_ctx.stringValue("MetastoreListTablesResponse.TableList["+ i +"].TableType"));
			table.setTableParameters(_ctx.stringValue("MetastoreListTablesResponse.TableList["+ i +"].TableParameters"));
			table.setOwner(_ctx.stringValue("MetastoreListTablesResponse.TableList["+ i +"].Owner"));
			table.setOwnerType(_ctx.stringValue("MetastoreListTablesResponse.TableList["+ i +"].OwnerType"));
			table.setIsTemporary(_ctx.booleanValue("MetastoreListTablesResponse.TableList["+ i +"].IsTemporary"));
			table.setPartitionKeys(_ctx.stringValue("MetastoreListTablesResponse.TableList["+ i +"].PartitionKeys"));
			table.setSerializationLib(_ctx.stringValue("MetastoreListTablesResponse.TableList["+ i +"].SerializationLib"));
			table.setSerdeParameters(_ctx.stringValue("MetastoreListTablesResponse.TableList["+ i +"].SerdeParameters"));
			table.setInputFormat(_ctx.stringValue("MetastoreListTablesResponse.TableList["+ i +"].InputFormat"));
			table.setOutputFormat(_ctx.stringValue("MetastoreListTablesResponse.TableList["+ i +"].OutputFormat"));
			table.setLocation(_ctx.stringValue("MetastoreListTablesResponse.TableList["+ i +"].Location"));
			table.setIsCompressed(_ctx.booleanValue("MetastoreListTablesResponse.TableList["+ i +"].IsCompressed"));
			table.setLastAccessTime(_ctx.longValue("MetastoreListTablesResponse.TableList["+ i +"].LastAccessTime"));
			table.setCreateTime(_ctx.longValue("MetastoreListTablesResponse.TableList["+ i +"].CreateTime"));
			table.setGmtCreate(_ctx.longValue("MetastoreListTablesResponse.TableList["+ i +"].GmtCreate"));
			table.setGmtModified(_ctx.longValue("MetastoreListTablesResponse.TableList["+ i +"].GmtModified"));

			tableList.add(table);
		}
		metastoreListTablesResponse.setTableList(tableList);
	 
	 	return metastoreListTablesResponse;
	}
}