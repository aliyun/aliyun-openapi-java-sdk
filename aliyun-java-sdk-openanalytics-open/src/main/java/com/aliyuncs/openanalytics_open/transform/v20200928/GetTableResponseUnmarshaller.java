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

package com.aliyuncs.openanalytics_open.transform.v20200928;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.openanalytics_open.model.v20200928.GetTableResponse;
import com.aliyuncs.openanalytics_open.model.v20200928.GetTableResponse.Table;
import com.aliyuncs.openanalytics_open.model.v20200928.GetTableResponse.Table.PartitionKeysItem;
import com.aliyuncs.openanalytics_open.model.v20200928.GetTableResponse.Table.StorageDescriptor;
import com.aliyuncs.openanalytics_open.model.v20200928.GetTableResponse.Table.StorageDescriptor.ColsItem;
import com.aliyuncs.openanalytics_open.model.v20200928.GetTableResponse.Table.StorageDescriptor.SerDeInfo;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTableResponseUnmarshaller {

	public static GetTableResponse unmarshall(GetTableResponse getTableResponse, UnmarshallerContext _ctx) {
		
		getTableResponse.setRequestId(_ctx.stringValue("GetTableResponse.RequestId"));
		getTableResponse.setMessage(_ctx.stringValue("GetTableResponse.Message"));
		getTableResponse.setCode(_ctx.stringValue("GetTableResponse.Code"));
		getTableResponse.setSuccess(_ctx.booleanValue("GetTableResponse.Success"));

		Table table = new Table();
		table.setTableName(_ctx.stringValue("GetTableResponse.Table.TableName"));
		table.setViewOriginalText(_ctx.stringValue("GetTableResponse.Table.ViewOriginalText"));
		table.setOwner(_ctx.stringValue("GetTableResponse.Table.Owner"));
		table.setTableType(_ctx.stringValue("GetTableResponse.Table.TableType"));
		table.setParameters(_ctx.mapValue("GetTableResponse.Table.Parameters"));
		table.setViewExpandedText(_ctx.stringValue("GetTableResponse.Table.ViewExpandedText"));
		table.setCreateTime(_ctx.longValue("GetTableResponse.Table.CreateTime"));
		table.setDbName(_ctx.stringValue("GetTableResponse.Table.DbName"));
		table.setLastAccessTime(_ctx.longValue("GetTableResponse.Table.LastAccessTime"));

		StorageDescriptor storageDescriptor = new StorageDescriptor();
		storageDescriptor.setParameters(_ctx.mapValue("GetTableResponse.Table.StorageDescriptor.Parameters"));
		storageDescriptor.setInputFormat(_ctx.stringValue("GetTableResponse.Table.StorageDescriptor.InputFormat"));
		storageDescriptor.setOutputFormat(_ctx.stringValue("GetTableResponse.Table.StorageDescriptor.OutputFormat"));
		storageDescriptor.setLocation(_ctx.stringValue("GetTableResponse.Table.StorageDescriptor.Location"));

		SerDeInfo serDeInfo = new SerDeInfo();
		serDeInfo.setSerializationLib(_ctx.stringValue("GetTableResponse.Table.StorageDescriptor.SerDeInfo.SerializationLib"));
		serDeInfo.setParameters(_ctx.mapValue("GetTableResponse.Table.StorageDescriptor.SerDeInfo.Parameters"));
		serDeInfo.setName(_ctx.stringValue("GetTableResponse.Table.StorageDescriptor.SerDeInfo.Name"));
		storageDescriptor.setSerDeInfo(serDeInfo);

		List<ColsItem> cols = new ArrayList<ColsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetTableResponse.Table.StorageDescriptor.Cols.Length"); i++) {
			ColsItem colsItem = new ColsItem();
			colsItem.setComment(_ctx.stringValue("GetTableResponse.Table.StorageDescriptor.Cols["+ i +"].Comment"));
			colsItem.setType(_ctx.stringValue("GetTableResponse.Table.StorageDescriptor.Cols["+ i +"].Type"));
			colsItem.setName(_ctx.stringValue("GetTableResponse.Table.StorageDescriptor.Cols["+ i +"].Name"));

			cols.add(colsItem);
		}
		storageDescriptor.setCols(cols);
		table.setStorageDescriptor(storageDescriptor);

		List<PartitionKeysItem> partitionKeys = new ArrayList<PartitionKeysItem>();
		for (int i = 0; i < _ctx.lengthValue("GetTableResponse.Table.PartitionKeys.Length"); i++) {
			PartitionKeysItem partitionKeysItem = new PartitionKeysItem();
			partitionKeysItem.setComment(_ctx.stringValue("GetTableResponse.Table.PartitionKeys["+ i +"].Comment"));
			partitionKeysItem.setType(_ctx.stringValue("GetTableResponse.Table.PartitionKeys["+ i +"].Type"));
			partitionKeysItem.setName(_ctx.stringValue("GetTableResponse.Table.PartitionKeys["+ i +"].Name"));

			partitionKeys.add(partitionKeysItem);
		}
		table.setPartitionKeys(partitionKeys);
		getTableResponse.setTable(table);
	 
	 	return getTableResponse;
	}
}