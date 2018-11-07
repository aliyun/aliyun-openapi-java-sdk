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
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class MetastoreListTablesResponseUnmarshaller {

	public static MetastoreListTablesResponse unmarshall(MetastoreListTablesResponse metastoreListTablesResponse, UnmarshallerContext context) {
		
		metastoreListTablesResponse.setRequestId(context.stringValue("MetastoreListTablesResponse.RequestId"));
		metastoreListTablesResponse.setTotalCount(context.integerValue("MetastoreListTablesResponse.TotalCount"));
		metastoreListTablesResponse.setPageNumber(context.integerValue("MetastoreListTablesResponse.PageNumber"));
		metastoreListTablesResponse.setPageSize(context.integerValue("MetastoreListTablesResponse.PageSize"));

		List<String> tableNames = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("MetastoreListTablesResponse.TableNames.Length"); i++) {
			tableNames.add(context.stringValue("MetastoreListTablesResponse.TableNames["+ i +"]"));
		}
		metastoreListTablesResponse.setTableNames(tableNames);

		List<Table> tableList = new ArrayList<Table>();
		for (int i = 0; i < context.lengthValue("MetastoreListTablesResponse.TableList.Length"); i++) {
			Table table = new Table();
			table.setId(context.stringValue("MetastoreListTablesResponse.TableList["+ i +"].Id"));
			table.setDatabaseId(context.stringValue("MetastoreListTablesResponse.TableList["+ i +"].DatabaseId"));
			table.setDatabaseName(context.stringValue("MetastoreListTablesResponse.TableList["+ i +"].DatabaseName"));
			table.setClusterBizId(context.stringValue("MetastoreListTablesResponse.TableList["+ i +"].ClusterBizId"));
			table.setClusterName(context.stringValue("MetastoreListTablesResponse.TableList["+ i +"].ClusterName"));
			table.setTableName(context.stringValue("MetastoreListTablesResponse.TableList["+ i +"].TableName"));
			table.setTableComment(context.stringValue("MetastoreListTablesResponse.TableList["+ i +"].TableComment"));
			table.setTableType(context.stringValue("MetastoreListTablesResponse.TableList["+ i +"].TableType"));
			table.setTableParameters(context.stringValue("MetastoreListTablesResponse.TableList["+ i +"].TableParameters"));
			table.setOwner(context.stringValue("MetastoreListTablesResponse.TableList["+ i +"].Owner"));
			table.setOwnerType(context.stringValue("MetastoreListTablesResponse.TableList["+ i +"].OwnerType"));
			table.setIsTemporary(context.booleanValue("MetastoreListTablesResponse.TableList["+ i +"].IsTemporary"));
			table.setPartitionKeys(context.stringValue("MetastoreListTablesResponse.TableList["+ i +"].PartitionKeys"));
			table.setSerializationLib(context.stringValue("MetastoreListTablesResponse.TableList["+ i +"].SerializationLib"));
			table.setSerdeParameters(context.stringValue("MetastoreListTablesResponse.TableList["+ i +"].SerdeParameters"));
			table.setInputFormat(context.stringValue("MetastoreListTablesResponse.TableList["+ i +"].InputFormat"));
			table.setOutputFormat(context.stringValue("MetastoreListTablesResponse.TableList["+ i +"].OutputFormat"));
			table.setLocation(context.stringValue("MetastoreListTablesResponse.TableList["+ i +"].Location"));
			table.setIsCompressed(context.booleanValue("MetastoreListTablesResponse.TableList["+ i +"].IsCompressed"));
			table.setLastAccessTime(context.longValue("MetastoreListTablesResponse.TableList["+ i +"].LastAccessTime"));
			table.setCreateTime(context.longValue("MetastoreListTablesResponse.TableList["+ i +"].CreateTime"));
			table.setGmtCreate(context.longValue("MetastoreListTablesResponse.TableList["+ i +"].GmtCreate"));
			table.setGmtModified(context.longValue("MetastoreListTablesResponse.TableList["+ i +"].GmtModified"));

			tableList.add(table);
		}
		metastoreListTablesResponse.setTableList(tableList);
	 
	 	return metastoreListTablesResponse;
	}
}