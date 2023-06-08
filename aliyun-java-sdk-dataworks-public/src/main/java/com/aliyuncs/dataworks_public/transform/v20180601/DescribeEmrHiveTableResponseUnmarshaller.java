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

import com.aliyuncs.dataworks_public.model.v20180601.DescribeEmrHiveTableResponse;
import com.aliyuncs.dataworks_public.model.v20180601.DescribeEmrHiveTableResponse.Data;
import com.aliyuncs.dataworks_public.model.v20180601.DescribeEmrHiveTableResponse.Data.TableColumn;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeEmrHiveTableResponseUnmarshaller {

	public static DescribeEmrHiveTableResponse unmarshall(DescribeEmrHiveTableResponse describeEmrHiveTableResponse, UnmarshallerContext _ctx) {
		
		describeEmrHiveTableResponse.setRequestId(_ctx.stringValue("DescribeEmrHiveTableResponse.RequestId"));
		describeEmrHiveTableResponse.setErrorMessage(_ctx.stringValue("DescribeEmrHiveTableResponse.ErrorMessage"));
		describeEmrHiveTableResponse.setErrorCode(_ctx.stringValue("DescribeEmrHiveTableResponse.ErrorCode"));

		Data data = new Data();
		data.setTableParameters(_ctx.stringValue("DescribeEmrHiveTableResponse.Data.TableParameters"));
		data.setOwner(_ctx.stringValue("DescribeEmrHiveTableResponse.Data.Owner"));
		data.setTableName(_ctx.stringValue("DescribeEmrHiveTableResponse.Data.TableName"));
		data.setTableDesc(_ctx.stringValue("DescribeEmrHiveTableResponse.Data.TableDesc"));
		data.setIsCompressed(_ctx.booleanValue("DescribeEmrHiveTableResponse.Data.IsCompressed"));
		data.setGmtModified(_ctx.stringValue("DescribeEmrHiveTableResponse.Data.GmtModified"));
		data.setSerializationLib(_ctx.stringValue("DescribeEmrHiveTableResponse.Data.SerializationLib"));
		data.setOwnerId(_ctx.stringValue("DescribeEmrHiveTableResponse.Data.OwnerId"));
		data.setTableSize(_ctx.longValue("DescribeEmrHiveTableResponse.Data.TableSize"));
		data.setLastAccessTime(_ctx.stringValue("DescribeEmrHiveTableResponse.Data.LastAccessTime"));
		data.setTableComment(_ctx.stringValue("DescribeEmrHiveTableResponse.Data.TableComment"));
		data.setLastModifyTime(_ctx.stringValue("DescribeEmrHiveTableResponse.Data.LastModifyTime"));
		data.setDatabaseName(_ctx.stringValue("DescribeEmrHiveTableResponse.Data.DatabaseName"));
		data.setIsTemporary(_ctx.booleanValue("DescribeEmrHiveTableResponse.Data.IsTemporary"));
		data.setGmtCreate(_ctx.stringValue("DescribeEmrHiveTableResponse.Data.GmtCreate"));
		data.setOutputFormat(_ctx.stringValue("DescribeEmrHiveTableResponse.Data.OutputFormat"));
		data.setTableType(_ctx.stringValue("DescribeEmrHiveTableResponse.Data.TableType"));
		data.setOwnerType(_ctx.stringValue("DescribeEmrHiveTableResponse.Data.OwnerType"));
		data.setPartitionKeys(_ctx.stringValue("DescribeEmrHiveTableResponse.Data.PartitionKeys"));
		data.setClusterBizId(_ctx.stringValue("DescribeEmrHiveTableResponse.Data.ClusterBizId"));
		data.setLocation(_ctx.stringValue("DescribeEmrHiveTableResponse.Data.Location"));
		data.setClusterBizName(_ctx.stringValue("DescribeEmrHiveTableResponse.Data.ClusterBizName"));
		data.setInputFormat(_ctx.stringValue("DescribeEmrHiveTableResponse.Data.InputFormat"));

		List<TableColumn> columns = new ArrayList<TableColumn>();
		for (int i = 0; i < _ctx.lengthValue("DescribeEmrHiveTableResponse.Data.Columns.Length"); i++) {
			TableColumn tableColumn = new TableColumn();
			tableColumn.setColumnName(_ctx.stringValue("DescribeEmrHiveTableResponse.Data.Columns["+ i +"].ColumnName"));
			tableColumn.setColumnComment(_ctx.stringValue("DescribeEmrHiveTableResponse.Data.Columns["+ i +"].ColumnComment"));
			tableColumn.setComment(_ctx.stringValue("DescribeEmrHiveTableResponse.Data.Columns["+ i +"].Comment"));
			tableColumn.setColumnType(_ctx.stringValue("DescribeEmrHiveTableResponse.Data.Columns["+ i +"].ColumnType"));
			tableColumn.setGmtCreate(_ctx.stringValue("DescribeEmrHiveTableResponse.Data.Columns["+ i +"].GmtCreate"));
			tableColumn.setGmtModified(_ctx.stringValue("DescribeEmrHiveTableResponse.Data.Columns["+ i +"].GmtModified"));
			tableColumn.setColumnPosition(_ctx.integerValue("DescribeEmrHiveTableResponse.Data.Columns["+ i +"].ColumnPosition"));

			columns.add(tableColumn);
		}
		data.setColumns(columns);
		describeEmrHiveTableResponse.setData(data);
	 
	 	return describeEmrHiveTableResponse;
	}
}