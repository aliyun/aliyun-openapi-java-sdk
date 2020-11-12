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

import com.aliyuncs.openanalytics_open.model.v20200928.GetPartitionsResponse;
import com.aliyuncs.openanalytics_open.model.v20200928.GetPartitionsResponse.PartitionModel;
import com.aliyuncs.openanalytics_open.model.v20200928.GetPartitionsResponse.PartitionModel.StorageDescriptorModel;
import com.aliyuncs.openanalytics_open.model.v20200928.GetPartitionsResponse.PartitionModel.StorageDescriptorModel.FieldSchemaModel;
import com.aliyuncs.openanalytics_open.model.v20200928.GetPartitionsResponse.PartitionModel.StorageDescriptorModel.SerDeInfoModel;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetPartitionsResponseUnmarshaller {

	public static GetPartitionsResponse unmarshall(GetPartitionsResponse getPartitionsResponse, UnmarshallerContext _ctx) {
		
		getPartitionsResponse.setRequestId(_ctx.stringValue("GetPartitionsResponse.RequestId"));
		getPartitionsResponse.setMessage(_ctx.stringValue("GetPartitionsResponse.Message"));
		getPartitionsResponse.setCode(_ctx.stringValue("GetPartitionsResponse.Code"));
		getPartitionsResponse.setSuccess(_ctx.booleanValue("GetPartitionsResponse.Success"));

		List<PartitionModel> partitions = new ArrayList<PartitionModel>();
		for (int i = 0; i < _ctx.lengthValue("GetPartitionsResponse.Partitions.Length"); i++) {
			PartitionModel partitionModel = new PartitionModel();
			partitionModel.setTableName(_ctx.stringValue("GetPartitionsResponse.Partitions["+ i +"].TableName"));
			partitionModel.setParameters(_ctx.mapValue("GetPartitionsResponse.Partitions["+ i +"].Parameters"));
			partitionModel.setCreateTime(_ctx.longValue("GetPartitionsResponse.Partitions["+ i +"].CreateTime"));
			partitionModel.setDbName(_ctx.stringValue("GetPartitionsResponse.Partitions["+ i +"].DbName"));

			List<String> values = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetPartitionsResponse.Partitions["+ i +"].Values.Length"); j++) {
				values.add(_ctx.stringValue("GetPartitionsResponse.Partitions["+ i +"].Values["+ j +"]"));
			}
			partitionModel.setValues(values);

			StorageDescriptorModel storageDescriptorModel = new StorageDescriptorModel();
			storageDescriptorModel.setParameters(_ctx.mapValue("GetPartitionsResponse.Partitions["+ i +"].StorageDescriptorModel.Parameters"));
			storageDescriptorModel.setInputFormat(_ctx.stringValue("GetPartitionsResponse.Partitions["+ i +"].StorageDescriptorModel.InputFormat"));
			storageDescriptorModel.setOutputFormat(_ctx.stringValue("GetPartitionsResponse.Partitions["+ i +"].StorageDescriptorModel.OutputFormat"));
			storageDescriptorModel.setLocation(_ctx.stringValue("GetPartitionsResponse.Partitions["+ i +"].StorageDescriptorModel.Location"));

			SerDeInfoModel serDeInfoModel = new SerDeInfoModel();
			serDeInfoModel.setSerializationLib(_ctx.stringValue("GetPartitionsResponse.Partitions["+ i +"].StorageDescriptorModel.SerDeInfoModel.SerializationLib"));
			serDeInfoModel.setParameters(_ctx.mapValue("GetPartitionsResponse.Partitions["+ i +"].StorageDescriptorModel.SerDeInfoModel.Parameters"));
			serDeInfoModel.setName(_ctx.stringValue("GetPartitionsResponse.Partitions["+ i +"].StorageDescriptorModel.SerDeInfoModel.Name"));
			storageDescriptorModel.setSerDeInfoModel(serDeInfoModel);

			List<FieldSchemaModel> cols = new ArrayList<FieldSchemaModel>();
			for (int j = 0; j < _ctx.lengthValue("GetPartitionsResponse.Partitions["+ i +"].StorageDescriptorModel.Cols.Length"); j++) {
				FieldSchemaModel fieldSchemaModel = new FieldSchemaModel();
				fieldSchemaModel.setComment(_ctx.stringValue("GetPartitionsResponse.Partitions["+ i +"].StorageDescriptorModel.Cols["+ j +"].Comment"));
				fieldSchemaModel.setType(_ctx.stringValue("GetPartitionsResponse.Partitions["+ i +"].StorageDescriptorModel.Cols["+ j +"].Type"));
				fieldSchemaModel.setName(_ctx.stringValue("GetPartitionsResponse.Partitions["+ i +"].StorageDescriptorModel.Cols["+ j +"].Name"));

				cols.add(fieldSchemaModel);
			}
			storageDescriptorModel.setCols(cols);
			partitionModel.setStorageDescriptorModel(storageDescriptorModel);

			partitions.add(partitionModel);
		}
		getPartitionsResponse.setPartitions(partitions);
	 
	 	return getPartitionsResponse;
	}
}