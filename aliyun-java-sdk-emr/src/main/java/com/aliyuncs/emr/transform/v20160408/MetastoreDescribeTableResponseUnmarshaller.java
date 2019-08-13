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

import com.aliyuncs.emr.model.v20160408.MetastoreDescribeTableResponse;
import com.aliyuncs.emr.model.v20160408.MetastoreDescribeTableResponse.Column;
import com.aliyuncs.emr.model.v20160408.MetastoreDescribeTableResponse.PartitionColumn;
import com.aliyuncs.emr.model.v20160408.MetastoreDescribeTableResponse.SerdeParameter;
import com.aliyuncs.emr.model.v20160408.MetastoreDescribeTableResponse.StorageDescParameter;
import com.aliyuncs.emr.model.v20160408.MetastoreDescribeTableResponse.TableParameter;
import com.aliyuncs.transform.UnmarshallerContext;


public class MetastoreDescribeTableResponseUnmarshaller {

	public static MetastoreDescribeTableResponse unmarshall(MetastoreDescribeTableResponse metastoreDescribeTableResponse, UnmarshallerContext _ctx) {
		
		metastoreDescribeTableResponse.setRequestId(_ctx.stringValue("MetastoreDescribeTableResponse.RequestId"));
		metastoreDescribeTableResponse.setId(_ctx.stringValue("MetastoreDescribeTableResponse.Id"));
		metastoreDescribeTableResponse.setDatabaseId(_ctx.stringValue("MetastoreDescribeTableResponse.DatabaseId"));
		metastoreDescribeTableResponse.setClusterBizId(_ctx.stringValue("MetastoreDescribeTableResponse.ClusterBizId"));
		metastoreDescribeTableResponse.setClusterName(_ctx.stringValue("MetastoreDescribeTableResponse.ClusterName"));
		metastoreDescribeTableResponse.setCreateTime(_ctx.integerValue("MetastoreDescribeTableResponse.CreateTime"));
		metastoreDescribeTableResponse.setLastAccessTime(_ctx.integerValue("MetastoreDescribeTableResponse.LastAccessTime"));
		metastoreDescribeTableResponse.setLocationUri(_ctx.stringValue("MetastoreDescribeTableResponse.LocationUri"));
		metastoreDescribeTableResponse.setInputFormat(_ctx.stringValue("MetastoreDescribeTableResponse.InputFormat"));
		metastoreDescribeTableResponse.setOutputFormat(_ctx.stringValue("MetastoreDescribeTableResponse.OutputFormat"));
		metastoreDescribeTableResponse.setCompressed(_ctx.booleanValue("MetastoreDescribeTableResponse.Compressed"));
		metastoreDescribeTableResponse.setSerializationLib(_ctx.stringValue("MetastoreDescribeTableResponse.SerializationLib"));
		metastoreDescribeTableResponse.setTableName(_ctx.stringValue("MetastoreDescribeTableResponse.TableName"));
		metastoreDescribeTableResponse.setDbName(_ctx.stringValue("MetastoreDescribeTableResponse.DbName"));
		metastoreDescribeTableResponse.setOwner(_ctx.stringValue("MetastoreDescribeTableResponse.Owner"));
		metastoreDescribeTableResponse.setTableComment(_ctx.stringValue("MetastoreDescribeTableResponse.TableComment"));
		metastoreDescribeTableResponse.setTableType(_ctx.stringValue("MetastoreDescribeTableResponse.TableType"));
		metastoreDescribeTableResponse.setCreator(_ctx.stringValue("MetastoreDescribeTableResponse.Creator"));
		metastoreDescribeTableResponse.setFieldDelimiter(_ctx.stringValue("MetastoreDescribeTableResponse.FieldDelimiter"));

		List<Column> columns = new ArrayList<Column>();
		for (int i = 0; i < _ctx.lengthValue("MetastoreDescribeTableResponse.Columns.Length"); i++) {
			Column column = new Column();
			column.setName(_ctx.stringValue("MetastoreDescribeTableResponse.Columns["+ i +"].Name"));
			column.setType(_ctx.stringValue("MetastoreDescribeTableResponse.Columns["+ i +"].Type"));
			column.setComment(_ctx.stringValue("MetastoreDescribeTableResponse.Columns["+ i +"].Comment"));

			columns.add(column);
		}
		metastoreDescribeTableResponse.setColumns(columns);

		List<PartitionColumn> partitionColumns = new ArrayList<PartitionColumn>();
		for (int i = 0; i < _ctx.lengthValue("MetastoreDescribeTableResponse.PartitionColumns.Length"); i++) {
			PartitionColumn partitionColumn = new PartitionColumn();
			partitionColumn.setName(_ctx.stringValue("MetastoreDescribeTableResponse.PartitionColumns["+ i +"].Name"));
			partitionColumn.setType(_ctx.stringValue("MetastoreDescribeTableResponse.PartitionColumns["+ i +"].Type"));
			partitionColumn.setComment(_ctx.stringValue("MetastoreDescribeTableResponse.PartitionColumns["+ i +"].Comment"));

			partitionColumns.add(partitionColumn);
		}
		metastoreDescribeTableResponse.setPartitionColumns(partitionColumns);

		List<SerdeParameter> serdeParameters = new ArrayList<SerdeParameter>();
		for (int i = 0; i < _ctx.lengthValue("MetastoreDescribeTableResponse.SerdeParameters.Length"); i++) {
			SerdeParameter serdeParameter = new SerdeParameter();
			serdeParameter.setKey(_ctx.stringValue("MetastoreDescribeTableResponse.SerdeParameters["+ i +"].Key"));
			serdeParameter.setValue(_ctx.stringValue("MetastoreDescribeTableResponse.SerdeParameters["+ i +"].Value"));

			serdeParameters.add(serdeParameter);
		}
		metastoreDescribeTableResponse.setSerdeParameters(serdeParameters);

		List<StorageDescParameter> storageDescParameters = new ArrayList<StorageDescParameter>();
		for (int i = 0; i < _ctx.lengthValue("MetastoreDescribeTableResponse.StorageDescParameters.Length"); i++) {
			StorageDescParameter storageDescParameter = new StorageDescParameter();
			storageDescParameter.setKey(_ctx.stringValue("MetastoreDescribeTableResponse.StorageDescParameters["+ i +"].Key"));
			storageDescParameter.setValue(_ctx.stringValue("MetastoreDescribeTableResponse.StorageDescParameters["+ i +"].Value"));

			storageDescParameters.add(storageDescParameter);
		}
		metastoreDescribeTableResponse.setStorageDescParameters(storageDescParameters);

		List<TableParameter> tableParameters = new ArrayList<TableParameter>();
		for (int i = 0; i < _ctx.lengthValue("MetastoreDescribeTableResponse.TableParameters.Length"); i++) {
			TableParameter tableParameter = new TableParameter();
			tableParameter.setKey(_ctx.stringValue("MetastoreDescribeTableResponse.TableParameters["+ i +"].Key"));
			tableParameter.setValue(_ctx.stringValue("MetastoreDescribeTableResponse.TableParameters["+ i +"].Value"));

			tableParameters.add(tableParameter);
		}
		metastoreDescribeTableResponse.setTableParameters(tableParameters);
	 
	 	return metastoreDescribeTableResponse;
	}
}