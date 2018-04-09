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
import com.aliyuncs.emr.model.v20160408.MetastoreDescribeTableResponse.SerdeParameter;
import com.aliyuncs.emr.model.v20160408.MetastoreDescribeTableResponse.StorageDescParameter;
import com.aliyuncs.transform.UnmarshallerContext;


public class MetastoreDescribeTableResponseUnmarshaller {

	public static MetastoreDescribeTableResponse unmarshall(MetastoreDescribeTableResponse metastoreDescribeTableResponse, UnmarshallerContext context) {
		
		metastoreDescribeTableResponse.setRequestId(context.stringValue("MetastoreDescribeTableResponse.RequestId"));
		metastoreDescribeTableResponse.setCreateTime(context.integerValue("MetastoreDescribeTableResponse.CreateTime"));
		metastoreDescribeTableResponse.setLastAccessTime(context.integerValue("MetastoreDescribeTableResponse.LastAccessTime"));
		metastoreDescribeTableResponse.setLocationUri(context.stringValue("MetastoreDescribeTableResponse.LocationUri"));
		metastoreDescribeTableResponse.setInputFormat(context.stringValue("MetastoreDescribeTableResponse.InputFormat"));
		metastoreDescribeTableResponse.setOutputFormat(context.stringValue("MetastoreDescribeTableResponse.OutputFormat"));
		metastoreDescribeTableResponse.setCompressed(context.booleanValue("MetastoreDescribeTableResponse.Compressed"));
		metastoreDescribeTableResponse.setSerializationLib(context.stringValue("MetastoreDescribeTableResponse.SerializationLib"));
		metastoreDescribeTableResponse.setTableName(context.stringValue("MetastoreDescribeTableResponse.TableName"));
		metastoreDescribeTableResponse.setDbName(context.stringValue("MetastoreDescribeTableResponse.DbName"));
		metastoreDescribeTableResponse.setOwner(context.stringValue("MetastoreDescribeTableResponse.Owner"));
		metastoreDescribeTableResponse.setTableType(context.stringValue("MetastoreDescribeTableResponse.TableType"));

		List<Column> columns = new ArrayList<Column>();
		for (int i = 0; i < context.lengthValue("MetastoreDescribeTableResponse.Columns.Length"); i++) {
			Column column = new Column();
			column.setName(context.stringValue("MetastoreDescribeTableResponse.Columns["+ i +"].Name"));
			column.setType(context.stringValue("MetastoreDescribeTableResponse.Columns["+ i +"].Type"));
			column.setComment(context.stringValue("MetastoreDescribeTableResponse.Columns["+ i +"].Comment"));

			columns.add(column);
		}
		metastoreDescribeTableResponse.setColumns(columns);

		List<SerdeParameter> serdeParameters = new ArrayList<SerdeParameter>();
		for (int i = 0; i < context.lengthValue("MetastoreDescribeTableResponse.SerdeParameters.Length"); i++) {
			SerdeParameter serdeParameter = new SerdeParameter();
			serdeParameter.setKey(context.stringValue("MetastoreDescribeTableResponse.SerdeParameters["+ i +"].Key"));
			serdeParameter.setValue(context.stringValue("MetastoreDescribeTableResponse.SerdeParameters["+ i +"].Value"));

			serdeParameters.add(serdeParameter);
		}
		metastoreDescribeTableResponse.setSerdeParameters(serdeParameters);

		List<StorageDescParameter> storageDescParameters = new ArrayList<StorageDescParameter>();
		for (int i = 0; i < context.lengthValue("MetastoreDescribeTableResponse.StorageDescParameters.Length"); i++) {
			StorageDescParameter storageDescParameter = new StorageDescParameter();
			storageDescParameter.setKey(context.stringValue("MetastoreDescribeTableResponse.StorageDescParameters["+ i +"].Key"));
			storageDescParameter.setValue(context.stringValue("MetastoreDescribeTableResponse.StorageDescParameters["+ i +"].Value"));

			storageDescParameters.add(storageDescParameter);
		}
		metastoreDescribeTableResponse.setStorageDescParameters(storageDescParameters);
	 
	 	return metastoreDescribeTableResponse;
	}
}