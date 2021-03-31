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

import com.aliyuncs.openanalytics_open.model.v20200928.GetPartitionResponse;
import com.aliyuncs.openanalytics_open.model.v20200928.GetPartitionResponse.PartitionModel;
import com.aliyuncs.openanalytics_open.model.v20200928.GetPartitionResponse.PartitionModel.StorageDescriptorModel;
import com.aliyuncs.openanalytics_open.model.v20200928.GetPartitionResponse.PartitionModel.StorageDescriptorModel.FieldSchemaModel;
import com.aliyuncs.openanalytics_open.model.v20200928.GetPartitionResponse.PartitionModel.StorageDescriptorModel.SerDeInfoModel;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetPartitionResponseUnmarshaller {

	public static GetPartitionResponse unmarshall(GetPartitionResponse getPartitionResponse, UnmarshallerContext _ctx) {
		
		getPartitionResponse.setRequestId(_ctx.stringValue("GetPartitionResponse.RequestId"));
		getPartitionResponse.setMessage(_ctx.stringValue("GetPartitionResponse.Message"));
		getPartitionResponse.setCode(_ctx.stringValue("GetPartitionResponse.Code"));
		getPartitionResponse.setSuccess(_ctx.booleanValue("GetPartitionResponse.Success"));

		PartitionModel partitionModel = new PartitionModel();
		partitionModel.setTableName(_ctx.stringValue("GetPartitionResponse.PartitionModel.TableName"));
		partitionModel.setParameters(_ctx.mapValue("GetPartitionResponse.PartitionModel.Parameters"));
		partitionModel.setCreateTime(_ctx.longValue("GetPartitionResponse.PartitionModel.CreateTime"));
		partitionModel.setDbName(_ctx.stringValue("GetPartitionResponse.PartitionModel.DbName"));

		List<String> values = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetPartitionResponse.PartitionModel.Values.Length"); i++) {
			values.add(_ctx.stringValue("GetPartitionResponse.PartitionModel.Values["+ i +"]"));
		}
		partitionModel.setValues(values);

		StorageDescriptorModel storageDescriptorModel = new StorageDescriptorModel();
		storageDescriptorModel.setParameters(_ctx.mapValue("GetPartitionResponse.PartitionModel.StorageDescriptorModel.Parameters"));
		storageDescriptorModel.setInputFormat(_ctx.stringValue("GetPartitionResponse.PartitionModel.StorageDescriptorModel.InputFormat"));
		storageDescriptorModel.setOutputFormat(_ctx.stringValue("GetPartitionResponse.PartitionModel.StorageDescriptorModel.OutputFormat"));
		storageDescriptorModel.setLocation(_ctx.stringValue("GetPartitionResponse.PartitionModel.StorageDescriptorModel.Location"));

		SerDeInfoModel serDeInfoModel = new SerDeInfoModel();
		serDeInfoModel.setSerializationLib(_ctx.stringValue("GetPartitionResponse.PartitionModel.StorageDescriptorModel.SerDeInfoModel.SerializationLib"));
		serDeInfoModel.setParameters(_ctx.mapValue("GetPartitionResponse.PartitionModel.StorageDescriptorModel.SerDeInfoModel.Parameters"));
		serDeInfoModel.setName(_ctx.stringValue("GetPartitionResponse.PartitionModel.StorageDescriptorModel.SerDeInfoModel.Name"));
		storageDescriptorModel.setSerDeInfoModel(serDeInfoModel);

		List<FieldSchemaModel> cols = new ArrayList<FieldSchemaModel>();
		for (int i = 0; i < _ctx.lengthValue("GetPartitionResponse.PartitionModel.StorageDescriptorModel.Cols.Length"); i++) {
			FieldSchemaModel fieldSchemaModel = new FieldSchemaModel();
			fieldSchemaModel.setComment(_ctx.stringValue("GetPartitionResponse.PartitionModel.StorageDescriptorModel.Cols["+ i +"].Comment"));
			fieldSchemaModel.setType(_ctx.stringValue("GetPartitionResponse.PartitionModel.StorageDescriptorModel.Cols["+ i +"].Type"));
			fieldSchemaModel.setName(_ctx.stringValue("GetPartitionResponse.PartitionModel.StorageDescriptorModel.Cols["+ i +"].Name"));

			cols.add(fieldSchemaModel);
		}
		storageDescriptorModel.setCols(cols);
		partitionModel.setStorageDescriptorModel(storageDescriptorModel);
		getPartitionResponse.setPartitionModel(partitionModel);
	 
	 	return getPartitionResponse;
	}
}